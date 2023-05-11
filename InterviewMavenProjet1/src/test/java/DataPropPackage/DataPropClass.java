package DataPropPackage;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
// Global Parameters
// This program is for defining Global Parameters using properties class in java API [Not Selenium API]
public class DataPropClass{

	public static void main(String[] args) throws InterruptedException, IOException {
		//FileInputStream to specify input file
		FileInputStream fis = new FileInputStream("D:\\SeliniumWorkspace\\InterviewMavenProejct\\data.properties");
		//Properties class from java API
		Properties prop = new Properties();		
		//Load the file
		prop.load(fis);
		
		//WebDriverManager for ChromeDriver
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();		
		driver.get(prop.getProperty("url"));//getproperty
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));		
		driver.findElement(By.xpath("//span[contains(text(),'My Account')]")).click();
		driver.findElement(By.linkText("Login")).click();		
		Thread.sleep(3000);
		driver.findElement(By.id("input-email")).sendKeys(prop.getProperty("username"));//getproperty
		driver.findElement(By.id("input-password")).sendKeys(prop.getProperty("Password"));//getproperty
		driver.findElement(By.id("input-password")).sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		driver.quit();
				
		prop.setProperty("Result", "Pass");//setproperty
		//FileInputStream to specify output file
		FileOutputStream fos = new FileOutputStream("data.properties");
		//to Store the outputs in data.properties file
		prop.store(fos, null);
				
				
	}


}
