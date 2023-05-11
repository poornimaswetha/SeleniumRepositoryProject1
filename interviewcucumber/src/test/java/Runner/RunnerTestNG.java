package Runner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin= {"pretty","html:target/Cucumber_html_Report.html"},
	 	monochrome = true,	//remove any unreadable character	
		features={"src/test/java/features"},
		glue= {"stepdefinitions"},	
		tags="@Login and not @Search"
		)
public class RunnerTestNG extends AbstractTestNGCucumberTests{

}
