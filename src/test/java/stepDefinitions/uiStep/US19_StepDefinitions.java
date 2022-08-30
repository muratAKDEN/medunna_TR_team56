package stepDefinitions.uiStep;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.US19_Pages;
import utilities.ConfigReader;
import utilities.Driver;

import static utilities.ReusableMethods.waitFor;

public class US19_StepDefinitions {
    US19_Pages us19_pages = new US19_Pages();
    Actions actions = new Actions(Driver.getDriver());

    @Given("ft  {string} sitesine gider")
    public void ft_sitesine_gider(String string) {
        Driver.getDriver().get(ConfigReader.getProperty("medunnaUrl"));
    }

    @Then("ft account-menu yi tiklar")
    public void ft_account_menu_yi_tiklar() {
        Driver.waitAndClick(us19_pages.signInButonu, 1);

    }

    @When("ft  login butonunu tiklar")
    public void ft_login_butonunu_tiklar() {
        Driver.waitAndClick(us19_pages.loginButonu, 1);
    }

    @When("ft {string} ve {string} bilgilerini girer ve sign in butonuna tiklar")
    public void ft_ve_bilgilerini_girer_ve_sign_in_butonuna_tiklar(String staffUsername, String StaffPassword) throws InterruptedException {
        Driver.waitAndSendText(us19_pages.username, ConfigReader.getProperty("staffUsername"));
        Driver.waitAndSendText(us19_pages.password, ConfigReader.getProperty("StaffPassword"));
        Driver.wait(1);
        Driver.waitAndClick(us19_pages.signIn, 1);
    }

    @When("ft items-titles e butonuna tiklar")
    public void ft_items_titles_e_butonuna_tiklar() {
        Driver.waitAndClick(us19_pages.itemsTitle, 1);

    }

    @When("ft acilan sekmede Staff 'a tiklar")
    public void ft_acilan_sekmede_staff_a_tiklar() {
        Driver.waitAndClick(us19_pages.staffButon, 1);
        Driver.wait(1);
    }

    @When("ft Create a new Staff 'a tiklar")
    public void ft_create_a_new_staff_a_tiklar() {
        Driver.waitAndClick(us19_pages.CreateStaff, 1);
        Driver.wait(1);
    }

    @When("ft Use Search tiklar")
    public void ft_use_search_tiklar() {
        Driver.waitAndClick(us19_pages.useSearch, 1);
        Driver.wait(1);
    }

    @When("ft {string} girer")
    public void ft_ssn_girer(String SSN) {
        Driver.waitAndSendText(us19_pages.ssn, SSN);
        Driver.wait(1);
    }

    @When("ft Search User ' tiklar")
    public void ft_search_user_tiklar() {
        Driver.clickWithJS(us19_pages.searchUser);
        Driver.wait(1);
    }
    //TC02

    @When("ft kayitli Staff'in Editine tiklar")
    public void ft_kayitli_staff_in_editine_tiklar() throws InterruptedException {
        us19_pages.staffEdit.click();
        Driver.wait(1);
    }

    @Given("ft {string}  ve {string} bilgilerini girer")
    public void ft_ve_bilgilerini_girer(String BirthDate, String phone) {
        Driver.wait(1);
        us19_pages.birthDay.sendKeys(BirthDate);
        Driver.wait(1);
        us19_pages.phone.clear();
        Driver.wait(1);
        us19_pages.phone.sendKeys(phone);
    }

    @Given("ft Gender ve Blood Group secer")
    public void ft_gender_ve_blood_group_secer() throws InterruptedException {
        Select selectGender = new Select(us19_pages.gender);
        selectGender.selectByVisibleText("FEMALE");

        Select selectBlood = new Select(us19_pages.bloodDroup);
        selectBlood.selectByVisibleText("B+");

    }

    @Given("ft {string},{string} bilgilerini girer")
    public void ft_bilgilerini_girer(String address, String description) {
        Driver.wait(1);
        us19_pages.address.sendKeys(address);
        Driver.wait(1);
        us19_pages.description.sendKeys(description);

    }

    @Given("ft User, Country ve State City secer")
    public void ft_user_country_ve_state_city_secer() {
        Driver.wait(1);
        Select selectCountry = new Select(us19_pages.country);
        selectCountry.selectByVisibleText("USA");
        Driver.wait(1);
        Select selectState = new Select(us19_pages.state);
        selectState.selectByVisibleText("California");
        Driver.wait(1);
    }


    @And("ft acilan kayitli Staff i edit butonuna tiklar")
    public void ftAcilanKayitliStaffIEditButonunaTiklar() {
        Driver.waitAndClick(us19_pages.edit, 1);
    }

    @And("ft acilan kayitli Staff 'i  delete butonuna tiklar")
    public void ftAcilanKayitliStaffIDeleteButonunaTiklar() {


    }

    @And("ft search de {string} mesajini gorur")
    public void ftSearchDeMesajiniGorur(String arg0) {
        Driver.wait(1);
        Assert.assertTrue(us19_pages.FoundMessage.getText().contains("User found"));
    }

    @And("ft save butonuna tiklar")
    public void ftSaveButonunaTiklar() {
        Driver.clickWithJS(us19_pages.saveButon);

    }

    @And("ft {string} mesajini gorur")
    public void ftMesajiniGorur(String arg0) {
        try {
            waitFor(1);
            Assert.assertTrue(us19_pages.CreateMessage.getText().contains("new Staff is created"));
        } catch (Exception e) {
            e.printStackTrace();
        }

        //Assert.assertTrue(us19_pages.CreateMessage.isDisplayed());
    }

    @And("ft bir kullanici secer")
    public void ftBirKullaniciSecer() {
        Driver.wait(1);
        Driver.waitAndClick(us19_pages.viewButton, 1);

    }

    @And("ft kayitli kullanicinin tum bilgilerinin gorunurlugunu dogrular")
    public void ftKayitliKullanicininTumBilgilerininGorunurlugunuDogrular() {
        Assert.assertTrue(us19_pages.staffTitle.isDisplayed());
        Driver.wait(1);
        Assert.assertTrue(us19_pages.staffId.isDisplayed());
        Driver.wait(1);
        Assert.assertTrue(us19_pages.staffSsn.isDisplayed());
        Driver.wait(1);
        Assert.assertTrue(us19_pages.staffFirstname.isDisplayed());
        Driver.wait(1);
        Assert.assertTrue(us19_pages.staffLastname.isDisplayed());
        Assert.assertTrue(us19_pages.staffBirthdate.isDisplayed());
        Assert.assertTrue(us19_pages.staffPhone.isDisplayed());
        Assert.assertTrue(us19_pages.staffGender.isDisplayed());
        Assert.assertTrue(us19_pages.staffBlood.isDisplayed());
        Assert.assertTrue(us19_pages.staffAddress.isDisplayed());
        Assert.assertTrue(us19_pages.staffDescription.isDisplayed());
        Assert.assertTrue(us19_pages.staffCreatedate.isDisplayed());
        Assert.assertTrue(us19_pages.staffUser.isDisplayed());
        Assert.assertTrue(us19_pages.staffCountry.isDisplayed());
        Assert.assertTrue(us19_pages.staffState.isDisplayed());
    }

    @When("ft {string} ve {string} degistirir")
    public void ft_ve_degistirir(String firstname, String lastname) {
        us19_pages.firstNameBox.clear();
        Driver.wait(1);
        us19_pages.firstNameBox.sendKeys(firstname);
        us19_pages.lastNameBox.clear();
        Driver.wait(1);
        us19_pages.lastNameBox.sendKeys(lastname);

    }

    @When("ft {string} ve {string} ogelerini doldurur")
    public void ft_ve_ogelerini_doldurur(String birthdate, String phone) {
        Driver.wait(1);
        us19_pages.birthDateBox.sendKeys(birthdate);
        us19_pages.phone.clear();
        Driver.wait(1);
        us19_pages.phoneBox.sendKeys(phone);
    }

    @When("ft blood group degistirir")
    public void ft_blood_group_degistirir() {
        Select selectBlood = new Select(us19_pages.bloodGroupDropdown);
        selectBlood.selectByVisibleText("AB+");
    }

    @When("ft {string} ve {string} doldurur")
    public void ft_ve_doldurur(String Adress, String Description) {
        us19_pages.adressBox.clear();
        Driver.wait(1);
        us19_pages.adressBox.sendKeys(Adress);
        Driver.wait(1);
        us19_pages.description.clear();
        Driver.wait(1);
        us19_pages.descriptionBox.sendKeys(Description);
    }

    @When("ft Country ve City degistir")
    public void ft_country_ve_city_degistir() {
        Driver.wait(1);
        Select selectCountry = new Select(us19_pages.countryDropdown);
        selectCountry.selectByVisibleText("USA");
        Driver.wait(1);
        Select selectState = new Select(us19_pages.cityDropdown);
        selectState.selectByVisibleText("California");
        Driver.wait(1);
    }

    @When("ft {string} mesajinin gorunur oldugunu dogrular")
    public void ft_mesajinin_gorunur_oldugunu_dogrular(String string) {
        Driver.wait(1);
        //Assert.assertTrue(us19_pages.updateMessage.getText().contains("A Staff is updated"));

        Assert.assertTrue(us19_pages.updateMessage.isDisplayed());


    }

    @When("ft delete dugmesine tiklar")
    public void ft_delete_dugmesine_tiklar() {
        Driver.wait(1);
        Driver.waitAndClick(us19_pages.deleteButton, 1);
    }

    @When("ft alert deki delete dugmesine tiklar")
    public void ft_alert_deki_delete_dugmesine_tiklar() {
        Driver.wait(1);
        Driver.clickWithJS(us19_pages.deleteButtonFromAlert);
    }

    @When("ft {string} mesajinin gorundugunu dogrular")
    public void ft_mesajinin_gorundugunu_dogrular(String string) {
        Driver.wait(1);
        Assert.assertTrue(us19_pages.deletedMessage.getText().contains("is deleted"));

        //Assert.assertTrue(us19_pages.deletedMessage.isDisplayed());


    }


    @And("ft sayfayi kapatir")
    public void ftSayfayiKapatir() {
        Driver.closeDriver();
    }
}
