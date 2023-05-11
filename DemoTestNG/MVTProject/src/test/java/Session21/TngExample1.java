package Session21;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class TngExample1 {

	@Test
	public void  sample() throws Exception{
		// TODO Auto-generated method stub		
		
					// TODO Auto-generated method stub
				WebDriverManager.chromedriver().setup();
				WebDriver driver = new ChromeDriver();
				driver.get("http://www.tutorialsninja.com/demo/");
				driver.manage().window().maximize();
				Thread.sleep(2000);
				
				driver.findElement(By.xpath("//a[@title='My Account']")).click();
				driver.findElement(By.linkText("Login")).click();
				
				driver.findElement(By.id("input-email")).sendKeys("divyapradeep@gmail.com");
				driver.findElement(By.id("input-password")).sendKeys("123456");
				driver.findElement(By.xpath("//input[@value='Login']")).click();
				Assert.assertTrue(driver.findElement(By.xpath("//ul[@class='breadcrumb']//a[text()='Account']")).isDisplayed());
				driver.findElement(By.name("search")).sendKeys("iphone");
				driver.findElement(By.cssSelector(".fa.fa-search")).click();
				Assert.assertTrue(driver.findElement(By.xpath("//div[@class='product-thumb']//a[text()='iPhone']")).isDisplayed());
				driver.findElement(By.xpath("//div[@class='product-thumb']//a[text()='iPhone']")).click();	
				WebElement quantity = driver.findElement(By.id("input-quantity"));
				quantity.clear();
				quantity.sendKeys("2");
				Thread.sleep(2000);
				driver.findElement(By.xpath("//button[@id='button-cart']")).click();
				Thread.sleep(2000);
				WebElement success= driver.findElement(By.cssSelector("div[class*='alert-success']"));				
				System.out.println((success.getText().contains("Success: You have added")));
			}

		
	}

