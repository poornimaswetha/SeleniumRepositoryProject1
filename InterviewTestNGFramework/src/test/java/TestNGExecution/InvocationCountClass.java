package TestNGExecution;

import org.junit.AfterClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
//invocationTimeOut,threadPoolSize both works with invocationcount only
// InvocationCount is used to run the same test method multiple times as per invocation count
public class InvocationCountClass {
	
	//@Test(invocationCount=4,invocationCount=50000)
	@Test(invocationCount=4,threadPoolSize=2)
	//if the timeout for execution is more than 50 seconds then test will fail
	//threadpoolsize will open the 2 browsers execution at a time and then next 2 browsers 
	public void Login() throws InterruptedException {
		// WebDriverManager for ChromeDriver
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://randomuser.me/");
		// Maximize the window
		driver.manage().window().maximize();
		// wait for 3 sec
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//li[@data-label='name']")).click();
		System.out.println("User Name :"+driver.findElement(By.xpath("//li[@data-label='name']")).getAttribute("data-value"));
		
		driver.findElement(By.xpath("//li[@data-label='email']")).click();
		System.out.println("Email Address :"+driver.findElement(By.xpath("//li[@data-label='email']")).getAttribute("data-value"));
		
		driver.quit();	
	}
	
	
}
