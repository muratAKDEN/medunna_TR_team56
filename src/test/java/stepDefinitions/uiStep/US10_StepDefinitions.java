package stepDefinitions.uiStep;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import pages.US10_Page;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US10_StepDefinitions {
    US10_Page US10_Page = new US10_Page();



    @Given("Doktor medunna sitesine gider")
    public void doktor_medunna_sitesine_gider() {
        Driver.getDriver().get("https://www.medunna.com");

    }
    @Given("Doktor User simgesine tiklar")
    public void doktor_user_simgesine_tiklar() {
        US10_Page.signInButonu.click();

    }
    @Given("Doktor Sign in secenegini tiklar")
    public void doktor_sign_in_secenegini_tiklar() {
        US10_Page.signIn.click();

    }
    @Given("Doktor gecerli bir username girer")
    public void doktor_gecerli_bir_username_girer() {
        US10_Page.username.sendKeys(ConfigReader.getProperty("username"));

    }
    @Given("Doktor gecerli bir password girer")
    public void doktor_gecerli_bir_password_girer() {
        US10_Page.password.sendKeys(ConfigReader.getProperty("password"));

    }

    @Given("Doktor My Pages butonuna tiklar")
    public void doktor_my_pages_butonuna_tiklar() {
        US10_Page.myPages.click();
        ReusableMethods.waitFor(2);
    }
    @Given("Doktor acilan pencereden My appointments butonuna tiklar")
    public void doktor_acilan_pencereden_my_appointments_butonuna_tiklar() {
        US10_Page.myAppointments.click();
        ReusableMethods.waitFor(4);
    }

    @Given("Doktor randevu listesini gorebildigini test eder")
    public void doktor_randevu_listesini_gorebildigini_test_eder() {
        Assert.assertTrue(US10_Page.appointmentList.isDisplayed());
        ReusableMethods.waitFor(4);

    }

    @Given("Doktor zaman dilimlerini gorebildigini test eder")
    public void doktor_zaman_dilimlerini_gorebildigini_test_eder(){
        Assert.assertTrue(US10_Page.timeSlots.isDisplayed());
        ReusableMethods.waitFor(4);

    }

    @Given("Doktor patient id, start date, end date, status bilgilerini gorebildigini test eder")
    public void doktor_patient_id_start_date_end_date_status_bilgilerini_gorebildigini_test_eder() {
        Assert.assertTrue(US10_Page.Id.isDisplayed());
        Assert.assertTrue(US10_Page.startDateTime.isDisplayed());
        Assert.assertTrue(US10_Page.endDateTime.isDisplayed());
        Assert.assertTrue(US10_Page.status.isDisplayed());
        ReusableMethods.waitFor(4);
    }
}
