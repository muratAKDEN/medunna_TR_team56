package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US16_Page {
    public US16_Page() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = " (//a[@class='dropdown-item'])[6]")
    public WebElement room;

    @FindBy(id = "jh-create-entity")
    public WebElement createAnewRoom;


    @FindBy(xpath = "//*[text()='Create or edit a Room']")
    public WebElement createOrEditnewRoom;

    @FindBy(xpath = "//input[@name='roomNumber']")
    public WebElement roomNumber;

    @FindBy (xpath = "//div[@class='invalid-feedback']")
    public WebElement RoomNumberBosHataMesji;

    @FindBy(xpath = "//select[@name='roomType']")
    public WebElement roomType;

    @FindBy(id = "room-status")
    public WebElement status;

    @FindBy (xpath = "//input[@name='price']")
    public WebElement PriceBox;

    @FindBy (xpath = "(//div[@class='invalid-feedback'])[2]")
    public WebElement PriceBoxBosHataMesaji;

    @FindBy (xpath = "//input[@name='description']")
    public WebElement DescriptionBox;

    @FindBy (xpath = "//input[@name='createdDate']")
    public WebElement CreatedDateBox;

    @FindBy (xpath = " //*[text()='Save']")
    public WebElement SaveBox;

    @FindBy(xpath = "//input[@value='true']")
    public WebElement statusTrue;

    @FindBy(xpath = "//input[@value='false']")
    public WebElement statusFalse;

    @FindBy (xpath = "//div[@class='Toastify__toast-container Toastify__toast-container--top-left toastify-container']")
    public WebElement KayitMesji;

    @FindBy (xpath = "//*[text()='Administration']")
    public WebElement AdministrationButton;

    @FindBy (xpath = "//*[text()='User management']")
    public WebElement UserManagementButton;

    @FindBy (xpath = "//*[text()='ID']")
    public WebElement IdButton;

    @FindBy (xpath = "//*[text()='Room Type']")
    public WebElement RoomTypeButton;

    @FindBy (xpath = "(//*[text()='View'])[1]")
    public WebElement ViewButton;

    @FindBy (xpath = "(//*[text()='Edit'])[1]")
    public WebElement EditButton;

    @FindBy (xpath = "(//*[text()='Delete'])[1]")
    public WebElement DeleteButton;

    @FindBy (xpath = "(//*[text()='Delete'])[21]")
    public WebElement IcDeleteButton;


}
