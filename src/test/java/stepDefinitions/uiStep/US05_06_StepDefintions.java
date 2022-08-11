package stepDefinitions.uiStep;

import com.github.javafaker.Faker;
import io.cucumber.java.en.*;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import pages.US05_06_Page;
import utilities.ConfigReader;
import utilities.Driver;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class US05_06_StepDefintions {
/*
    US05_06_Page us05_06_Page = new US05_06_Page();
    Faker faker=new Faker();
    String expectedCreatedDate;
    int actualCreatedIndex;

    @Given("Hasta {string} ana sayfasina gider")
    public void hasta_ana_sayfasina_gider(String string) {
        Driver.getDriver().get(ConfigReader.getProperty("medunnaUrl"));
    }

    @Given("Anasayfada giris ikonuna tiklar")
    public void anasayfa_giris_ikonuna_tiklar() {
        us05_06_Page.girisIkonu.click();
    }

    @Given("Sign in secenegine tiklar")
    public void sign_in_secenegine_tiklar() {
        us05_06_Page.signInTextElement.click();
    }

    @Given("Gecerli bir username girer")
    public void gecerli_bir_username_girer() {
        us05_06_Page.signInUsername.sendKeys(ConfigReader.getProperty("patientUser"));
    }

    @Given("Gecerli bir parola girer")
    public void gecerli_bir_parola_girer() {
        us05_06_Page.signInPassword.sendKeys(ConfigReader.getProperty("password"));
    }

    @Given("Sign in buttonuna tiklar")
    public void sign_in_buttonuna_tiklar() {
        us05_06_Page.signInButton.click();
    }

    @Given("My Pages\\(patient)e tiklar")
    public void my_pages_patient_e_tiklar() {
        us05_06_Page.myPagesPatient.click();
    }

    @Given("Make an Appointmenta tiklar")
    public void make_an_appointmenta_tiklar() {
        us05_06_Page.makeAnAppointmentElement.click();
    }

    @Then("First Name kutusunun bos birakilamayacagini kontrol eder")
    public void first_name_kutusunun_bos_birakilamayacagini_kontrol_eder() throws InterruptedException {
        us05_06_Page.makeAnAppointmentUserName.clear();
        us05_06_Page.sendAnAppointmentRequest.click();

        String expectedResult = "Your FirstName is required.";
        String actualResult = us05_06_Page.firstNameRequiredTextElement.getText();

        Assert.assertEquals(expectedResult, actualResult);
    }

    @And("Sayfayi kapatir")
    public void sayfayiKapatir() throws InterruptedException {
        Thread.sleep(3000);
        Driver.closeDriver();
    }

    @And("SSN kutusunun bos birakilamayacagini kontrol eder")
    public void ssnKutusununBosBirakilamayacaginiKontrolEder() {
        us05_06_Page.makeAnAppointmentSsn.clear();
        us05_06_Page.sendAnAppointmentRequest.click();

        String expectedResult = "Your SSN is required.";
        String actualResult = us05_06_Page.ssnRequiredTextElement.getText();

        Assert.assertEquals(expectedResult, actualResult);
    }

    @And("Last Name kutusunun bos birakilamayacagini kontrol eder")
    public void lastNameKutusununBosBirakilamayacaginiKontrolEder() {
        us05_06_Page.makeAnAppointmentLastName.clear();
        us05_06_Page.sendAnAppointmentRequest.click();

        String expectedResult = "Your LastName is required.";
        String actualResult = us05_06_Page.lastNameRequiredTextElement.getText();

        Assert.assertEquals(expectedResult, actualResult);

    }

    @And("Phone kutusunun bos birakilamayacagini kontrol eder")
    public void phoneKutusununBosBirakilamayacaginiKontrolEder() {
        us05_06_Page.makeAnAppointmentPhone.clear();
        us05_06_Page.sendAnAppointmentRequest.click();

        String expectedResult = "Phone number is required.";
        String actualResult = us05_06_Page.phoneNumberRequiredTextElement.getText();

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Given("Randevu formuna telefon numarasi girer")
    public void randevu_formuna_telefon_numarasi_girer() {
        us05_06_Page.makeAnAppointmentPhone.sendKeys(ConfigReader.getProperty("patientPhoneNumber"));
    }

    @Given("Send an Appointment Requeste tiklar")
    public void send_an_appointment_requeste_tiklar() {
        us05_06_Page.sendAnAppointmentRequest.click();
        LocalDateTime myDateObj = LocalDateTime.now();
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd/MM/yy HH:mm");
        expectedCreatedDate = myDateObj.format(myFormatObj);
    }

    @Given("Randevu olusturuldugunu kontrol eder")
    public void randevu_olusturuldugunu_kontrol_eder() {
        //Assert.assertTrue(us05_06_Page.appointmentSavedTextElement.isDisplayed());

    }

    @Given("My Appointmentsa tiklar")
    public void my_appointmentsa_tiklar() {
        us05_06_Page.makeAppointmentsElement.click();
    }

    @Given("Ramdevularin goruntulendigini kontrol eder")
    public void ramdevularin_goruntulendigini_kontrol_eder() {


        for (int i = 0; i < us05_06_Page.createdDateElements.size() ; i++) {
            JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
            js.executeScript("arguments[0].scrollIntoView();", us05_06_Page.createdDateElements.get(i));
            if(us05_06_Page.createdDateElements.get(i).getText().contains(expectedCreatedDate)){
                actualCreatedIndex=i;
                break;
            }
        }
        String actualCreatedDate=us05_06_Page.createdDateElements.get(actualCreatedIndex).getText();

        Assert.assertEquals(actualCreatedDate, expectedCreatedDate);
        System.out.println();
    }

    @Given("Settingse tiklar")
    public void settingse_tiklar() {
        us05_06_Page.settings.click();
    }

    @Given("First Name bilgisinin dogrulugunu kontrol eder")
    public void first_name_bilgisinin_dogrulugunu_kontrol_eder() throws InterruptedException {
        String expectedFirstName = ConfigReader.getProperty("userFirstName");
        String actualFirstName = us05_06_Page.settingsFirstName.getText();

        Assert.assertEquals(actualFirstName, expectedFirstName);
    }

    @Given("Last Name bilgisinin dogrulugunu kontrol eder")
    public void last_name_bilgisinin_dogrulugunu_kontrol_eder() {
        String expectedLastName = ConfigReader.getProperty("userLastName");
        String actualLastName = us05_06_Page.settingsLastName.getText();

        Assert.assertEquals(actualLastName, expectedLastName);

    }

    @Given("Email bilgisinin dogrulugunu kontrol eder")
    public void email_bilgisinin_dogrulugunu_kontrol_eder() {
        String expectedEmail = ConfigReader.getProperty("userEmail");
        String actualEmail = us05_06_Page.settingsEmail.getText();

        //Assert.assertEquals(actualEmail, expectedEmail);

    }

    @And("First Name bilgisinin degistirilebildigini kontrol eder")
    public void firstNameBilgisininDegistirilebildiginiKontrolEder() {
        us05_06_Page.settingsFirstName.clear();
        us05_06_Page.settingsFirstName.sendKeys(ConfigReader.getProperty("newUserFirstName") + Keys.ENTER);
        Driver.getDriver().navigate().refresh();

        String expectedFirstName = ConfigReader.getProperty("newUserFirstName");
        String actualFirstName = us05_06_Page.settingsFirstName.getText();

        Assert.assertEquals(actualFirstName, expectedFirstName);

        us05_06_Page.settingsFirstName.clear();
        us05_06_Page.settingsFirstName.sendKeys(ConfigReader.getProperty("userFirstName") + Keys.ENTER);

    }

    @And("Last Name bilgisinin degistirilebildigini kontrol eder")
    public void lastNameBilgisininDegistirilebildiginiKontrolEder() {
        us05_06_Page.settingsLastName.clear();
        us05_06_Page.settingsLastName.sendKeys(ConfigReader.getProperty("newUserLastName") + Keys.ENTER);
        Driver.getDriver().navigate().refresh();

        String expectedLastName = ConfigReader.getProperty("newUserLastName");
        String actualLastName = us05_06_Page.settingsFirstName.getText();

        Assert.assertEquals(actualLastName, expectedLastName);

        us05_06_Page.settingsLastName.clear();
        us05_06_Page.settingsLastName.sendKeys(ConfigReader.getProperty("userLastName") + Keys.ENTER);

    }

    @And("Email bilgisinin degistirilebildigini kontrol eder")
    public void emailBilgisininDegistirilebildiginiKontrolEder() {
        us05_06_Page.settingsEmail.clear();
        String firstEmail = us05_06_Page.settingsEmail.getText();
        us05_06_Page.settingsEmail.sendKeys(faker.internet().emailAddress() + Keys.ENTER);
        Driver.getDriver().navigate().refresh();

        String actualEmail = us05_06_Page.settingsEmail.getText();

        Assert.assertEquals(actualEmail, firstEmail);
    }
*/

}