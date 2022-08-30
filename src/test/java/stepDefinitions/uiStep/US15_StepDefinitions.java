package stepDefinitions.uiStep;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import pages.US15_Page;
import pojos.Patient;
import pojos.PatientsPojo;
import utilities.*;

import static org.testng.AssertJUnit.assertFalse;
import static org.testng.AssertJUnit.assertTrue;
import static pages.US15_Page.saveButton;

public class US15_StepDefinitions{
    US15_Page patient = new US15_Page();
    Select select;
    Faker faker = new Faker();
    public String firstName;
    public String lastName;
    public String email;
    public String phone;



    @Given("Admin Medunna Url'e gider")
    public void admin_medunna_url_e_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("medunnaUrl"));
    }

    @And("Admin dropdown ikonuna tiklar")
    public void adminDropdownIkonunaTiklar() {
        patient.userIcon.click();
    }

    @Given("Admin sign in elementini tiklar")
    public void admin_sign_in_elementini_tiklar() {
        patient.signinElementi.click();
    }

    @Then("Admin username ve password girer")
    public void admin_username_ve_password_girer() {
        patient.usernameBox.sendKeys(ConfigReader.getProperty("admin"));
        patient.passwordBox.sendKeys(ConfigReader.getProperty("password"));
    }

    @Then("Admin sign in butonunu tiklar")
    public void admin_sign_in_butonunu_tiklar() {
        patient.signInButton.click();
    }


    @Given("kullanici patient butonuna tiklar")
    public void kullanici_patient_butonuna_tiklar(String string) {
        patient.patient.click();
        // ReusableMethods.waitForClickablility( patientButton,5);
    }

    @Given("kullanici gerekli alanlari doldurur")
    public void kullanici_gerekli_alanlari_doldurur() {

        US15_Page.usersIdFirstNameBox.sendKeys(faker.name().firstName());

        US15_Page.usersIdLastNameBox.sendKeys(faker.name().lastName());

        US15_Page.usersMailBox.sendKeys(faker.internet().emailAddress());

        US15_Page.usersphoneBox.sendKeys("5555555555");




    }

    @Given("kullanici Save butonuna tiklar")
    public void kullanici_save_butonuna_tiklar() {

    //    JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
     //   jse.executeScript("arguments[0].scrollIntoView()", saveButton);
      //  ReusableMethods.waitForClickablility(saveButton,5);
        saveButton.submit();
    }

    @Given("kullanici {string} uyarisinin gorundugunu test eder")
    public void kullanici_uyarisinin_gorundugunu_test_eder(String istenenText) {
        ReusableMethods.waitForVisibility(patient.alertList.get(0), 10);
        if (!patient.alertList.isEmpty()) {
            assertTrue(istenenText + " yazisi goruntulenmedi", patient.alertList.get(0).getText().contains(istenenText));
        }
    }
    @Given("kullanici {string} bilgisinin goruntulendigini test eder")
    public void kullanici_bilgisinin_goruntulendigini_test_eder(String button) {

        WebElement beklenen= Driver.getDriver().findElement(By.xpath("//*[text()='"+ button +"']"));
        ReusableMethods.waitForVisibility(beklenen,5);
        Assert.assertTrue(beklenen.isDisplayed());
    }


    @Given("kullanici First Name, Last Name, Birth Date, Phone, Gender, Blood Group, Address, Description, User, Country and state City butonlarinin enable oldugunu test eder")
    public void kullanici_first_name_last_name_birth_date_phone_gender_blood_group_address_description_user_country_and_state_city_butonlarinin_enable_oldugunu_test_eder() {

    }

    @Given("kullanici country ve state alanlarini bos birakir")
    public void kullanici_country_ve_state_alanlarini_bos_birakir() {
      //    Select select1 =new Select(patient.countryDDM);
     //    Select select2 =new Select(patient.cityStateDDM);
      //  select1.selectByIndex(0);
     //    select2.selectByIndex(0);

    }

    @Given("kullanici {string} uyarisinin cikmadigini test eder")
    public void kullanici_uyarisinin_cikmadigini_test_eder(String string) {
  //       ReusableMethods.waitForVisibility(patient.alertlist.get(0), 10);
 //        if (!patient.alertlist.isEmpty()) {
      //     assertFalse(istenenText + " goruntulendi.", patient.alertList.get(0).getText().contains(istenenText));
    }

    //  @And("kullanici (string) butonuna tiklar")
    //  public void kullaniciUserManegementButonunaTiklar(String button){
    //  Driver.getDriver().findElement(By.xpath("//*[text()='"+ button+"']")).click();


    @Then("Items Titles menusune tiklar")
    public void items_titles_menusune_tiklar() {
        ReusableMethods.waitForClickablility(patient.itemsAndTitlesButton, 3);
        patient.itemsAndTitlesButton.click();
    }

    @Given("kullanici deleted uyarisinin gorundugunu test eder")
    public void kullanici_deleted_uyarisinin_gorundugunu_test_eder(String string) {

    }
    @Given("{string} basliga tiklar")
    public void basliga_tiklar(String button) {
     WebElement webelement= Driver.getDriver().findElement(By.xpath("//*[text()='"+ button+"']"));
        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].scrollIntoView()",webelement);
     ReusableMethods.waitForClickablility(webelement,5);
     webelement.click();
    }
}