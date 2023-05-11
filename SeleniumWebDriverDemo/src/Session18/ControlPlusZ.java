package Session18;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ControlPlusZ {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\SeliniumWorkspace\\SeleniumWebDriverDemo\\Drivers\\chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
				
		// get method and Manage method belong to webdriver interface		
		driver.get("http://omayo.blogspot.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.findElement(By.id("ta1")).sendKeys("Poornima how are u?");
		Thread.sleep(2000);
		
		// Press Ctrl+Z to undo the typed text in text box field
		driver.findElement(By.id("ta1")).sendKeys(Keys.chord(Keys.CONTROL,"z"));
		Thread.sleep(2000);
		driver.quit();
		
		
		
	}

}
