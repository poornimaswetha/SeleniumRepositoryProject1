package DifferentBrowsers;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
// Get all the html hyperlinks in a webpage 
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.remote.CapabilityType;

public class AllBrowerCode{

	public static void main(String[] args) throws InterruptedException {
		
		String Browser="InternetExplorer";
		WebDriver driver=null;
		
		if(Browser.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "D:\\SeliniumWorkspace\\InterviewSelenium\\Driver\\chromedriver.exe");
			ChromeOptions options = new ChromeOptions();// To open the web page 
			options.addArguments("--remote-allow-origins=*");//To allow origins
			driver=new ChromeDriver(options);
			
		}else if(Browser.equalsIgnoreCase("Firefox")) {
			System.setProperty("webdriver.gecko.driver","D:\\SeliniumWorkspace\\InterviewSelenium\\Driver\\geckodriver.exe");
			driver=new FirefoxDriver();
			
		}else if(Browser.equalsIgnoreCase("Edge")) {
			System.setProperty("webdriver.edge.driver","D:\\SeliniumWorkspace\\InterviewSelenium\\Driver\\msedgedriver.exe");
			driver=new EdgeDriver();
			
		}else if(Browser.equalsIgnoreCase("InternetExplorer")) {
			System.setProperty("webdriver.ie.driver","D:\\SeliniumWorkspace\\InterviewSelenium\\Driver\\IEDriverServer.exe");
			InternetExplorerOptions options=new InternetExplorerOptions();
			options.setCapability(InternetExplorerDriver.IGNORE_ZOOM_SETTING, true);
			options.setCapability(CapabilityType.BROWSER_VERSION, "11");
			options.setCapability("IgnoreProtectedModeSettings", true);
			driver=new InternetExplorerDriver();
			
		}		
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

