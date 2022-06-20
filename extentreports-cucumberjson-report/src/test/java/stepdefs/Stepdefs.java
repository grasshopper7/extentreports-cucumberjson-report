package stepdefs;

import static org.testng.Assert.assertEquals;

import java.util.List;
import java.util.Random;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.SkipException;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.PendingException;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

/*import cucumber.api.*;
import cucumber.api.java.*;
import cucumber.api.java.en.*;*/

import io.github.bonigarcia.wdm.WebDriverManager;

public class Stepdefs {

	private Scenario scenario;

	@Given("Hello background")
	public void background() throws InterruptedException {
		this.scenario.log("background");
		Thread.sleep(250);
	}

	@Before(value = "not @failure")
	public void before(Scenario scenario) {
		this.scenario = scenario;
		scenario.log("BEFORE HI");
		scenario.log("BEFORE HELLO");
	}

	@After(value = "not @failure")
	public void after(Scenario scenario) {

	}

	@Before(value = "@failure")
	public void beforeFailure(Scenario scenario) {
		// System.out.println("Before failure");
		this.scenario = scenario;
		scenario.log("FAILURE HI");
		scenario.log("FAILURE HELLO");
		throw new RuntimeException();
	}

	@After(value = "@failure")
	public void afterFailure() {
		// System.out.println("After failure");
		scenario.log("FAILURE HI");
		scenario.log("FAILURE HELLO");
		throw new RuntimeException();
	}

	@BeforeStep(value = "@failure")
	public void beforeStepFailure() {
		// System.out.println("Before Step failure");
	}

	@AfterStep(value = "@failure")
	public void afterStepFailure() {
		// System.out.println("After Step failure");
	}

	@Given("Hook failure step")
	public void hook_failure_step() throws InterruptedException {
		// System.out.println("Failure step");
		scenario.log("FAILURE STEP HI");
		scenario.log("FAILURE STEP HELLO");
		throw new RuntimeException();
		// Thread.sleep(500);
	}

	@Given("Skip hook failure step")
	public void skip_hook_failure_step() throws InterruptedException {
		Thread.sleep(250);
	}

	@Given("{string} background")
	public void background(String type) {
		//System.out.format("%s type background. \n", type);
	}

	@Given("Write a {string} step with precondition in {string}")
	@When("Complete action in {string} step in {string}")
	@Then("Validate the outcome in {string} step in {string}")
	public void step(String step, String scenario) throws InterruptedException {
		//System.out.format("%s step from %s.\n", step.toUpperCase(), scenario.toUpperCase());
		Thread.sleep(400);
	}

	@Then("Raise exception")
	public void raiseExcep() {

		Random r = new Random();
		boolean flag = r.nextBoolean();
		assertEquals(flag, true);
	}

	@Then("Do not raise exception")
	public void doNotRaiseExcep() {
		assertEquals(true, true);
	}

	@Given("Customer orders the dishes")
	public void dataTable(List<List<String>> table) {
		//System.out.println(table);
	}

	@Given("the doc string is")
	public void docStr(String docStr) {

		//System.out.println(docStr);
	}

	private WebDriver driver;
	private String site;

	@And("Go to {word}")
	public void visitweb(String site) throws Exception {
		driver.get(site);
		this.site = site;
		// scenario.log("scenario log");
		scenario.log("scenario website name - " + site);
		Thread.sleep(3000);
		// byte[] screenshot = Files.readAllBytes(new
		// File("src/test/resources/logo.png").toPath());
		// scenario.attach(screenshot, "image/png", this.site);
	}

	@BeforeStep(value = "@website or @large")
	public void beforeSite(Scenario scenario) {
		this.scenario = scenario;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		scenario.log("HELLO THERE!!!");
	}

	@AfterStep(value = "@website or @large")
	public void afterSite(Scenario scenario) {
		TakesScreenshot ts = (TakesScreenshot) driver;
		byte[] screenshot = ts.getScreenshotAs(OutputType.BYTES);
		// scenario.embed(screenshot, "image/png", this.site);
		// scenario.embed(screenshot, "image/png");
		scenario.attach(screenshot, "image/png", this.site);
		// scenario.log("HELLO THERE!!!");
		driver.quit();
	}

	@Given("Pending step definition")
	public void pendingStep() throws PendingException {
		throw new PendingException();
	}

	@Given("Skipped step definition")
	public void skippedStep() {
		throw new SkipException("Skip it");
	}

	@Given("Only text log")
	public void only_text_log() {
		scenario.log(
				"Text log is just text. Text log is just text. Text log is just text. Text log is just text. Text log is just text. Text log is just text.");
	}

	@Given("Only table log")
	public void only_table_log() {
		scenario.log("<table><tr><th>1</th><th>2</th></tr><tr><td>A</td><td>B</td></tr>"
				+ "<tr><td>C</td><td>D</td></tr></table>");
	}

	@Given("Both logs")
	public void both_logs() {
		scenario.log(
				"Text log is just text. Text log is just text. Text log is just text. Text log is just text. Text log is just text. Text log is just text. Text log is just text. Text log is just text. Text log is just text. Text log is just text. Text log is just text. Text log is just text. Text log is just text. Text log is just text. Text log is just text. Text log is just text. Text log is just text. Text log is just text.");

		scenario.log("<table><tr><th>heading 1</th><th>Heading 2</th></tr><tr><td>hi</td><td>Hello</td></tr>"
				+ "<tr><td>hi 2</td><td>Hello Two</td></tr>"
				+ "<tr><td>Real big cell details. Real big cell details. Real big cell details. Real big cell details. Real big cell details. Real big cell details. Real big cell details. Real big cell details. Real big cell details. Real big cell details. Real big cell details. Real big cell details. Real big cell details.</td><td>Hello Two</td></tr>"
				+ "</table>");
	}

	@Given("Mega table log")
	public void mega_table_log() {
		scenario.log(
				"<html><body><input></input><table><tr><th>heading 1</th><th>Heading 2</th><th>heading 3</th><th>Heading 4</th></tr><tr><td>hi</td><td>Hello</td><td>hi</td><td>Hello</td></tr>"
						+ "<tr><td>hi 2</td><td>Hello Two</td><td>hi 3</td><td>Hello Four</td></tr>"
						+ "<tr><td>Real big cell details. Real big cell details. Real big cell details. Real big cell details. Real big cell details. Real big cell details. Real big cell details. Real big cell details. Real big cell details. Real big cell details. Real big cell details. Real big cell details. Real big cell details.</td><td>Hello Two</td><td>Hello Three</td><td>Hello Four Hello 4 Hello 4</td></tr>"
						+ "<tr><td>Real big cell details. Real big cell details. Real big cell details. Real big cell details. Real big cell details. Real big cell details. Real big cell details. Real big cell details. Real big cell details. Real big cell details.</td><td>Hello Two</td><td>Hello Three</td><td>Hello Four Hello 4 Hello 4  BIG BIG BIG  BIG BIG BIG LARGE ONE HERE</td></tr>"
						+ "</table>");
	}

	@Given("Wrong span table log")
	public void wrong_span_table_log() {
		scenario.log(
				"<table><tr><th rowspan=1>heading 1</th><th colspan=1>Heading 2</th></tr><tr><td rowspan=2>hi</td><td colspan=3>Hello</td></tr>"
						+ "<tr><td>111</td><td>222</td></tr></table>");
	}
}