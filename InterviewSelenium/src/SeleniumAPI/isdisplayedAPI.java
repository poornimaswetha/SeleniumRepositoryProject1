package SeleniumAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class isdisplayedAPI{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//Webdriver is an interface
		//Chromedriver is a Class of WebDriver Interface
		//Object named driver is created here for ChromeDriver() Class constructor
		//System.setProperty Set the chrome driver and chromedriver path 
		System.setProperty("webdriver.chrome.driver", "D:\\SeliniumWorkspace\\InterviewSelenium\\Driver\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();// To open the web page 
		options.addArguments("--remote-allow-origins=*");//To allow origins
		WebDriver driver=new ChromeDriver(options);
		
		//To call the Parent class chrome driver methods use object "driver"
		driver.get("https://omayo.blogspot.com/");
		
		//Maximize the window
		driver.manage().window().maximize();
		//wait 
		Thread.sleep(3000);
		// Button2 is a visible Enabled button
		boolean bol1=driver.findElement(By.id("but2")).isDisplayed();
		
		//id=hbutton is a hidden not visible button 
		boolean bol2=driver.findElement(By.id("hbutton")).isDisplayed();
		
		System.out.println(bol1); // true
		System.out.println(bol2); //false
		//quit()will close all the Browser windows opened 
		driver.quit(); 
	}
}
