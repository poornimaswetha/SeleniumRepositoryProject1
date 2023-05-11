package InterviewMavenProejct;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EndtoEndScenario {

	public static void main(String[] args) throws InterruptedException {
		
		//WebDriverManager for ChromeDriver
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://tutorialsninja.com/demo/index.php?route=account/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));		
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();		
		Thread.sleep(3000);
		driver.findElement(By.id("input-email")).sendKeys("swetha2010@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("selenium@123");
		driver.findElement(By.id("input-password")).sendKeys(Keys.ENTER);		
		//Check whether Account page is displayed
		System.out.println("Account Page Displayed "+driver.findElement(By.xpath("//ul[@class='breadcrumb']//a[text()='Account']")).isDisplayed());//true
		
		// search iphone 
		driver.findElement(By.name("search")).sendKeys("iphone");		
		driver.findElement(By.cssSelector("i[class$=fa-search]")).click();
		
		//click on iphone
		System.out.println("iPhone Page Displayed "+driver.findElement(By.xpath("//*[@class='product-thumb']//a[text()='iPhone']")).isDisplayed());// true
		driver.findElement(By.xpath("//*[@class='product-thumb']//a[text()='iPhone']")).click();
		
		//Check whether iphone page is displayed
		System.out.println("iPhone Page is selected "+driver.findElement(By.xpath("//ul[@class='breadcrumb']//a[text()='iPhone']")).isDisplayed());//true
	
		//
		driver.findElement(By.id("input-quantity")).clear();
		driver.findElement(By.id("input-quantity")).sendKeys("2");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@id='button-cart']")).click();
		
		Thread.sleep(3000);
		System.out.println(driver.findElement(By.cssSelector("div[class*=alert-success]")).getText().contains("Success: You have added iPhone to your shopping cart!x"));
		
		driver.findElement(By.linkText("shopping cart")).click();
		
		driver.findElement(By.cssSelector("a[href='#collapse-shipping']")).click();		
		WebElement country=driver.findElement(By.id("input-country"));
		Select countryobj=new Select(country);
		countryobj.selectByVisibleText("Qatar");
		
		WebElement zone=driver.findElement(By.id("input-zone"));
		Select zoneobject=new Select(zone);		
		zoneobject.selectByVisibleText("Al Wakrah");
		
		driver.findElement(By.xpath("//a[text()='Checkout']")).click();
		
		System.out.println("This product is not in stock "+driver.findElement(By.xpath("//div[contains(@class,'alert-dismissible')]")).isDisplayed());
		
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
		driver.quit();
	}

}
