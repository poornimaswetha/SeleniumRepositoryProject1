package Session18;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyUpKeyDown {

	public static void main(String[] args) throws InterruptedException {
		
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\SeliniumWorkspace\\SeleniumWebDriverDemo\\Drivers\\chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
		
		// get method and Manage method belong to webdriver interface		
		driver.get("http://omayo.blogspot.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement linkcompendium = driver.findElement(By.linkText("compendiumdev"));
		
		//Keyup and Keydown to click on the link using mouse action
		Actions a= new Actions(driver);	
		//a.keyDown(Keys.CONTROL).click(linkcompendium).perform();	
		//a.keyUp(Keys.CONTROL).perform();
		
		// singleline you can write the above code
		a.keyDown(Keys.CONTROL).click(linkcompendium).keyUp(Keys.CONTROL).perform();
		
		
	}

}
