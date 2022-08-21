package stepDefinitions.uiStep;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.US19_Pages;
import utilities.ConfigReader;
import utilities.Driver;

public class US19_StepDefinitions {
    US19_Pages us19_pages = new US19_Pages();
    Actions actions = new Actions(Driver.getDriver());

    @Given("ft  {string} sitesine gider")
    public void ft_sitesine_gider(String string) {
        Driver.getDriver().get(ConfigReader.getProperty("medunnaUrll"));
    }

    @Then("ft account-menu yi tiklar")
    public void ft_account_menu_yi_tiklar() {
        us19_pages.signInButonu.click();
    }

    @When("ft  login butonunu tiklar")
    public void ft_login_butonunu_tiklar() {
        us19_pages.loginButonu.click();
    }

    @When("ft {string} ve {string} bilgilerini girer ve sign in butonuna tiklar")
    public void ft_ve_bilgilerini_girer_ve_sign_in_butonuna_tiklar(String string, String string2) throws InterruptedException {
        us19_pages.username.sendKeys("healthprojectteam56" + Keys.TAB);
        us19_pages.password.sendKeys("Teamproject.56" + Keys.TAB);

        Thread.sleep(3000);
        actions
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .perform();
        us19_pages.signIn.click();
    }

    @When("ft items-titles e butonuna tiklar")
    public void ft_items_titles_e_butonuna_tiklar() {
        us19_pages.itemsTitle.click();

    }

    @When("ft acilan sekmede Staff 'a tiklar")
    public void ft_acilan_sekmede_staff_a_tiklar() {
        us19_pages.staffButon.click();
    }

    @When("ft Create a new Staff 'a tiklar")
    public void ft_create_a_new_staff_a_tiklar() {
        us19_pages.CreateStaff.click();
    }

    @When("ft Use Search tiklar")
    public void ft_use_search_tiklar() throws InterruptedException {
        us19_pages.useSearch.click();
        Thread.sleep(3000);
    }

    @When("ft {string} girer")
    public void ft_ssn_girer(String SSN) {
        us19_pages.ssn.sendKeys(SSN);
    }

    @When("ft Search User ' tiklar")
    public void ft_search_user_tiklar() throws InterruptedException {
        us19_pages.searchUser.click();
        Thread.sleep(3000);
    }
    //TC02

    @When("ft kayitli Staff'in Editine tiklar")
    public void ft_kayitli_staff_in_editine_tiklar() throws InterruptedException {
        us19_pages.staffEdit.click();
        Thread.sleep(3000);
    }

    @Given("ft {string}  ve {string} bilgilerini girer")
    public void ft_ve_bilgilerini_girer(String BirthDate, String phone) {
        us19_pages.birthDay.sendKeys(BirthDate);
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
        us19_pages.address.sendKeys(address);
        us19_pages.description.sendKeys(description);

    }

    @Given("ft User, Country ve State City secer")
    public void ft_user_country_ve_state_city_secer() {

        Select user = new Select(us19_pages.user);
        user.selectByVisibleText("team87staff001");

        Select country = new Select(us19_pages.country);
        country.selectByVisibleText("Turkey");

        Select state = new Select(us19_pages.state);
        state.selectByVisibleText("Adana");

    }


    @And("ft kayitli Staff de view ' tiiklar")
    public void ftKayitliStaffDeViewTiiklar() {
        us19_pages.view.click();

    }

    @And("ft acilan kayitli Staff i edit butonuna tiklar")
    public void ftAcilanKayitliStaffIEditButonunaTiklar() {
        us19_pages.edit.click();
    }
}


