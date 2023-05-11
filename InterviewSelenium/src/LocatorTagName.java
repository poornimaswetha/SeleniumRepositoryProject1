import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
// Get all the html hyperlinks in a webpage 
//TagName locator is used to get the Tagname of a webelement from webpage
//TagName is not single, same tagname is seen multiple times in a webpage s
//TagName is used to get multiple webelements
public class LocatorTagName{

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
		//TagName is used to get multiple webelements
	     List<WebElement> Listelem =driver.findElements(By.tagName("a"));
	    
	    /*//for Loop
	    //get(i) will get the index of element - 'a' link index
	    //gettext() method will get the exact name between the link tag
	    for(int i=0;i<Listelem.size();i++) {
	    	String text=Listelem.get(i).getText();//gettext returntype is string
	    	//if the length of linkname is 0 then no need to print that line
	    	if(text.length()>0) {
	    	System.out.println(text);
	    	}*/
	 
	    //for each loop 
	    // Wrapper class is WebElement	
	    for(WebElement j :Listelem ) {
	    	if(j.getText().length()>0) {
	    	System.out.println(j.getText());
	    	}
	    } 	
		driver.quit();	
	}
}
