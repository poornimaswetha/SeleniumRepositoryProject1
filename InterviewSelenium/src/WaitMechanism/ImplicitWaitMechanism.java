package WaitMechanism;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ImplicitWaitMechanism {

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
		// drop button is found immediately in 0 seconds
		// It will be clicked immediately
		driver.findElement(By.className("dropbtn")).click();
		// drop button is not found. It will appear after 3 seconds
		// So it will be clicked after object facebook appear in 3 seconds
		driver.findElement(By.linkText("Facebook")).click();
		driver.quit();

	}

}
