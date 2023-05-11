package Alerts;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
public class HandlingAlertWindow {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\SeliniumWorkspace\\InterviewSelenium\\Driver\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();// To open the web page 
		options.addArguments("--remote-allow-origins=*");//To allow origins
		WebDriver driver=new ChromeDriver(options);
		
		//To call the Parent class chrome driver methods use object "driver"
		driver.get("https://omayo.blogspot.com/");		
		//Maximize the window
		driver.manage().window().maximize();		
		//wait for 3 sec
		Thread.sleep(3000);
		//Click to Get Alert
		driver.findElement(By.id("alert1")).click();
		//wait for 3 sec
		Thread.sleep(3000);
		//Moving the focus to alert window using switchto> alert
		//alert() is an interface in selenium
		//alert() interface has many methods like accept, dismiss etc
		//Here alert() return type is alert()
		Alert alrt=driver.switchTo().alert();
		//getText() method is a method in Alert interface
		String Strtext=alrt.getText();
		System.out.println(Strtext);
		//To click on 'OK' button in Alert
		alrt.accept();
		//wait for 3 sec
		Thread.sleep(3000);
		driver.quit();
}
}