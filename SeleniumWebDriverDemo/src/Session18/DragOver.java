package Session18;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragOver {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\SeliniumWorkspace\\SeleniumWebDriverDemo\\Drivers\\chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
		
		// get method and Manage method belong to webdriver interface		
		driver.get("https://omayo.blogspot.com/p/page3.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement minprice= driver.findElement(By.xpath("//a[@aria-labelledby='price-min-label']"));
		
		
		//Draging minprice to 100 along x-axis
		Actions a= new Actions(driver);
		a.dragAndDropBy(minprice, 100, 0).perform();
		
		Thread.sleep(2000);
		a.dragAndDropBy(minprice, -200, 0).perform();
		
		driver.quit();
		
	}

}
