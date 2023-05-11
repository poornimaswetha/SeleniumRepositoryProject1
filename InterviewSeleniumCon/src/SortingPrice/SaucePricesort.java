package SortingPrice;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

//Sort Price list Ascending
public class SaucePricesort {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\SeliniumWorkspace\\InterviewSelenium\\Driver\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();// To open the web page 
		options.addArguments("--remote-allow-origins=*");//To allow origins
		WebDriver driver=new ChromeDriver(options);		
		//To call the Parent class chrome driver methods use object "driver"
		driver.get("https://www.saucedemo.com/");		
		//Maximize the window
		driver.manage().window().maximize();
		//wait for 4 secs - Global wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();	
		
		//All prices List before filter
		List<WebElement> BPriceelements=driver.findElements(By.xpath("//div[@class='inventory_item_price']"));
		
		//Array List to store prices before filter
		List<Double> Bprice=new ArrayList<>();
		
		//Loop through the Price before filter and store in the list
		//Remove dollar symbol
		for(WebElement i:BPriceelements) {
			System.out.println(Double.parseDouble(i.getText().replace("$", "")));
			Bprice.add(Double.parseDouble(i.getText().replace("$", "")));			
		}
		
		//Select the drop down to filter Price from low to high		
		Select selobj=new Select(driver.findElement(By.className("product_sort_container")));
		selobj.selectByVisibleText("Price (low to high)");
		
		//All prices List after filter
		List<WebElement> APriceelements=driver.findElements(By.xpath("//div[@class='inventory_item_price']"));
				
		//Array List to store prices before filter
		List<Double> Aprice=new ArrayList<>();
				
		//Loop through the Price before filter and store in the list
		//Remove dollar symbol
		for(WebElement j:APriceelements) {
			System.out.println(Double.parseDouble(j.getText().replace("$", "")));			
			Aprice.add(Double.parseDouble(j.getText().replace("$", "")));			
		}
		
		Collections.sort(Bprice);
		boolean bool = Bprice.equals(Aprice); 
		System.out.println(bool);  
		
		//Print the List
		System.out.println(Bprice);
		System.out.println(Aprice);
		
		driver.quit();
		
		

	}

}
