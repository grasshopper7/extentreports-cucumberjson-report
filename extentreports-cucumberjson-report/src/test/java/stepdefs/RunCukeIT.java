package stepdefs;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin = { "json:target/cucumber-json.json", "summary" }/* , tags = "@website" */)
public class RunCukeIT extends AbstractTestNGCucumberTests {

	/*
	 * @DataProvider(parallel = true) public Object[][] scenarios() { return
	 * super.scenarios(); }
	 */
}
