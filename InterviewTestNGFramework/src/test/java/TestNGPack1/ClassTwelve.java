package TestNGPack1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClassTwelve {
	@Parameters({"url","username","password"})
	@Test
	public void flipkarttc5(String urlnm,String uname,String pwd) throws InterruptedException {
		//WebDriverManager for ChromeDriver
				WebDriverManager.chromedriver().setup();
				WebDriver driver=new ChromeDriver();		
				driver.get(urlnm);
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));		
				driver.findElement(By.xpath("//span[contains(text(),'My Account')]")).click();
				driver.findElement(By.linkText("Login")).click();		
				Thread.sleep(3000);
				driver.findElement(By.id("input-email")).sendKeys(uname);
				driver.findElement(By.id("input-password")).sendKeys(pwd);
				driver.findElement(By.id("input-password")).sendKeys(Keys.ENTER);
				Thread.sleep(3000);
				driver.quit();
	}


}
