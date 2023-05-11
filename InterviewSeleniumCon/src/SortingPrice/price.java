package SortingPrice;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class price {

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
		driver.findElement(By.id("nav-search-submit-button")).click;
		Thread.sleep(5000);	
		
		String s= driver.findElement(By.xpath("//span[@class='s-pagination-item s-pagination-disabled']")).getText();
		System.out.println(s);
		int pg=Integer.parseInt(s);
		
		List<WebElement> pricebeforesorting=driver.findElements(By.xpath("//span[@class='a-price-whole']"));
		List<Integer> b=new ArrayList<>();
		
		for (int page=1;page<pg; page++) {			
			for(WebElement i:pricebeforesorting) {
				String str=i.getText().replace(",","");
				if(str!="") {
				System.out.println(str);
				int pint=Integer.parseInt(str);
				b.add(pint);
				}
			}
		driver.findElement(By.linkText("Next")).click();
		Thread.sleep(5000);
		pricebeforesorting=driver.findElements(By.xpath("//span[@class='a-price-whole']"));	
		}
		for(WebElement i:pricebeforesorting) {
			String str=i.getText().replace(",","");		
			if(str!="") {	
			System.out.println(str);
			int pint=Integer.parseInt(str);
			b.add(pint);
			}
		}
		System.out.println("========Sorted Price List=====");
		
		Collections.sort(b);
		for(Integer j:b) {
		System.out.println(j);
		}
		
		}
		
	}

		
		
			
		



