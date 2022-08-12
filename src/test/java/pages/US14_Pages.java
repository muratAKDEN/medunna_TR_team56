package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US14_Pages {

    public US14_Pages (){
        PageFactory.initElements(Driver.getDriver(),this);


    }
    @FindBy(xpath = "//*[@class='d-flex align-items-center dropdown-toggle nav-link']")
    public WebElement girisButon;

    @FindBy(xpath = "(//*[@class='dropdown-item'])[1]")
    public WebElement singInButon;

    @FindBy(xpath = "//input[@name='username']")
    public WebElement kullaniciAdi;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement password;

    @FindBy(xpath = "//button[@class='btn btn-primary']")
    public WebElement singInGiris;

    @FindBy(xpath = "//*[text()='MY PAGES']")
    public WebElement myPagesButon;

    @FindBy(xpath = "(//*[@class='dropdown-item'])[3]")
    public WebElement myInpatientsButon;

    @FindBy(xpath = "//th[1]")
    public WebElement id;

    @FindBy(xpath = "//th[2]")
    public WebElement startDate;

    @FindBy(xpath = "//th[3]")
    public WebElement endDate;

    @FindBy(xpath = "//th[4]")
    public WebElement status;

    @FindBy(xpath = "//th[5]")
    public WebElement description;

    @FindBy(xpath = "//th[6]")
    public WebElement createdDate;

    @FindBy(xpath = "//th[7]")
    public WebElement room;

    @FindBy(xpath = "//th[8]")
    public WebElement appointment;

    @FindBy(xpath = "//th[9]")
    public WebElement patient;

    @FindBy (xpath = "(//*[@class='btn btn-primary btn-sm'])[2]")
    public WebElement edit;

    @FindBy (xpath = "//*[@id='in-patient-status']")
    public WebElement statusDd;

    @FindBy(xpath = "//button[@id='save-entity']")
    public WebElement save;

    @FindBy(xpath = "//select[@id='in-patient-room']")
    public WebElement roomDd;

    @FindBy(xpath = "//*[@class='Toastify__toast-body']")
    public WebElement uyariYazi;


}
