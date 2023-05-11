package Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class DragDrop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\SeliniumWorkspace\\InterviewSelenium\\Driver\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();// To open the web page 
		options.addArguments("--remote-allow-origins=*");//To allow origins
		WebDriver driver=new ChromeDriver(options);		
		//To call the Parent class chrome driver methods use object "driver"
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");		
		//Maximize the window
		driver.manage().window().maximize();			
		//wait for 4 secs - Global wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		WebElement Seoul=driver.findElement(By.id("box5"));
		WebElement Denmark=driver.findElement(By.id("box104"));
		Thread.sleep(3000);
		//Actions Class - Pass webDriver as Argument
		//Mouse Events of move to elemement is done here
		//perform() method is always used to perform any kind of action methods
		Actions a=new Actions(driver);
		//drag Seoul element and drop inside Denmark element
		a.dragAndDrop(Seoul, Denmark).perform();
		
		Thread.sleep(3000);
		driver.quit();

	}

}
