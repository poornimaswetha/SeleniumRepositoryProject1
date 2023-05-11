package Reading.SampleTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.AfterMethod;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class TestNG1 {
	WebDriver driver ;
	@Parameters({"URL"})
	@Test
	public void testCase1(String url) {	  
       
	        System.out.println("Launching Google Chrome browser"); 
	        driver = new ChromeDriver();
	        driver.get(url);
	        String testTitle = "Free QA Automation Tools For Everyone";
	        String originalTitle = driver.getTitle();
	        Assert.assertEquals(originalTitle, testTitle);
	        Assert.assertTrue(driver.findElement(By.id("password")).isDisplayed());
  }

	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Starting Test On Chrome Browser");
	}
	
	@AfterMethod
	public void afterMethod() throws Exception {
		 driver.close();
		System.out.println("Finished Test On Chrome Browser");
		throw new Exception("dfdf");// manually exception
	}
}