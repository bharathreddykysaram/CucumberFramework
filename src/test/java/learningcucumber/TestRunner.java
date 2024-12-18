package learningcucumber;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features",
        glue="learningcucumber"
)

public class TestRunner extends AbstractTestNGCucumberTests {
}
