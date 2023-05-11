package JavaScriptPackage;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class javascriptExecutorDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\SeliniumWorkspace\\InterviewSelenium\\Driver\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();// To open the web page 
		options.addArguments("--remote-allow-origins=*");//To allow origins
		WebDriver driver=new ChromeDriver(options);

		//To call the Parent class chrome driver methods use object "driver"
		driver.get("https://www.google.com/");		
		//Maximize the window
		driver.manage().window().maximize();
		
		//JavascriptExecutor js=(JavascriptExecutor) driver;
		//js.executeScript("alert('Welcome to Selenium')");
	}
}