package stepDefinitions.apiSteps;

import io.cucumber.java.en.*;
import pages.US17_Page;
import utilities.ConfigReader;
import utilities.Driver;

public class US17_ApiStepDefinitions {

    US17_Page us17_page = new US17_Page();

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
    public void yeni_test_ogesi_olusturulabildigini_kontrol_eder() {

    }

    @Given("Olusturulan test items verisini siler")
    public void olusturulan_test_items_verisini_siler() {

    }
}
