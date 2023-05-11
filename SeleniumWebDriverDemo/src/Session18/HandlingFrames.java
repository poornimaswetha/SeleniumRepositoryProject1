package Session18;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFrames {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\SeliniumWorkspace\\SeleniumWebDriverDemo\\Drivers\\chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
		
		// get method and Manage method belong to webdriver interface		
		driver.get("http://omayo.blogspot.com/");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

		Thread.sleep(3000);
		
		WebElement iframe2= driver.findElement(By.id("iframe2"));
		
		//switch to iframe2
		driver.switchTo().frame(iframe2);
		
		// get the text <p> in iframe2
		String para = driver.findElement(By.cssSelector("body[text=\"#000000\"]>h2>p")).getText();
		System.out.println(para);
		
		//This prints total number of frames in the page 
		System.out.println(driver.findElements(By.tagName("iframe")).size());
		
		//switch to default page 
		driver.switchTo().defaultContent();
		driver.findElement(By.id("ta1")).sendKeys("Poornima");
	}
}
