package DifferentBrowsers;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
// Get all the html hyperlinks in a webpage 

public class FirefoxBrowserCode{

	public static void main(String[] args) throws InterruptedException {
			
		System.setProperty("webdriver.gecko.driver","D:\\SeliniumWorkspace\\InterviewSelenium\\Driver\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		//To call the Parent class chrome driver methods use object "driver"
		driver.get("https://omayo.blogspot.com/");		
		//Maximize the window
		driver.manage().window().maximize();		
		//wait for 3 sec
		Thread.sleep(3000);		
		//TagName is used to get multiple webelements
	    List<WebElement> Listelem=driver.findElements(By.tagName("a"));	    	    	
	    //for each loop 
	    // Wrapper class is WebElement	
	    for(WebElement j :Listelem ) {
	    	if(j.getText().length()>0) {
	    	System.out.println(j.getText());
	    	}
	    } 	
		driver.quit();	
	}
}
