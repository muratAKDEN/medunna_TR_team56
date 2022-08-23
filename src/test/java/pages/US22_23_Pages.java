package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US22_23_Pages {

    public US22_23_Pages(){
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
    @FindBy(xpath ="//*[text()='MY PAGES']")
    public WebElement myPages;
    @FindBy(xpath ="//*[text()='My Appointments']")
    public WebElement myAppointments;
    @FindBy(xpath ="//*[text()='Search Patient']")
    public WebElement searchPatient;
    @FindBy(xpath ="//input[@name='ssn']")
    public WebElement ssnBox;
    @FindBy(xpath ="//*[text()='123-45-4324']")
    public WebElement validSSN;
    @FindBy(xpath ="//*[text()='Show Appointments']")
    public WebElement showAppointments;
    @FindBy(xpath ="//*[text()='Show Tests'][1]")
    public WebElement showTests;
    @FindBy(xpath ="//*[text()='View Results'][1]")
    public WebElement viewResults;


    @FindBy(xpath ="//*[text()='Test Results'][1]")
    public WebElement testResults;
    //div[@class='table-responsive']

    @FindBy(xpath ="//*[text()='Edit'][1]")
    public WebElement editButton;
    @FindBy(xpath ="//input[@name='description']")
    public WebElement descriptionButton;
    @FindBy(xpath ="//input[@name='result']")
    public WebElement resultButton;
    @FindBy(xpath ="//*[text()='Save'][1]")
    public WebElement saveButton;
    @FindBy(xpath ="//div[@role='alert']")
    public WebElement updatedAlert;






}
