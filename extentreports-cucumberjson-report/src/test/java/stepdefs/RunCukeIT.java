package stepdefs;

/*import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;*/

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin = { "json:target/cucumber-json1.json" , "summary" } /* , tags = "@Both" */ )
public class RunCukeIT extends AbstractTestNGCucumberTests {

}
