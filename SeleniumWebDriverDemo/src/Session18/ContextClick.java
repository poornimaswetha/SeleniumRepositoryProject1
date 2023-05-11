package Session18;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextClick {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\SeliniumWorkspace\\SeleniumWebDriverDemo\\Drivers\\chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
		
		// get method and Manage method belong to webdriver interface		
		driver.get("http://omayo.blogspot.com/");
		driver.manage().window().maximize();
		
		WebElement searchboxfield =driver.findElement(By.name("q"));
		
		Thread.sleep(2000);
		//Right click on Search Box Field
		Actions a= new Actions(driver);		
		a.contextClick(searchboxfield).perform();
		
		//double Click on Search Box searchboxfieldField		
		searchboxfield.sendKeys("Poornima");	
		Thread.sleep(2000);
		a.doubleClick(searchboxfield).perform();
		Thread.sleep(2000);
		driver.quit();
				
	}

}
