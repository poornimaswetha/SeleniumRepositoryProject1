package Session18;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
				System.setProperty("webdriver.chrome.driver", "D:\\SeliniumWorkspace\\SeleniumWebDriverDemo\\Drivers\\chromedriver.exe");
				WebDriver driver =  new ChromeDriver();
				
				// get method and Manage method belong to webdriver interface		
				driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
				driver.manage().window().maximize();
				Thread.sleep(2000);
				
				WebElement Rome = driver.findElement(By.id("box6"));
				WebElement Italy = driver.findElement(By.id("box106"));
				
				//Drag and Drop
				Actions a= new Actions(driver);	
				a.dragAndDrop(Rome,Italy).perform();
				Thread.sleep(2000);
		
	}

}
