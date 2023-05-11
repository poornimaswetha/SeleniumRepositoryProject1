import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Fluientwait {


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
				
				/*
				 * //webdriverwait WebDriverWait wait = new
				 * WebDriverWait(driver,Duration.ofSeconds(30));
				 * 
				 * WebElement facebookelement =
				 * wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText(
				 * "Facebook")));
				 * 
				 * facebookelement.click();
				 */
				
				
				// Waiting 30 seconds for an element to be present on the page, checking
				// for its presence once every 5 seconds.
				Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				  .withTimeout(Duration.ofSeconds(30))
				  .pollingEvery(Duration.ofSeconds(1))
				  .ignoring(NoSuchElementException.class);
				

				WebElement facebookelement = wait.until(new Function<WebDriver, WebElement>() {
				  public WebElement apply(WebDriver driver) {
				    return driver.findElement(By.linkText("Facebook"));
				   
				  }
				});
				  
				
				driver.quit();	
		
		

	}



}
