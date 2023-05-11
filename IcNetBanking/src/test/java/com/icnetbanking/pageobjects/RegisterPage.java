package com.icnetbanking.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.Status;
import com.icnetbanking.testcases.BaseClass;
import com.icnetbanking.utilities.Listeners;

public class RegisterPage {
	WebDriver driver;

	public RegisterPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "input-firstname")
	WebElement txtregfirstname;

	@FindBy(id = "input-lastname")
	WebElement txtreglastname;

	@FindBy(id = "input-email")
	WebElement txtregemail;

	@FindBy(id = "input-telephone")
	WebElement txtregtelephone;

	@FindBy(id = "input-password")
	WebElement txtregpassword;

	@FindBy(id = "input-confirm")
	WebElement txtregconfirmpassword;

	@FindBy(xpath = "//label[@class='radio-inline']/preceding-sibling::label")
	WebElement radiobtnnewsletteryes;

	@FindBy(xpath = "//input[@name='agree']")
	WebElement chkboxregagree;

	@FindBy(xpath = "//input[@value='Continue']")
	WebElement btnregcontinue;

	@FindBy(xpath = "//div[@id='content']/h1[.='Your Account Has Been Created!']")
	WebElement getaccountcreated;

	// Action Methods
	public void setregfirstname(String fname) {
		txtregfirstname.sendKeys(fname);
		BaseClass.logger.info("Entered Firstname successfully :" + fname);
		Listeners.extenttest.log(Status.INFO, "Entered Firstname successfully :" + fname);
	}

	public void setreglastname(String lname) {
		txtreglastname.sendKeys(lname);
		BaseClass.logger.info("Entered Lastname successfully :" + lname);
		Listeners.extenttest.log(Status.INFO, "Entered Lastname successfully :" + lname);
	}

	public void setregemail(String email) {
		txtregemail.sendKeys(email);
		BaseClass.logger.info("Entered Email successfully :" + email);
		Listeners.extenttest.log(Status.INFO, "Entered Email successfully :" + email);
	}

	public void setregtelephone(String telephone) {
		txtregtelephone.sendKeys(telephone);
		BaseClass.logger.info("Entered Telephoneno successfully :" + telephone);
		Listeners.extenttest.log(Status.INFO, "Entered Telephoneno successfully :" + telephone);
	}

	public void setregpassword(String regpwd) {
		txtregpassword.sendKeys(regpwd);
		BaseClass.logger.info("Entered password successfully :" + regpwd);
		Listeners.extenttest.log(Status.INFO, "Entered password successfully :" + regpwd);
	}

	public void setregconfirmpassword(String regpwd) {
		txtregconfirmpassword.sendKeys(regpwd);
		BaseClass.logger.info("Entered confirm password successfully :" + regpwd);
		Listeners.extenttest.log(Status.INFO, "Entered confirm password successfully :" + regpwd);
	}

	public void clickyesnewsletter() {
		radiobtnnewsletteryes.click();
		BaseClass.logger.info("Clicked Yes for NewsLetter successfully");
		Listeners.extenttest.log(Status.INFO, "Clicked Yes for NewsLetter successfully");
	}

	public void clickagree() {
		chkboxregagree.click();
		BaseClass.logger.info("Clicked Agree CheckBox successfully");
		Listeners.extenttest.log(Status.INFO, "Clicked Agree CheckBox successfully");
	}

	public void clickcontinue() {
		btnregcontinue.click();
		BaseClass.logger.info("Clicked Continue Button successfully");
		Listeners.extenttest.log(Status.INFO, "Clicked Continue Button successfully");
	}

	public String gettxtaccountcreated() {
		return getaccountcreated.getText();
	}
}
