package SeleniumAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class GetPagesourceAPI{

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
		//get the page source of the page
		String pagesource=driver.getPageSource();
		System.out.println(pagesource);
		//wait for 3 secs
		Thread.sleep(3000);
		driver.quit(); 
	}
}
