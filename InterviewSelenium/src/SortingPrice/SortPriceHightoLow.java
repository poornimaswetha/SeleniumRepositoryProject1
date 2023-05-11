package SortingPrice;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class SortPriceHightoLow {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\SeliniumWorkspace\\InterviewSelenium\\Driver\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();// To open the web page 
		options.addArguments("--remote-allow-origins=*");//To allow origins
		WebDriver driver=new ChromeDriver(options);		
		//To call the Parent class chrome driver methods use object "driver"
		driver.get("https://www.amazon.in/");		
		//Maximize the window
		driver.manage().window().maximize();
		//wait for 4 secs - Global wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Shirts");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.ENTER);
		
		/*List<WebElement> pricebeforesorting=driver.findElements(By.xpath("//span[@class='a-price-whole']"));
		List<Double> b=new ArrayList<>();
		
		for(WebElement i:pricebeforesorting) {			
			//System.out.println(i.getText());
			String str=i.getText().replace(",","");
			if(str!="") {			
			System.out.println(str);
			b.add(Double.parseDouble(str));
			}	*/	
		
	
		System.out.println(driver.findElement(By.className("s-pagination-item s-pagination-disabled")).getText());	
		
		
		/*while(driver.findElement(By.linkText("Next")).isEnabled()) {
		driver.findElement(By.linkText("Next")).click();
		Thread.sleep(5000);	
		pricebeforesorting=driver.findElements(By.xpath("//span[@class='a-price-whole']"));		
		for(WebElement j:pricebeforesorting) {			
			//System.out.println(i.getText());
			String str1=j.getText().replace(",","");
			if(str1!="") {			
			System.out.println(str1);
			b.add(Double.parseDouble(str));
			}			
		}		
		}*/
		
		/*System.out.println("========Sorted Price List=====");
		
		Collections.sort(b);
		for(Double j:b) {
		System.out.println(j);
		}*/
		
		
		
		}
		
		
	}
}

