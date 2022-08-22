package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US17_Page {
    public US17_Page(){
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




}
