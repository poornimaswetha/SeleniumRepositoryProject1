package Keyclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
// Program shows KeyClass Keys.ENTER can be used from WebElement > sendkeys also
// instead of using Action class > Sendkeys 
// Advanced Method of using keyboard operations without Actions class
public class keysEnterinWebElement {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\SeliniumWorkspace\\InterviewSelenium\\Driver\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();// To open the web page 
		options.addArguments("--remote-allow-origins=*");//To allow origins
		WebDriver driver=new ChromeDriver(options);		
		//To call the Parent class chrome driver methods use object "driver"
		driver.get("http://tutorialsninja.com/demo/index.php?route=account/login");		
		//Maximize the window
		driver.manage().window().maximize();			
		//wait for 4 secs - Global wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.findElement(By.id("input-email")).sendKeys("arun.selenium@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Second@123");
		//Key class can also be called from WebElement sendkeys also instead of Actions class sendkeys 
		//This is also possible
		Thread.sleep(3000);
		driver.findElement(By.id("input-password")).sendKeys(Keys.ENTER);
		Thread.sleep(5000);
		driver.quit();
	}

}
