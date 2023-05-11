package InterviewAutoIT;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoITClass {

	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://omayo.blogspot.com/");
		
		// this uploadfile button is not clicking by selenium tool
		//so we use Actions class to click it
		//driver.findElement(By.id("uploadfile")).click();
		
		
		Actions actionsobj=new Actions(driver);
		actionsobj.moveToElement(driver.findElement(By.id("uploadfile"))).click().build().perform();
		
	    // To Run any exe file from java program use this
		Runtime.getRuntime().exec("D:\\SeliniumWorkspace\\InterviewAutoIT\\AutoITExecutableFiles\\OpenfileBrowser.exe");

	}

}
