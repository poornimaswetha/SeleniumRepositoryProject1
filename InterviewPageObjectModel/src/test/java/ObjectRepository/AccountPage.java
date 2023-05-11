package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AccountPage {

	WebDriver driver;
	// Constructor
	// Constructor 'AccountPage', single parameterized constructor
	// driver return type is 'WebDriver' so WebDriver driver
	// this AccountPage driver 'this.driver' is assigned to the LoginTestCase 'driver'
	public AccountPage(WebDriver driver) {
		this.driver = driver;
	}
	
	//By method() =By.Locators
	//private Access modifier is used so that this locators are used only with in class
	//encapsulated - Private for this class
	private By accountbreadcrumb = By.xpath("//ul[@class='breadcrumb']//a[text()='Account']");
	
	// Create a method for each Objects in this Loginpage
	// And return the webElement driver.findElement(method)
	public WebElement accountbreadcrumb() {
		return driver.findElement(accountbreadcrumb);
	}
}
