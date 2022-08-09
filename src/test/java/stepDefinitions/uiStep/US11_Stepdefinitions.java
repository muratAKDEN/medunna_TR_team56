package stepDefinitions.uiStep;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.US11_Pages;
import utilities.ConfigReader;
import utilities.Driver;

public class US11_Stepdefinitions {
    US11_Pages us11_pages=new US11_Pages();

    Actions actions = new Actions(Driver.getDriver());
    Faker faker = new Faker();
    String fakerName = faker.name().fullName();

    @Given("kullanici {string} anasayfasindaa")
    public void kullanici_anasayfasinda(String medunna) {
        Driver.getDriver().get(ConfigReader.getProperty("medunnaUrl"));
    }
    @Then("doktor signInbutonu tiklar")
    public void doktor_sign_ınbutonu_tiklar() {
        us11_pages.signInButonu.click();
    }
    @Then("doktor loginButonu tiklar")
    public void doktor_login_butonu_tiklar() {
        us11_pages.loginButonu.click();
    }
    @Then("doktor {string} ve {string} girer SignIn tıklar")
    public void doktor_ve_girer_sign_ın_tıklar(String string, String string2) {
        us11_pages.username.sendKeys("doctor-healthprojectteam56" + Keys.TAB);
        us11_pages.password.sendKeys("Teamproject.56" + Keys.TAB);


        actions
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .perform();
        us11_pages.signIn.click();
    }
    @Then("doktor mypages butonuna tiklar")
    public void doktor_mypages_butonuna_tiklar() {
        us11_pages.myPages.click();
    }
    @Then("doktor myAppointments butonuna tiklar")
    public void doktor_my_appointments_butonuna_tiklar() {
        us11_pages.myAppointments.click();
    }
    @Then("doktor edit butonuna tiklar")
    public void doktor_edit_butonuna_tiklar() {
        us11_pages.editButonu.click();
    }
    @Then("doktor Create or Edit an Appointment yazisini gorur")
    public void doktor_create_or_edit_an_appointment_yazisini_gorur() {
        Assert.assertTrue(us11_pages.createYazisi.isDisplayed());

    }

    @Given("doktor {string},{string},{string},{string},{string} gorebilmeli")
    public void doktorGorebilmeli(String ID, String SrartDateTime, String EndDataTime, String Status, String aPhysician) {
        Assert.assertTrue(us11_pages.Id.isDisplayed());
        Assert.assertTrue(us11_pages.startDateTime.isDisplayed());
        Assert.assertTrue(us11_pages.endDateTime.isDisplayed());
        Assert.assertTrue(us11_pages.status.isDisplayed());
        Assert.assertTrue(us11_pages.patient.isDisplayed());
    }

    @Given("doktor {string},{string} ve {string} alanlarini doldurmali")
    public void doktorVeAlanlariniDoldurmali(String Anamnesis, String Treatment, String Diagnosis) {
        actions.click(us11_pages.anamnesis)
                .sendKeys(fakerName)
                .sendKeys(Keys.TAB)
                .sendKeys(fakerName)
                .sendKeys(Keys.TAB)
                .sendKeys(fakerName)
                .perform();
    }

    @Given("doktor {string},{string} doldurmali")
    public void doktorDoldurmali(String prescription, String description) {
        us11_pages.prescription.sendKeys(fakerName);
        us11_pages.description.sendKeys(fakerName);
    }

    @Given("doktor status olarak secebilmeli")
    public void doktorOlarakSecebilmeli(String status) {
        WebElement ddo= us11_pages.status;
        Select select= new Select(ddo);
        select.selectByVisibleText("PENDING");
        select.selectByVisibleText("COMPLETED");
        select.selectByVisibleText("CANCELLED");
    }
}
