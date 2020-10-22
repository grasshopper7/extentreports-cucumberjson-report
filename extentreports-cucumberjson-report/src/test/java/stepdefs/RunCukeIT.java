package stepdefs;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin = { "json:target/cucumber-json.json", "summary" }/* , tags = "@skipscenario" */)
public class RunCukeIT extends AbstractTestNGCucumberTests {

}
