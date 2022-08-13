package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.ArrayList;
import java.util.List;

public class US08_Pages {

    public US08_Pages() {
        PageFactory.initElements(Driver.getDriver(), this);
    }



    @FindBy(xpath = "//li[@id='account-menu']")
    public WebElement accountButton;

    @FindBy(xpath = "(//a[@class='dropdown-item'])[5]")
    public WebElement passwordButton;


    @FindBy(xpath = "//input[@name='currentPassword']")
    public WebElement currentPaswordBox;


    @FindBy(xpath = "//input[@name='newPassword']")
    public WebElement newPaswordBox;


    @FindBy(xpath = "//input[@name='confirmPassword']")
    public WebElement confirmNewPaswordBox;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement saveButton;


    @FindBy(xpath = "//div[@class='Toastify']")
    public WebElement passwordChanged;

    @FindBy(xpath = "(//li[@class='point'])[1]")
    public WebElement passwordStrengthBar1;

    @FindBy(xpath = "(//li[@class='point'])[1]")
    public WebElement passwordStrengthBar2;

    @FindBy(xpath = "(//li[@class='point'])[1]")
    public WebElement passwordStrengthBar3;

    @FindBy(xpath = "(//li[@class='point'])[1]")
    public WebElement passwordStrengthBar4;

    @FindBy(xpath = "(//li[@class='point'])[1]")
    public WebElement passwordStrengthBar5;






}