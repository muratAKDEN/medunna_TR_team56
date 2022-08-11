package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US10_Page {
    public US10_Page(){
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
    @FindBy(xpath="//input[@id='appointment-id']")
    public WebElement Id;
    @FindBy(xpath ="//input[@id='appointment-startDate']")
    public WebElement startDateTime;
    @FindBy(xpath="//input[@id='appointment-endDate']")
    public WebElement endDateTime;
    @FindBy(xpath ="//select[@id='appointment-status']")
    public WebElement status;
    @FindBy(xpath ="//select[@id='appointment-heading']")
    public WebElement timeSlots;
    @FindBy(xpath ="//div[@class='table-responsive']")
    public WebElement appointmentList;
    @FindBy(xpath ="//select[@id='appointment-physician']")
    public WebElement patient;

}
