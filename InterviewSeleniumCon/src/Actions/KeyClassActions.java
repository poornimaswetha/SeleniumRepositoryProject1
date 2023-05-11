package Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
// Program to click on a link and the link opens in a new tab [ctrl+link click]
// Ctrl key press down + Link click + Ctrl key Press up
// Here Key Class is used to do keyboard keys press Ctrl 
public class KeyClassActions {

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
		WebElement compendlink=driver.findElement(By.linkText("compendiumdev"));
		
		//Actions Class - Pass webDriver as Argument
		//Mouse Events of move to elemement is done here
		//perform() method is always used to perform any kind of action methods
		Actions a=new Actions(driver);
		// Ctrl key press down + Link click + Ctrl key Press up
		// Here Key Class is used to do keyboard keys press Ctrl 
		// Here Keydown is a method of Action class 
		// keys.control is the method of Keys Class not Action class
		a.keyDown(Keys.CONTROL).click(compendlink).keyUp(Keys.CONTROL).build().perform();
		
		Thread.sleep(5000);
		driver.quit();

	}

}
