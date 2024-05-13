package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "features", // Path to your feature files
        glue = {"stepDefinitions", "hooks"},// Package where your step definitions are located
        dryRun = false,
        tags = "@Smoke",
        plugin = {"pretty", "html:target/cucumber-reports"} // Optional: generates HTML reports
)

public class NHSJobSearchRunner {


}