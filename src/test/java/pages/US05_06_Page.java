package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class US05_06_Page {
    public US05_06_Page() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//li[@id='account-menu']")
    public WebElement girisIkonu;

    @FindBy(xpath = "//span[text()='Sign in']")
    public WebElement signInTextElement;

    @FindBy(xpath = "//input[@name='username']")
    public WebElement signInUsername;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement signInPassword;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement signInButton;

    @FindBy(xpath = "//span[text()='MY PAGES(PATIENT)']")
    public WebElement myPagesPatient;

    @FindBy(xpath = "//span[text()='Make an Appointment']")
    public WebElement makeAnAppointmentElement;

    @FindBy(xpath = "//input[@name='firstName']")
    public WebElement makeAnAppointmentUserName;

    @FindBy(xpath = "//span[text()='Send an Appointment Request']")
    public WebElement sendAnAppointmentRequest;

    @FindBy(xpath = "//div[text()='Your FirstName is required.']")
    public WebElement firstNameRequiredTextElement;

    @FindBy(xpath = "//input[@name='ssn']")
    public WebElement makeAnAppointmentSsn;

    @FindBy(xpath = "//div[text()='Your SSN is required.']")
    public WebElement ssnRequiredTextElement;

    @FindBy(xpath = "//input[@name='lastName']")
    public WebElement makeAnAppointmentLastName;

    @FindBy(xpath = "//div[text()='Your LastName is required.']")
    public WebElement lastNameRequiredTextElement;

    @FindBy(xpath = "//input[@name='phone']")
    public WebElement makeAnAppointmentPhone;

    @FindBy(xpath = "//div[text()='Phone number is required.']")
    public WebElement phoneNumberRequiredTextElement;

    @FindBy(xpath = "//span[text()='My Appointments']")
    public WebElement makeAppointmentsElement;

    @FindBy(xpath = "//strong[text()='Appointment registration saved!']")
    public WebElement appointmentSavedTextElement;

    @FindBy(xpath = "//tbody//tr/td[6]")
    public List<WebElement> createdDateElements;

    @FindBy(xpath = "//h4[text()='Useful Links']")
    public WebElement usefullLinks;


}
