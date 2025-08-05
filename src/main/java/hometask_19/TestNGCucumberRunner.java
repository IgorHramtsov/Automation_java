package hometask_19;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/main/resources/features",
        glue = "hometask_19",
        plugin = {"pretty", "html:target/cucumber-report.html"},
        monochrome = true
)
public class TestNGCucumberRunner extends AbstractTestNGCucumberTests {
}

