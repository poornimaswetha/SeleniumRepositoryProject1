package POMPackage;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTestCase {

	WebDriver driver;
	@Test
	public void Login() throws Exception {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://tutorialsninja.com/demo/index.php?route=account/login");
		Thread.sleep(2000);
		
		LoginPage loginpg=new LoginPage(driver);
		loginpg.emailfield().sendKeys("divyapradeep@gmail.com");
		loginpg.password().sendKeys("123456");
		loginpg.loginbtn().click();
		
		AccountPage Accountpg=new AccountPage(driver);
		Assert.assertTrue(Accountpg.AccountBreadCrumb().isDisplayed());
		}
	
	@AfterMethod
	public void closure() {
		driver.close();
	}
	


}
