package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class US18 {

    public US18(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//div//li[7]")
    public WebElement itemTitlesDropdown;

    @FindBy (xpath = "//*[text()='Create a new Physician']")
    public WebElement createANewPhysicianButton;

    @FindBy (xpath = "//input[@id='searchSSN']")
    public WebElement ssnBox;

    @FindBy(xpath = "//*[text()='Search User']")
    public WebElement searchUserButton;

    @FindBy(xpath = "//input[@id='useSSNSearch']")
    public WebElement useSearch;

    @FindBy (xpath = "//div[@class='Toastify__toast-body']")
    public WebElement alertSSNDelete;

    @FindBy (xpath = "(//a[@class='dropdown-item'])[3]")
    public WebElement physicianSecenegi;

    @FindBy(xpath = "//td")
    public List<WebElement> physiciansTable;

    @FindBy(xpath = "//select[@id='physician-user']")
    public WebElement physicianUserDdm;

    @FindBy(xpath = "//select[@id='physician-country']")
    public WebElement physicianCountryDdm;

    @FindBy(xpath = "//select[@id='physician-cstate']")
    public WebElement physicianStateCityDdm;

    @FindBy(xpath = "//input[@id='file_image']")
    public WebElement imageButton;

    @FindBy (xpath = "//*[text()='Save']")
    public WebElement createPhysicianSaveButton;

    @FindBy(xpath = "//*[text()='23']")
    public WebElement physicianSayfa23;

    @FindBy (xpath = "(//*[text()='Delete'])[2]")
    public WebElement deleteButton;

    @FindBy(xpath = "//button[@class='btn btn-danger']")
    public WebElement deleteAlert;

    @FindBy(xpath = "//*[text()='Administration']")
    public WebElement administrationButton;

    @FindBy(xpath = "//*[text()='User management']")
    public WebElement userManagement;

    @FindBy(xpath = "(//a[@class='btn btn-primary btn-sm'])[1]")
    public WebElement physicianEditButton;

    @FindBy(xpath = "//*[text()='Save']")
    public WebElement saveButton;

    @FindBy(xpath = "//tbody//tr[1]//td")
    public List<WebElement> editPhysicianList;

    @FindBy(xpath = "//input[@id='physician-firstName']")
    public WebElement physicianFirstnameButton;

    @FindBy(xpath = "//input[@id='physician-lastName']")
    public WebElement physicianLastnameButton;

    @FindBy(xpath = "//input[@id='physician1-birthDate']")
    public WebElement physicianBirthDateButton;

    @FindBy(xpath = "//input[@id='physician-phone']")
    public WebElement physicianPhoneButton;

    @FindBy(xpath = "//input[@id='physician-adress']")
    public WebElement physicianAdressButton;

    @FindBy(xpath = "//select[@id='physician-gender']")
    public WebElement genderDdm;

    @FindBy(xpath = "//select[@id='physician-speciality']")
    public WebElement specialityDdm;

    @FindBy(xpath = "//select[@id='physician-bloodGroup']")
    public WebElement physicianBloodGroupButton;

    @FindBy(xpath = "//input[@id='physician-description']")
    public WebElement physicianDescriptionButton;

    @FindBy(xpath = "//input[@id='physician-examFee']")
    public WebElement examFreeButton;


}
