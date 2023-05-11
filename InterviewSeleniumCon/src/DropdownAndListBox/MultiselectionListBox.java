package DropdownAndListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class MultiselectionListBox {

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
		WebElement multiselctionlist= driver.findElement(By.id("multiselect1"));
		//Select is a predefined Class in selenium
		//Select constructor should have an argument as webelement
		Select selobj=new Select(multiselctionlist);
		
		//Select the object by visible text
		//selobj.selectByVisibleText("Volvo");
		//selobj.selectByVisibleText("Hyundai");
		//selobj.selectByVisibleText("Audi");
		
		//select the object by index value
		selobj.selectByIndex(1);
		selobj.selectByIndex(2);
		selobj.selectByIndex(3);	
		
		//deselect the object by visible text
		//selobj.deselectByVisibleText("Hyundai");
		
		//deselect value by index
		selobj.deselectByIndex(2);
		//wait for 3 sec
		Thread.sleep(3000);
		driver.quit();
	}

}
