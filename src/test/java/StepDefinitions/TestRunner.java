package StepDefinitions;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features",
				 glue={"StepDefinitions"},
				 monochrome=true,
				 plugin= {"pretty","junit:target/JUnitReports/report.xml",
						 "json:target/JSONReports/report.json",
						 "html:target/HtmlReports"})
public class TestRunner {

}
