package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(plugin= {"html:target/cucumber_html_report.html","pretty"},
		features= {"src/test/java/features"},
		glue= {"stepdefinitions"},
		tags="@ninjareg"
		)
public class TestRunner {

	

}
