package Session19;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AutoSuggDropDown {

	public static void main(String[] args) throws InterruptedException {
		/// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\SeliniumWorkspace\\SeleniumWebDriverDemo\\Drivers\\chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
		
		
		// get method and Manage method belong to webdriver interface		
		driver.get("https://www.makemytrip.com/");
		Thread.sleep(2000);	
		driver.manage().window().maximize();
			
		
		Thread.sleep(2000);	
		//WebElement logo=driver.findElement(By.xpath("//a[@data-cy='mmtLogo'/img]"));	
		//Actions a=new Actions(driver);
		//a.moveToElement(logo).click().build().perform();
		driver.findElement(By.id("fromCity")).click();
			
		driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys("del");
		
		int i=0;
		while(i<4) {
		Thread.sleep(2000);	
		driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys(Keys.DOWN);
		i++;
		}
		driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys(Keys.ENTER);
	}

}
