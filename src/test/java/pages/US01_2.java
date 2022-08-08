package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US01_2 {

    public US01_2(){
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
    public WebElement firstNameHataMesaji;

    @FindBy(xpath="//*[text()='Your LastName is required.']")
    public WebElement lastNameHataMesasji;





}
