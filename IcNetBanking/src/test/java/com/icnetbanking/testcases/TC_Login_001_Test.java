package com.icnetbanking.testcases;

import org.apache.hc.core5.http.Method;

import org.openqa.selenium.NoSuchElementException;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;
import com.aventstack.extentreports.Status;
import com.icnetbanking.pageobjects.AccountPage;
import com.icnetbanking.pageobjects.HomePage;
import com.icnetbanking.pageobjects.LoginPage;
import com.icnetbanking.utilities.Listeners;

//@Listeners(com.icnetbanking.utilities.Listeners.class) // package.Listeners.class
public class TC_Login_001_Test extends BaseClass {

	@Test(priority = 1)
	public void CheckValidUserPwdforLogin() throws InterruptedException {
	
		HomePage HomePageObj = new HomePage(driver);
		HomePageObj.clicklinkmyaccount();
		HomePageObj.clicklinklogin();
		LoginPage LoginPageObj = new LoginPage(driver);
		LoginPageObj.setusername(username);
		LoginPageObj.setpassword(password);
		LoginPageObj.clickbuttonlogin();

		Thread.sleep(3000);

		// throw new SkipException("This Test got skipped");
		// Assert.assertEquals(Actualtitle, Expectedtitle, "The Title of after loggedin
		// page is mismatching");

		AccountPage AccountPageObj = new AccountPage(driver);
		try {
			Boolean Actualmessage = AccountPageObj.verifyEdityouraccinfodisplayed();
			Boolean Expectedmessage = true;
			logger.info("Actualmessage=" + Actualmessage);	
			Listeners.extenttest.log(Status.INFO, "ActualMessage = " + Actualmessage);
			logger.info("Expectedmessage=" + Expectedmessage);
			Listeners.extenttest.log(Status.INFO, "Expectedmessage=" + Expectedmessage);
			if (Actualmessage.equals(Expectedmessage)) {				
				logger.info("Pass: Edit Your Account information link is displayed");
				Listeners.extenttest.log(Status.INFO, "Pass: Edit Your Account information link is displayed");
				Assert.assertTrue(true);
			} else {				
				logger.info("Fail: Edit Your Account information link is not displayed");
				Listeners.extenttest.log(Status.INFO, "Fail: Edit Your Account information link is not displayed ");
				Assert.assertTrue(false);
			}
		} catch (NoSuchElementException e) {
			// e.printStackTrace();
			logger.info("No Such Element Found :" + e.getMessage());
			logger.info("Fail: Edit Your Account information link is not displayed ");
			Listeners.extenttest.log(Status.INFO, "Fail: Edit Your Account information link is not displayed ");
			Assert.assertTrue(false);
		}

	}

	@Test(dataProvider = "CustomdpNinjaLogin", dataProviderClass = com.icnetbanking.testdata.CustomDataProvider.class, priority = 2)
	public void CheckInValidUserPwdforLogin(String uname, String pwd) throws InterruptedException {
	
		HomePage HomePageObj = new HomePage(driver);
		HomePageObj.clicklinkmyaccount();
		HomePageObj.clicklinklogin();
		LoginPage LoginPageObj = new LoginPage(driver);
		LoginPageObj.setusername(uname);
		LoginPageObj.setpassword(pwd);
		LoginPageObj.clickbuttonlogin();
		Thread.sleep(3000);
		try {
			String Actualmessage = LoginPageObj.gettxtinvalidcredentials();
			String Expectedmessage = "Warning: No match for E-Mail Address and/or Password.";
			logger.info("Actualmessage=" + Actualmessage);
			Listeners.extenttest.log(Status.INFO, "ActualMessage = " + Actualmessage);
			logger.info("Expectedmessage=" + Expectedmessage);
			Listeners.extenttest.log(Status.INFO, "Expectedmessage=" + Expectedmessage);
			if (Actualmessage.equals(Expectedmessage)) {				
				logger.info("Correct warning message displayed for invalid credentials");
				Listeners.extenttest.log(Status.INFO, "Correct warning message displayed for invalid credentials");
				Assert.assertTrue(true);
			} else {				
				logger.info("Fail : InCorrect warning message displayed for invalid credentials");
				Listeners.extenttest.log(Status.INFO, "Fail : InCorrect warning message displayed for invalid credentials");
				Assert.assertTrue(false);
			}
		} catch (NoSuchElementException e) {
			// e.printStackTrace();
			logger.info("No Such Element Found :" + e.getMessage());
			logger.info("Fail : InCorrect warning message displayed for invalid credentials");
			Listeners.extenttest.log(Status.INFO, "Fail : InCorrect warning message displayed for invalid credentials");
			Assert.assertTrue(false);
		}
	}

	@Test(dataProvider = "CustomdpNinjaLogin", dataProviderClass = com.icnetbanking.testdata.CustomDataProvider.class, priority = 3)
	public void CheckInValidUserValidPwdforLogin(String uname, String pwd) throws InterruptedException {
		HomePage HomePageObj = new HomePage(driver);
		HomePageObj.clicklinkmyaccount();	
		HomePageObj.clicklinklogin();	
		LoginPage LoginPageObj = new LoginPage(driver);
		LoginPageObj.setusername(uname);		
		LoginPageObj.setpassword(pwd);		
		LoginPageObj.clickbuttonlogin();	
		Thread.sleep(3000);
		try {
		String Actualmessage = LoginPageObj.gettxtinvalidcredentials();
		String Expectedmessage = "Warning: No match for E-Mail Address and/or Password.";
		logger.info("Actualmessage=" + Actualmessage);
		Listeners.extenttest.log(Status.INFO, "ActualMessage = " + Actualmessage);
		logger.info("Expectedmessage=" + Expectedmessage);
		Listeners.extenttest.log(Status.INFO, "Expectedmessage=" + Expectedmessage);

		if (Actualmessage.equals(Expectedmessage)) {			
			logger.info("Correct warning message displayed for invalid credentials");
			Listeners.extenttest.log(Status.INFO, "Correct warning message displayed for invalid credentials");
			Assert.assertTrue(true);
		} else {			
			logger.info("Fail : InCorrect warning message displayed for invalid credentials");
			Listeners.extenttest.log(Status.INFO, "Fail : InCorrect warning message displayed for invalid credentials");
			Assert.assertTrue(false);
		}
		} catch (NoSuchElementException e) {
			// e.printStackTrace();
			logger.info("No Such Element Found :" + e.getMessage());
			logger.info("Fail : InCorrect warning message displayed for invalid credentials");
			Listeners.extenttest.log(Status.INFO, "Fail : InCorrect warning message displayed for invalid credentials");
			Assert.assertTrue(false);
		}

	}

}
