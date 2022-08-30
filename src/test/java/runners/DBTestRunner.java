package runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin={"html:target/cucumber-html-reports/DB_cucumber.html", // buradaki / \\ idi, degistirdim, emin degilim
                "json:target/json-reports/DB_cucumber.json",
                "junit:target/xml-report/DB_cucumber.xml"},

        features="src/test/resources/features/dbFeatures",


        glue="stepDefinitions",


        tags = "@messageDb",
        dryRun = false
)








public class DBTestRunner {

}
