package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US17_Page {
    public US17_Page() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//input[@name='username']")
    public WebElement signInUsername;

    @FindBy(xpath = "//span[text()='Items&Titles']")
    public WebElement itemsTitles;

    @FindBy(xpath = "//span[text()='Test Item']")
    public WebElement testItem;

    @FindBy(xpath = "//span[text()='Create a new Test Item']")
    public WebElement createTestItem;

    @FindBy(xpath = "//input[@name='name']")
    public WebElement createEditItemName;

    @FindBy(xpath = "//div[@class='Toastify__toast-body']")
    public WebElement popUpMessage;

    @FindBy(xpath = "//span[.='Created Date']")
    public WebElement createdDate;

    @FindBy(xpath = "(//span[.='Delete'])[1]")
    public WebElement deleteLastTestItem;

    @FindBy(xpath = "//button[@id='jhi-confirm-delete-cTestItem']")
    public WebElement confirmDelete;

    @FindBy(xpath = "(//span[.='Edit'])[1]")
    public WebElement editLastTestItem;

    @FindBy(xpath = "//input[@name='id']")
    public WebElement editTestItemId;

    @FindBy(xpath = "(//span[.='View'])[1]")
    public WebElement viewLastTestItem;

    @FindBy(xpath = "//h2")
    public WebElement viewTestItemTitle;
}