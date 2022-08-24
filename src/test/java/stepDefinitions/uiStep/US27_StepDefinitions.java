package stepDefinitions.uiStep;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.US14_Pages;
import pages.US27_Pages;
import utilities.ConfigReader;
import utilities.Driver;

public class US27_StepDefinitions {

     US27_Pages us27 = new US27_Pages();
    Actions action = new Actions(Driver.getDriver());

    @Given("Admin medunna ana sayfasina gider")
    public void admin_medunna_ana_sayfasina_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("medunnaUrl"));

    }
 @Then("Gecerli bir admin kullaniciAdi girer")
 public void gecerli_bir_admin_kullanici_adi_girer() {
  us27.kullaniciAdi.sendKeys(ConfigReader.getProperty("admin"));

 }

 @Then("Items & Titles menusune tiklar")
    public void items_titles_menusune_tiklar() {
    us27.itemsTitles.click();

    }
    @Then("Items & Titles menusunden Messages'i secer")
    public void items_titles_menusunden_messages_i_secer() {
    us27.messages.click();

    }
    @Then("Tum mesajlari, yazarlarini ve e-postalarini goruntuleyebilir")
    public void tum_mesajlari_yazarlarini_ve_e_postalarini_goruntuleyebilir() {
        System.out.println(us27.mesaj.getText());
        System.out.println(us27.yazar.getText());
        System.out.println(us27.eposta.getText());
        us27.mesaj.isDisplayed();
        us27.yazar.isDisplayed();
        us27.eposta.isDisplayed();

       }

    @Then("Create and new message menusune tiklar")
    public void create_end_new_message_menusune_tiklar() {
    us27.createNewMessage.click();

    }
    @Then("Name, e-mail, subject, message alanlarini doldurur")
    public void name_e_mail_subject_message_alanlarini_doldurur() {
        us27.Name.sendKeys("Hamza");
        action.sendKeys(Keys.TAB);
        us27.eMail.sendKeys("hamza@gmail.com");
        action.sendKeys(Keys.TAB);
        us27.suject.sendKeys("sikayet");
        action.sendKeys(Keys.TAB);
        us27.message.sendKeys("sikayetim var");
    }
    @Then("Save tusuna basar")
    public void save_tusuna_basar() {
    us27.Save.click();
    }
    @Then("Yeni bir mesaj olusturuldu yazısı goruntulenir")
    public void yeni_bir_mesaj_olusturuldu_yazısı_goruntulenir() {
        System.out.println(us27.mesajOlusturulduYazi.getText());
        us27.mesajOlusturulduYazi.isDisplayed();
    }
    @Then("Admin edit tusuna basar")
    public void admin_edit_tusuna_basar() {
        us27.editUpdate.click();

    }
    @Then("Cikan ekranda message yazisini günceller ve save tusuna basar")
    public void cikan_ekranda_message_yazisini_günceller_ve_save_tusuna_basar() throws InterruptedException {
    us27.mesajUpdate.clear();
    action.sendKeys(Keys.PAGE_DOWN).perform();
    us27.mesajUpdate.sendKeys("mesaj guncellendi");
    Thread.sleep(7000);
    us27.saveUpdate.click();

    }
    @Then("Mesaj guncellendi yazisi goruntulenir")
    public void mesaj_guncellendi_yazisi_goruntulenir() {
        System.out.println(us27.mesajGuncellendiYazi.getText());
        us27.mesajGuncellendiYazi.isDisplayed();


    }
    @Then("Admin delete tusuna basar, cikan onay tusuna tiklar")
    public void admin_delete_tusuna_basar_cikan_onay_tusuna_tiklar() throws InterruptedException {
        us27.delete.click();
        Thread.sleep(3000);
        us27.deleteOnay.click();

    }
    @Then("Mesaj silindi yazisi goruntulenir")
    public void mesaj_silindi_yazisi_goruntulenir() {
        System.out.println(us27.silindiYazisi.getText());
        us27.silindiYazisi.isDisplayed();

    }

}
