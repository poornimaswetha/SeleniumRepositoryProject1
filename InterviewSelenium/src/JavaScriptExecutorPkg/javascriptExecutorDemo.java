package JavaScriptExecutorPkg;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class javascriptExecutorDemo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\SeliniumWorkspace\\InterviewSelenium\\Driver\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();// To open the web page 
		options.addArguments("--remote-allow-origins=*");//To allow origins
		WebDriver driver=new ChromeDriver(options);

		//To call the Parent class chrome driver methods use object "driver"
		driver.get("https://login.yahoo.com/");		
		//Maximize the window
		driver.manage().window().maximize();
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		
		js.executeScript("document.getElementById('login-username').value='Poornima';");
		WebElement signin = driver.findElement(By.id("login-signin"));
		js.executeScript("arguments[0].click()",signin);
		
		// to dispay alert
		//js.executeScript("alert('Welcome to Selenium')");
		
		// to scroll the webpage - down
		js.executeScript("window.scrollBy(0,500)", "");	
		
		Thread.sleep(3000);
		// to scroll the webpage - up
		js.executeScript("window.scrollBy(0,-350)", "");	
		
		Thread.sleep(3000);
		// scrollBy the webpage down
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");  
		
		Thread.sleep(3000);
		
		// scrollTo the webpage Up
		js.executeScript("window.scrollTo(document.body.scrollHeight,0)"); 
		
	
	}
}