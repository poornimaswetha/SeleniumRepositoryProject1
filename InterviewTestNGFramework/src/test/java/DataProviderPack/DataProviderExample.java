package DataProviderPack;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
// How to use DataProvider for data driven testing in a same class
public class DataProviderExample {

	@Test(dataProvider="NinjaLoginDataProvider",dataProviderClass=CustomDataProvider.class)
	public void Ninja(String urlnm,String uname,String pwd) throws InterruptedException {
		//WebDriverManager for ChromeDriver
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();		
		driver.get(urlnm);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));		
		driver.findElement(By.xpath("//span[contains(text(),'My Account')]")).click();
		driver.findElement(By.linkText("Login")).click();		
		Thread.sleep(3000);
		driver.findElement(By.id("input-email")).sendKeys(uname);
		driver.findElement(By.id("input-password")).sendKeys(pwd);
		driver.findElement(By.id("input-password")).sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		driver.quit();
	}	
	
	/*@DataProvider(name="NinjaLoginDataProvider")
	public Object[][] getData() {
		Object[][] data= {{"http://tutorialsninja.com/demo/","poornima1982@gmail.com","poornima@123"},{"http://tutorialsninja.com/demo/","swetha2010@gmail.com","selenium@123"},{"http://tutorialsninja.com/demo/","Renga2010@gmail.com","Renga@123"}};
		return data;
		
		/*Object[][] data=new Object[3][3];
		data[0][0]="http://tutorialsninja.com/demo/";
		data[0][1]="poornima1982@gmail.com";
		data[0][2]="poornima@123";
		
		data[1][0]="http://tutorialsninja.com/demo/";
		data[1][1]="swetha2010@gmail.com";
		data[1][2]="selenium@123";
		
		data[2][0]="http://tutorialsninja.com/demo/";
		data[2][1]="Renga2010@gmail.com";
		data[2][2]="Renga@123";		
		return data;	
	}*/
}
