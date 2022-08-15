package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.ArrayList;
import java.util.List;

public class US09_page {
    public US09_page() {
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

    @FindBy(xpath = "//div[@class='Toastify__toast-container Toastify__toast-container--top-left toastify-container']")
    public WebElement saveGeciciSekme;

    public List<WebElement> hastaBilgileri() {

        List<WebElement> tabloSatiri = new ArrayList<>();
        WebElement istenenHucreDegeri = null;
        for (int i = 1; i < 16; i++) {
            String dinamikSatirXpath = "//tbody//tr//td[" + i + "]";
            istenenHucreDegeri = Driver.getDriver().findElement(By.xpath(dinamikSatirXpath));
            tabloSatiri.add(istenenHucreDegeri);
        }
        return tabloSatiri;

    }
    @FindBy(xpath = "//input[@name='ssn']")
    public WebElement patentSsnBox;




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

    @FindBy(id = "cancel-save")
    public WebElement backButton;

    @FindBy(xpath = "//div[text()='This field is required.']")
    public WebElement deleteHataYazisi;

    @FindBy(xpath = "//tbody/tr[1]/td[16]/div[1]")    // delete buton ama komple edit view falan içeriyor
    public WebElement deleteButton;

    @FindBy(id = "//span[text()='First Name']")
    public WebElement guncellemeFirstname;
    @FindBy(id = "//span[text()='Last Name']")
    public WebElement guncellemelastname;
    @FindBy(id = "//span[text()='Birth Date']")
    public WebElement guncellemeBirthday;
    @FindBy(id = "//span[text()='Email']")
    public WebElement guncellemeEmail;
    @FindBy(id = "//span[text()='Phone']")
    public WebElement guncellemePhone;
    @FindBy(id = "//span[text()='Gender']")
    public WebElement guncellemeGender;
    @FindBy(id = "//span[text()='Blood Group']")
    public WebElement guncellemeBlood;
    @FindBy(id = "//span[text()='Address']")
    public WebElement guncellemeAdres;
    @FindBy(id = "//span[text()='Description']")
    public WebElement guncellemeDescription;
    @FindBy(id = "//span[text()='User']")
    public WebElement guncellemeUser;
    @FindBy(id = "//span[text()='Country']")
    public WebElement guncellemeCountry;
    @FindBy(id = "//span[text()=' State/City']")
    public WebElement guncellemeState;
    @FindBy(id = "//span[text()='Patient']")
    public WebElement guncellemePatient;
    @FindBy(id = "//span[text()='Back']")
    public WebElement patientbackButton;

    @FindBy(xpath = "//dt")
    public List<WebElement> tumSayfa;

    @FindBy(xpath = "//div[@class='info jhi-item-count']")
    public  WebElement countOfPatients;








}
