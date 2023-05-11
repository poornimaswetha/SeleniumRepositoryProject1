package Session18;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsMoveToElement {

	public static void main(String[] args) throws InterruptedException {
				
		// TODO Auto-generated method stub
				System.setProperty("webdriver.chrome.driver", "D:\\SeliniumWorkspace\\SeleniumWebDriverDemo\\Drivers\\chromedriver.exe");
				WebDriver driver =  new ChromeDriver();
				
				// get method and Manage method belong to webdriver interface		
				driver.get("http://omayo.blogspot.com/");
				driver.manage().window().maximize();
				
				WebElement blgmenu =driver.findElement(By.id("blogsmenu"));		
				WebElement seli143opt= driver.findElement(By.xpath("//a/span[text()=\"Selenium143\"]"));
				Actions a=new Actions(driver);				
				a.moveToElement(blgmenu).perform();
				
				Thread.sleep(2000);					
				a.moveToElement(seli143opt).click().build().perform();
				
				

	}

}
