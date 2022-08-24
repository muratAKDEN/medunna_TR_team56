package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US20_Page {

    public US20_Page() {PageFactory.initElements(Driver.getDriver(), this);}



    @FindBy(xpath="//span[text()='Administration']")
    public WebElement administrationElementi;

    @FindBy(xpath="//span[text()='User management']")
    public WebElement userManagementButonu;

    @FindBy(xpath="(//span[text()='Edit'])[13]")
    public WebElement usersId;

    @FindBy(xpath="//input[@name='firstName']")
    public WebElement usersIdFirstNameBox;

    @FindBy(xpath="//input[@name='lastName']")
    public WebElement usersIdLastNameBox;

    @FindBy(xpath="//input[@name='email']")
    public WebElement usersIdMailBox;

   @FindBy(xpath="//input[@name='activated']")
    public WebElement activatedBox;

    @FindBy(xpath="//option[@value='ROLE_USER']")
    public WebElement profilsRoleUser;

    @FindBy(xpath="//option[@value='ROLE_PATIENT']")
    public WebElement profilsRolePatient;

    @FindBy(xpath="//option[@value='ROLE_STAFF']")
    public WebElement profilsRoleStaff;

    @FindBy(xpath="//option[@value='ROLE_PHYSICIAN']")
    public WebElement profilsRolePhysician;

    @FindBy(xpath="(//span[text()='Delete'])[13]")
    public WebElement usersDeleteButton;










}
