package HandlingFrames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HandleFrames {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
				System.setProperty("webdriver.chrome.driver", "D:\\SeliniumWorkspace\\InterviewSelenium\\Driver\\chromedriver.exe");
				ChromeOptions options = new ChromeOptions();// To open the web page 
				options.addArguments("--remote-allow-origins=*");//To allow origins
				WebDriver driver=new ChromeDriver(options);
				
				//To call the Parent class chrome driver methods use object "driver"
				driver.get("https://www.hyrtutorials.com/p/frames-practice.html");		
				//Maximize the window
				driver.manage().window().maximize();		
				//wait for 3 sec
				Thread.sleep(3000);
				// If selenium not able to identify element even if it is correct locator given
				// Reason : it is inside frame or Reason: May be Timing issue
				//Create a WebElement for Frame2 & switch the focus to Frame2
				WebElement frame2=driver.findElement(By.id("frm2"));
				driver.switchTo().frame(frame2);
				//send keys inside frame2 textbox firstname and lastname
				driver.findElement(By.id("firstName")).sendKeys("Poornima");
				driver.findElement(By.id("lastName")).sendKeys("Devi");
				//Now send keys to some element in main page
				//switch to default content & then send keys
				//wait for 3 sec
				Thread.sleep(3000);
				driver.switchTo().defaultContent();
				driver.findElement(By.id("name")).sendKeys("GoodMorning");
				//wait for 3 sec
				Thread.sleep(3000);
				driver.quit();
				

	}

}
