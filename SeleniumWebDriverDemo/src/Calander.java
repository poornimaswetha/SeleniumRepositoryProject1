import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Calander {

	public static void main(String[] args) throws InterruptedException {
		
		/// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\SeliniumWorkspace\\SeleniumWebDriverDemo\\Drivers\\chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
			
		// get method and Manage method belong to web driver interface		
		driver.get("https://www.path2usa.com/travel-companions/");
		driver.manage().window().maximize();
		Thread.sleep(5000);	
		
		driver.findElement(By.id("form-field-travel_comp_date")).click();	
		Thread.sleep(4000);		
		
		while(!driver.findElement(By.cssSelector(".cur-month")).getText().contains("December")){
		driver.findElement(By.cssSelector(".flatpickr-next-month")).click();
		}
		
		driver.quit();				
	}

}

