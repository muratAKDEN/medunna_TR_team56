package stepDefinitions.uiStep;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import pages.US12_13;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.ArrayList;
import java.util.List;

public class US12_13StepDefinitions {
    US12_13 us12_13 =new US12_13();
    JavascriptExecutor js ;

    @Given("Doktor {string} gider")
    public void doktor_gider(String url) {
        Driver.getDriver().get(ConfigReader.getProperty(url));
    }

    @Then("Sign in secenegine tiklar")
    public void sign_in_secenegine_tiklar() {
      us12_13.signInButton.click();
    }
    @Then("Gecerli kullanici adi ve gecerli sifre ile giris yapar")
    public void gecerli_kullanici_adi_ve_gecerli_sifre_ile_giris_yapar() {
       us12_13.userNameButton.sendKeys(ConfigReader.getProperty("doktorErva"));
       us12_13.passwordButton.sendKeys(ConfigReader.getProperty("passwordErva"));
    }
    @Then("Sign in butonuna tiklar")
    public void sign_in_butonuna_tiklar() {
        us12_13.signInButton2.click();
    }
    @Then("My Pages\\(patient)e tiklar")
    public void my_pages_patient_e_tiklar() {
        us12_13.myPages.click();
    }
    @Then("My appointments'e tiklar")
    public void my_appointments_e_tiklar() {
        us12_13.myAppointments.click();
    }
    @Then("Edit butonuna tiklar")
    public void edit_butonuna_tiklar() {
        us12_13.editButton.click();
        ReusableMethods.waitFor(3);

    }
    @Then("Request A Test  butonuna tiklar")
    public void request_a_test_butonuna_tiklar() {
        us12_13.requestATest.click();
        ReusableMethods.waitFor(5);
    }


    @And("Test items tablosu gorunur olmali")
    public void testItemsTablosuGorunurOlmali() {
        Assert.assertTrue(us12_13.testItemsTable.isDisplayed());
    }

    @And("sayfayi kapatir")
    public void sayfayiKapatir() {
        Driver.closeDriver();
    }


    @And("Testlere tiklar")
    public void testlereTiklar() {
        js = (JavascriptExecutor)Driver.getDriver();

        for (WebElement w: us12_13.buttonListesi
        ) {
            //js.executeScript("document.getElementById("+w+").click();");
            js.executeScript("arguments[0].click();",w);
            js.executeScript("window.scrollBy(0,200)");
        }
        js.executeScript("window.scrollBy(0,10000)");
        ReusableMethods.waitFor(5);
    }

    @And("Test içeriğinde Glucose Urea Creatinine Sodium Potassium Total protein Albumin Hemoglobin seçenekleri olmalı")
    public void testIçeriğindeGlucoseUreaCreatinineSodiumPotassiumTotalProteinAlbuminHemoglobinSeçenekleriOlmalı() {
        List<String> expectedTestListesi=new ArrayList<>();
        expectedTestListesi.add("glucose");
        expectedTestListesi.add("Urea");
        expectedTestListesi.add("Creatinine-");
        expectedTestListesi.add("Sodium-");
        expectedTestListesi.add("Potassium-");
        expectedTestListesi.add("Albumin");
        expectedTestListesi.add("Hemoglobin");

       List<String> actualTestListesi=new ArrayList<>();
        for (WebElement w: us12_13.testListesi
             ) {
            actualTestListesi.add(w.getText());
        }
        Assert.assertTrue(actualTestListesi.containsAll(expectedTestListesi));
    }

    @And("Show Test Result butonuna tiklar")
    public void showTestResultButonunaTiklar() {
        us12_13.showTestResultButton.click();
        ReusableMethods.waitFor(2);
    }

    @And("View Results butonuna tiklar")
    public void viewResultsButonunaTiklar() {
       us12_13.viewResultsButton.click();
       ReusableMethods.waitFor(3);
    }

    @And("id name\\(Urea Sodium Glucose etc) default maximum value default minimum value test description and date bilgileri gorunur olmali")
    public void idNameUreaSodiumGlucoseEtcDefaultMaximumValueDefaultMinimumValueTestDescriptionAndDateBilgileriGorunurOlmali() {
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

    @And("Request Inpatient butonuna tiklar")
    public void requestInpatientButonunaTiklar() {
        us12_13.requestInpatientButton.click();
        ReusableMethods.waitFor(5);
    }

    @And("A new In Patient is created with identifier mesaji gorunur olmali")
    public void aNewInPatientIsCreatedWithIdentifierMesajiGorunurOlmali() {
        String expectedAlert="A new In Patient is created with identifier 164867";
        WebElement alertMesaji=Driver.getDriver().findElement(By.xpath("//div[@class='Toastify__toast-container Toastify__toast-container--top-left toastify-container']"));
        System.out.println(alertMesaji.getText());
        Assert.assertTrue(alertMesaji.getText().contains(expectedAlert));
    }

    @And("save butonuna tiklar")
    public void saveButonunaTiklar() {
        js.executeScript("arguments[0].click();", us12_13.saveButton);
        ReusableMethods.waitFor(3);
       String aa= "hahahhahha";
    }
}

