package Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class movetoelementperform {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "D:\\SeliniumWorkspace\\InterviewSelenium\\Driver\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();// To open the web page 
		options.addArguments("--remote-allow-origins=*");//To allow origins
		WebDriver driver=new ChromeDriver(options);
		
		//To call the Parent class chrome driver methods use object "driver"
		driver.get("https://omayo.blogspot.com/");		
		//Maximize the window
		driver.manage().window().maximize();	
		
		//wait for 4 secs - Global wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		WebElement blogmenu=driver.findElement(By.id("blogsmenu"));
		WebElement selbyAru=driver.findElement(By.xpath("//a/span[text()='SeleniumByArun']"));
		//Actions Class - Pass webDriver as Argument
		//Mouse Events of move to elemement is done here
		//perform() method is always used to perform any kind of action methods
		Actions a=new Actions(driver);
		a.moveToElement(blogmenu).perform();
		Thread.sleep(3000);
		
		//a.moveToElement(selbyAru).perform();
		//a.click(selbyAru).perform();
		
		// Above 2 lines of actions can be clubbed. 
		// Use Build to perform multiple actions in same line
		a.moveToElement(selbyAru).click(selbyAru).build().perform();
			
		driver.quit();
		
	}

}
