package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class US15_Page {
    public US15_Page() {PageFactory.initElements(Driver.getDriver(), this);}
    @FindBy(xpath = "//div[@role='alert']")
    public List<WebElement> alertList;

    @FindBy(xpath="//input[@name='firstName']")
    public static WebElement usersIdFirstNameBox;

    @FindBy(xpath="//input[@name='lastName']")
    public static WebElement usersIdLastNameBox;
    @FindBy(xpath="//input[@name='email']")
    public static WebElement usersMailBox;
    @FindBy(xpath="//input[@name='phone']")
    public static WebElement usersphoneBox;

    @FindBy(xpath = "//input[@value='109504']")
    public WebElement id;
    @FindBy(xpath = "(//input[@value='0000001Team83'])[1]")
    public static WebElement firstName;
    @FindBy(xpath = "(//input[@value='0000001Team83'])[2]")
    public static WebElement lastName;
    @FindBy(xpath = "//input[@value='2022-07-05T00:00']")
    public WebElement birthDate;
    @FindBy(xpath = "//input[@value='0000001Team83@gmail.com']")
    public static WebElement email;
    @FindBy(xpath = "//input[@value='223-223-2222']")
    public static WebElement phone;
    @FindBy(id = "patient-gender")
    public WebElement gender;
    @FindBy(id = "patient-bloodGroup")
    public WebElement bloodGroup;
    @FindBy(xpath = "//input[@value='123mainst']")
    public WebElement address;
    @FindBy(xpath = "//*[text()='111']")
    public WebElement description;
    @FindBy(xpath = "//select[@id='patient-user']")
    public WebElement user;
    @FindBy(id = "patient-country")
    public WebElement country;
    @FindBy(id = "patient-cstate")
    public WebElement state;
    @FindBy(xpath = "//button[@id='save-entity']")
    public static WebElement saveButton;

    @FindBy(xpath = "//input[@name='username']")
    public WebElement usernameBox;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement passwordBox;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement signInButton;

    @FindBy(id="login-item")
    public WebElement signIn;

    @FindBy(xpath = "//span[text()='Sign in']")
    public WebElement signinElementi;

    @FindBy(xpath = "//*[@data-icon='user']")
    public WebElement userIcon;

    @FindBy(xpath = "//*[@id='entity-menu']")
    public WebElement itemsAndTitlesButton;

    @FindBy(xpath = "//span[.='Patient']")
    public WebElement patient;

}
