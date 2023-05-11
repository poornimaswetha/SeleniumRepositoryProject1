import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Seliniumex1 {

	public static void main(String[] args) throws InterruptedException {
		/*// TODO Auto-generated method stub
		//ChromeDriver is the predifed class of selenium
		//WebDriver is an interface of selenium
		//ChromeDriver is the Child class of WebDriver interface
		// Interface Webdriver is called by child Class Chrome driver
		
		//ChromeDriver() is a Constructor to launch chrome browser*/
		//System.setProperty("webdriver.chrome.driver", "D:\\SeliniumWorkspace\\SeleniumWebDriverDemo\\Drivers\\chromedriver.exe");
		//WebDriver driver= new ChromeDriver();
		
		//FirefoxDriver()
		//System.setProperty("webdriver.gecko.driver", "D:\\SeliniumWorkspace\\SeleniumWebDriverDemo\\Drivers\\geckodriver.exe");
		//WebDriver driver= new FirefoxDriver();	
		
		//InternetExplorer()
		//System.setProperty("webdriver.ie.driver", "D:\\SeliniumWorkspace\\SeleniumWebDriverDemo\\Drivers\\IEDriverServer.exe");
		//WebDriver driver= new InternetExplorerDriver();	
		
		//MicrosoftEdge()
		//System.setProperty("webdriver.edge.driver", "D:\\SeliniumWorkspace\\SeleniumWebDriverDemo\\Drivers\\msedgedriver.exe");
		//WebDriver driver= new EdgeDriver();	
		
		
		String Browser= "Edge";
		WebDriver driver=null;
		
		if (Browser.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "D:\\SeliniumWorkspace\\SeleniumWebDriverDemo\\Drivers\\chromedriver.exe");
			driver= new ChromeDriver();
		}
		
		else if (Browser.equalsIgnoreCase("Firefox") ) {
			System.setProperty("webdriver.gecko.driver", "D:\\SeliniumWorkspace\\SeleniumWebDriverDemo\\Drivers\\geckodriver.exe");
			driver= new FirefoxDriver();	
		}
		else if (Browser.equalsIgnoreCase("Edge") ) {
			System.setProperty("webdriver.edge.driver", "D:\\SeliniumWorkspace\\SeleniumWebDriverDemo\\Drivers\\msedgedriver.exe");
			driver= new EdgeDriver();	
			
		}
				
				
		// get method and Manage method belong to webdriver interface
		driver.get("http://omayo.blogspot.com/http://omayo.blogspot.com/");
		driver.manage().window().maximize();
		
		//driver.get("https://www.lmax.com/global/demo-login/");
		//driver.manage().window().maximize();
		
		
		//findElement belongs to webdriver interface
		// By -is the Class name for method - id is static method
		
		// id static method has to be called by Classname, By.id like that
		
		//*****Code 1*****  
		//WebElement element = driver.findElement(By.id("confirm"));
		//element.click();
		
		
		//*****Code 2***** 
		/*
		 * WebElement element = driver.findElement(By.name("q"));
		 * element.sendKeys("Poornima");
		 */
			
		
		/*
		 * //*****Code 3***** 
		 * WebElement element =driver.findElement(By.id("textbox1")); 
		 * element.sendKeys("Poornima"); 
		 * // Wait
		 * Thread.sleep(5000); 
		 * element.clear();
		 */
		
		
		/*
		 * //*****Code 4***** 
		 * WebElement element = driver.findElement(By.className("classone")); 
		 * element.sendKeys("Poornima");
		 * // Wait 
		 * Thread.sleep(5000); 
		 * element.clear();
		 */
		
		/*
		 * //*****Code 5***** 
		 * WebElement element = driver.findElement(By.linkText("compendiumdev")); 
		 * element.click();
		 */
				
		  //*****Code 6***** 
		  //WebElement element = driver.findElement(By.partialLinkText("compendium")); 
		  //element.click();
			
		
		  //*****Code 7***** 
		 // WebElement element = driver.findElement(By.cssSelector("#confirm")); 
		 //element.click();
		
		//*****Code 8***** 
		//WebElement element = driver.findElement(By.xpath("//input[@id='confirm']")); 
		//Welement.click();
		
		//*****Code 9***** 
		//driver.findElement(By.xpath("//input[@id='confirm']")).click();
		
		//*****Code 10***** 
		//String text = driver.findElement(By.id("pah")).getText();
		//System.out.println(text);
		
		//*****Code 11***** 
		//To get tile of the text
		//String titl =driver.getTitle();
		//System.out.println("The tile of this Web Page is : "+titl);
		
		//*****Code 11***** 
		//To get url of the text
		//String ul =driver.getCurrentUrl();
		//System.out.println("The tile of this Web Page is : "+ul);
		
		
		// click on 2 links and open new page & quit or close all browser window
		//driver.findElement(By.linkText("Blogger")).click();
		//Thread.sleep(5000); 
		
		// Closes only one browser window
		//driver.close();
		//Close all browser window
		//driver.quit();
		
		//*****Code 12***** 
		// getting attribute value
		//String text =driver.findElement(By.id("textbox1")).getAttribute("value"); 
		//System.out.println(text);
		
		//*****Code 13*****
		//Boolean text =driver.findElement(By.id("but2")).isDisplayed();
		//System.out.println(text);
		
		//*****Code 14*****
		// Button 1 is disabled state in web page so false		
		//Boolean text =driver.findElement(By.id("but1")).isEnabled();
		//System.out.println(text);
		
		// check box is selected
		//Boolean text1 =driver.findElement(By.id("checkbox1")).isSelected();
		//System.out.println(text1);		
		
		//Check box is selected
		//Boolean text1 =driver.findElement(By.id("radio2")).isSelected();
		//System.out.println(text1);
		
		//navigates to this google site
		//driver.navigate().to("https://www.google.com");
		
		//*****Code 14***** Back and Front navigate
		//navigates to this google site
		//driver.navigate().to("https://www.google.com");
		//Thread.sleep(5000);		
		
		//driver.navigate().back();
		//Thread.sleep(5000);
		
		//driver.navigate().forward();
		//Thread.sleep(5000);
		
		//driver.quit();
		
		//*****Code 15***** page source
		//String sourcecode = driver.getPageSource();
		//System.out.println(sourcecode);
		
		//*****Code 16***** submit forms		
		//driver.findElement(By.id("username")).sendKeys("Poornima");
		//driver.findElement(By.id("password")).sendKeys("Poornima@123");		
		//driver.findElement(By.xpath("//button[contains(text(),'Login')]")).submit();
		
		//******Code 17****** tag name is the name of tags of Home 		
		//String text =driver.findElement(By.id("home")).getTagName();
		//System.out.println(text);
		
		//******Code 18****** tag name is the name of tags of Home 	- see styles for css name	
		//String text =driver.findElement(By.id("home")).getCssValue("text-align");
		//System.out.println(text);
		
		//size of the button 
		//Dimension d =driver.findElement(By.id("but2")).getSize();				
		//System.out.println(d);		
		
		//get location of the button 
		//Point L =driver.findElement(By.id("but2")).getLocation();			
		//System.out.println(L.getX());
		//System.out.println(L.getY());
		
		//fullscreen
		//driver.manage().window().fullscreen();
		
		
		//******Code 17******Get all link name from the webpage using for loop
		//List<WebElement> element = driver.findElements(By.tagName("a"));	
		//for (int i=0;i<element.size();i++) {
			
		//	if(element.get(i).getText().length()>0){
		//	System.out.println(element.get(i).getText());	
		//}
			
		//******Code 17******Get all link name from the webpage using for each
		List<WebElement> element = driver.findElements(By.tagName("a"));	
		for (WebElement j:element) {
				
		if(j.getText().length()>0){
		System.out.println(j.getText());	
			}			
			
			
			
		}
	}

}
