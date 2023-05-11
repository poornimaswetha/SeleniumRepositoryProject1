
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LocatorPartialLinkText{

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
		//wait for 3 sec
		Thread.sleep(3000);
				
		//findElement(By) is a method in Webdriver Interface
		//By is a class, it has static method 'id'
		//so static method can be called by classname(Classname.PartiallinkText) By.PartiallinkText
		//Return type of findElement is WebElement
		//WebElement is an interface 
		WebElement elem=driver.findElement(By.partialLinkText("compendium"));		
		elem.click();
		
		//wait for 3 sec
		Thread.sleep(3000);
		driver.close();
			

	}

}
