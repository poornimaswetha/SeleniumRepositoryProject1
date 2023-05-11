import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class switchwindows {		

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		//ChromeDriver() is a Constructor to launch chrome browser*/
		System.setProperty("webdriver.chrome.driver", "D:\\SeliniumWorkspace\\SeleniumWebDriverDemo\\Drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		// get method and Manage method belong to webdriver interface		
		driver.get("http://omayo.blogspot.com/");
		driver.manage().window().maximize();
		
		String paratext=null;
		driver.findElement(By.linkText("Open a popup window")).click();
		driver.findElement(By.linkText("Blogger")).click();
		
		Set<String> windowids = driver.getWindowHandles();
		Iterator<String> itr = windowids.iterator();
		
		while(itr.hasNext()) {
			String wid=itr.next();
			driver.switchTo().window(wid);
			if (driver.getTitle().equals("Basic Web Page Title")) {
			paratext = driver.findElement(By.id("para1")).getText();
			System.out.println(paratext);
			
				}
			
		
		
				
	}
}
}