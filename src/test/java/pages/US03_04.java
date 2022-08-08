package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US03_04 {
    public US03_04() {PageFactory.initElements(Driver.getDriver(),this);}

    @FindBy(xpath = "//a[@href='#']")
    public WebElement dropdownMenu;

    @FindBy(xpath = "//a[@class='dropdown-item'][2]")
    public WebElement registerButonu;

    @FindBy(xpath = "//input[@name='firstPassword']")
    public WebElement passwordKutusu;

    @FindBy(xpath = "//li[@class='point'][1]")
    public WebElement birinciseviye;

    @FindBy(xpath = "//li[@class='point'][2]")
    public WebElement ikinciseviye;

    @FindBy(xpath = "//li[@class='point'][3]")
    public WebElement ucuncuseviye;

    @FindBy(xpath = "//li[@class='point'][4]")
    public WebElement dorduncuseviye;

    @FindBy(xpath = "//li[@class='point'][5]")
    public WebElement besinciseviye;



    @FindBy(xpath = "//a[@class='dropdown-item'][1]")
    public WebElement signInButonu;

    @FindBy(xpath = "//input[@name='username']")
    public WebElement kullaniciAdiKutusu;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement sifreKutusu;


    @FindBy(xpath = "//input[@name='rememberMe']")
    public WebElement rememberMeKutusu;

    @FindBy(xpath = "//button[@class='btn btn-primary']")
    public WebElement signInKutusu;

    @FindBy(xpath = "//li[@id='account-menu']")
    public WebElement basariliGiris;

    @FindBy(xpath = "//*[text()='Did you forget your password?']")
    public WebElement sifreUnuttum;

    @FindBy(xpath =  "//*[text()='Register a new account']")
    public WebElement yeniKayitOl;

    @FindBy(xpath = "//*[text()='Cancel']")
    public WebElement cancelButonu;

}
