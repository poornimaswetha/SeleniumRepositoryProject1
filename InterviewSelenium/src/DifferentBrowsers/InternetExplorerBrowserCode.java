package DifferentBrowsers;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
// Get all the html hyperlinks in a webpage 
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.remote.CapabilityType;

public class InternetExplorerBrowserCode{

	public static void main(String[] args) throws InterruptedException {
			
		System.setProperty("webdriver.ie.driver","D:\\SeliniumWorkspace\\InterviewSelenium\\Driver\\IEDriverServer.exe");
		//InternetExplorerOptions options=new InternetExplorerOptions();
		//options.setCapability(InternetExplorerDriver.IGNORE_ZOOM_SETTING, true);
		//options.setCapability(CapabilityType.BROWSER_VERSION, "11");
		//options.setCapability("IgnoreProtectedModeSettings", true);
		WebDriver driver=new InternetExplorerDriver();
		
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
