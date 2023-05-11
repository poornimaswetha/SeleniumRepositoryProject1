package Session19;
import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tables {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub		
		System.setProperty("webdriver.chrome.driver", "D:\\SeliniumWorkspace\\SeleniumWebDriverDemo\\Drivers\\chromedriver.exe");
		WebDriver driver =  new ChromeDriver();		
		
		// get method and Manage method belong to web driver interface		
		driver.get("http://omayo.blogspot.com//");			
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		String givenname ="Praveen";		
		List<WebElement> names = driver.findElements(By.xpath("//table[@id='table1']//td[1]"));
		System.out.println(names.size());
	
		for (int i=0;i<=names.size();i++) {
			if (names.get(i).getText().equals(givenname)) {
				System.out.println(names.get(i).getText().equals(givenname));
				System.out.println(driver.findElement(By.xpath("//table[@id='table1']//tr["+(i+1)+"]//td[3]")).getText());
				
			}		
		}
		
			
		driver.quit();
	}

}
