package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US07_Page {
    public US07_Page() {PageFactory.initElements(Driver.getDriver(), this);}

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





}
