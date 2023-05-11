import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownMultiselectionbox {


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
				
				// select dropdown list
				//WebElement dropdownselection = driver.findElement(By.id("drop1"));
				//Select sel=new Select(dropdownselection);
				//sel.selectByIndex(2);
				
				//select Multiple selection field
				WebElement multiselection = driver.findElement(By.id("multiselect1"));
				Select sel = new Select(multiselection);
				sel.selectByVisibleText("Volvo");
				sel.selectByVisibleText("Audi");
				sel.selectByVisibleText("Swift");
				Thread.sleep(3000);					
				driver.quit();	
			

	}





}
