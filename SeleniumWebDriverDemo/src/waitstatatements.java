import java.time.Duration;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class waitstatatements {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				//ChromeDriver() is a Constructor to launch chrome browser*/
				System.setProperty("webdriver.chrome.driver", "D:\\SeliniumWorkspace\\SeleniumWebDriverDemo\\Drivers\\chromedriver.exe");
				WebDriver driver= new ChromeDriver();
				
				// get method and Manage method belong to webdriver interface		
				driver.get("http://omayo.blogspot.com/");
				driver.manage().window().maximize();
				//driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
				
				driver.findElement(By.className("dropbtn")).click();
				
				//Thread.sleep(3000);
				
				//webdriverwait
				WebDriverWait wait =  new WebDriverWait(driver,Duration.ofSeconds(30));
			
				WebElement facebookelement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Facebook")));
				
				facebookelement.click();
				driver.quit();	
		
		

	}



}
