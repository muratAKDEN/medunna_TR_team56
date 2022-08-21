package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Ayse_Page {
    public Ayse_Page() {PageFactory.initElements(Driver.getDriver(), this);}

    @FindBy(xpath = "(//a[@href='#'])[1]")
    public WebElement dropDownIkonu;

    @FindBy(xpath = "//span[text()='Sign in']")
    public WebElement signinElementi;

    @FindBy(xpath = "//input[@name='username']")
    public WebElement usernameBox;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement passwordBox;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement signinButonu;

    @FindBy(xpath = "//span[text()='MY PAGES(PATIENT)']")
    public WebElement mypagesElementi;

    @FindBy(xpath = "//span[text()='Make an Appointment']")
    public WebElement makeanAppointmentButonu;

    @FindBy(xpath = "(//input[@id='phone'])[1]")
    public WebElement phoneBox;

    @FindBy(xpath = "//input[@name='appoDate']")
    public WebElement appointmentDateTimeBox;

    @FindBy(xpath="//button[@type='submit']")
    public WebElement appointmentRequestButonu;

    @FindBy(xpath="//span[text()='Appointment date can not be past date!']")
    public WebElement pastDateTextElement;

    @FindBy(xpath="//div[@style='pointer-events: none;']")
    public WebElement randevuKabulTextElementi;

    @FindBy(xpath="//span[text()='Administration']")
    public WebElement administrationElementi;

    @FindBy(xpath="//span[text()='User management']")
    public WebElement userManagementButonu;

    @FindBy(xpath="(//span[text()='View'])[13]")
    public WebElement userViewButonu;

    @FindBy(xpath="//span[text()='First name']")
    public WebElement userFirstNameElement;

    @FindBy(xpath="//span[text()='Last name']")
    public WebElement userLastNameElement;

    @FindBy(xpath="//span[text()='Email']")
    public WebElement userEmailElement;

    @FindBy(xpath="(//span[text()='Edit'])[13]")
    public WebElement userEditButton;

    @FindBy(xpath="(//span[text()='Delete'])[13]")
    public WebElement userDeleteButton;

    @FindBy(xpath="//input[@name='firstName']")
    public WebElement userIdFirstNameBox;

    @FindBy(xpath="//input[@name='lastName']")
    public WebElement userIdLastNameBox;

    @FindBy(xpath="//input[@name='email']")
    public WebElement userIdMailBox;

    @FindBy(xpath="//input[@name='activated']")
    public WebElement activatedBox;

    @FindBy(xpath="//option[@value='ROLE_ADMIN']")
    public WebElement profilsRoleAdmin;

    @FindBy(xpath="//div[@class='Toastify__toast Toastify__toast--success toastify-toast']")
    public WebElement rolKabulYaziElementi;

    @FindBy(xpath="//span[text()='Save']")
    public WebElement saveButonu;

    @FindBy(xpath="//option[@value='ROLE_USER']")
    public WebElement profilsRoleUser;

    @FindBy(xpath="//option[@value='ROLE_PATIENT']")
    public WebElement profilsRolePatient;

    @FindBy(xpath="//option[@value='ROLE_STAFF']")
    public WebElement profilsRoleStaff;

    @FindBy(xpath="//option[@value='ROLE_PHYSICIAN']")
    public WebElement profilsRolePhysician;







}
