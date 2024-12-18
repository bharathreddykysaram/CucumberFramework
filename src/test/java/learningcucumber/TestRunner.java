package learningcucumber;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

@CucumberOptions(
        features = "src/test/resources/features",
        glue="learningcucumber",
        //tags="@login and @valid_cred",
         tags="@login and @invalid_cred_outline",
       plugin = {
                "pretty",//here it will print methods and scenarios in console
                "html:target/cucumber-reports.html",
                 "json:target/cucumber.json"
       },
        monochrome = true,//this used for graphic desings in console
        publish = true//this will publish reports at cucumber cloud  so that we can view at url
       // tags="@login and @invalid_cred_outline"

)

public class TestRunner extends AbstractTestNGCucumberTests {
       //below used to run scenarios in parallel and all browsers will open
       @Override
       @DataProvider(parallel = true)
       public Object[][] scenarios(){
              return super.scenarios();
       }
}
