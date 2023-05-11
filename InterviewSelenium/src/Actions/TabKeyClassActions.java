package Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
//Program to type name in username field,press Tab to go to Password field
//type password in password field, press Tab to go to Enter button, Then press Enter
//Key class is used to presss Tab and Press Enter 
//WebElement 'sendkeys' is used to send username and Password in fields
//Action 'sendkeys' is used to do keyboard operations like Tab, Enter etc
public class TabKeyClassActions {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\SeliniumWorkspace\\InterviewSelenium\\Driver\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();// To open the web page 
		options.addArguments("--remote-allow-origins=*");//To allow origins
		WebDriver driver=new ChromeDriver(options);		
		//To call the Parent class chrome driver methods use object "driver"
		driver.get("https://omayo.blogspot.com/");		
		//Maximize the window
		driver.manage().window().maximize();			
		//wait for 4 secs - Global wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		WebElement usernm=driver.findElement(By.name("userid"));
		WebElement pwd=driver.findElement(By.name("pswrd"));
		WebElement Login=driver.findElement(By.xpath("//input[@value='Login']"));
		
		//To type username use sendkeys of WebElement interface 
		/*//Using Sendkeys performing keys class
		usernm.sendKeys("arun"); // webelement sendkeys
		usernm.sendKeys(Keys.TAB);
		pwd.sendKeys("12345");
		pwd.sendKeys(Keys.TAB);
		Login.sendKeys(Keys.ENTER);*/
		
		//Using Action class - Sendkeys performing keys class
		//Actions Class - Pass webDriver as Argument
		//Mouse Events of move to elemement is done here
		//perform() method is always used to perform any kind of action methods
		Actions a=new Actions(driver);
		//To send keys of Tab keyboard event use
		usernm.sendKeys("arun");
		a.sendKeys(Keys.TAB).perform();// Action sendkeys
		
		pwd.sendKeys("12345");// webelement sendkeys
		a.sendKeys(Keys.TAB).perform();// Action sendkeys //Keys.TAB is key class
		a.sendKeys(Keys.ENTER).perform();// Action sendkeys// Keys.ENTER is key class
	
	}

}
