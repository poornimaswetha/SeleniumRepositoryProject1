package ListenersPack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;



public class Login {
	@Test
	public void ClassTen1() throws InterruptedException {
		// TODO Auto-generated method stub
		int a=1;
		int b=5;int c = 6;
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.tutorialsninja.com/demo/");
		driver.manage().window().maximize();
	    Thread.sleep(2000);

		if (a==1) {
			Assert.assertTrue(b<6);
		}else if (a==2)
		{
			Assert.assertFalse(b>c);
		}else if (a==3) {
			throw new SkipException("Test Skipped");
		}		
	
		driver.close();	
	}
	@Test
	public void ClassTen2() throws InterruptedException {
		// TODO Auto-generated method stub
		int a=2;
		int b=5;int c = 6;
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.tutorialsninja.com/demo/");
		driver.manage().window().maximize();
		Thread.sleep(2000);

		if (a==1) {
			Assert.assertTrue(b<6);
			driver.close();	
		}else if (a==2){
			Assert.assertFalse(b>c);
			driver.close();	
		}else if (a==3) {
			throw new SkipException("Test Skipped");			
		}		
		driver.close();	
	}
	@Test
	public void ClassTen3() throws InterruptedException {
		// TODO Auto-generated method stub
		int a=3;
		int b=5;int c = 6;
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.tutorialsninja.com/demo/");
		driver.manage().window().maximize();
		Thread.sleep(2000);

		if (a==1) {
			Assert.assertTrue(b<6);
			driver.close();	
		}else if (a==2)
		{
			Assert.assertFalse(b>c);
			driver.close();	
		}else if (a==3) {
			throw new SkipException("Test Skipped");
		}		
	
		driver.close();	
	}
	
}
