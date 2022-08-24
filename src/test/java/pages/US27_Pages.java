package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US27_Pages {

    public US27_Pages(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//input[@name='username']")
    public WebElement kullaniciAdi;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement password;

    @FindBy(xpath = "(//*[@class='d-flex align-items-center dropdown-toggle nav-link'])[1]")
    public WebElement itemsTitles;

    @FindBy(xpath = "(//*[@class='dropdown-item'])[9]")
    public WebElement messages;

    @FindBy(xpath = "(//td)[5]")
    public WebElement mesaj;

    @FindBy(xpath = "(//td)[2]")
    public WebElement yazar;

    @FindBy(xpath = "(//td)[3]")
    public WebElement eposta;

    @FindBy(xpath = "//*[@id='jh-create-entity']")
    public WebElement createNewMessage;

    @FindBy(xpath = "//*[@name='name']")
    public WebElement Name;

    @FindBy(xpath = "//input[@id='c-message-email']")
    public WebElement eMail;

    @FindBy(xpath = "//input[@id='c-message-subject']")
    public WebElement suject;

    @FindBy(xpath = "//input[@id='c-message-message']")
    public WebElement message;

    @FindBy(xpath = "//button[@id='save-entity']")
    public WebElement Save;

    @FindBy(xpath = "//*[@class='Toastify__toast-body']")
    public WebElement mesajOlusturulduYazi;

    @FindBy(xpath = "(//*[@class='btn btn-primary btn-sm'])[1]")
    public WebElement editUpdate;

    @FindBy(xpath = "//input[@id='c-message-message']")
    public WebElement mesajUpdate;

    @FindBy(xpath = "//button[@class='btn btn-primary']")
    public WebElement saveUpdate;

    @FindBy(xpath ="//*[@class='Toastify__toast-body']")
    public WebElement mesajGuncellendiYazi;

    @FindBy(xpath = "(//*[@class='btn btn-danger btn-sm'])[1]")
    public WebElement delete;

    @FindBy(xpath = "//button[@id='jhi-confirm-delete-cMessage']")
    public WebElement deleteOnay;

    @FindBy(xpath = "//*[@class='Toastify__toast-container Toastify__toast-container--top-left toastify-container']")
    public WebElement silindiYazisi;


}
