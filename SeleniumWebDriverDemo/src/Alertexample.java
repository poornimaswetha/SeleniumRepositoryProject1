import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertexample {


	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				//ChromeDriver() is a Constructor to launch chrome browser*/
				System.setProperty("webdriver.chrome.driver", "D:\\SeliniumWorkspace\\SeleniumWebDriverDemo\\Drivers\\chromedriver.exe");
				WebDriver driver= new ChromeDriver();
				
				// get method and Manage method belong to webdriver interface		
				driver.get("http://omayo.blogspot.com/");
				driver.manage().window().maximize();
				//driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
				
				driver.findElement(By.id("alert1")).click();
				Thread.sleep(3000);
				Alert alert = driver.switchTo().alert();
				
				System.out.println(alert.getText());
				
				alert.accept();
				Thread.sleep(3000);					
				driver.quit();	
			

	}



}
