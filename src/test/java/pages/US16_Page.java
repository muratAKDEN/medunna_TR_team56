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

    @FindBy(xpath = "//select[@name='roomType']")
    public WebElement roomType;

    @FindBy(id = "room-status")
    public WebElement status;


}
