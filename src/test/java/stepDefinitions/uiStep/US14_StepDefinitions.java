package stepDefinitions.uiStep;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.US14_Pages;
import utilities.ConfigReader;
import utilities.Driver;

public class US14_StepDefinitions {

    US14_Pages us14 = new US14_Pages();

    @Given("Doktor Medunna ana sayfasina gider")
    public void doktor_medunna_ana_sayfasina_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("medunnaUrl"));

    }

    @When("Anasayfada giris butonuna tiklar")
    public void anasayfada_giris_butonuna_tiklar() {
        us14.girisButon.click();

    }

    @Then("SignIn secenegine tiklar")
    public void sign_in_secenegine_tiklar() {
        us14.singInButon.click();

    }

    @Then("Gecerli bir kullaniciAdi girer")
    public void gecerli_bir_username_girer() {
        us14.kullaniciAdi.sendKeys(ConfigReader.getProperty("doctorUser"));

    }

    @Then("Gecerli bir sifre girer")
    public void gecerli_bir_parola_girer() {
        us14.password.sendKeys(ConfigReader.getProperty("password"));

    }

    @Then("SignIn buttonuna tiklar")
    public void sign_in_buttonuna_tiklar() {
        us14.singInGiris.click();

    }

    @Then("kullanici {int} saniye bekler")
    public void kullanici_saniye_bekler(int istenenSaniye) {

        try {
            Thread.sleep(istenenSaniye * 1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    @Then("MY PAGES menusune tiklar")
    public void my_pages_menusune_tiklar() {
        us14.myPagesButon.click();

    }

    @Then("MY PAGES menuden My Inpatients'i secer")
    public void my_pages_menuden_my_ınpatients_i_secer() {
        us14.myInpatientsButon.click();

    }

    @Then("Cikan sayfada \"\"ID, Start Date, End date, Satatus, Description, Created Date, Room, Appointment id and Patient\" bilgilerinin goruntulenebildigini test eder")
    public void cikan_sayfada_ıd_start_date_end_date_satatus_description_created_date_room_appointment_id_and_patient_bilgilerinin_goruntulenebildigini_test_eder() {

        System.out.println(us14.id.getText());
        Assert.assertTrue(us14.id.isDisplayed());
        Assert.assertTrue(us14.startDate.isDisplayed());
        Assert.assertTrue(us14.endDate.isDisplayed());
        Assert.assertTrue(us14.status.isDisplayed());
        Assert.assertTrue(us14.description.isDisplayed());
        Assert.assertTrue(us14.createdDate.isDisplayed());
        Assert.assertTrue(us14.room.isDisplayed());
        Assert.assertTrue(us14.appointment.isDisplayed());
        Assert.assertTrue(us14.patient.isDisplayed());


    }

    @Then("kullanici sayfayi kapatir")
    public void kullanici_sayfayi_kapatir() {
        Driver.closeDriver();
    }

    @Then("Cikan sayfada edit butonuna tiklanir")
    public void cikan_sayfada_edit_butonuna_tiklanir() {
        us14.edit.click();
        // WebDriver driver = new ChromeDriver();
        // JavascriptExecutor js = (JavascriptExecutor)driver;
        // js.executeScript("window.scrollBy(0, 250)", "");
    }

    @Then("status menusunden {string} sekmesi secilerek save tusuna basilir. \"UNAPPROVED\"yazisi goruntulenir")
    public void status_menusunden_sekmesi_secilerek_save_tusuna_basilir_unapproved_yazisi_goruntulenir(String string) throws InterruptedException {
        Actions action = new Actions(Driver.getDriver());
        action.sendKeys(Keys.PAGE_DOWN).build().perform();

        Select select = new Select(us14.statusDd);
        select.selectByVisibleText("UNAPPROVED");
        Thread.sleep(2000);
        us14.save.submit();


    }

    @Then("status menusunden {string} sekmesi secilerek save tusuna basilir. \"STAYING\"yazisi goruntulenir")
    public void status_menusunden_sekmesi_secilerek_save_tusuna_basilir_stayıng_yazisi_goruntulenir(String string) throws InterruptedException {
        Thread.sleep(8000);
        Select select = new Select(us14.statusDd);
        select.selectByVisibleText("STAYING");
        Thread.sleep(2000);
        us14.save.submit();
    }

    @Then("status menusunden {string} sekmesi secilerek save tusuna basilir. \"DISCHARGED\"yazisi goruntulenir")
    public void status_menusunden_sekmesi_secilerek_save_tusuna_basilir_dıscharged_yazisi_goruntulenir(String string) throws InterruptedException {
        Thread.sleep(8000);
        Select select = new Select(us14.statusDd);
        select.selectByVisibleText("DISCHARGED");
        Thread.sleep(2000);
        us14.save.submit();
    }

    @Then("status menusunden {string} sekmesi secilerek save tusuna basilir. \"CANCELLED\"yazisi goruntulenir")
    public void status_menusunden_sekmesi_secilerek_save_tusuna_basilir_cancelled_yazisi_goruntulenir(String string) throws InterruptedException {
        Thread.sleep(8000);
        Select select = new Select(us14.statusDd);
        select.selectByVisibleText("CANCELLED");
        Thread.sleep(2000);
        us14.save.submit();
    }

    @Then("Cikan sayfada yatan bir hastanin edit butonuna tiklanir")
    public void cikan_sayfada_yatan_bir_hastanin_edit_butonuna_tiklanir() {
        us14.edit.click();

    }

    @Then("{string} menusunden herhangi bir oda secilerek save tusuna basilir.")
    public void menusunden_herhangi_bir_oda_secilerek_save_tusuna_basilir(String string) throws InterruptedException {
        Actions action = new Actions(Driver.getDriver());
        action.sendKeys(Keys.PAGE_DOWN).build().perform();

        Select select = new Select(us14.roomDd);
        select.selectByIndex(7);
        Thread.sleep(2000);

        us14.save.click();

    }

    @Then("Yeni sayfada degisikligin oldugu goruntulenir.")
    public void yeni_sayfada_degisikligin_oldugu_goruntulenir() {


    }
}
