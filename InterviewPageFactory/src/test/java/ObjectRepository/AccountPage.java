package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountPage {

	WebDriver driver;

	// Constructor
	// Constructor 'AccountPage', single parameterized constructor
	// driver return type is 'WebDriver' so WebDriver driver
	// this AccountPage driver 'this.driver' is assigned to the LoginTestCase
	// 'driver'
	public AccountPage(WebDriver driver) {
		this.driver = driver;
		// To avoid staleelementexception
		// To avoid nullpointexception
		// This error comes because pagefactory objects are not initialized for each pages
		PageFactory.initElements(driver,this);
	}

	// @FindBy(Locators) - This is from Selenium Annotations
	// private Access modifier is used so that this locators are used only with in
	// class
	// encapsulated - Private for this class
	// WebElement is return type of accountbreadcrumb method
	@FindBy(xpath = "//ul[@class='breadcrumb']//a[text()='Account']")
	private WebElement accountbreadcrumb;

	// Create a method for each Objects in this Loginpage
	// And return the webElement driver.findElement(method)
	public WebElement accountbreadcrumb() {
		return accountbreadcrumb;
	}
}
