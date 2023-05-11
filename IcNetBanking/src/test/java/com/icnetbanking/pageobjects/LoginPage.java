package com.icnetbanking.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.icnetbanking.testcases.BaseClass;
//constructor
public class LoginPage {
	WebDriver driver;
	
	public LoginPage(WebDriver driver){
		this.driver=driver;		
		PageFactory.initElements(driver, this);		
	}
		
	@FindBy(id="input-email")
	WebElement txtusername;
		
	@FindBy(id="input-password")
	WebElement txtpassword;
	
	@FindBy(xpath="//input[@value='Login']")
	WebElement btnlogin;
	
	@FindBy(xpath="//div[contains(@class,'alert-dismissible')]")
	WebElement messageinvalidCredentials;
			
	//Action Methods
	public void setusername(String uname) {
		txtusername.sendKeys(uname);
		BaseClass.logger.info("Entered Username successfully "+ uname);
	}
	public void setpassword(String pwd) {
		txtpassword.sendKeys(pwd);		
		BaseClass.logger.info("Entered Password successfully "+ pwd);
	}	
	public void clickbuttonlogin() {
		btnlogin.click();	
		BaseClass.logger.info("Clicked Login Button successfully");
	}
	public String gettxtinvalidcredentials() {
		return messageinvalidCredentials.getText();
	}
	
	
	
}
