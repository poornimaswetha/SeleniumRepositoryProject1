package Session18;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class LightBox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\SeliniumWorkspace\\SeleniumWebDriverDemo\\Drivers\\chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
		
		// get method and Manage method belong to webdriver interface		
		driver.get("https://omayo.blogspot.com/p/lightbox.html");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

		//click on light box
		driver.findElement(By.id("lightbox1")).click();
		
		Thread.sleep(3000);
		
		//xpath for light box
		//driver.findElement(By.xpath("//*[@class='close cursor']")).click();
		
		//css for light box
		driver.findElement(By.cssSelector(".close.cursor")).click();
	}

}
