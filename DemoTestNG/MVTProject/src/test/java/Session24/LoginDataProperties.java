package Session24;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginDataProperties {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Properties Prop=new Properties();
		FileInputStream fis=new FileInputStream("D:\\SeliniumWorkspace\\DemoTestNG\\MVTProject\\data.properties");
		Prop.load(fis);
		
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get(Prop.getProperty("url"));
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@title='My Account']")).click();
		driver.findElement(By.linkText("Login")).click();
		
		
		driver.findElement(By.id("input-email")).sendKeys(Prop.getProperty("email"));
		driver.findElement(By.id("input-password")).sendKeys(Prop.getProperty("pwd"));
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		
		Prop.setProperty("result", "Pass");
		FileOutputStream fos=new FileOutputStream("data.properties");
		Prop.store(fos, null);
		
		fis.close();
		fos.close();
	}

}
