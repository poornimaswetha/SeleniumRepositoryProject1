package Log4jLogger;
import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class Demo {
	
	public static void main(String[] args) throws InterruptedException {		
		Logger log = LogManager.getLogger(Demo.class.getName());
		log.debug("Execution started for omayo");
		System.setProperty("webdriver.chrome.driver", "D:\\SeliniumWorkspace\\InterviewJavaWorkOut\\Driver\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();// To open the web page 
		options.addArguments("--remote-allow-origins=*");//To allow origins
		options.addArguments("--disable-notifications");// To disable notifications
		WebDriver driver=new ChromeDriver();		
		log.debug("omayo application got launched");
		driver.get("https://omayo.blogspot.com/");		
		driver.manage().window().maximize();
		log.debug("omayo application window got maximized");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		log.debug("compendiumdev link got clicked");
		driver.findElement(By.linkText("compendiumdev")).click();
		Thread.sleep(5000);
		driver.navigate().back();
		log.debug("Page Navigated Backward");
		Thread.sleep(5000);
		driver.navigate().forward();
		log.debug("Page Navigated Forward");
		Thread.sleep(5000);
		
		if(driver.getTitle().equals("Basic Web Page Title1")) {
			log.info("Title is verified and matches with expected");
		}else {
			log.error("Title is verified and not matching with expected");
		}
				
		log.debug(" omayo application got closed");		
		driver.quit();	
	}

}
