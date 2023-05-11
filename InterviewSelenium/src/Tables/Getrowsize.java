package Tables;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Getrowsize {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\SeliniumWorkspace\\InterviewSelenium\\Driver\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();// To open the web page 
		options.addArguments("--remote-allow-origins=*");//To allow origins
		WebDriver driver=new ChromeDriver(options);		
		//To call the Parent class chrome driver methods use object "driver"
		driver.get("http://omayo.blogspot.com/");		
		//Maximize the window
		driver.manage().window().maximize();
		//wait for 4 secs - Global wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		int rowsize=driver.findElements(By.xpath("//table[@id='table1']//tbody/tr")).size();
		int Colsize=driver.findElements(By.xpath("//table[@id='table1']//tbody/tr[1]/td")).size();
		System.out.println("Number of Rows ="+rowsize);
		System.out.println("Number of Columns ="+Colsize);
		driver.quit();
	}

}
