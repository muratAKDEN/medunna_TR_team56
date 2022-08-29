package stepDefinitions.uiStep;

import com.github.javafaker.Faker;
import io.cucumber.java.en.*;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.US24_26;
import utilities.Driver;

import java.util.List;

import static org.junit.Assert.assertTrue;

public class US24_26_StepDefinitions {

    US24_26 page =new US24_26();
    Actions actions=new Actions(Driver.getDriver());
    Faker faker=new Faker();

    @Then("NBH My Appointments butonuna tiklar")
    public void nbh_my_appointments_butonuna_tiklar() {
        page.myAppointments.click();
    }
    @Then("NBH gecerli bir tarih girer")
    public void nbh_gecerli_bir_tarih_girer() throws InterruptedException {

        actions.sendKeys(Keys.CLEAR);
        page.fromDate.sendKeys("18.08.2022");
        Thread.sleep(2000);
        actions.sendKeys(Keys.CLEAR);
        page.toDate.sendKeys("30.08.2022");
        Thread.sleep(2000);

    }
    @Then("NBH Show Tests butonuna tiklar")
    public void nbh_show_tests_butonuna_tiklar() {

        page.showTestRequest.click();
    }
    @Then("NBH View Results butonuna tiklar")
    public void nbh_view_results_butonuna_tiklar() {

        page.viewResults.click();

    }
    @Then("NBH acilan sayfada kan tahlili bolumlerinin gorunur oldugunu test eder")
    public void nbh_acilan_sayfada_kan_tahlili_bolumlerinin_gorunur_oldugunu_test_eder() {

        List<WebElement> kanTahliliBaslikListesi = page.kanTahliliBilgileri;

        int istenenBaslikIndexi = -3;
        for (int i = 0; i < kanTahliliBaslikListesi.size(); i++) {
            if (kanTahliliBaslikListesi.get(i).getText().equals(kanTahliliBaslikListesi)) {
                istenenBaslikIndexi = i + 1;

            }
            System.out.println(kanTahliliBaslikListesi.get(i).getText());
            assertTrue(kanTahliliBaslikListesi.size()>0);
        }
    }

    @Then("NBH Show Invoice butonuna tiklar")
    public void nbh_show_invoice_butonuna_tiklar() {
        page.showInvoice.click();
    }
    @Then("NBH Invoice'in gorunur oldugunu test eder")
    public void nbh_invoice_in_gorunur_oldugunu_test_eder() {

        List<WebElement> receteBilgisi = page.invoice;

        int istenenBaslikIndexi = -3;
        for (int i = 0; i < receteBilgisi.size(); i++) {
            if (receteBilgisi.get(i).getText().equals(receteBilgisi)) {
                istenenBaslikIndexi = i + 1;

            }
            System.out.println(page.invoice.get(i).getText());
            System.out.println(receteBilgisi.get(i).getText());
            assertTrue(receteBilgisi.size()>0);
        }
    }

    @Given("content butonuna tiklar")
    public void content_butonuna_tiklar() {
        page.contentButonu.click();
    }
    @Given("mesaj icin gerekli olan name kutucugu doldurur")
    public void mesaj_icin_gerekli_olan_name_kutucugu_doldurur() throws InterruptedException {

        assertTrue( page.mesajName.isDisplayed());
        page.mesajName.sendKeys(faker.name().firstName());
        Thread.sleep(2000);
    }
    @Given("mesaj icin gerekli olan email kutucugu doldurur")
    public void mesaj_icin_gerekli_olan_email_kutucugu_doldurur() throws InterruptedException {

        assertTrue(page.mesajEmail.isDisplayed());
        page.mesajEmail.sendKeys(faker.internet().emailAddress());
        Thread.sleep(2000);
        actions.sendKeys(Keys.PAGE_DOWN);
    }
    @Given("mesaj icin gerekli olan Subject kutucugu doldurur")
    public void mesaj_icin_gerekli_olan_subject_kutucugu_doldurur() throws InterruptedException {

        assertTrue(page.mesajSubject.isDisplayed());
        page.mesajSubject.sendKeys("Konu Basligi");
        actions.sendKeys(Keys.DOWN);
        Thread.sleep(2000);
    }
    @Given("mesaj icin gerekli olan Message kutucugu doldurur")
    public void mesaj_icin_gerekli_olan_message_kutucugu_doldurur() throws InterruptedException {

        assertTrue(page.mesaj.isDisplayed());
        actions.sendKeys(Keys.DOWN);
        Thread.sleep(2000);
        page.mesaj.sendKeys("Mesaj bilgisi girildi");

    }
    @Then("Send butonuna taklar")
    public void send_butonuna_taklar() {

        actions.sendKeys(Keys.DOWN);
        page.sendButonu.submit();
    }


    }
