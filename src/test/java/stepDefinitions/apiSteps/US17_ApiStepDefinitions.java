package stepDefinitions.apiSteps;

import com.github.javafaker.Faker;
import io.cucumber.java.en.*;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.asserts.SoftAssert;
import pages.US17_Page;
import pojos.TestItemsPojo;
import utilities.Authentication;
import utilities.ConfigReader;
import utilities.DBUtils;
import utilities.Driver;

import java.sql.SQLException;
import java.util.Collections;
import java.util.List;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertFalse;

public class US17_ApiStepDefinitions {

    US17_Page us17_page = new US17_Page();
    Actions actions;
    Faker faker;
    String expectedId;
    Response response;
    String testName;
    String newTestName;
    JsonPath json;
    SoftAssert softAssert = new SoftAssert();

    @And("Admin olarak {string} ana sayfasina gider")
    public void adminOlarakAnaSayfasinaGider(String arg0) {
        Driver.getDriver().get(ConfigReader.getProperty("medunnaUrl"));
    }

    @And("Admin olarak gecerli bir username girer")
    public void adminOlarakGecerliBirUsernameGirer() {
        us17_page.signInUsername.sendKeys(ConfigReader.getProperty("admin"));
    }

    @Given("Items&Titles elementine tiklar")
    public void items_titles_elementine_tiklar() {
        us17_page.itemsTitles.click();
    }

    @Given("Test Item elementine tiklar")
    public void test_item_elementine_tiklar() {
        us17_page.testItem.click();
    }

    @Given("Create a new Test Item elementine tiklar")
    public void create_a_new_test_item_elementine_tiklar() {
        us17_page.createTestItem.click();
    }

    @Given("Yeni test ogesi olusturulabildigini kontrol eder")
    public void yeni_test_ogesi_olusturulabildigini_kontrol_eder() throws InterruptedException {
        actions = new Actions(Driver.getDriver());
        faker = new Faker();
        String testName = faker.funnyName().name();
        actions.click(us17_page.createEditItemName).
                sendKeys(testName).sendKeys(Keys.TAB).
                sendKeys("overdose is suspected").sendKeys(Keys.TAB).
                sendKeys("100").sendKeys(Keys.TAB).
                sendKeys("5").sendKeys(Keys.TAB).
                sendKeys("50").sendKeys(Keys.ENTER).perform();

        Thread.sleep(1000);
        String expectedText = us17_page.popUpMessage.getText();
        Assert.assertTrue(expectedText.contains("A new Test Item is created"));
    }

    @Given("Olusturulan test items verisini siler")
    public void olusturulan_test_items_verisini_siler() throws InterruptedException {
        Thread.sleep(3000);
        us17_page.createdDate.click();
        us17_page.deleteLastTestItem.click();
        us17_page.confirmDelete.click();
    }

    @Given("Test Item formunun doldurulabildigini kontrol eder")
    public void test_item_formunun_doldurulabildigini_kontrol_eder() {
        Assert.assertTrue(us17_page.createEditItemName.isEnabled());
    }

    @Given("Test Item formunun guncellenebildigini kontrol eder")
    public void test_item_formunun_guncellenebildigini_kontrol_eder() throws InterruptedException {
        actions = new Actions(Driver.getDriver());
        faker = new Faker();

        String testName = faker.funnyName().name();
        actions.click(us17_page.createEditItemName).
                sendKeys(testName).sendKeys(Keys.TAB).
                sendKeys("overdose is suspected").sendKeys(Keys.TAB).
                sendKeys("100").sendKeys(Keys.TAB).
                sendKeys("5").sendKeys(Keys.TAB).
                sendKeys("50").sendKeys(Keys.ENTER).perform();
        Thread.sleep(1000);
        expectedId = us17_page.popUpMessage.getText().replace("A new Test Item is created with identifier ", "");
        us17_page.createdDate.click();
        us17_page.editLastTestItem.click();

        String actualId = us17_page.editTestItemId.getAttribute("value");
        Assert.assertEquals(expectedId, actualId);

        String newTestName = faker.funnyName().name();
        actions.click(us17_page.createEditItemName).
                sendKeys(newTestName).sendKeys(Keys.ENTER).perform();
        String actualNewTestName = us17_page.createEditItemName.getAttribute("value");

        Assert.assertNotEquals(testName, actualNewTestName);
    }

    @Given("Test Item formunu doldurur")
    public void test_item_formunu_doldurur() throws InterruptedException {
        actions = new Actions(Driver.getDriver());
        faker = new Faker();
        testName = faker.funnyName().name();
        actions.click(us17_page.createEditItemName).
                sendKeys(testName).sendKeys(Keys.TAB).
                sendKeys("overdose is suspected").sendKeys(Keys.TAB).
                sendKeys("100").sendKeys(Keys.TAB).
                sendKeys("5").sendKeys(Keys.TAB).
                sendKeys("50").sendKeys(Keys.ENTER).perform();

        Thread.sleep(1000);
        expectedId = us17_page.popUpMessage.getText().replace("A new Test Item is created with identifier ", "");

    }

    @Given("Olusturulan test ogesininin goruntulendigini kontrol eder")
    public void olusturulan_test_ogesininin_goruntulendigini_kontrol_eder() throws InterruptedException {
        us17_page.createdDate.click();
        Thread.sleep(1000);
        us17_page.viewLastTestItem.click();
        String actualId = us17_page.viewTestItemTitle.getText();

        Assert.assertTrue(actualId.contains(expectedId));
        Driver.getDriver().navigate().back();
    }

    @And("Test items silindigini kontrol eder")
    public void testItemsSilindiginiKontrolEder() {
        us17_page.createdDate.click();
        us17_page.viewLastTestItem.click();

        String actualId = us17_page.viewTestItemTitle.getText();
        assertFalse(actualId.contains(expectedId));
    }


    @Given("Test items formunu gunceller")
    public void test_items_formunu_gunceller() throws InterruptedException {
        Thread.sleep(1000);
        us17_page.createdDate.click();
        us17_page.editLastTestItem.click();
        actions = new Actions(Driver.getDriver());
        faker = new Faker();

        newTestName = faker.funnyName().name();
        actions.click(us17_page.createEditItemName).keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).
                sendKeys(Keys.DELETE).
                sendKeys(newTestName).sendKeys(Keys.ENTER).perform();
        Thread.sleep(1000);
    }

    @Given("Test items olusturuldugunu API ile kontrol eder")
    public void test_items_olusturuldugunu_api_ile_kontrol_eder() {
        // Test Item icin get Request yolla "https://medunna.com/api/c-test-items/expectedId"
        String token = Authentication.generateToken();
        response = given().headers("Authorization",
                "Bearer " + token,
                "Content-Type",
                ContentType.JSON,
                "Accept",
                ContentType.JSON).when().get("https://medunna.com/api/c-test-items/" + expectedId);
        // Test Items olusturuldugunu kontrol et
        response.
                then().
                assertThat().
                statusCode(200).
                contentType(ContentType.JSON);
        json = response.jsonPath();
        String actualTestName = json.getString("name");
        softAssert.assertEquals(actualTestName, testName);
        softAssert.assertAll();
    }

    @Given("Test items guncellendigini API ile kontrol eder")
    public void test_items_guncellendigini_api_ile_kontrol_eder() {
        // Test Item icin get Request yolla "https://medunna.com/api/c-test-items/expectedId"
        String token = Authentication.generateToken();
        response = given().headers("Authorization",
                "Bearer " + token,
                "Content-Type",
                ContentType.JSON,
                "Accept",
                ContentType.JSON).when().get("https://medunna.com/api/c-test-items/" + expectedId);
        // Test Items guncellendigini kontrol et
        response.
                then().
                assertThat().
                statusCode(200).
                contentType(ContentType.JSON);
        json = response.jsonPath();
        String actualTestName = json.getString("name");
        softAssert.assertEquals(actualTestName, newTestName);
        softAssert.assertAll();
    }

    @Given("Test items silindigini API ile kontrol eder")
    public void test_items_silindigini_api_ile_kontrol_eder() {
        // Test Item icin get Request yolla "https://medunna.com/api/c-test-items/expectedId"
        String token = Authentication.generateToken();
        response = given().headers("Authorization",
                "Bearer " + token,
                "Content-Type",
                ContentType.JSON,
                "Accept",
                ContentType.JSON).when().get("https://medunna.com/api/c-test-items");
        // Test Items guncellendigini kontrol et
        response.
                then().
                assertThat().
                statusCode(200).
                contentType(ContentType.JSON);
        json = response.jsonPath();
        softAssert.assertFalse(response.asString().contains(expectedId));
        softAssert.assertAll();
    }

    @Given("Admin API ile test items olusturur")
    public void adminAPIIleTestItemsOlusturur() {
        TestItemsPojo testItems = new TestItemsPojo();
        String token = Authentication.generateToken();

        testItems.setCreatedBy("medunna");
        testItems.setCreatedDate("2022-08-23T18:14:44.983593Z");
        testItems.setName("Harun");
        testItems.setDescription("kanTesti");

        testItems.setDefaultValMin("15");
        testItems.setDefaultValMax("50");


        response = given().headers("Authorization",
                        "Bearer " + token,
                        "Content-Type",
                        ContentType.JSON,
                        "Accept",
                        ContentType.JSON)
                .when().body(testItems)
                .post("https://www.medunna.com/api/c-test-items/")
                .then()
                .contentType(ContentType.JSON)
                .extract()
                .response();
        response.prettyPrint();
        response.then().assertThat().statusCode(201);

    }

    @And("API ile Test items olusturuldugunu API ile kontrol eder")
    public void apiIleTestItemsOlusturuldugunuAPIIleKontrolEder() {
    }

    @And("Test items olusturuldugunu DB ile kontrol eder")
    public void testItemsOlusturuldugunuDBIleKontrolEder() throws SQLException {
        DBUtils.createConnection();
        String query = "select * from c_test_item";
        System.out.println(DBUtils.getColumnNames(query) + "\n");
        List<Object> idList = DBUtils.getColumnData(query, "id");
        Object expectedIdObject = expectedId;

        System.out.println(idList + "\n");
        System.out.println("expectedId= " + expectedId);
        Assert.assertTrue(idList.contains(expectedIdObject));

        for (Object each : idList) {
            //System.out.println(each);
            if (each.equals((Object) expectedId)) {
                System.out.println("varmisss");
            }
        }
    }

    @And("Test items guncellendigini DB ile kontrol eder")
    public void testItemsGuncellendiginiDBIleKontrolEder() {

    }

    @And("Test items silindigini DB ile kontrol eder")
    public void testItemsSilindiginiDBIleKontrolEder() {

    }
}




         /*
        {
    "createdBy": "healthprojectteam56",
    "createdDate": "2022-08-23T14:42:51.187773Z",
    "id": 221025,
    "name": "Ty Tannick",
    "description": "overdose is suspected",
    "price": 100.00,
    "defaultValMin": "5",
    "defaultValMax": "50"
}

 */