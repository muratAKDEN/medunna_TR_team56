package stepDefinitions.uiStep;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import pages.US12_13;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.ArrayList;
import java.util.List;

public class US12_13_StepDefinitions {
    US12_13 us12_13 =new US12_13();
    JavascriptExecutor js = (JavascriptExecutor)Driver.getDriver();

    @Given("Doktor {string} gider")
    public void doktor_gider(String url) {
        Driver.getDriver().get(ConfigReader.getProperty(url));
    }

    @When("Doktor Giris ikonuna tiklar")
    public void doktorGirisIkonunaTiklar() {
        us12_13.accountMenu.click();
    }

    @Then("Doktor Sign in secenegine tiklar")
    public void doktorSignInSecenegineTiklar() {
        us12_13.signInButton1.click();
    }

    @And("Doktor valid {string} ve valid {string} ile giris yapar")
    public void doktorValidVeValidIleGirisYapar(String username, String password) {
        us12_13.userNameButton.sendKeys(ConfigReader.getProperty(username));
        us12_13.passwordButton.sendKeys(ConfigReader.getProperty(password));
    }

    @And("Doktor Sign in butonuna tiklar")
    public void doktorSignInButonunaTiklar() {
       us12_13.signInButton2.click();
    }

    @And("Doktor My Pages'e tiklar")
    public void doktorMyPagesETiklar() {
        us12_13.myPages.click();
    }

    @And("Doktor My appointments'e tiklar")
    public void doktorMyAppointmentsETiklar() {
        us12_13.myAppointments.click();
    }

    @And("Doktor Edit butonuna tiklar")
    public void doktorEditButonunaTiklar() {
        us12_13.editButton.click();
        ReusableMethods.waitFor(3);
    }

    @And("Doktor Request A Test butonuna tiklar")
    public void doktorRequestATestButonunaTiklar() {
        us12_13.requestATest.click();
        ReusableMethods.waitFor(5);
    }

    @And("Doktor Test items tablosunun gorunur oldugunu test eder")
    public void doktorTestItemsTablosununGorunurOldugunuTestEder() {
        for (WebElement w:us12_13.testItemsTable
             ) {
            Assert.assertTrue(w.isDisplayed());
        }
    }

    @Then("Doktor sayfayi kapatir")
    public void doktorSayfayiKapatir() {
        Driver.closeDriver();
    }

    @And("Doktor Testlere tiklar")
    public void doktorTestlereTiklar() {
        //    //js.executeScript("document.getElementById("+w+").click();");
        //    js.executeScript("window.scrollBy(0,200)");
        js.executeScript("arguments[0].scrollIntoView()",us12_13.sodiumbutton);
        js.executeScript("arguments[0].click();",us12_13.sodiumbutton);
        js.executeScript("arguments[0].scrollIntoView()",us12_13.ureaButton);
        js.executeScript("arguments[0].click();",us12_13.ureaButton);
        js.executeScript("arguments[0].scrollIntoView()",us12_13.creatinineButton);
        js.executeScript("arguments[0].click();",us12_13.creatinineButton);
        js.executeScript("arguments[0].scrollIntoView()",us12_13.albuminButton);
        js.executeScript("arguments[0].click();",us12_13.albuminButton);
        js.executeScript("arguments[0].scrollIntoView()",us12_13.hemoglobinButton);
        js.executeScript("arguments[0].click();",us12_13.hemoglobinButton);
        js.executeScript("arguments[0].scrollIntoView()",us12_13.glucoseButton);
        js.executeScript("arguments[0].click();",us12_13.glucoseButton);
        js.executeScript("arguments[0].scrollIntoView()",us12_13.potassiumButton);
        js.executeScript("arguments[0].click();",us12_13.potassiumButton);
       ReusableMethods.waitFor(5);
    }




    @And("Doktor save butonuna tiklar")
    public void doktorSaveButonunaTiklar() {
        js.executeScript("arguments[0].scrollIntoView()",us12_13.saveButton);
        ReusableMethods.waitFor(2);
        js.executeScript("arguments[0].click();", us12_13.saveButton);
        ReusableMethods.waitFor(3);
    }

    @And("Doktor Show Test Result butonuna tiklar")
    public void doktorShowTestResultButonunaTiklar() {
        us12_13.showTestResultButton.click();
        ReusableMethods.waitFor(2);
    }

    @And("Doktor View Results butonuna tiklar")
    public void doktorViewResultsButonunaTiklar() {
        us12_13.viewResultsButton.click();
        ReusableMethods.waitFor(3);
    }

    @And("Doktor id,name\\(Urea Sodium Glucose etc),default maximum value, default minimum value, test, description, and date bilgilerinin gorunur oldugunu test eder")
    public void doktorIdNameUreaSodiumGlucoseEtcDefaultMaximumValueDefaultMinimumValueTestDescriptionAndDateBilgilerininGorunurOldugunuTestEder() {
        //Assert.assertTrue(us12_13Page.testResultsBaslik.isDisplayed());
        List<String> expectedBaslik=new ArrayList<>();
        expectedBaslik.add("ID");
        expectedBaslik.add("Name");
        expectedBaslik.add("Result");
        expectedBaslik.add("Default Min. Value");
        expectedBaslik.add("Default Max. Value");
        expectedBaslik.add("Test");
        expectedBaslik.add("Description");
        expectedBaslik.add("Date");

        List<String> actualBaslik=new ArrayList<>();
        for (WebElement w: us12_13.testResultsBaslikIsimleri
        ) {
            actualBaslik.add(w.getText());
        }
        Assert.assertTrue(actualBaslik.containsAll(expectedBaslik));
    }

    @And("Doktor Request Inpatient butonuna tiklar")
    public void doktorRequestInpatientButonunaTiklar() {
        us12_13.requestInpatientButton.click();
        ReusableMethods.waitFor(5);
    }

    @And("Doktor My Inpatients butonuna tiklar")
    public void doktorMyInpatientsButonunaTiklar() {
        us12_13.myInpatientsButton.click();
    }

    @And("Doktor yatan hastalar\\(Inpatients) tablosunda hasta bilgilerinin gorunur oldugunu test eder")
    public void doktorYatanHastalarInpatientsTablosundaHastaBilgilerininGorunurOldugunuTestEder() {
        for (WebElement w:us12_13.inpatientsBilgileriTablosu
        ) {
            Assert.assertTrue(w.isDisplayed());
        }
    }

    @And("Doktor Test iceriginde \\(glucose, Urea, Creatinine, Sodium, Potassium-, Albumin, Hemoglobin) seceneklerinin oldugunu test eder")
    public void doktorTestIcerigindeGlucoseUreaCreatinineSodiumPotassiumAlbuminHemoglobinSeceneklerininOldugunuTestEder() {
        List<String> expectedTestListesi=new ArrayList<>();
        expectedTestListesi.add("glucose");
        expectedTestListesi.add("Urea");
        expectedTestListesi.add("Creatinine");
        expectedTestListesi.add("Sodium");
        expectedTestListesi.add("Potassium-");
        expectedTestListesi.add("Albumin");
        expectedTestListesi.add("Hemoglobin");

        List<String> actualTestListesi=new ArrayList<>();
        for (WebElement w: us12_13.testResultsListesi
        ) {
            actualTestListesi.add(w.getText());
        }
        Assert.assertTrue(actualTestListesi.containsAll(expectedTestListesi));

    }
    }


