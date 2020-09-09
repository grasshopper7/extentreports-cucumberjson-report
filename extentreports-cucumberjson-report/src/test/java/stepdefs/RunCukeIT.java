package stepdefs;

/*import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;*/

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin = { /* "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:", */
		"json:target/cucumber-json.json", "summary" } /* , tags = "@both" */ )
public class RunCukeIT extends AbstractTestNGCucumberTests {

}
