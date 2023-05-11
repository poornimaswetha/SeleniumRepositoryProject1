package POMPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountPage {

	WebDriver driver;
	
	
	@FindBy(xpath="//*[@class='breadcrumb']//a[text()='Account']")
	private WebElement AccountBreadCrumb;	
		
		
	public AccountPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		}

	public WebElement AccountBreadCrumb() {
		return (AccountBreadCrumb);
	}
		
		

}
