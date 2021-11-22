package nl.saleschamp.Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(

        features = "src/test/resources/Features",
        glue = "nl/saleschamp/step_definitions",
        dryRun = false,

        tags = ""
)


public class CBrunner {
}
