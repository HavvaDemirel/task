package automationExercise.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = "cydeo/step_definitions",
        features = "@target/anyName.txt"
)
public class FailedTestRunner {
}
