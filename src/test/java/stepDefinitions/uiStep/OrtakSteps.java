package stepDefinitions.uiStep;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.OrtakPages;
import utilities.ConfigReader;
import utilities.Driver;

public class OrtakSteps {

    OrtakPages ortakPages =new OrtakPages();
    @Given("Kullanici {string} adresine gider")
    public void kullanici_adresine_gider(String url) {

        Driver.getDriver().get(ConfigReader.getProperty(url));

    }


    @Given("Kullanici sayfanin sag ust kosesinde yer alan insan ikonuna tiklar")
    public void kullanici_sayfanin_sag_ust_kosesinde_yer_alan_insan_ikonuna_tiklar() {
        ortakPages.anasayfaInsanIkonu.click();


    }
    @And("kullanici acilan dropdown menude signIn butonuna tiklar")
    public void kullaniciAcilanDropdownMenudeSignInButonunaTiklar() {
        ortakPages.anasayfaInsanIkonuSignInElementi.click();
    }


    @Then("kullanici username olarak {string} girer")
    public void kullanici_username_olarak_girer(String username) {

ortakPages.loginUsernameTextBox.sendKeys(ConfigReader.getProperty(username));
    }
    @Then("kullanici password olarak {string} girer")
    public void kullanici_password_olarak_girer(String password) {
ortakPages.loginPasswordTextBox.sendKeys(ConfigReader.getProperty(password));

    }
    @And("kullanici Sign In butonuna tiklar")
    public void kullaniciSignInButonunaTiklar() {

        ortakPages.loginSignInButonu.click();
    }




    @And("Kullanici sayfayi kapatir")
    public void kullaniciSayfayiKapatir() {

     Driver.closeDriver();

        Driver.closeDriver();

    }
}
