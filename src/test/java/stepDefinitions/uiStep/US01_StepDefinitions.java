package stepDefinitions.uiStep;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import pages.US01_02;
import utilities.Driver;
import utilities.ReusableMethods;


public class US01_StepDefinitions {
    US01_02 medunna = new US01_02();



    //   TC1


    @Given("Hg Your SSN is required yazisinin gorunmedigini test eder")
    public void hg_your_ssn_is_required_yazisinin_gorunmedigini_test_eder() {

        Assert.assertEquals(0,medunna.YourSSNisinvalidmesaji.size());

    }

    //  TC2
    @Given("Hg ssn kutucuguna tiklar")
    public void hg_ssn_kutucuguna_tiklar() {
        medunna.SSNBox.click();
    }
    @Given("Hg firstname kutucuguna tiklar")
    public void hg_firstname_kutucuguna_tiklar() {
        medunna.firstNameBox.click();
    }
    @Given("Hg Your SSN is required yazisinin goruntulendigini dogrular")
    public void hg_your_ssn_is_required_yazisinin_goruntulendigini_dogrular() {
           Assert.assertTrue(medunna.SSNHataMesaji.isDisplayed());
    }

    //  TC3

    @Given("Hg firstname kutucugunun bos olup olmadigini dogrular")
    public void hg_firstname_kutucugunun_bos_olup_olmadigini_dogrular() {
        Assert.assertTrue(medunna.YourFirstNameIsrequiredMesaji.isDisplayed());
    }

    //   TC4




    @Given("Hg LastName kutucugunun bos olup olmadigini konrol eder")
    public void hg_lastname_kutucugunun_bos_olup_olmadigini_konrol_eder() {
        medunna.lastName.click();
        medunna.bosAlan.click();
        Assert.assertTrue(medunna.lastNameHataMesasji.isDisplayed());
    }
    @Given("Hg username kutusuna tiklar")
    public void hg_username_kutusuna_tiklar() {
        medunna.usernamebox.click();
    }

    @Given("Hg email kutusuna tiklar")
    public void hg_email_kutusuna_tiklar() {
        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
jse.executeScript("arguments[0].scrollIntoView()",medunna.emailTextBox);
        ReusableMethods.waitForVisibility(medunna.emailTextBox,5);
      medunna.emailTextBox.click();

    }
    @Given("Hg Your username is required yazisinin goruntulendigini dogrular")
    public void hg_your_username_is_required_yazisinin_goruntulendigini_dogrular() {
        Assert.assertTrue(medunna.yourUsernameIsRequiredMesaji.isDisplayed());
    }


    @Given("Hg Your username is invalid mesajinin gorundugunu test eder")
    public void hg_your_username_is_invalid_mesajinin_gorundugunu_test_eder() {
        Assert.assertTrue(medunna.yourUsernameIsInvalidMessage.isDisplayed());

    }
    @Given("Hg ozel karakter iceren {string} olusturur")
    public void hg_ozel_karakter_iceren_olusturur(String username) {
        medunna.usernamebox.sendKeys(username);
    }
    @Given("Hg Your email is required yazisinin goruntulendigini  dogrular")
    public void hg_your_email_is_required_yazisinin_goruntulendigini_dogrular() {
        Assert.assertTrue(medunna.yourEmailIsRequiredMesaji.isDisplayed());

    }


    @Given("Hg bosluk iceren {string} olusturur")
    public void hg_bosluk_iceren_olusturur(String username) {
        medunna.usernamebox.sendKeys(username);
    }

    @Given("Hg @ ve . isareti olmadan {string} ile giris yapar")
    public void hg_ve_isareti_olmadan_ile_giris_yapar(String email) {
        medunna.emailTextBox.sendKeys(email);
    }

    @Given("Hg This field is invalid yazisinin goruntulendigini dogrular")
    public void hg_this_field_is_invalid_yazisinin_goruntulendigini_dogrular() {
        Assert.assertTrue(medunna.thisFieldIsInvalidMesaji.isDisplayed());
    }
    @Then("Hg Your username is required mesajinin gorundugunu test eder")
    public void hg_your_username_is_required_mesajinin_gorundugunu_test_eder() {
   Assert.assertTrue(medunna.yourUsernameIsRequiredMesaji.isDisplayed());
    }
    @Then("Hg yeni {string}  olusturur")
    public void hg_yeni_olusturur(String email) {

     medunna.emailTextBox.sendKeys(email);
    }


    @Then("Hg dokuz haneli {string} girer")
    public void hg_dokuz_haneli_girer(String ssn) {
       medunna.SSNBox.sendKeys(ssn);
    }

    @Then("Hg bos alana tiklar")
    public void hg_bos_alana_tiklar() {
        medunna.firstNameBox.click();

    }
    @Then("Hg lastname kutucuguna tiklar")
    public void hg_lastname_kutucuguna_tiklar() {
       medunna.lastName.click();
    }

    @Then("Hg lastname kutucugunun bos olup olmadigini dogrular")
    public void hg_lastname_kutucugunun_bos_olup_olmadigini_dogrular() {
       Assert.assertTrue(medunna.lastNameHataMesasji.isDisplayed());
    }
    @Then("Hg lastname kutucuguna karakter iceren {string} girer")
    public void hg_lastname_kutucuguna_karakter_iceren_girer(String soyisim) {
        medunna.lastName.sendKeys(soyisim);
    }
    @Then("Hg firstname kutucuguna karakter iceren {string} girer")
    public void hg_firstname_kutucuguna_karakter_iceren_girer(String isim) {
        medunna.firstNameBox.sendKeys(isim);
    }
 @Given("Hg hata metni gorulmedigini dogrular")
    public void hg_hata_metni_gorulmedigini_dogrular(){
     Assert.assertEquals(0,medunna.firstNameHataMesaji.size());
 }


    @Then("Kulllanici register butonuna tiklar")
    public void kulllanici_Register_Butonuna_Tiklar() {
        medunna.Register.click();
    }
 @Then ("Hg password kutusuna tiklar")
    public void hg_password_kutusuna_tiklar(){
        medunna.passwordbox.click();
 }
}