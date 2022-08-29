package stepDefinitions.apiSteps;
import io.cucumber.java.en.*;

import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Assert;
import utilities.Authentication;
import utilities.ConfigReader;

import java.util.List;

import static io.restassured.RestAssured.given;
import static stepDefinitions.dbSteps.US09_dbStep.hastaToplamSayisi_DB;
import static stepDefinitions.uiStep.US09_StepDefinitions.hastaToplamSayisi_UI;
import static utilities.Authentication.generateToken;

public class US09_apiStep {

    public static List<String> ssnListAPI;
    Response response;
    int hastaToplamSayisi_API;
    String token;


    @Given("Kullanici GET request gonderir")
    public void kullaniciGETRequestGonderir() {
        String endpointAllUsers = ConfigReader.getProperty("allPatientEndpoint");
        //  token = generateToken(ConfigReader.getProperty("adminUser"), ConfigReader.getProperty("password"));
String token=Authentication.generateToken();
        response = given().headers(
                "Authorization",
                "Bearer " + Authentication.generateToken(),
                "Content-Type",
                ContentType.JSON,
                "Accept",
                ContentType.JSON).when().get(endpointAllUsers);
        response.prettyPrint();
    }


    @Given("status kodunun {int} oldugu gorulur")
    public void status_kodunun_oldugu_gorulur(int expectedStatusCode) {

       Assert.assertEquals(expectedStatusCode,response.getStatusCode());

    }

    @Then("Kullanici tum hasta bilgilerini API response ile alir")
    public void kullanici_tum_hasta_bilgilerini_api_response_ile_alir() {

        JsonPath jsonPath = response.jsonPath();

        ssnListAPI = jsonPath.getList("ssn");

        hastaToplamSayisi_API = ssnListAPI.size();
        System.out.println("Tüm kayıtlı API Hasta  Sayısı : "+hastaToplamSayisi_API);

    }

    @Then("Kullanici API ile kayitli hasta sayisini DB ve UI ile gercekler")
    public void kullanici_apı_ile_kayitli_hasta_sayisini_db_ve_ui_ile_gercekler () {
            Assert.assertEquals(hastaToplamSayisi_API, hastaToplamSayisi_DB);
            Assert.assertNotEquals(hastaToplamSayisi_API, hastaToplamSayisi_UI);


        }


    }


