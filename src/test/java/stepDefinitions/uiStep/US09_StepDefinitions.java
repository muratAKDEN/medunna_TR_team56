package stepDefinitions.uiStep;

import com.github.javafaker.Faker;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;
import pages.US09_page;
import utilities.Driver;

import java.util.List;


public class US09_StepDefinitions {

    Actions actions=new Actions(Driver.getDriver());
    US09_page us09_page=new US09_page();
    Select select;
    WebElement ssnDinamik;
    String ssnx;
    Faker faker=new Faker();
    SoftAssert softAssert = new SoftAssert();
    public static int hastaToplamSayisi_UI;

    @Then("NBH {string} dropdown menusunu tiklar")
    public void nbh_dropdown_menusunu_tiklar(String string) {
        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        us09_page.myPagesDropdownMenuElementi.click();

    }
    @Then("NBH {string} sekmesinde hasta bilgilerinin gorunur oldugunu test eder")
    public void nbh_sekmesinde_hasta_bilgilerinin_gorunur_oldugunu_test_eder(String string) {


        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Assert.assertTrue(us09_page.patientsTableElementi.isDisplayed());


    }
    @Then("NBH tablo bilgilerini duzenlemek istediği hastanin yanindaki {string} butonuna tiklar")
    public void nbh_tablo_bilgilerini_duzenlemek_istediği_hastanin_yanindaki_butonuna_tiklar(String string) {
        // edit
        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        actions.sendKeys(Keys.ARROW_RIGHT).perform();
        us09_page.patientsTableHastaEditElementi.click();


    }
    @Then("NBH hasta bilgilerinin duzenlenebilir oldugunu test eder")
    public void nbh_hasta_bilgilerinin_duzenlenebilir_oldugunu_test_eder() throws InterruptedException {
        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        us09_page.hastaBilgileriGuncellemeIdTextBoxElementi.click();
        actions.sendKeys(Keys.TAB).perform();
        Thread.sleep(2000);
        us09_page.hastaBilgileriGuncellemeFirstNameTextBoxElementi.clear();
        us09_page.hastaBilgileriGuncellemeFirstNameTextBoxElementi.sendKeys("ABC");
        us09_page.hastaBilgileriGuncellemeLastNameTextBoxElementi.clear();
        us09_page.hastaBilgileriGuncellemeLastNameTextBoxElementi.sendKeys("DEF");
        actions.sendKeys(Keys.TAB).perform();
        us09_page.hastaBilgileriGuncellemeEmailTextBoxElementi.clear();
        us09_page.hastaBilgileriGuncellemeEmailTextBoxElementi.sendKeys("abc@gmail.com");
        //actions.sendKeys(Keys.PAGE_DOWN).perform();
        us09_page.hastaBilgileriGuncellemePhoneTextBoxElementi.clear();
        us09_page.hastaBilgileriGuncellemePhoneTextBoxElementi.sendKeys("1234567890");
        actions.sendKeys(Keys.PAGE_DOWN).perform();

        select = new Select(us09_page.hastaBilgileriGuncellemeGenderSelectMenuElementi);
        // staffPage.genderDropdownElement.click();
        Thread.sleep(100);
        select.selectByVisibleText("MALE");
        //staffPage.genderDropdownElement.click();

        select = new Select(us09_page.hastaBilgileriGuncellemeBloodGroupSelectMenuElementi);
        //  staffPage.bloodGroupDropdownElement.click();
        select.selectByIndex(0);
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //staffPage.bloodGroupDropdownElement.click();


        actions.
                sendKeys(Keys.TAB).
                sendKeys(Keys.TAB).
                sendKeys(Keys.TAB).
                sendKeys(Keys.TAB).
                sendKeys(Keys.TAB).sendKeys(Keys.TAB).perform();

        JavascriptExecutor jsexecutor = ((JavascriptExecutor) Driver.getDriver());
       jsexecutor.executeScript("arguments[0].scrollIntoView(true);", us09_page.hastaBilgileriGuncellemeSaveButonuElementi);  // element gorunene kadar kaydirir

        jsexecutor.executeScript("arguments[0].click();", us09_page.hastaBilgileriGuncellemeSaveButonuElementi);



        softAssert.assertTrue(us09_page.hastaBilgileriGuncellemeStateSelectMenuElementi.isEnabled());
        softAssert.assertTrue(us09_page.saveGeciciSekme.isEnabled());
        softAssert.assertAll();


      /*  Assert.assertTrue(us09_page.hastaBilgileriGuncellemeSaveButonuElementi.isDisplayed());
        Assert.assertFalse(us09_page.hastaBilgileriGuncellemeStateSelectMenuElementi.isDisplayed());  //Bug  */



    }
    @Then("NBH {string} butonunu tiklar")
    public void nbh_butonunu_tiklar(String string) {

        //'Search Patient' icin
        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        us09_page.myPagesDropdownMenuSearchPatientElementi.click();

    }

    @Then("NBH Patient SSN kismina hastanin SSN bilgisini girer")
    public void nbh_patient_ssn_kismina_hastanin_ssn_bilgisini_girer() {

        int random = faker.random().nextInt(2, 19);
        ssnDinamik = Driver.getDriver().findElement(By.xpath("//tbody/tr[" + random + "]/td[2]"));

        ssnx = ssnDinamik.getText();

        us09_page.patentSsnBox.sendKeys(ssnx);


    }
    @Then("NBH ilgili hastanin yanindaki {string} butonuna tiklar")
    public void nbh_ilgili_hastanin_yanindaki_butonuna_tiklar(String string) {
        //view
        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        actions.sendKeys(Keys.ARROW_RIGHT).perform();
        us09_page.patientsTableHastaViewElementi.click();

    }
    @Then("NBH kayit bilgilerinin gorunur oldugunu test eder")
    public void nbh_kayit_bilgilerinin_gorunur_oldugunu_test_eder() {
        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        List<WebElement> tumSayfaPatientview = us09_page.tumSayfa;

        int istenenBaslikIndexi = -3;
        for (int i = 0; i < tumSayfaPatientview.size(); i++) {
            if (tumSayfaPatientview.get(i).getText().equals(tumSayfaPatientview)) {
                istenenBaslikIndexi = i + 1;

            }
            System.out.println(us09_page.tumSayfa.get(i).getText());
            System.out.println(tumSayfaPatientview.get(i).getText());

        }
    }
    @Then("NBH kayit bilgilerini siler ve save butonuna tiklar")
    public void nbh_kayit_bilgilerini_siler_ve_save_butonuna_tiklar() {
        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        us09_page.hastaBilgileriGuncellemeFirstNameTextBoxElementi.clear();

        //  us09_page.hastaBilgileriGuncellemeFirstNameTextBoxElementi.sendKeys(Keys.TAB);
        us09_page.hastaBilgileriGuncellemeFirstNameTextBoxElementi.sendKeys(Keys.TAB);
        us09_page.hastaBilgileriGuncellemeLastNameTextBoxElementi.sendKeys(Keys.TAB);
        us09_page.hastaBilgileriGuncellemeBirthDateTextBoxElementi.sendKeys(Keys.TAB);
        us09_page.hastaBilgileriGuncellemeEmailTextBoxElementi.sendKeys(Keys.TAB);
        us09_page.hastaBilgileriGuncellemePhoneTextBoxElementi.sendKeys(Keys.TAB);
        us09_page.hastaBilgileriGuncellemeGenderSelectMenuElementi.sendKeys(Keys.TAB);
        us09_page.hastaBilgileriGuncellemeBloodGroupSelectMenuElementi.sendKeys(Keys.TAB);
        us09_page.hastaBilgileriGuncellemeDescriptionTextBoxElementi.sendKeys(Keys.TAB);
        us09_page.hastaBilgileriGuncellemeUserSelectMenuElementi.sendKeys(Keys.TAB);
        us09_page.hastaBilgileriGuncellemeCountrySelectMenuElementi.sendKeys(Keys.TAB);
        us09_page.hastaBilgileriGuncellemeStateSelectMenuElementi.sendKeys(Keys.TAB);
        us09_page.backButton.sendKeys(Keys.TAB);

        us09_page.hastaBilgileriGuncellemeSaveButonuElementi.click();

    }
    @Then("NBH bilgilerin silinip silinmedigini test eder")
    public void nbh_bilgilerin_silinip_silinmedigini_test_eder() {
        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String expectedText = "";
        actions.sendKeys(Keys.PAGE_UP).perform();
        String actualText = us09_page.deleteHataYazisi.getText();
        Assert.assertNotEquals(expectedText, actualText);

        System.out.println(actualText);

    }
    @Then("NBH hastalarin silinmedigini test eder")
    public void nbh_hastalarin_silinmedigini_test_eder() {

        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Assert.assertFalse(us09_page.deleteButton.getText().contains("Delete"));  //sayfayı yana kaydırmak gerekebilir

    }


    @Then("NBH Arama yapabildigini ve istenilen hastanin gorunur oldugunu test eder")
    public void nbh_arama_yapabildigini_ve_istenilen_hastanin_gorunur_oldugunu_test_eder() {

        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Assert.assertTrue(us09_page.deleteButton.isDisplayed());   //sayfayı yana kaydırmak gerekebilir
    }

    @Then("kullanici sayfanin en altindaki kayitli hasta sayisini alir")
    public void kullaniciSayfaninEnAltindakiKayitliHastaSayisiniAlir() {
        String[] ssnArray = us09_page.countOfPatients.getText().split(" ");
        hastaToplamSayisi_UI = Integer.parseInt(ssnArray[5]);
        System.out.println("Tüm kayıtlı UI Hasta  Sayısı : "+ hastaToplamSayisi_UI);
    }
















}
