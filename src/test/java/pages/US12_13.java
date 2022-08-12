package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class US12_13 {
    public US12_13(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (id = "account-menu")
    public WebElement accountMenu;

    @FindBy (id = "login-item")
    public WebElement signInButton1;

    @FindBy (xpath = "//input[@name='username']")
    public WebElement userNameButton;

    @FindBy (xpath = "//input[@name='password']")
    public WebElement passwordButton;

    @FindBy (xpath = "//button[@type='submit']")
    public WebElement signInButton2;

    @FindBy (xpath = "//*[text()='MY PAGES']")
    public WebElement myPages;

    @FindBy (xpath = "(//*[text()='My Appointments'])[1]")
    public WebElement myAppointments;

    @FindBy (xpath = "//*[text()='Edit']")
    public WebElement editButton;

    @FindBy(xpath = "//*[text()='Request A Test']")
    public WebElement requestATest;

    @FindBy (xpath = "//tr//th")
    public List<WebElement> testItemsTable;

    @FindBy (xpath = "//button[@id='save-entity']")
    public WebElement saveButton;


    @FindBy (xpath = "//*[text()='Show Test Results']")
    public WebElement showTestResultButton;

    @FindBy (xpath = "//*[text()='Request Inpatient']")
    public WebElement requestInpatientButton;


    @FindBy(xpath = "(//div[@class='btn-group flex-btn-group-container'])[1]")
    public WebElement viewResultsButton;

    @FindBy (xpath = "//tr//th")
    public List<WebElement> testResultsBaslikIsimleri;

    @FindBy(xpath = "//*[text()='My Inpatients']")
    public WebElement myInpatientsButton;

    @FindBy(xpath = "//tr/td")
    public List<WebElement> inpatientsBilgileriTablosu;

    @FindBy(xpath = "//input[@id='1404']")
    public WebElement sodiumbutton;

    @FindBy(xpath = "//input[@id='1402']")
    public WebElement ureaButton;

    @FindBy(xpath = "//input[@id='1408']")
    public WebElement hemoglobinButton;

    @FindBy(xpath = "//input[@id='1407']")
    public WebElement albuminButton;

    @FindBy(xpath = "//input[@id='1403']")
    public WebElement creatinineButton;

    @FindBy(xpath = "//input[@id='132795']")
    public WebElement potassiumButton;

    @FindBy(xpath = "//input[@id='132751']")
    public WebElement glucoseButton;

    @FindBy(xpath = "//tr//td[2]")
    public List<WebElement> testResultsListesi;
}
