package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class US24_26 {
    public US24_26() {
        PageFactory.initElements(Driver.getDriver(), this);
    }



    @FindBy(xpath = "//input[@id='username']")
    public WebElement usernameTextBox;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement passwordTextBox;

    @FindBy(xpath = "//a[@id='login-item']")
    public WebElement signInButton1;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement signInButton2;

    @FindBy(id = "account-menu")
    public WebElement accountMenu;

    @FindBy(xpath = "//input[@name='fromDate']")
    public WebElement fromDate;

    @FindBy(xpath = "//input[@name='toDate']")
    public WebElement toDate;

    @FindBy(xpath = "//span[@class='d-none d-md-inline']")
    public WebElement viewResults;

    @FindBy(xpath = "//div[@role='alert']")
    public WebElement randevuOnayMesaji;

    @FindBy(xpath = "//*[text()='MY PAGES(PATIENT)']") //"(//a[@class='d-flex align-items-center dropdown-toggle nav-link'])[1]")
    public WebElement myPages;

    @FindBy(xpath = "(//*[text()='My Appointments'])[1]")
    public WebElement myAppointments;

    @FindBy(xpath = "(//a[@class='btn btn-primary btn-sm'])[1]")  //(//*[text()='Show Tests'])[1]
    public WebElement showTestRequest;

    @FindBy(xpath = "(//span[@class='d-none d-md-inline'])[1]") // //*[text()='View Results']
    public WebElement kanTahliliGorunum;

    @FindBy(xpath = "(//span[@class='d-none d-md-inline'])[2]") // //*[text()='View Results']
    public WebElement showInvoice;

    @FindBy(xpath = "//tbody//tr")
    public List<WebElement> kanTahliliBilgileri;

    @FindBy(xpath = "//tbody//tr")
    public List<WebElement> invoice;

    @FindBy(xpath = "//a[@class='appointment-btn scrollto']")
    public WebElement makeAnAppointment;

    @FindBy(xpath = "//input[@name='firstName']")
    public WebElement firstName;

    @FindBy(xpath = "//input[@name='lastName']")
    public WebElement lastName;

    @FindBy(xpath = "//input[@name='ssn']")
    public WebElement snn;

    @FindBy(xpath = "//input[@name='email']")
    public WebElement email;

    @FindBy(xpath = "//input[@name='phone']")
    public WebElement phone;

    @FindBy(xpath = "//input[@name='appoDate']")
    public WebElement appoDate;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement sendAnAppointmentRequest;

    @FindBy(xpath = "//*[text()='CONTACT']")
    public WebElement contentButonu;

    @FindBy(xpath = "//input[@name='name']")
    public WebElement mesajName;

    @FindBy(xpath = "//input[@name='email']")
    public WebElement mesajEmail;

    @FindBy(xpath = "//input[@name='subject']")
    public WebElement mesajSubject;

    @FindBy(xpath = "//textarea[@id='message']")
    public WebElement mesaj;

    @FindBy(xpath = "//button[@class='btn btn-primary']")
    public WebElement sendButonu;


}
