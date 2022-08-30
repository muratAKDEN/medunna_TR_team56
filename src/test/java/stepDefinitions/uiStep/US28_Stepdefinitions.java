package stepDefinitions.uiStep;


import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import utilities.ReusableMethods;
import pages.US28;
import utilities.ConfigReader;
import utilities.Driver;

public class US28_Stepdefinitions {


    US28 us28 = new US28();

    String id;



    @Given("Admin adi ve sifresiyle siteye girer")
    public void admin_adi_ve_sifresiyle_siteye_girer() {
        us28.Username.sendKeys(ConfigReader.getProperty("adminUN"));
        us28.Password.sendKeys(ConfigReader.getProperty("adminPW"));
      //  us28.signInKutusu.click();

    }

    @Given("Items&Titles butonuna tiklar")
    public void items_titles_butonuna_tiklar() {
        us28.Items.click();

    }

    @Given("Country secenegine tiklar")
    public void country_secenegine_tiklar() {
        WebElement element = us28.Country;
        ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].scrollIntoView(true);", element);
        ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].click(true);", element);

        //us28.Country.click();

    }

    @Then("Create a new Country butonuna tiklar")
    public void create_a_new_country_butonuna_tiklar() {
        us28.CreateCountry.click();

    }

    @Then("Name kismina Ülke adini yazar")
    public void name_kismina_ulke_adini_yazar() {
        String country = Faker.instance().country().name();
        us28.Name.sendKeys(country);

    }

    @Then("Save butonuna tiklar")
    public void save_butonuna_tiklar() {
        us28.countrySave.click();

    }

    @Then("Admin yeni ulke olusturdugunu cikan yaziyla dogrular")
    public void admin_yeni_ulke_olusturdugunu_cikan_yaziyla_dogrular() {
        Assert.assertTrue(us28.createDogrulama.isDisplayed());
        ReusableMethods.waitForVisibility(us28.alertList.get(0), 10);
        id = us28.alertList.get(0).getText().replaceAll("\\D", "");
        System.out.println(id);
    }

    @Then("Olusturdugu ulkenin listede gorundugunu test eder")
    public void olusturdugu_ulkenin_listede_gorundugunu_test_eder() {
        String ulke = "country";
        String actualAramaSonucStr = us28.newcountry.getText();
        Assert.assertTrue(actualAramaSonucStr.contains(ulke));

    }

    @Then("Ulkenin Id sini kaydeder")
    public void ulkenin_id_sini_kaydeder() {
        String ulkeId= "224234";

    }


    @Given("StateCity secenegine tiklar")
    public void statecitySecenegineTiklar() {
        us28.StateCity.click();

    }

    @Then("Create a new StateCity butonuna tiklar")
    public void create_a_new_state_city_butonuna_tiklar() {
        us28.CreatStateCity.click();


    }

    @Then("Acilan sayfada Name kismina eyalet veya sehrini yazar")
    public void acilan_sayfada_name_kismina_eyalet_veya_sehrini_yazar() {
        us28.StateName.sendKeys("Luanda");


    }

    @Given("Admin sayfayi kapatir")
    public void admin_sayfayi_kapatir() {
        Driver.closeDriver();

    }

    @Given("StateCity kismina olusturdugu ulkeyi yazar")
    public void stateCityKisminaOlusturduguUlkeyiYazar() {
        us28.StateUlke.click();
        WebElement Angola = us28.StateUlke;
        ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].scrollIntoView(true);", Angola);

    }


    @And("Admin yeni StateCity olusturdugunu cikan yaziyla dogrular")
    public void adminYeniStateCityOlusturdugunuCikanYaziylaDogrular() {
        Assert.assertTrue(us28.olumsuzMesaj.isDisplayed());
    }


    @When("Delete butonuna basar")
    public void deleteButonunaBasar() {
       // WebElement ulkeDeletee = us28.ulkeDelete;
       // ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].scrollIntoView(true);", ulkeDeletee);
       // ReusableMethods.waitForVisibility(us28.sondelete, 3);
        WebElement element = us28.sondelete;
        ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].scrollIntoView(true);", element);
        ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].click(true);", element);

       // us28.sondelete.click();

    }

    @When("Cikan dogrulama ekranindan da Delete butonuna basar")
    public void cikan_dogrulama_ekranindan_da_delete_butonuna_basar() {
        us28.deleteConfirm.click();
        us28.deleteDogrulama.click();


    }

    @When("Ulkenin silindiginden emin olur")
    public void ulkenin_silindiginden_emin_olur() {
    Assert.assertTrue(us28.silindi.isDisplayed());


    }
}
