package SeleniumAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TagNameAPI{

	public static void main(String[] args) throws InterruptedException {
		//Webdriver is an interface
		//Chromedriver is a Class of WebDriver Interface
		System.setProperty("webdriver.chrome.driver", "D:\\SeliniumWorkspace\\InterviewSelenium\\Driver\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();// To open the web page 
		options.addArguments("--remote-allow-origins=*");//To allow origins
		WebDriver driver=new ChromeDriver(options);		
		//To call the Parent class chrome driver methods use object "driver"
		driver.get("http://tutorialsninja.com/demo/index.php?route=account/login");		
		//Maximize the window
		driver.manage().window().maximize();
		//wait for 3 secs
		Thread.sleep(3000);
		driver.findElement(By.id("input-email")).sendKeys("Poornimadevi");
		//wait for 3 secs
		Thread.sleep(3000);
		driver.findElement(By.id("input-password")).sendKeys("123456");
		//wait for 3 secs
		Thread.sleep(3000);
		//get the html Tagname of the webelement
		driver.findElement(By.id("input-email")).getTagName();
		//wait for 3 secs
		Thread.sleep(3000);		
		driver.quit(); 
	}
}
