package stepDefinitions.uiStep;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.US22_23_Pages;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import javax.swing.*;

public class US22_StepDefinitions {

    US22_23_Pages US22_23 = new US22_23_Pages();
    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
    Actions actions = new Actions(Driver.getDriver());

    @Given("Staff medunna sitesine gider")
    public void staff_medunna_sitesine_gider() {
        Driver.getDriver().get("https://www.medunna.com");

    }

    @Then("Staff User simgesine tiklar")
    public void staff_user_simgesine_tiklar() {
        US22_23.signInButonu.click();

    }

    @Then("Staff Sign in secenegini tiklar")
    public void staff_sign_in_secenegini_tiklar() {
        US22_23.loginButonu.click();

    }

    @Then("Staff gecerli bir username girer")
    public void staff_gecerli_bir_username_girer() {
        US22_23.username.sendKeys(ConfigReader.getProperty("staffUser"));
    }

    @Then("Staff gecerli bir password girer")
    public void staff_gecerli_bir_password_girer() {
        US22_23.password.sendKeys(ConfigReader.getProperty("password"));
    }

    @Then("Staff Sign in butonuna tiklar")
    public void staff_sign_in_butonuna_tiklar() {
        US22_23.signIn.click();

    }

    @Then("Staff My Pages butonuna tiklar")
    public void staff_my_pages_butonuna_tiklar() {
        US22_23.myPages.click();
        ReusableMethods.waitFor(2);
    }

    @Then("Staff acilan pencereden Search Patient butonuna tiklar")
    public void staff_acilan_pencereden_search_patient_butonuna_tiklar() {
        US22_23.searchPatient.click();
        ReusableMethods.waitFor(2);
    }

    @Then("Staff Patient SSN kutusuna gecerli bir SSN girer")
    public void staff_patient_ssn_kutusuna_gecerli_bir_ssn_girer() {
        US22_23.ssnBox.sendKeys(ConfigReader.getProperty("gecerliSSN"));
        ReusableMethods.waitFor(4);
    }

    @Then("Staff bu SSN kimligine kayitli hastanin kaydina erismeyi dogrulamalidir")
    public void staff_bu_ssn_kimligine_kayitli_hastanin_kaydina_erismeyi_dogrulamalidir() {

        String expectedResult = ConfigReader.getProperty("gecerliSSN");
        String actualResult = US22_23.validSSN.getText();

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Then("Staff Show Appoinments butonuna tiklar")
    public void staff_show_appoinments_butonuna_tiklar() {
        US22_23.showAppointments.click();
        ReusableMethods.waitFor(2);
    }

    @Then("Staff Show Test butonuna tiklar")
    public void staff_show_test_butonuna_tiklar() {
        US22_23.showTests.click();
        ReusableMethods.waitFor(2);
    }

    @Then("Staff View Results butonuna tiklar")
    public void staff_view_results_butonuna_tiklar() {
        US22_23.viewResults.click();
        ReusableMethods.waitFor(2);
    }

    @Then("Staff test sonuclarinin gorulebildigini test eder")
    public void staff_test_sonuclarinin_gorulebildigini_test_eder() {
        Assert.assertTrue(US22_23.testResults.isDisplayed());
        ReusableMethods.waitFor(2);
    }

    @Then("Staff edit butonuna tiklar")
    public void staff_edit_butonuna_tiklar() {
        US22_23.editButton.click();
        ReusableMethods.waitFor(2);
    }

    @Then("Staff edit sayfasinda description kutusuna tiklar")
    public void staff_edit_sayfasinda_description_kutusuna_tiklar() {

    }

    @Then("Staff edit sayfasinda description kutusuna -ifade- yazar")
    public void staff_edit_sayfasinda_description_kutusuna_ifade_yazar() {
        US22_23.descriptionButton.clear();
        US22_23.descriptionButton.sendKeys("ifade");
        ReusableMethods.waitFor(4);
    }

    @Then("Staff Save butonuna tiklar")
    public void staff_save_butonuna_tiklar() {
        //WebElement Element = US22_23.saveButton;
        //js.executeScript("arguments[0].scrollIntoView();", Element);
        actions.sendKeys(Keys.PAGE_DOWN).build().perform();
        US22_23.saveButton.click();
        ReusableMethods.waitFor(3);
    }

    @Then("Staff Test Result Updated mesajinin goruldugunu dogrular")
    public void staff_test_result_updated_mesajinin_goruldugunu_dogrular() {
        Assert.assertTrue(US22_23.updatedAlert.isDisplayed());
        ReusableMethods.waitFor(2);
    }


    @Then("Staff sayfayi kapatir")
    public void staff_sayfayi_kapatir() {
        Driver.closeDriver();
    }
}
