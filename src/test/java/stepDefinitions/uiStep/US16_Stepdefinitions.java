package stepDefinitions.uiStep;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import pages.US08_Pages;
import pages.US16_Page;

import java.util.ArrayList;
import java.util.List;

public class US16_Stepdefinitions {
    US16_Page us16 = new US16_Page();


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

    }


}
