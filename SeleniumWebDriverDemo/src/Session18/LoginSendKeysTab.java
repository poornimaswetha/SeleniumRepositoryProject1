package Session18;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LoginSendKeysTab {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\SeliniumWorkspace\\SeleniumWebDriverDemo\\Drivers\\chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
		
		// get method and Manage method belong to webdriver interface		
		driver.get("http://omayo.blogspot.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		
		// using tab and enter send keys and do the keyboard operation to login 
		//Actions a= new Actions(driver);	
		//WebElement login = driver.findElement(By.name("userid"));
		//login.sendKeys("arun");
		//a.sendKeys(Keys.TAB).perform();
		
		Thread.sleep(2000);
		//WebElement pwd = driver.findElement(By.name("pswrd"));
		//pwd.sendKeys("12345");
		//a.sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();
		//a.sendKeys(Keys.DOWN).perform();
		
		// Shortcut for above code
		driver.findElement(By.name("userid")).sendKeys("arun");
		driver.findElement(By.name("pswrd")).sendKeys("12345");
		Actions a= new Actions(driver);
		a.sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();
		a.sendKeys(Keys.DOWN).perform();
		
		
	}

}
