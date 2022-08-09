package stepDefinitions.uiStep;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import pages.US_08_Pages;
import utilities.ConfigReader;
import utilities.Driver;

public class US_08_StepDefinitions {
    US_08_Pages us08=new US_08_Pages();

    Actions actions = new Actions(Driver.getDriver());
    Faker faker = new Faker();


    @Given("kullanici {string} anasayfasindaa")
    public void kullanici_anasayfasinda(String medunna) {
        Driver.getDriver().get(ConfigReader.getProperty("medunnaUrl"));
    }

    @Then("doktor signInbutonu tiklar")
    public void doktor_sign_ınbutonu_tiklar() {
        us08.signInButonu.click();
    }

    @Then("doktor loginButonu tiklar")
    public void doktor_login_butonu_tiklar() {
        us08.loginButonu.click();
    }

    @Then("doktor {string} ve {string} girer SignIn tıklar")
    public void doktor_ve_girer_sign_ın_tıklar(String string, String string2) {
        us08.username.sendKeys("doctor-healthprojectteam56" + Keys.TAB);
        us08.password.sendKeys("Teamproject.56" + Keys.TAB);


        actions
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .perform();
        us08.signIn.click();
    }

    @Then("Ana sayfada kullaniciya ait sekmeyi \\(en sağda) tiklar")
    public void ana_sayfada_kullaniciya_ait_sekmeyi_en_sağda_tiklar() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("Password sekmesine tiklar")
    public void password_sekmesine_tiklar() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("Current password kutusuna mevcut şifreyi girer")
    public void current_password_kutusuna_mevcut_şifreyi_girer() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }




}
