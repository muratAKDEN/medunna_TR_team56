package stepDefinitions.uiStep;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.Ayse_Page;
import utilities.ConfigReader;
import utilities.Driver;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class US07_StepDefinitions {
    Ayse_Page pages = new Ayse_Page();

    @Given("kullanici Medunna internet sitesinin anasayfasina gider")
    public void hastaMedunnaAnasayfasinaGider(){
        Driver.getDriver().get(ConfigReader.getProperty("medunnaUrl"));
    }

    @Then("Hasta dropdown ikonuna tiklar")
    public void hastaDropDownIkonunaTiklar(){
        pages.dropDownIkonu.click();
    }

    @And("Hasta sign in elementini tiklar")
    public void hastaSigninElementinitiklar(){
        pages.signinElementi.click();
    }

    @And("Hasta gecerli bir username girer")
    public void hastaGecerliBirUsernameGirer(){
        pages.usernameBox.sendKeys(ConfigReader.getProperty("patientUser"));
    }

    @And("Hasta gecerli bir password girer")
    public void hastaGecerliBirPasswordGirer(){
        pages.passwordBox.sendKeys(ConfigReader.getProperty("password"));
    }

    @And("Hasta signinButonuna tiklar")
    public void hastaSigninButonunaTiklar(){
        pages.signinButonu.click();
    }

    @And("Hasta My Pages-patient elementine tiklar")
    public void myPagespatientElementineTiklar(){
        pages.mypagesElementi.click();
    }

    @Then("Hasta Make an Appointment butonuna tiklar")
    public void makeAnAppointmentButonunaTiklar(){
        pages.makeanAppointmentButonu.click();
    }

    @And("Hasta Phone boxa telefon numarasi girer")
    public void phoneBoxaTelefonNumarasiGirer(){
        pages.phoneBox.sendKeys(ConfigReader.getProperty("patientPhoneNumber"));
    }

    @And("Hasta appointment DateTime Gecmis bir tarih girer")
    public void appointmentDateTimeBoxaGecmisBirTarihGirer(){
        pages.appointmentDateTimeBox.sendKeys(ConfigReader.getProperty("gecmisTarih"));
    }

    @When("Hasta gecmis bir tarihle randevu alinamayacagini test eder")
    public void gecmisTarihleRandevuAlinamayacaginiTestEder(){
        Assert.assertTrue(pages.pastDateTextElement.isDisplayed());
    }

     @Then("Hasta Guncel tarihle randevu alinabilecegini test eder")
    public void guncelTarihleRandevuAlinabileceginiTestEder() {
        Date simdikiZaman = new Date();
        System.out.println(simdikiZaman.toString());
        DateFormat df = new SimpleDateFormat("dd.MM.yyyy");
        System.out.println(df.format(simdikiZaman));
         pages.appointmentDateTimeBox.sendKeys(df.format(simdikiZaman));
    }

    @Then("Hasta appointment DateTime Boxa guncel veya gelecekteki bir tarih girer")
    public void appointmentDateTimeBoxaGuncelVeyaGelecekBirTarihGirer(){
        pages.appointmentDateTimeBox.sendKeys(ConfigReader.getProperty("gelecekTarih"));
    }

    @And("Hasta appointment request butonunu tiklar")
    public void appointmentRequestButonunuTiklar(){
        pages.appointmentRequestButonu.click();
    }

    @When("Hasta guncel veya gelecek bir tarih girilebilecegini dogrular")
    public void guncel_gelecekTarihleRandevuAlinabileceginiDogrular(){
        Assert.assertTrue(pages.randevuKabulTextElementi.isDisplayed());
    }

    @And("Hasta girilen tarihin gg.aa.yyyy formunda oldugunu dogrular")
    public void hastaGirilenTarihinGgAaYyyyFormundaOldugunuDogrular() {

       // US07_Page.appointmentDateTimeBox.sendKeys(ConfigReader.getProperty("unvaliddate"));

        pages.appointmentDateTimeBox.sendKeys(ConfigReader.getProperty("unvalidDate"));

    }

    @And("Hasta Sayfayi kapatir")
    public void sayfayiKapatir() throws InterruptedException {
        Thread.sleep(3000);
        Driver.closeDriver();
    }
}
