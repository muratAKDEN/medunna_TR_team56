package stepDefinitions.uiStep;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;
import pages.US12_13;
import pages.US18;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.ArrayList;
import java.util.List;

public class US18_StepDefinitions {
    US12_13 us12_13 =new US12_13();
    US18 us18=new US18();
    SoftAssert softAssert=new SoftAssert();

    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
    Select select;
    String firstName="Bosver";
    String lastName="neden";
    String birthDate="20.12.1994";
    String phone="765-888-0987";
    String adress="Kim bilir nerede";
    String gender="MALE";
    String speciality="Ophthalmology";
    String blood="AB+";
    String desc="Aciklamam yok";
    String examFree="700";


    @Given("Admin {string} gider")
    public void admin_gider(String url) {
        Driver.getDriver().get(ConfigReader.getProperty(url));
    }
    @When("Admin Giris ikonuna tiklar")
    public void admin_giris_ikonuna_tiklar() {
        us12_13.accountMenu.click();
    }
    @When("Admin Sign in secenegine tiklar")
    public void admin_sign_in_secenegine_tiklar() {
      us12_13.signInButton1.click();
    }
    @When("Admin Sign in butonuna tiklar")
    public void admin_sign_in_butonuna_tiklar() {
      us12_13.signInButton2.click();
    }
    @When("Admin Physician secenegine tiklar")
    public void admin_physician_secenegine_tiklar() {
      us18.physicianSecenegi.click();
    }
    @When("Admin Create a new physician butonuna tiklar")
    public void admin_create_a_new_physician_butonuna_tiklar() {
        ReusableMethods.waitFor(3);
      us18.createANewPhysicianButton.click();
    }
    @When("Admin Search User butonuna tiklar")
    public void admin_search_user_butonuna_tiklar() {
        us18.useSearch.click();
       us18.searchUserButton.click();

    }
    @When("Admin alert mesajinin {string} oldugunu test eder")
    public void admin_alert_mesajinin_oldugunu_test_eder(String alert) {
        ReusableMethods.waitFor(3);
        softAssert.assertEquals(us18.alertSSNDelete.getText(),alert);
    }
    @Then("Admin Sayfayi kapatir")
    public void admin_sayfayi_kapatir() {
      //Driver.closeDriver();
    }

    @And("Admin ItemsTitles butonuna tiklar")
    public void adminItemsTitlesButonunaTiklar() {
        ReusableMethods.waitFor(2);
        us18.itemTitlesDropdown.click();

    }

    @And("Admin valid {string} ve valid {string} ile giris yapar")
    public void adminValidVeValidIleGirisYapar(String userName, String password) {
        us12_13.userNameButton.sendKeys(ConfigReader.getProperty(userName));
        us12_13.passwordButton.sendKeys(ConfigReader.getProperty(password));
    }

    @And("Admin SSN kutusuna kayitli bir {string} numarasi girer")
    public void adminSSNKutusunaKayitliBirNumarasiGirer(String ssn) {
        us18.ssnBox.sendKeys(ConfigReader.getProperty(ssn));
    }

    @And("Admin Physicians tablosundaki butun doktorlarin bigilerinin gorunur oldugunu test eder")
    public void adminPhysiciansTablosundakiButunDoktorlarinBigilerininGorunurOldugunuTestEder() {
        for (WebElement w:us18.physiciansTable
             ) {
            softAssert.assertTrue(w.isDisplayed());
        }
    }

    @And("Admin Save butonuna tiklar")
    public void adminSaveButonunaTiklar() {
        js.executeScript("arguments[0].scrollIntoView()",us18.createPhysicianSaveButton);
        js.executeScript("arguments[0].click();",us18.createPhysicianSaveButton);
    }

    @And("Admin son sayfaya gider ve son siradaki delete butonuna tiklar")
    public void adminSonSayfayaGiderVeSonSiradakiDeleteButonunaTiklar() {
        js.executeScript("arguments[0].click();",us18.physicianSayfa23);
        ReusableMethods.waitFor(3);
        js.executeScript("arguments[0].click();",us18.deleteButton);
        us18.deleteAlert.click();
    }

    @And("Admin ilk edit butonuna tiklar")
    public void adminIlkEditButonunaTiklar() {
        us18.physicianEditButton.click();
    }

    @And("Admin doktor bilgilerini gunceller")
    public void adminDoktorBilgileriniGunceller() {
        us18.physicianFirstnameButton.clear();
        us18.physicianFirstnameButton.sendKeys(firstName);
        ReusableMethods.waitFor(1);
        us18.physicianLastnameButton.clear();
        us18.physicianLastnameButton.sendKeys(lastName);
        ReusableMethods.waitFor(1);
        us18.physicianBirthDateButton.clear();
        us18.physicianBirthDateButton.sendKeys(birthDate);
        ReusableMethods.waitFor(1);
        us18.physicianPhoneButton.clear();
        us18.physicianPhoneButton.sendKeys(phone);
        ReusableMethods.waitFor(1);
        us18.physicianAdressButton.clear();
        us18.physicianAdressButton.sendKeys(adress);
        ReusableMethods.waitFor(1);
        select=new Select(us18.genderDdm);
        select.selectByVisibleText("OTHER");
        ReusableMethods.waitFor(1);
        select=new Select(us18.specialityDdm);
        select.selectByVisibleText("Nuclear_medicine");
        ReusableMethods.waitFor(1);
        select=new Select(us18.physicianBloodGroupButton);
        select.selectByVisibleText("O+");
        ReusableMethods.waitFor(1);
        us18.physicianDescriptionButton.clear();
        us18.physicianDescriptionButton.sendKeys(desc);
        ReusableMethods.waitFor(1);
        us18.imageButton.clear();
        String str="C:\\Users\\user\\OneDrive\\Masaüstü\\Urunler Pic\\doktorlar_800.jpg";
        us18.imageButton.sendKeys(str);
        ReusableMethods.waitFor(1);
        us18.examFreeButton.clear();
        us18.examFreeButton.sendKeys(examFree);
        ReusableMethods.waitFor(1);
        select=new Select(us18.physicianCountryDdm);
        select.selectByVisibleText("Germany");
        ReusableMethods.waitFor(1);
        select=new Select(us18.physicianStateCityDdm);
        //select.selectByVisibleText("Nebraska");
        //softAssert.assertTrue(us18.physicianStateCityDdm.getText().contains("Nebraska"),"State/City olmasi gerektigi gibi calismiyor");

    }
    @And("Admin Physician tablosunda doktor bilgilerinin guncellenmis oldugunu test eder")
    public void adminPhysicianTablosundaDoktorBilgilerininGuncellenmisOldugunuTestEder() {

     List<String> expected=new ArrayList<>();
     expected.add(firstName);
     expected.add(lastName);
     expected.add(birthDate);
     expected.add(phone);
     expected.add(adress);
     expected.add(gender);
     expected.add(speciality);
     expected.add(blood);
     expected.add(desc);
     expected.add(examFree);
     softAssert.assertEquals(us18.editPhysicianList.get(3),firstName);
    //List<String> actualPhysician=new ArrayList<>();
    //for (WebElement w:us18.editPhysicianList
    //) {
    //    actualPhysician.add(w.getText());
    //}
    //softAssert.assertTrue(actualPhysician.containsAll(expected));
    softAssert.assertAll();

    }

    @Then("Admin alert mesajinin {string} icerdigini test eder")
    public void adminAlertMesajininIcerdiginiTestEder(String deleteAlert) {
        ReusableMethods.waitFor(3);
        System.out.println(us18.alertSSNDelete.getText());
        System.out.println(deleteAlert);
        Assert.assertTrue("Actual alert ve expected alert farkli",us18.alertSSNDelete.getText().contains(deleteAlert));


    }
}
