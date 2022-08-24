package stepDefinitions.uiStep;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import pages.US08_Pages;
import pages.US16_Page;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.ArrayList;
import java.util.List;

public class US16_Stepdefinitions {
    US16_Page us16 = new US16_Page();

    JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
    //   jse.executeScript("arguments[0].scrollIntoView()",locator);
//   jse.executeScript("arguments[0].click();",locator );
    @Then("admin room sekmesine tiklar")
    public void admin_room_sekmesine_tiklar() {
       us16.room.click();
    }


    @And("create a new Room sekmesine tiklar")
    public void createANewRoomSekmesineTiklar() {
        us16.createAnewRoom.click();
    }
    /*
     ReusableMethods.waitFor(5);
       storeManagerPage.allowBackorders.click();
       extentTest.info("Backorder izni verdi");

       ReusableMethods.waitFor(5);
       Select select=new Select(storeManagerPage.allowBackorders);
       select.getAllSelectedOptions();
       List<WebElement> requestedListesi=select.getOptions();
       List<String>opsiyonlar=new ArrayList<>();
       for (int i = 0; i < requestedListesi.size(); i++) {
           opsiyonlar.add(requestedListesi.get(i).getText());
       }
       System.out.println(opsiyonlar);

       List<String>expectedBackordersListesi=new ArrayList<>();
       expectedBackordersListesi.add("Allow");
       expectedBackordersListesi.add("Do not Allow");
       expectedBackordersListesi.add("Allow, but notify customer");
     */

    @And("Create a new room yazi elementinin gorunur oldugu test edilir")
    public void createANewRoomYaziElementininGorunurOlduguTestEdilir() {
        Assert.assertTrue(  us16.createOrEditnewRoom.isDisplayed());
    }
    @Then("admin acilan sayfada room number sekmesini doldurur")
    public void admin_acilan_sayfada_room_number_sekmesini_doldurur() {
        us16.roomNumber.sendKeys("321456");

    }
    @Then("Room Type TWIN DELUXE PREMIUM_DELUXE SUIT ve DAYCARE olmali")
    public void room_type_twin_deluxe_premium_deluxe_suit_ve_daycare_olmali() {
        Select select=new Select(us16.roomType);
        select.getAllSelectedOptions();
        List<WebElement> roomTypeListesi=select.getOptions();
        List<String>roomTypeStr=new ArrayList<>();
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
    @Then("admin status checkbox tiklar")
    public void admin_status_checkbox_tiklar() {

        us16.status.click();
    }

    @Then("admin status checkbox tiklandgini test eder")
    public void admin_status_checkbox_tiklandgini_test_eder() {
        Assert.assertTrue(us16.statusTrue.isDisplayed());

    }

    @And("admin status checkbox tiklanmadigini test eder")
    public void adminStatusCheckboxTiklanmadiginiTestEder() {
        Assert.assertTrue(us16.statusFalse.isDisplayed());
    }
    @Then("admin acilan sayfada room number sekmesini bos birakir")
    public void admin_acilan_sayfada_room_number_sekmesini_bos_birakir() {
        us16.roomNumber.click();
    }
    @Then("hata mesajinin gorundugunu test eder")
    public void hata_mesajinin_gorundugunu_test_eder() {
        ReusableMethods.waitFor(2);
        jse.executeScript("arguments[0].scrollIntoView()",us16.RoomNumberBosHataMesji);
     Assert.assertTrue(us16.RoomNumberBosHataMesji.isDisplayed());
    }
    @Then("price kismina tiklar")
    public void price_kismina_tiklar() {

        us16.PriceBox.click();
    }
    @Then("description kismina tiklar")
    public void description_kismina_tiklar() {
       us16.DescriptionBox.click();
    }
    @Then("price hata mesajinin gorundugunu test eder")
    public void price_hata_mesajinin_gorundugunu_test_eder() {
        ReusableMethods.waitFor(2);
        Faker faker=new Faker();
      us16.PriceBox.sendKeys(faker.phoneNumber().phoneNumber());
        Assert.assertTrue(us16.PriceBoxBosHataMesaji.isDisplayed());
    }
    @Then("fiyat bilgisi girer")
    public void fiyat_bilgisi_girer() {
       us16.PriceBox.sendKeys("255");
    }

    /*
      ReusableMethods.waitFor(2);
    //TWIN
    String expectedRoomType1 = "TWIN";
    boolean result1 = false;

    int count1 = 0;
    for (int i = 1; i <= 20; i++) {
        if (Driver.getDriver().findElement(By.xpath("//tbody/tr[" + i + "]/td[3]")).getText().contains(expectedRoomType1)) {
            result1 = true;
            count1++;
        } else {
            result1 = false;
        }
    }
    System.out.println("Ilk Listede " + count1 + " adet TWIN roomType var.");
    Assert.assertTrue(result1);
    Driver.waitAndClick(rom.roomsTabloRoomType);
    ReusableMethods.waitFor(5);
    //DAYCARE
    String expectedRoomType2 = "DAYCARE";
    boolean result2 = false;
    int count2 = 0;
    for (int i = 1; i <= 20; i++) {
        if (Driver.getDriver().findElement(By.xpath("//tbody/tr[" + i + "]/td[3]")).getText().contains(expectedRoomType2)) {
            result2 = true;
            count2++;
        } else {
            result2 = false;
        }
    }
    System.out.println("Son Listede " + count2 + " adet DAYCARE roomType var.");
    Assert.assertTrue(result2);
}
     */


}
