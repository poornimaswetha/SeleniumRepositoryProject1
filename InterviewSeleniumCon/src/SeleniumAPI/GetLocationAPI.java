package SeleniumAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class GetLocationAPI{

	public static void main(String[] args) throws InterruptedException {
		//Webdriver is an interface
		//Chromedriver is a Class of WebDriver Interface
		System.setProperty("webdriver.chrome.driver", "D:\\SeliniumWorkspace\\InterviewSelenium\\Driver\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();// To open the web page 
		options.addArguments("--remote-allow-origins=*");//To allow origins
		WebDriver driver=new ChromeDriver(options);		
		//To call the Parent class chrome driver methods use object "driver"
		driver.get("https://omayo.blogspot.com/");		
		//Maximize the window
		driver.manage().window().maximize();
		//wait for 3 secs
		Thread.sleep(3000);
		//To get the location of the button element use - getLocation()
		//Getsize return type is dimension
		Point pt= driver.findElement(By.id("but2")).getLocation();
		//To print the Location x
		System.out.println("x Location ="+pt.x);
		//To print the Location y
		System.out.println("y Location ="+pt.y);	
		//wait for 3 secs
		Thread.sleep(3000);		
		driver.quit(); 
	}
}
