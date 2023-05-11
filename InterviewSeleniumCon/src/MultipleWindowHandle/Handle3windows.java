package MultipleWindowHandle;
import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Handle3windows {

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
		
		// Click on the Blogger hyperlink 
		driver.findElement(By.linkText("Blogger")).click();
		
		//Get all the window id's opened using getWindowHandles()
		//returntype of getwindowHandles is Set<String>		
		Set<String> winhandlesids=driver.getWindowHandles();
				
		//winhandlesids has set of all window Handler id's
		//Hence use iterator method and iterator interface to get each window id
		Iterator<String> winiditer=winhandlesids.iterator();
		
		while(winiditer.hasNext()) {
			//next() return type is String
			String windowid=winiditer.next();
			//switch to that window of window id
			driver.switchTo().window(windowid);
			
			if (driver.getTitle().equals("Basic Web Page Title")){
				//wait for 3 sec
				Thread.sleep(3000);	
						
				// gettext() of the second window - first para
				String paratextfirst=driver.findElement(By.id("para1")).getText();
				
				// gettext() of the second window - Second para
				String paratextsecond=driver.findElement(By.id("para2")).getText();			
				
				//Printing Paratextfirstline and paratextsecondline
				System.out.println(paratextfirst);
				System.out.println(paratextsecond);	
				
				}
			//Close - Closing the current switchto window
			driver.close();
		}	

	}

}
