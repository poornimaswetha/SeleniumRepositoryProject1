package Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class draganddropby {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\SeliniumWorkspace\\InterviewSelenium\\Driver\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();// To open the web page 
		options.addArguments("--remote-allow-origins=*");//To allow origins
		WebDriver driver=new ChromeDriver(options);		
		//To call the Parent class chrome driver methods use object "driver"
		driver.get("https://omayo.blogspot.com/p/page3.html");		
		//Maximize the window
		driver.manage().window().maximize();			
		//wait for 4 secs - Global wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		WebElement minbar=driver.findElement(By.xpath("//a[@aria-labelledby='price-min-label']"));
		////Actions Class - Pass webDriver as Argument
		Actions a=new Actions(driver);
		//move the bar to left (Webelement,horizontalmove, verticalmove) 
		//Vertical move is zero
		a.dragAndDropBy(minbar, 100, 0).perform();
		Thread.sleep(3000);
		//move the bar to right -ve(Webelement,horizontalmove, verticalmove)
		//Horizontal move is Zero
		a.dragAndDropBy(minbar, -200, 0).perform(); 
		
		
	}

}
