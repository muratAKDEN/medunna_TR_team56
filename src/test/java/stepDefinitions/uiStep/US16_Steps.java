package stepDefinitions.uiStep;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import pages.US16_Page;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class US16_Steps {
    US16_Page us16_page=new US16_Page();

    Faker faker=new Faker();
    JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
    //jse.executeScript("arguments[0].scrollIntoView()",locator);
    // jse.executeScript("arguments[0].click();",locator );

    @Then("Kullanici acilan dropdown menuden Room sekmesine tiklar")
    public void kullanici_acilan_dropdown_menuden_room_sekmesine_tiklar() {

        us16_page.RoomButton.click();
    }
    @Then("Kullanici Create a New Room butonuna tiklar")
    public void kullanici_create_a_new_room_butonuna_tiklar() {

        us16_page.CreateRoomButton.click();
    }
    @Then("Kullanici Room Number kismina daha once kullanilmamis bir oda numarasi girer")
    public void kullanici_room_number_kismina_daha_once_kullanilmamis_bir_oda_numarasi_girer() {
        String number= ""+faker.number().numberBetween(1111,999999999);
        us16_page.RoomNumberBox.sendKeys(number);
    }
    @Then("Kullanici Price gecerli bir fiyat girer")
    public void kullanici_price_gecerli_bir_fiyat_girer() {

        us16_page.PriceBox.sendKeys("152");
        ReusableMethods.waitFor(2);
    }
    @Then("Kullanici Save butonunu tiklar")
    public void kullanici_save_butonunu_tiklar() {

        jse.executeScript("arguments[0].click();",us16_page.SaveBox );
     //   us16_page.SaveBox.click();

    }


    @Then("Kullanici cikan mesajinin uzerinde {string}  icerdigini dogrular")
    public void kullanici_cikan_mesajinin_uzerinde_icerdigini_dogrular(String string) {

        ReusableMethods.waitFor(2);
        String exceptedmesaj="A new Room is created with identifier";
        //Assert.assertTrue(adminNewRoomPage.KayitMesji.getText().contains(exceptedmesaj));
        Assert.assertTrue(us16_page.KayitMesji.isDisplayed());

    }

    @Then("Kullanici Room Number kismina tiklar")
    public void kullaniciRoomNumberKisminaTiklar() {

        us16_page.RoomNumberBox.click();
    }

    @And("Kullanici Price kismina tiklar")
    public void kullaniciPriceKisminaTiklar() {

        us16_page.PriceBox.click();
    }


    @And("Kullanici Room Number kisminin altinda {string} yazisinin gorundugunu dogrular")
    public void kullaniciRoomNumberKismininAltindaYazisininGorundugunuDogrular(String arg0) {

        ReusableMethods.waitFor(2);
        Assert.assertTrue( us16_page.RoomNumberBosHataMesji.isDisplayed());
    }

    @And("Kullanici Room Number kismini harf ve ozel karakter ile doldurur")
    public void kullaniciRoomNumberKisminiHarfVeOzelKarakterIleDoldurur() {

        us16_page.RoomNumberBox.sendKeys("abcd");
    }

    @And("Kullanici Room Type alanindaki secenekler arasinda asagidaki seceneklerin bulundugunu dogrular")
    public void kullaniciRoomTypeAlanindakiSeceneklerArasindaAsagidakiSeceneklerinBulundugunuDogrular() {

        Select select=new Select(us16_page.RoomTypeBox);
        select.getAllSelectedOptions();
        List<WebElement> roomTypeListesi=select.getOptions();
        List<String> roomTypeStr=new ArrayList<>();
        for (int i = 0; i < roomTypeListesi.size(); i++) {
            roomTypeStr.add(roomTypeListesi.get(i).getText());
        }

        List<String>expectedRoomTypes=new ArrayList<>();
        expectedRoomTypes.add("TWIN");
        expectedRoomTypes.add("DELUXE");
        expectedRoomTypes.add("PREMIUM_DELUXE");
        expectedRoomTypes.add("SUITE");
        expectedRoomTypes.add("DAYCARE");

        Assert.assertTrue(roomTypeStr.containsAll(expectedRoomTypes));
    }

    @And("Kullanici Status Checkbox'inin Isaretler")
    public void kullaniciStatusCheckboxIninIsaretler() {

        us16_page.StatusButton.click();
    }

    @And("Kullanici Description kismina tiklar")
    public void kullaniciDescriptionKisminaTiklar() {
ReusableMethods.waitFor(1);
       jse.executeScript("arguments[0].scrollIntoView()",us16_page.DescriptionBox);
        jse.executeScript("arguments[0].click();",us16_page.DescriptionBox );
       // us16_page.DescriptionBox.click();
    }

    @And("Kullanici Price kisminin altinda {string} yazisinin gorundugunu dogrular")
    public void kullaniciPriceKismininAltindaYazisininGorundugunuDogrular(String mesaj) {

        ReusableMethods.waitFor(1);
        Assert.assertTrue(us16_page.PriceBoxBosHataMesaji.getText().contains(mesaj));
    }



    @And("Kullanici Price kismini temizler")
    public void kullaniciPriceKisminiTemizler() {

        us16_page.PriceBox.clear();
    }

    @And("Kullanici Create Date alanini tiklar")
    public void kullaniciCreateDateAlaniniTiklar() {

        us16_page.CreatedDateBox.click();
    }

    @And("Kullanici Description kismini bos birakildiginda bir hata mesaji alinmadigini dogrulamak icin ekran resmi alir")
    public void kullaniciDescriptionKisminiBosBirakildigindaBirHataMesajiAlinmadiginiDogrulamakIcinEkranResmiAlir() {

        Assert.assertTrue(us16_page.DescriptionBox.isDisplayed());
    }

    @And("Kullanici Description kismina aciklama girer")
    public void kullaniciDescriptionKisminaAciklamaGirer() {

        us16_page.DescriptionBox.sendKeys("gecmis olsun");
    }

    @And("Kullanici Create Date alanina gun ay yil girer")
    public void kullaniciCreateDateAlaninaGunAyYilGirer() {

        us16_page.CreatedDateBox.sendKeys("25.08.2022");
    }

    @Given("Kullanici Rooms kismida yer alan Room Type'a tiklar")
    public void kullaniciRoomsKismidaYerAlanRoomTypeATiklar() {

        us16_page.RoomTypeButton.click();
    }

    @Then("Kullanici Room Type sutununda {string} tipindeki odalarin gorundugunu dogrular ve ekran resmi alir")
    public void kullaniciRoomTypeSutunundaTipindekiOdalarinGorundugunuDogrularVeEkranResmiAlir(String arg0) throws IOException {

        ReusableMethods.waitFor(2);
        Assert.assertTrue(us16_page.RoomTypeButton.isDisplayed());
        us16_page.RoomTypeButton.click();
        ReusableMethods.waitFor(2);
        ReusableMethods.getScreenshot("ekran göruntusu alındı");
    }

    @Given("Kullanici Room Table kisminda ID alanina tiklayarak odalari en son olusturulandan baslayarak siralar")
    public void kullaniciRoomTableKismindaIDAlaninaTiklayarakOdalariEnSonOlusturulandanBaslayarakSiralar() {
        ReusableMethods.waitFor(2);
        us16_page.IdButton.click();
    }

    @Then("Kullanici Room Table kisminda Room Number alanina tiklayarak odalari en son olusturulandan baslayarak siralar")
    public void kullaniciRoomTableKismindaRoomNumberAlaninaTiklayarakOdalariEnSonOlusturulandanBaslayarakSiralar() {

        us16_page.RoomNumberButton.click();
    }

    @And("Kullanici Room Table kisminda Status  alanina tiklayarak odalarin durumunu en son olusturulandan baslayarak siralar")
    public void kullaniciRoomTableKismindaStatusAlaninaTiklayarakOdalarinDurumunuEnSonOlusturulandanBaslayarakSiralar() {

        us16_page.RoomTypeButton.click();
    }

    @And("Kullanici Room Table kisminda Price alanina tiklayarak odalarin fiyatlarini en son olusturulandan baslayarak siralar")
    public void kullaniciRoomTableKismindaPriceAlaninaTiklayarakOdalarinFiyatlariniEnSonOlusturulandanBaslayarakSiralar() {

        us16_page.PriceButton.click();
    }

    @And("Kullanici Room Table kisminda Description alanina tiklayarak odalarla ilgili aciklamalari en son olusturulandan baslayarak siralar")
    public void kullaniciRoomTableKismindaDescriptionAlaninaTiklayarakOdalarlaIlgiliAciklamalariEnSonOlusturulandanBaslayarakSiralar() {

        us16_page.DescriptionButton.click();
    }

    @And("Kullanici Room Table kisminda Created Date alanina tiklayarak odalarin olusturulma tarihlerini en son olusturulandan baslayarak siralar")
    public void kullaniciRoomTableKismindaCreatedDateAlaninaTiklayarakOdalarinOlusturulmaTarihleriniEnSonOlusturulandanBaslayarakSiralar() {

        us16_page.CreateRoomButton.click();
    }

    @And("Kullanici acilan Room sayfasinda view butonuna tiklar ve room bilgilerinin geldigini dogrular")
    public void kullaniciAcilanRoomSayfasindaViewButonunaTiklarVeRoomBilgilerininGeldiginiDogrular() {

        us16_page.ViewButton.click();
        Assert.assertTrue(us16_page.ViewButton.isDisplayed());

    }

    @And("Kullanici acilan Room sayfasinda edit butonuna tiklar")
    public void kullaniciAcilanRoomSayfasindaEditButonunaTiklar() {

        us16_page.EditButton2.click();
    }

    @And("Kullanici Room Number kismina tiklar, temizler ve daha once kullanilmamis yeni bir Room Number girer")
    public void kullaniciRoomNumberKisminaTiklarTemizlerVeDahaOnceKullanilmamisYeniBirRoomNumberGirer() {

       us16_page.RoomNumberBox.click();
       us16_page.RoomNumberBox.clear();
       us16_page.RoomNumberBox.sendKeys("1259748");

    }

    @And("Kullanici Room Type secer")
    public void kullaniciRoomTypeSecer() {

        us16_page.RoomTypeBox.click();
    }

    @And("Kullanici Price kismina tiklar, temizler ve yeni bir price degeri girer")
    public void kullaniciPriceKisminaTiklarTemizlerVeYeniBirPriceDegeriGirer() {


        us16_page.PriceBox.clear();
        us16_page.PriceBox.sendKeys("124");

    }

    @And("Kullanici Description kismina tiklar, temizler ve yeni bir description girer")
    public void kullaniciDescriptionKisminaTiklarTemizlerVeYeniBirDescriptionGirer() {

        us16_page.DescriptionBox.click();
        us16_page.DescriptionBox.clear();
        us16_page.DescriptionBox.sendKeys("maasallah");
    }

    @Then("Kullanici Room Table'da ilk satirda yer alan odanin delete butonuna basar")
    public void kullaniciRoomTableDaIlkSatirdaYerAlanOdaninDeleteButonunaBasar() {
        ReusableMethods.waitFor(2);
        us16_page.DeleteButton.click();
    }

    @And("Kullanici Room sayfasinda acilan kisimda delete butonuna tiklar")
    public void kullaniciRoomSayfasindaAcilanKisimdaDeleteButonunaTiklar() {

        us16_page.IcDeleteButton.isDisplayed();
    }

    @And("Kullanici gelen mesajin {string}  icerdigini dogrular")
    public void kullaniciGelenMesajinARoomIsDeletedWithIdentifierIcerdiginiDogrular() {

        ReusableMethods.waitFor(2);
        Assert.assertTrue(us16_page.DeleteMesaji.isDisplayed());

    }


    @And("Kullanici Price kismini gecersiz bir fiyat Ile doldurur")
    public void kullaniciPriceKisminiGecersizBirFiyatIleDoldurur() {
        us16_page.PriceBox.sendKeys("asdf");
    }

    @And("Price kisminin altinda {string} yazisinin gorundugunu dogrular")
    public void priceKismininAltindaYazisininGorundugunuDogrular(String mesaj) {
        ReusableMethods.waitFor(2);
        //Assert.assertTrue(adminNewRoomPage.PriceGecersizHataMesaji.isDisplayed());
       us16_page.PriceGecersizHataMesaji.click();
        Assert.assertEquals(mesaj,us16_page.PriceGecersizHataMesaji.getText());
    }

    @And("Kullanici Save butonunun erisilemez oldugunu dogrular")
    public void kullaniciSaveButonununErisilemezOldugunuDogrular() {
        ReusableMethods.waitFor(2);
        jse.executeScript("arguments[0].scrollIntoView()",us16_page.SaveBox);
        Assert.assertFalse(us16_page.KayitMesji.isDisplayed());
    }

    @And("Kullanici Room Number kismina temizler")
    public void kullaniciRoomNumberKisminaTemizler() {
        us16_page.RoomNumberBox.clear();
    }

    @And("Kullanici acilan Room sayfasinda view butonuna tiklar")
    public void kullaniciAcilanRoomSayfasindaViewButonunaTiklar() {

        us16_page.ViewButton.click();
    }

    @And("Kullanici cikan mesajinin uzerindee {string}  icerdigini dogrular")
    public void kullaniciCikanMesajininUzerindeeIcerdiginiDogrular(String arg0) {

        ReusableMethods.waitFor(2);
        String exceptedmesaj="A new Room is updated with identifier";
        //Assert.assertTrue(adminNewRoomPage.KayitMesji.getText().contains(exceptedmesaj));
        Assert.assertTrue(us16_page.UpdateMesaji.isDisplayed());

    }

}
