package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US11_Pages {
    public US11_Pages(){
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
    @FindBy(xpath ="//span[normalize-space()='MY PAGES']")
    public WebElement myPages;
    @FindBy(xpath ="//span[normalize-space()='My Appointments']")
    public WebElement myAppointments;
    @FindBy(xpath ="(//span[contains(text(),'Edit')])[1]")
    public WebElement editButonu;
    @FindBy(xpath ="//span[normalize-space()='Create or Edit an Appointment']")
    public WebElement createYazisi;


    @FindBy(xpath="//input[@id='appointment-id']")
    public WebElement Id;
    @FindBy(xpath ="//input[@id='appointment-startDate']")
    public WebElement startDateTime;
    @FindBy(xpath="//input[@id='appointment-endDate']")
    public WebElement endDateTime;
    @FindBy(xpath ="//select[@id='appointment-status']")
    public WebElement status;
    @FindBy(xpath ="//select[@id='appointment-physician']")
    public WebElement patient;
    @FindBy(xpath="//textarea[@id='appointment-anamnesis']")
    public WebElement anamnesis;
    @FindBy(xpath="//textarea[@id='appointment-prescription']")
    public WebElement prescription;
    @FindBy(xpath="//textarea[@id='appointment-description']")
    public WebElement description;
}


