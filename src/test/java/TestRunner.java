import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/features", // Path to your feature files
        glue = {"Stepdefination"},              // Package with step defs
        plugin = {"pretty",
                "html:target/cucumber-reports/html-report.html",   // HTML report
                "json:target/cucumber-reports/report.json",        // JSON report
                "junit:target/cucumber-reports/report.xml"         // JUnit XML
        },
        monochrome = true,                       // Cleaner console output
        tags = "@Regression"                      // Run specific tagged scenarios
)
public class TestRunner {
}
