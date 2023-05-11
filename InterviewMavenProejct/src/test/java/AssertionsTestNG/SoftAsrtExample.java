package AssertionsTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SoftAsrtExample {
@Test
	public void softAssertion() throws InterruptedException{
		//WebDriverManager for ChromeDriver
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		SoftAssert softassertobj=new SoftAssert();
				
		//Title Assertion
		String actualtitle=driver.getTitle();
		String expectedtitle="Facebook - log in or sign up";
		softassertobj.assertEquals(actualtitle, expectedtitle,"Title is mismatched");
		
		//URL Assertion
		String actualURL=driver.getCurrentUrl();
		String expectedURL="https://www.facebook.com/";
		softassertobj.assertEquals(actualURL, expectedURL,"URL is mismatched");
		
		//Text Email Assertion
		String actualtext=driver.findElement(By.name("email")).getAttribute("value");
		String expectedtext="";
		softassertobj.assertEquals(actualtext, expectedtext,"Text is mismatched");
		
		//Border Assertion
		String actualborder=driver.findElement(By.name("email")).getCssValue("border");
		String expectedborder="0.8px solid rgb(27, 116, 228)";
		softassertobj.assertEquals(actualborder, expectedborder,"Border is mismatched");
		
		//Error message Assertion
		driver.findElement(By.name("email")).sendKeys("HYR Tutorials",Keys.ENTER);
		Thread.sleep(3000);
		String actualError=driver.findElement(By.xpath("//div[@class='clearfix _5466 _44mg']//div[2]")).getText();
		String expectedError="The password you’ve entered is incorrect. Forgot Password?";
		softassertobj.assertEquals(actualError, expectedError,"Error is mismatched");
		
		driver.quit();
		softassertobj.assertAll();
		
		

	}

}
