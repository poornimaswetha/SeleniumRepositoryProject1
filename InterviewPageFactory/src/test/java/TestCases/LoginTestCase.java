package TestCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import DataProvider.CustomDataProvider;
import ObjectRepository.AccountPage;
import ObjectRepository.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTestCase {
	WebDriver driver;
	@Test(dataProvider="LoginDP",dataProviderClass=CustomDataProvider.class)	
	public void Login(String urlnm,String uname,String pwd) throws InterruptedException  {

		WebDriverManager.chromedriver().setup();
		//ChromeOptions
		ChromeOptions Options=new ChromeOptions();
		Options.addArguments("--remote-allow-orgins-=*");
		
		driver = new ChromeDriver(Options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get(urlnm);
		
		//Create an object for Login page to use it here
		//Pass the driver of this 'LoginTestCase' class as arguement to the constructor 'LoginPage'
		// constructor 'LoginPage' Pass this driver argument
		LoginPage Login=new LoginPage(driver);
		Login.emailfield().sendKeys(uname);
		Login.passwordfield().sendKeys(pwd);
		Login.loginbutton().click();
		Thread.sleep(3000);
		
		//Create an object for Account page to use it here
		AccountPage myAccount=new AccountPage(driver);	
		Assert.assertTrue(myAccount.accountbreadcrumb().isDisplayed());
	}
	
	@AfterMethod
	public void teardown() {		
		driver.close();
	}
}