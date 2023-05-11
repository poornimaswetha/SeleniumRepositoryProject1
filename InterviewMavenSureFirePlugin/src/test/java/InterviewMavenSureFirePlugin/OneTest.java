package InterviewMavenSureFirePlugin;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


import io.github.bonigarcia.wdm.WebDriverManager;

public class OneTest {
	WebDriver driver;
@Test
	public void Checkomayotext() {
		//SoftAssert softassertobj=new SoftAssert();		
		WebDriverManager.chromedriver().setup();
		
		//Chrome Options
		ChromeOptions options = new ChromeOptions();// To open the web page 
		options.addArguments("--remote-allow-origins=*");//To allow origins
		options.addArguments("--disable-notifications");// To disable notifications
		
		//DesiredCapabilities		
		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setCapability(ChromeOptions.CAPABILITY, options);
		options.merge(dc);
		
		driver=new ChromeDriver(options);
		driver.get("http://omayo.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));		
		System.out.println("OneTest got executed");
		String actualtext=driver.findElement(By.id("pah")).getText();
		Assert.assertEquals(actualtext, "PracticeAutomationHere");
		//softassertobj.assertEquals(actualtext, "PracticeAutomationHere");		
		//softassertobj.assertAll();
	}


@AfterMethod
public void closure() throws InterruptedException {	
	Thread.sleep(3000);
	driver.quit();
}

}
