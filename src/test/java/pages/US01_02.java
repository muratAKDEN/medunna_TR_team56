package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class US01_02 {

    public US01_02(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//a[@aria-haspopup='true']")
    public WebElement manIcon;

    @FindBy(xpath = "//span[text()='Register']")
    public WebElement Register;

    @FindBy(xpath = "//input[@name='ssn']")
    public WebElement SSNBox;

    @FindBy(xpath = "//input[@name='firstName']")
    public WebElement firstNameBox;

    @FindBy(xpath = "//input[@name='lastName']")
    public WebElement lastName;

    @FindBy(xpath="(//div[@class='invalid-feedback'])[1]")
    public WebElement SSNHataMesaji;

    @FindBy(xpath="//input[@id='firstName']")
    public WebElement firstName;

    @FindBy (xpath="(//div[@class='justify-content-center row'])[2]")
    public WebElement bosAlan;

    @FindBy(xpath="//input[@name='firstName']")
    public List<WebElement> firstNameHataMesaji;

    @FindBy(xpath="//*[text()='Your LastName is required.']")
    public WebElement lastNameHataMesasji;
    @FindBy(xpath="(//div[@class='invalid-feedback'])[1]")
    public List<WebElement> YourSSNisinvalidmesaji;
    @FindBy(xpath = "//input[@id=\"username\"]")
    public WebElement usernamebox;
    @FindBy(xpath = "//div[@class=\"invalid-feedback\"]")
    public WebElement yourUsernameIsRequiredMesaji;
    @FindBy(xpath = "//div[@class=\"invalid-feedback\"]")
    public WebElement yourUsernameIsInvalidMesaji;

    @FindBy(xpath = "//div[@class=\"invalid-feedback\"]")
    public WebElement thisFieldIsInvalidMesaji;

    @FindBy(xpath = "//div[@class=\"invalid-feedback\"][1]")
    public WebElement yourEmailIsRequiredMesaji;


    @FindBy(xpath = "//*[@id='email']")
    public WebElement emailTextBox;

    @FindBy(xpath = "//div[@class=\"invalid-feedback\"]")
    public WebElement yourUsernameIsInvalidMessage;

    @FindBy(xpath = "//div[@class=\"invalid-feedback\"]")
    public WebElement thisFieldIsInvalidMessage;

    @FindBy(xpath = "//div[@class=\"invalid-feedback\"]")
    public WebElement yourEmailIsRequiredMessage;

    @FindBy(xpath = "//input[@id='firstPassword']")
    public WebElement passwordbox;
//input[@name="firstPassword"]

    @FindBy(xpath = "//div[@class='invalid-feedback'][1]")
    public WebElement YourFirstNameIsrequiredMesaji;
//div[@class='invalid-feedback'][1]

}
