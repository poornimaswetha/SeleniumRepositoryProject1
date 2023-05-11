package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(plugin= {"pretty","html:target/Cucumber_html_Report.html"},
	 	monochrome = true,	//remove any unreadable character	
		features={"src/test/java/features"},
		glue= {"stepdefinitions"}	
		//tags="@Login and not @Search"
		)
public class Runner {
	

}
