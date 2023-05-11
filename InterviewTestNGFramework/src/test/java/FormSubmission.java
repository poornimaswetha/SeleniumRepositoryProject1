
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FormSubmission {
	WebDriver driver;
    public static void fillForm(WebDriver driver, String pageUrl) {
        // fill form code goes here
    	
    	
		driver.get(pageUrl);
		
		
    }

    public static void submitForm(WebDriver driver) {
        // Assume this method is called only after calling fillForm(driver,url) method
    	WebDriverManager.chromedriver().setup();	
		driver=new ChromeDriver();
    	fillForm(driver,url);
    }
}