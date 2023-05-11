package one;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



@Test
public class dataProvider {


		public void loginTest(String username, String password) {
			WebDriver driver ;
			System.out.println(username);
			System.out.println(password);
			driver = new ChromeDriver();
			driver.navigate().to("https://www.browserstack.com/");
			String ActualTitle = driver.getTitle();
			String ExpectedTitle = "Most Reliable App & Cross Browser Testing Platform | BrowserStack";
			
			
		
		}
		
	


		@DataProvider
		public Object[][] getdata() {
			Object[][] a=new  Object[3][2];
			a[0][0]="poornima";
			a[0][1]="12345";
			
			a[1][0]="Samu";
			a[1][1]="12345";
			
			a[2][0]="Lakshmi";
			a[2][1]="12345";
			return a;
					
		}
		
	}

