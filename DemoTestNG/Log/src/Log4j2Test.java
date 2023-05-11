import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Log4j2Test {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Logger log=LogManager.getLogger(Log4j2Test.class.getName());
		System.setProperty("WebDriver.Chrome.driver", "D:\\SeliniumWorkspace\\DemoTestNG\\Log\\Drivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://omayo.blogspot.com/");
		Thread.sleep(2000);
		log.debug("Omayo has Launched");	
		driver.findElement(By.linkText("compendiumdev")).click();
		log.debug("compendiumdev has got Clicked");
		driver.navigate().back();
		log.debug("Page Navigated backwards");
		
		driver.navigate().forward();
		log.debug("Page Navigated Forwards");
		
		if (driver.getTitle().equals("Basic Web Page Title")) {
			log.info("Page tile displayed correctly");
			
		}else {
			log.error("Page Title displayed Wrongly");
		}

		driver.close();

	}

}
