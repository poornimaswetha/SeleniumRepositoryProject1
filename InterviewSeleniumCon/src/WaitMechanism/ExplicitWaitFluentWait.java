package WaitMechanism;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import com.google.common.base.Function;

public class ExplicitWaitFluentWait {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\SeliniumWorkspace\\InterviewSelenium\\Driver\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();// To open the web page 
		options.addArguments("--remote-allow-origins=*");//To allow origins
		WebDriver driver=new ChromeDriver(options);
		
		//To call the Parent class chrome driver methods use object "driver"
		driver.get("https://omayo.blogspot.com/");		
		//Maximize the window
		driver.manage().window().maximize();		
		//wait for 3 sec // This is Java Wait
		Thread.sleep(3000);
		//Implicit Wait is a Global Wait // This is Selenium Wait
		//This Wait is applicable to all Webelements statements 
		//If object is not found then Selenium will wait for 3 Seconds to see for object to appear
		//after that only it will throw object not found error
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));		
		driver.findElement(By.className("dropbtn")).click();
		//FluentWait is child Class of wait() interface
		// Waiting 30 seconds for an element to be present on the page, checking
		// for its presence once every 5 seconds of default polling time
		//Fluent wait has polling time customizable
		   Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
		       .withTimeout(Duration.ofSeconds(30))// wait time
		       .pollingEvery(Duration.ofSeconds(1))//Polling time
		       .ignoring(NoSuchElementException.class);

		   WebElement felement = wait.until(new Function<WebDriver, WebElement>() {
		     public WebElement apply(WebDriver driver) {
		       return driver.findElement(By.linkText("Facebook"));
		     }
		   });
		   driver.findElement(By.linkText("Facebook")).click();
		   driver.quit();
	}

}
