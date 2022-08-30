package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class US28 {


        public US28() {
            PageFactory.initElements(Driver.getDriver(),this);}

        @FindBy(xpath = "//input[@name='username']")
        public WebElement Username;

        @FindBy(xpath = "//input[@name='password']")
        public WebElement Password;

        @FindBy(xpath = "//button[@class='btn btn-primary']")
        public WebElement signInKutusu;

        @FindBy(xpath = "//*[text()='Items&Titles']")
        public WebElement Items;

        @FindBy(xpath = "//*[text()='Country']")
        public WebElement Country;

        @FindBy(xpath = "//a[@id='jh-create-entity']")
        public WebElement CreateCountry;

        @FindBy(xpath = "//input[@name='name']")
        public WebElement Name;

        @FindBy(xpath = "//button[@class='btn btn-primary']")
        public WebElement countrySave;

        @FindBy(xpath = "//a[.='222192']")
        public WebElement newcountry;

        @FindBy(xpath = "//div[@class='Toastify__toast Toastify__toast--success toastify-toast']")
        public WebElement createDogrulama;


        @FindBy(xpath = "//a[@class='btn btn-danger btn-sm']")
        public WebElement delete;

        @FindBy(xpath = "//div[@class='Toastify__toast Toastify__toast--success toastify-toast']")
        public WebElement deleteDogrulama;

        @FindBy(xpath ="//*[text()='State/City'][1]")
        public WebElement StateCity;

        @FindBy(xpath = "//*[text()='Create a new State/City']")
        public WebElement CreatStateCity;

        @FindBy(xpath = "//input[@name='name']")
        public WebElement StateName;

        @FindBy(xpath = "//select[@name='state.id']")
        public WebElement StateUlke;

        @FindBy(xpath = "//div[@role='alert']")
        public List<WebElement> alertList;


        @FindBy(xpath = "//tbody//tr[last()]/td[4]/div/a[3]")
        public WebElement sondelete;

        @FindBy(xpath = "//button[@id='jhi-confirm-delete-country']//span[contains(text(),'Delete')]")
        public WebElement deleteConfirm;


        @FindBy(xpath = "//div[@role='alert']")
        public WebElement olumsuzMesaj;

        @FindBy (xpath ="//div[@class='Toastify__toast-body']")
        public WebElement silindi;



    }

