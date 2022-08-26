package runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin={"html:target/cucumber-html-reports/API_cucumber.html", // buradaki / \\ idi, degistirdim, emin degilim
                "json:target/json-reports/API_cucumber.json",
                "junit:target/xml-report/API_cucumber.xml"},
        features = "src/test/resources/features/apiFeatures",
        glue = "stepDefinitions",
        tags = "RoomPost",
        dryRun = false

)
public class ApiTestRunner {
}
