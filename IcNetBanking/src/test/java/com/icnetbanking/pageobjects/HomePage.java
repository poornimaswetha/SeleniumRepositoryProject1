package com.icnetbanking.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.Status;
import com.icnetbanking.testcases.BaseClass;
import com.icnetbanking.utilities.Listeners;
//constructor
public class HomePage {
	WebDriver driver;
	
	public HomePage(WebDriver driver){
		this.driver=driver;		
		PageFactory.initElements(driver, this);		
	}
	
	@FindBy(xpath="//span[text()='My Account']")
	WebElement linkmyaccount;
	
	@FindBy(linkText="Login")
	WebElement linklogin;
	
	@FindBy(xpath="//li[contains(@class,'dropdown open')]//a[text()='Register']")
	WebElement linkRegister;
	
	//Action Methods
	public void clicklinkmyaccount() {
		linkmyaccount.click();
		BaseClass.logger.info("Cliked on My Account link in HomePage successfully");
		Listeners.extenttest.log(Status.INFO, "Cliked on My Account link in HomePage successfully");
		
	}
	public void clicklinklogin() {
		linklogin.click();		
		BaseClass.logger.info("Cliked on Login link in HomePage successfully");
		Listeners.extenttest.log(Status.INFO, "Cliked on Login link in HomePage successfully");
	}
	public void clicklinkregister() {
		linkRegister.click();
		BaseClass.logger.info("Cliked on My Register link in HomePage successfully");
		Listeners.extenttest.log(Status.INFO, "Cliked on My Register link in HomePage successfully");
		
	}
		
	
}
