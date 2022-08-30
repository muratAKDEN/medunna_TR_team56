package runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin={"html:target/cucumber-html-reports/UI_cucumber.html", // buradaki / \\ idi, degistirdim, emin degilim
                "json:target/json-reports/UI_cucumber.json",
                "junit:target/xml-report/UI_cucumber.xml"},
        features="src/test/resources/features/uiFeatures",
        glue= "stepDefinitions",
<<<<<<< HEAD
        tags = "@smoke",
=======

        tags = " @sdf",
>>>>>>> 2573cbc6cf32e1ee14decca4e7a6eebfe693935e
        dryRun = false




)



public class UITestRunner {




}
