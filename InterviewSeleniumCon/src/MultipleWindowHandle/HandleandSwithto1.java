package MultipleWindowHandle;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HandleandSwithto1 {

	public static void main(String[] args) throws InterruptedException {
		
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
		//Click on the hyperlink - Open a popup window
		driver.findElement(By.linkText("Open a popup window")).click();
		//Get all the window id's opened using getWindowHandles()
		//returntype of getwindowHandles is Set<String>		
		Set<String> winhandlesids=driver.getWindowHandles();
		
		//winhandlesids has set of all window Handler id's
		//Hence use iterator method and iterator interface to get each window id
		Iterator<String> windowid=winhandlesids.iterator();
		
		String firstwindowid= windowid.next(); // first window id
		System.out.println(firstwindowid);
		
		String Secondwindowid= windowid.next(); // Second window id
		System.out.println(Secondwindowid);
		
		//Move the Focus to the second Windowid
		driver.switchTo().window(Secondwindowid);
		
		//wait for 3 sec
		Thread.sleep(3000);
				
		// gettext() of the second window - first para
		String paratextfirst=driver.findElement(By.id("para1")).getText();
		
		// gettext() of the second window - Second para
		String paratextsecond=driver.findElement(By.id("para2")).getText();
		
		//Printing Paratextfirstline and paratextsecondline
		System.out.println(paratextfirst);
		System.out.println(paratextsecond);
		
		//Close - Closing the Secondwindow - As the switch to focusing second window
		driver.close();
		
		//Move the Focus to the First Windowid
		driver.switchTo().window(firstwindowid);
		
		//Close - Closing the Secondwindow - As the switch to focusing First window
		driver.close();
		
	}

}
