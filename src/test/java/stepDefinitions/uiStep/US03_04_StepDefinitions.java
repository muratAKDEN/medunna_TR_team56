package stepDefinitions.uiStep;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import pages.US03_04;
import utilities.ConfigReader;
import utilities.Driver;

public class US03_04_StepDefinitions {
    US03_04 us03_04=new US03_04();

    @Given("kullanici {string} anasayfasinda")
    public void kullaniciAnasayfasinda(String URL) {
        Driver.getDriver().get(ConfigReader.getProperty(URL));
    }
    @Given("dropdown menusune tiklar")
    public void dropdown_menusune_tiklar() {
        us03_04.dropdownMenu.click();
    }
    @Then("register butonuna basar")
    public void register_butonuna_basar() {
        us03_04.registerButonu.click();

    }
    @And("kullanici sayfada elementi bulana kadar asagiya iner")
    public void kullaniciSayfadaElementiBulanaKadarAsagiyaIner() {
        WebElement element = us03_04.passwordKutusu;
        ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].scrollIntoView(true);", element);

    }
    @Then("password kutusuna en az bir kucuk harf gonderir")
    public void password_kutusuna_en_az_bir_kucuk_harf_gonderir() {
        us03_04.passwordKutusu.sendKeys(ConfigReader.getProperty("enAzBirKucukHarf"));

    }

    @Then("password strenght seviyesinin kirmizi oldugunu test eder")
    public void password_strenght_seviyesinin_kirmizi_oldugunu_test_eder() {
        Assert.assertTrue(us03_04.birinciseviye.isDisplayed());
    }
    @Then("password kutusuna en az bir buyuk harf gonderir")
    public void password_kutusuna_en_az_bir_buyuk_harf_gonderir() {
        us03_04.passwordKutusu.sendKeys(ConfigReader.getProperty("enAzBirBuyukHarf"));

    }
    @Then("password strenght seviyesinin turuncu oldugunu test eder")
    public void password_strenght_seviyesinin_turuncu_oldugunu_test_eder() {
        Assert.assertTrue(us03_04.ikinciseviye.isDisplayed());

    }
    @Then("password kutusuna en az bir rakam gonderir")
    public void password_kutusuna_en_az_bir_rakam_gonderir() {
        us03_04.passwordKutusu.sendKeys(ConfigReader.getProperty("enAzBirRakam"));

    }
    @Then("password strenght seviyesinin acik yesil oldugunu test eder")
    public void password_strenght_seviyesinin_acik_yesil_oldugunu_test_eder() {
        Assert.assertTrue(us03_04.dorduncuseviye.isDisplayed());

    }
    @Then("password kutusuna en az bir ozel karakter gonderir")
    public void password_kutusuna_en_az_bir_ozel_karakter_gonderir() {
        us03_04.passwordKutusu.sendKeys(ConfigReader.getProperty("enAzBirOzelKarakter"));
    }
    @Then("password strenght seviyesinin koyu yesil oldugunu test eder")
    public void password_strenght_seviyesinin_koyu_yesil_oldugunu_test_eder() {
        Assert.assertTrue(us03_04.besinciseviye.isDisplayed());

    }
    @Then("sign in butonuna basar")
    public void sign_in_butonuna_basar() {

        us03_04.signInButonu.click();
    }

    @Then("kullanici gecerli bir username girer")
    public void kullanici_gecerli_bir_username_girer() {
        us03_04.kullaniciAdiKutusu.sendKeys(ConfigReader.getProperty("validUsername"));
    }

    @Then("kullanici gecerli bir password girer")
    public void kullanici_gecerli_bir_password_girer() throws InterruptedException {
        us03_04.sifreKutusu.sendKeys(ConfigReader.getProperty("validPassword"));
        Thread.sleep(3000);
    }

    @Then("sign in butonuna tiklar")
    public void sign_in_butonuna_tiklar() {
        us03_04.signInKutusu.click();

    }
    @Then("basarili bir giris yaptigini test eder")
    public void basarili_bir_giris_yaptigini_test_eder() {

        Assert.assertTrue(us03_04.basariliGiris.isDisplayed());
    }


    @And("kullanici beni hatirla butonunun oldugunu kontrol eder")
    public void kullaniciBeniHatirlaButonununOldugunuKontrolEder() {
        Assert.assertTrue(us03_04.rememberMeKutusu.isDisplayed());

    }

    @And("sifremi unuttum seceneginin oldugunu test eder")
    public void sifremiUnuttumSecenegininOldugunuTestEder() {
        Assert.assertTrue(us03_04.sifreUnuttum.isDisplayed());
    }


    @Then("password kutusuna en az yedi karakter gonderir")
    public void passwordKutusunaEnAzYediKarakterGonderir() {
        us03_04.passwordKutusu.sendKeys(ConfigReader.getProperty("enAzYediKarakter"));
    }

    @And("guclu bir parola oldugunu test eder")
    public void gucluBirParolaOldugunuTestEder() {

        Assert.assertTrue(us03_04.besinciseviye.isDisplayed());
    }

    @And("register a new account seceneginin oldugunu test eder")
    public void registerANewAccountSecenegininOldugunuTestEder() {
        Assert.assertTrue(us03_04.yeniKayitOl.isDisplayed());
    }

    @And("Cancel secenegininin gorundugunu test eder")
    public void cancelSeceneginininGorundugunuTestEder() {
        Assert.assertTrue(us03_04.cancelButonu.isDisplayed());
    }


}




