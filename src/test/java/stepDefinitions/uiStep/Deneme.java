package stepDefinitions.uiStep;

import io.cucumber.java.en.Given;
import utilities.ConfigReader;
import utilities.Driver;

public class Deneme {



    @Given("kullanıcı anasayfaya gider")
    public void kullanıcı_anasayfaya_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("medunnaUrl"));
    }



}
