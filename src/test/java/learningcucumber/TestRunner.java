package learningcucumber;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features",
        glue="learningcucumber",
       // tags="@login and @valid_cred"
        tags="@login and @invalid_cred"

)

public class TestRunner extends AbstractTestNGCucumberTests {
}
