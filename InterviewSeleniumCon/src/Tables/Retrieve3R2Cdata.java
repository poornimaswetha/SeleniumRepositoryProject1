package Tables;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Retrieve3R2Cdata {

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
		String name="Praveen";
		List<WebElement> hd=driver.findElements(By.xpath("//table[@id='table1']//td[1]"));
		int row=0;
		for(int i=0; i<hd.size();i++) {			
			if (hd.get(i).getText().equals(name)) {
				row=i;
				System.out.println(row);
			};
		}
		String x="//table[@id='table1']//tr["+(row+1)+"]//td[3]";
		System.out.println(driver.findElement(By.xpath(x)).getText());
		driver.quit();
	}


}
