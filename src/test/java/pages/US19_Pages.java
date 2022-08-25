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

    @FindBy(xpath = "//button[text()='Search User']")
    public WebElement searchUser;

    @FindBy(xpath = "(//span[contains(text(),'Edit')])[1]")
    public WebElement staffEdit;

    @FindBy(xpath = "//input[@id='staff-birthDate']")
    public WebElement birthDay;

    @FindBy(xpath = "//input[@id='staff-phone']")
    public WebElement phone;

    @FindBy(xpath = "//select[@id='staff-gender']")
    public WebElement gender;

    @FindBy(xpath = "//select[@id='staff-bloodGroup']")
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

    // (//span[contains(text(),'Edit')])[1]
    @FindBy(xpath = "(//a[@class='btn btn-primary btn-sm'])[1]")
    public WebElement edit;

    @FindBy(xpath = "//div[@class='col-md-8']")
    public WebElement viewSonuc;

    @FindBy(xpath = "//div[@class='Toastify__toast-body']")
    public WebElement FoundMessage;
    //button[@id='save-entity']

    @FindBy(xpath = "//button[@id='save-entity']")
    public WebElement saveButon;

    @FindBy(xpath = "//div[contains(text(),'created')]")
    public WebElement CreateMessage;

    @FindBy(xpath = "(//a[@class='btn btn-info btn-sm'])[1]")
    public WebElement viewButton;

    //TC03
    @FindBy(xpath = "(//*[text()='Staff'])[2]")
    public WebElement staffTitle;
    @FindBy(xpath = "//h2/b")
    public WebElement staffId;
    @FindBy(xpath = "//dt[1]")
    public WebElement staffSsn;
    @FindBy(xpath = "//dt[2]")
    public WebElement staffFirstname;
    @FindBy(xpath = "//dt[3]")
    public WebElement staffLastname;
    @FindBy(xpath = "//dt[4]")
    public WebElement staffBirthdate;
    @FindBy(xpath = "//dt[5]")
    public WebElement staffPhone;
    @FindBy(xpath = "//dt[6]")
    public WebElement staffGender;
    @FindBy(xpath = "//dt[7]")
    public WebElement staffBlood;
    @FindBy(xpath = "//dt[8]")
    public WebElement staffAddress;
    @FindBy(xpath = "//dt[9]")
    public WebElement staffDescription;
    @FindBy(xpath = "//dt[10]")
    public WebElement staffCreatedate;
    @FindBy(xpath = "//dt[11]")
    public WebElement staffUser;
    @FindBy(xpath = "//dt[12]")
    public WebElement staffCountry;
    @FindBy(xpath = "//dt[13]")
    public WebElement staffState;

    //TC04
    @FindBy(xpath = "//input[@id='staff-firstName']")
    public WebElement firstNameBox;

    @FindBy(xpath = "//input[@id='staff-lastName']")
    public WebElement lastNameBox;

    @FindBy(xpath = "//input[@id='staff-birthDate']")
    public WebElement birthDateBox;

    @FindBy(xpath = "//input[@id='staff-phone']")
    public WebElement phoneBox;

    @FindBy(xpath = "//select[@id='staff-gender']")
    public WebElement genderDropdown;

    @FindBy(xpath = "//select[@id='staff-bloodGroup']")
    public WebElement bloodGroupDropdown;

    @FindBy(id = "staff-adress")
    public WebElement adressBox;

    @FindBy(xpath = "//input[@name='description']")
    public WebElement descriptionBox;

    @FindBy(xpath = "//select[@id='staff-user']")
    public WebElement userBox;

    @FindBy(xpath = "//select[@id='staff-country']")
    public WebElement countryDropdown;

    @FindBy(xpath = "//select[@id='staff-cstate']")
    public WebElement cityDropdown;

    @FindBy(xpath = "//button[@id='save-entity']")
    public WebElement saveButton;
    //div[@role='alert']


    @FindBy(xpath = "//div[contains(text(),'updated')]")
    public WebElement updateMessage;

    //TC05
    @FindBy(xpath = "(//a[@class='btn btn-danger btn-sm'])[1]")
    public WebElement deleteButton;

    @FindBy(xpath = "//button/span[text()='Delete']")
    public WebElement deleteButtonFromAlert;

    @FindBy(xpath = "//div[contains(text(),'deleted')]")
    public WebElement deletedMessage;


}


