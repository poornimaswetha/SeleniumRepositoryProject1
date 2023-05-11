package SeleniumAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NavigateAPI{

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
		//wait for 5 secs
		Thread.sleep(3000);
		//Navigate to and get are doing same - opening url
		//After omayo opened then navigate to will open another url
		driver.navigate().to("https://www.selenium.dev/selenium/docs/api/java/allclasses-noframe.html");
		//wait for 5 secs
		Thread.sleep(5000);
		driver.navigate().back(); // the webpage goes backward to previous url
		//wait for 5 secs
		Thread.sleep(5000);
		driver.navigate().forward();// the webpage goes forward to previous url
		//wait for 5 secs
		Thread.sleep(5000);
		driver.navigate().refresh();// Webpage refreshes
		//wait for 5 secs
		Thread.sleep(5000);
		driver.quit(); 
	}
}
