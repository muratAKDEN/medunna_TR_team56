package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class OrtakPages {

    public  OrtakPages (){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//li[@id='account-menu']")
    public WebElement anasayfaInsanIkonu;

    @FindBy(xpath = "//a[@id='login-item']")
    public WebElement anasayfaInsanIkonuSignInElementi;

    @FindBy(xpath = "//input[@name='username']")
    public WebElement loginUsernameTextBox;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement loginPasswordTextBox;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement loginSignInButonu;




}
