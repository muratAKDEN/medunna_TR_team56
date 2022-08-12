package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US9_page {
    public US9_page() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//li[@id='account-menu']")
    public WebElement anasayfaInsanIkonu;

    @FindBy(xpath = "//a[@id='login-item']")
    public WebElement anasayfaInsanIkonuSignInElementi;

    @FindBy(xpath = "//input[@name='username']")
    public WebElement loginUsernameTextBox;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement loginPasswordTextBox;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement loginSignInButonu;

    @FindBy(xpath = "//li[@id='entity-menu']")
    public WebElement myPagesDropdownMenuElementi;

    @FindBy(xpath = "//span[text()='Search Patient']")
    public WebElement myPagesDropdownMenuSearchPatientElementi;

    @FindBy(xpath = "//span[text()='Patients']") // dogrulamak icin
    public WebElement patientsTableElementi;

    @FindBy(xpath = "//input[@name='ssn']")
    public WebElement patientsTableSSNsearchTextBox;

    @FindBy(xpath = "(//span[text()='View'])[1]")
    public WebElement patientsTableHastaViewElementi;

    @FindBy(xpath = "(//span[text()='Edit'])[1]")
    public WebElement patientsTableHastaEditElementi;


    // Hasta bilgileri Edit Sayfasi
    @FindBy(xpath = "//input[@name='id']")
    public WebElement hastaBilgileriGuncellemeIdTextBoxElementi;

    @FindBy(xpath = "//input[@name='firstName']")
    public WebElement hastaBilgileriGuncellemeFirstNameTextBoxElementi;

    @FindBy(xpath = "//input[@name='lastName']")
    public WebElement hastaBilgileriGuncellemeLastNameTextBoxElementi;

    @FindBy(xpath = "//input[@name='birthDate']")
    public WebElement hastaBilgileriGuncellemeBirthDateTextBoxElementi;

    @FindBy(xpath = "//input[@name='email']")
    public WebElement hastaBilgileriGuncellemeEmailTextBoxElementi;

    @FindBy(xpath = "//input[@name='phone']")
    public WebElement hastaBilgileriGuncellemePhoneTextBoxElementi;

    @FindBy(xpath = "//select[@name='gender']")
    public WebElement hastaBilgileriGuncellemeGenderSelectMenuElementi;

    @FindBy(xpath = "//select[@name='bloodGroup']")
    public WebElement hastaBilgileriGuncellemeBloodGroupSelectMenuElementi;

    @FindBy(xpath = "//input[@name='adress']")
    public WebElement hastaBilgileriGuncellemeAdressTextBoxElementi;

    @FindBy(xpath = "//textarea[@name='description']")
    public WebElement hastaBilgileriGuncellemeDescriptionTextBoxElementi;

    @FindBy(xpath = "//select[@name='user.id']")
    public WebElement hastaBilgileriGuncellemeUserSelectMenuElementi;

    @FindBy(xpath = "//select[@name='country.id']")
    public WebElement hastaBilgileriGuncellemeCountrySelectMenuElementi;

    @FindBy(xpath = "//select[@name='cstate.id']")
    public WebElement hastaBilgileriGuncellemeStateSelectMenuElementi;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement hastaBilgileriGuncellemeSaveButonuElementi;


    @FindBy(xpath = "//span[text()='SSN']")
    public WebElement hastaBilgisiGoruntulemeSSNElementi;

    @FindBy(xpath = "//div[@role='alert']")
    public WebElement hastaBilgisiGuncellemeBasariliYazisi;

    @FindBy(xpath = "//div[@class='Toastify__toast-container Toastify__toast-container--top-left toastify-container']")
    public WebElement alertButton;


    @FindBy(xpath = "//td[text()='27605']")
    public WebElement arananHastaId;




}
