package stepDefinitions.uiStep;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import pages.US08_Pages;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.ArrayList;
import java.util.List;

public class US08_Stepdefinitions {
    US08_Pages us08 = new US08_Pages();

    Actions actions = new Actions(Driver.getDriver());


    JavascriptExecutor jse = (JavascriptExecutor)Driver.getDriver();
//   jse.executeScript("arguments[0].scrollIntoView()",locator);
//   jse.executeScript("arguments[0].click();",locator );

    @Then("kullanici account buttona tiklar")
    public void kullanici_account_buttona_tiklar() {
        us08.accountButton.click();
    }


    @And("password buttona tiklar")
    public void passwordButtonaTiklar() {
        us08.passwordButton.click();
    }




    @And("current Password Kutusuna {string} girer")
    public void currentPasswordKutusunaGirer(String string) {
        us08.currentPaswordBox.sendKeys(ConfigReader.getProperty(string));

    }




    @And("new password kutusuna {string} girer")
    public void newPasswordKutusunaGirer(String str) {

        us08.newPaswordBox.sendKeys(ConfigReader.getProperty(str));
    }

    @And("confirm the password kutusuna {string} girer")
    public void confirmThePasswordKutusunaGirer(String yeniSifreTekrar) {
        us08.confirmNewPaswordBox.sendKeys(ConfigReader.getProperty(yeniSifreTekrar));

    }

    @Then("save butonuna basar")
    public void save_butonuna_basar() {
//us08.saveButton.click();
        jse.executeScript("arguments[0].click()",us08.saveButton);



    }
    @Then("password changed yazisinin gorundugunu test eder")
    public void password_changed_yazisinin_gorundugunu_test_eder() {

        ReusableMethods.waitFor(2);
        jse.executeScript("arguments[0].scrollIntoView()",us08.passwordChanged);
        Assert.assertTrue(us08.passwordChanged.isDisplayed());

    }
    @Then("password changed yazisinin gorunmedigini test eder")
    public void password_changed_yazisinin_gorunmedigini_test_eder() {

        ReusableMethods.waitFor(2);
        jse.executeScript("arguments[0].scrollIntoView()",us08.passwordChanged);
        Assert.assertFalse(us08.passwordChanged.isDisplayed());

    }


    @And("password strenght seviyesinin {string} oldugunu test eder")
    public void passwordStrenghtSeviyesininOldugunuTestEder(String arg0) {

      Assert.assertTrue(us08.passwordStrengthBar5.isDisplayed());

    }



}
