package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver;	
	// Constructor
	// Constructor 'LoginPage', single parameterized constructor
	// driver return type is 'WebDriver' so WebDriver driver
	// this Loginpage driver 'this.driver' is assigned to the LoginTestCase 'driver'
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		// To avoid staleelementexception 
		// To avoid nullpointexception
		// This error comes because pagefactory objects are not initialized for each pages		
		PageFactory.initElements(driver,this);
	}	
	//@FindBy(Locators) - This is from Selenium Annotations 
	//private Access modifier is used so that this locators are used only with in class
	//encapsulated - Private for this class
	// WebElement is return type of emailfield method
	@FindBy(id="input-email")
	private WebElement emailfield;
	
	@FindBy(id="input-password")
	private WebElement passwordfield;
	
	//'css' can be used instead of cssselector locator	
	@FindBy(css="input[value='Login']")
	private WebElement loginbutton;
		
	// Create a method for each Objects in this Loginpage
	// And return method
	public WebElement emailfield() {
		return emailfield ;
	}
	public WebElement passwordfield() {
		return passwordfield;
	}

	public WebElement loginbutton() {
		return loginbutton;
	}

	
	
}
