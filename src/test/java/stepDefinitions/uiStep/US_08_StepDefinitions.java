package stepDefinitions.uiStep;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import pages.US_08_Pages;
import utilities.ConfigReader;
import utilities.Driver;

public class US_08_StepDefinitions {
    US_08_Pages us08=new US_08_Pages();

    Actions actions = new Actions(Driver.getDriver());



    @Given("kullanici {string} anasyfasindaa")
    public void kullanici_anasyfasinda(String medunna) {
        Driver.getDriver().get(ConfigReader.getProperty("medunnaUrl"));

    }








    @Then("Acilan drop down menude Password sekmesine tiklar")
    public void acilan_drop_down_menude_password_sekmesine_tiklar() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}
