package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US19_Pages {
    public US19_Pages(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath="//li[@id='account-menu']")
    public WebElement signInButonu;
    @FindBy(xpath ="//a[@id='login-item']")
    public WebElement loginButonu;
    @FindBy(xpath="//input[@id='username']")
    public WebElement username;
    @FindBy(xpath ="//input[@id='password']")
    public WebElement password;
    @FindBy(xpath ="//button[@type='submit']")
    public WebElement signIn;

    @FindBy(xpath = "//span[normalize-space()='Items&Titles']")
    public WebElement itemsTitle;

    @FindBy(xpath = "(//a[@role='menuitem'])[2]")
    public WebElement staffButon;

    @FindBy(xpath = "//span[normalize-space()='Create a new Staff']")
    public WebElement CreateStaff;

    @FindBy(xpath = "//input[@id='useSSNSearch']")
    public WebElement useSearch;

    @FindBy(xpath = "//input[@id='searchSSN']")
    public WebElement ssn;

    @FindBy(xpath = "//button[normalize-space()='Search User']")
    public WebElement searchUser;

    @FindBy(xpath = "(//span[contains(text(),'Edit')])[1]")
    public WebElement staffEdit;

    @FindBy(xpath = "//input[@id='staff-birthDate']")
    public WebElement birthDay;

    @FindBy(xpath = "//input[@id='staff-phone']")
    public WebElement phone;

    @FindBy(xpath = "//select[@name='gender']")
    public WebElement gender;

    @FindBy(xpath = "//select[@name='bloodGroup']")
    public WebElement bloodDroup;

    @FindBy(xpath = "//input[@id='staff-adress']")
    public WebElement address;

    @FindBy(xpath = "//input[@id='staff-description']")
    public WebElement description;

    @FindBy(xpath = "//select[@id='staff-user']")
    public WebElement user;

    @FindBy(xpath = "//select[@id='staff-country']")
    public WebElement country;

    @FindBy(xpath = "//select[@id='staff-cstate']")
    public WebElement state;

    @FindBy(xpath = "(//span[contains(text(),'View')])[1]")
    public WebElement view;

    @FindBy(xpath = "(//span[contains(text(),'Edit')])[1]")
    public WebElement edit;


}


