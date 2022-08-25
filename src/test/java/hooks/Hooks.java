package hooks;
import io.restassured.builder.RequestSpecBuilder;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.Driver;
import io.restassured.specification.RequestSpecification;
public class Hooks {

    public static RequestSpecification spec;

    @Before
    public void setUp() {


        spec = new RequestSpecBuilder().setBaseUri("https://medunna.com").build();

    }


    @After
    public void tearDown(Scenario scenario) {

        final byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
        if (scenario.isFailed()) {
            scenario.attach(screenshot, "image/png", "screenshots");
        }
        Driver.closeDriver();
    }
}
