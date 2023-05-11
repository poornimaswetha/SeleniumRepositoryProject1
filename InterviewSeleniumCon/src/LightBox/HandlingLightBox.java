package LightBox;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HandlingLightBox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\SeliniumWorkspace\\InterviewSelenium\\Driver\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();// To open the web page 
		options.addArguments("--remote-allow-origins=*");//To allow origins
		WebDriver driver=new ChromeDriver(options);
		
		//To call the Parent class chrome driver methods use object "driver"
		driver.get("https://omayo.blogspot.com/p/lightbox.html");		
		//Maximize the window
		driver.manage().window().maximize();	
		
		//wait for 4 secs - Global wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		// no need to switch to light box as it is part of same web page
		//Click on the light Box5
		driver.findElement(By.id("lightbox1")).click();
		Thread.sleep(5000);
		//using xpath
		// driver.findElement(By.xpath("//*[@class='close cursor']")).click();
		//using cssselector
		driver.findElement(By.cssSelector(".close.cursor")).click();
		Thread.sleep(5000);
		driver.quit();
	}

}
