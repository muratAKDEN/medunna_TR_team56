package stepDefinitions.uiStep;

import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.Ayse_Page;
import pages.US20_Page;
import utilities.ConfigReader;
import utilities.Driver;

public class US20_StepDefinitions {
    Ayse_Page pages=new Ayse_Page();

    @Given("Admin Ayse Medunna Url'e gider")
    public void admin_ayse_medunna_url_e_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("medunnaUrl"));
    }

    @And("Admin Ayse dropdown ikonuna tiklar")
    public void adminAyseDropdownIkonunaTiklar() {
        pages.dropDownIkonu.click();
    }

    @Given("Admin Ayse sign in elementini tiklar")
    public void admin_ayse_sign_in_elementini_tiklar() {
        pages.signinElementi.click();
    }

    @Then("Admin Ayse username ve password girer")
    public void admin_ayse_username_ve_password_girer() {
        pages.usernameBox.sendKeys(ConfigReader.getProperty("admin"));
        pages.passwordBox.sendKeys(ConfigReader.getProperty("password"));
    }

    @Then("Admin Ayse sign in butonunu tiklar")
    public void admin_ayse_sign_in_butonunu_tiklar() {
        pages.signinButonu.click();
    }

    @Then("Admin Ayse Administration butonunu tiklar")
    public void admin_ayse_administration_butonunu_tiklar() {
        pages.administrationElementi.click();
    }

    @Then("Admin Ayse User Management butonunu tiklar")
    public void admin_ayse_user_management_butonunu_tiklar() {
        pages.userManagementButonu.click();
    }

    @Then("Admin Ayse kullaniciyi secer ve view butonunu tiklar")
    public void admin_ayse_kullaniciyi_secer_ve_view_butonunu_tiklar() {
        pages.userViewButonu.click();
    }

    @Then("Admin Ayse firstname, lastname,email bilgilerinin gorunur oldugunu test eder")
    public void admin_ayse_firstname_lastname_email_bilgilerinin_gorunur_oldugunu_test_eder() {
        Assert.assertTrue(pages.userFirstNameElement.isDisplayed());
        Assert.assertTrue(pages.userLastNameElement.isDisplayed());
        Assert.assertTrue(pages.userEmailElement.isDisplayed());
    }

    @And("Admin Ayse kullaniciyi secer ve edit butonunu tiklar")
    public void adminAyseKullaniciyiSecerVeEditButonunuTiklar() {
        pages.userEditButton.click();
    }

    @And("Admin Ayse activated box i tiklayarak kullanici aktive edebilir veya iptal edebilir")
    public void adminAyseActivatedBoxITiklayarakKullaniciAktiveEdebilirVeyaIptalEdebilir() {
        pages.activatedBox.click();
        pages.activatedBox.click();
    }

    @And("Admin Ayse profils seceneginden Role-Admin atayabildigini test eder")
    public void adminAyseProfilsSecenegindenRoleAdminAtayabildiginiTestEder() {
        pages.profilsRoleAdmin.click();
        pages.saveButonu.click();
        Assert.assertTrue(pages.rolKabulYaziElementi.isDisplayed());
    }

    @And("Admin Ayse profils seceneginden Role-User atayabildigini test eder")
    public void adminAyseProfilsSecenegindenRoleUserAtayabildiginiTestEder() {
        pages.userEditButton.click();
        pages.profilsRoleUser.click();
        pages.saveButonu.click();
        Assert.assertTrue(pages.rolKabulYaziElementi.isDisplayed());
    }

    @And("Admin Ayse profils seceneginden Role-Patient atayabildigini test eder")
    public void adminAyseProfilsSecenegindenRolePatientAtayabildiginiTestEder() {
        pages.userEditButton.click();
        pages.profilsRolePatient.click();
        pages.saveButonu.click();
        Assert.assertTrue(pages.rolKabulYaziElementi.isDisplayed());
    }

    @And("Admin Ayse profils seceneginden Role-Staff atayabildigini test eder")
    public void adminAyseProfilsSecenegindenRoleStaffAtayabildiginiTestEder() {
        pages.userEditButton.click();
        pages.profilsRoleStaff.click();
        pages.saveButonu.click();
        Assert.assertTrue(pages.rolKabulYaziElementi.isDisplayed());
    }

    @And("Admin Ayse profils seceneginden Role-Physician atayabildigini test eder")
    public void adminAyseProfilsSecenegindenRolePhysicianAtayabildiginiTestEder() {
        pages.userEditButton.click();
        pages.profilsRolePhysician.click();
        pages.saveButonu.click();
        Assert.assertTrue(pages.rolKabulYaziElementi.isDisplayed());
    }

    @And("Admin Ayse kullaniciyi secer ve delete butonunu tiklar")
    public void adminAyseKullaniciyiSecerVeDeleteButonunuTiklar() {
        //pages.userDeleteButton.click();

    }

    @Then("Admin Ayse sayfayi kapatir")
    public void admin_ayse_sayfayi_kapatir() throws InterruptedException {
        Thread.sleep(3000);
        Driver.closeDriver();
    }


}




