package POMPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver;

	//private By emailfield = By.id("input-email");
	//private By password = By.id("input-password");
	//private By loginbtn = By.cssSelector("input[value='Login']");
	
	@FindBy(id="input-email")
	private WebElement emailfield;
	
	@FindBy(id="input-password")
	private WebElement password;
	
	@FindBy(css="input[value='Login']")
	private WebElement loginbtn;

	public LoginPage(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement emailfield() {

		return emailfield;
	}

	public WebElement password() {

		return password;
	}

	public WebElement loginbtn() {

		return loginbtn;
	}
}
