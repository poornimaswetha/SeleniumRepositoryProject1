package com.icnetbanking.testcases;

import org.openqa.selenium.NoSuchElementException;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.aventstack.extentreports.Status;
import com.icnetbanking.pageobjects.HomePage;
import com.icnetbanking.pageobjects.LoginPage;
import com.icnetbanking.utilities.Listeners;

//@Listeners(com.icnetbanking.utilities.Listeners.class) // package.Listeners.class
public class TC_Login_002_Test extends BaseClass {

	@Test(priority = 1, dataProvider = "gettestdatafromexcel", dataProviderClass = com.icnetbanking.testdata.ExcelDataProvider.class)
	public void InvalidCredentialsLogin(String uname, String pwd, String expectedmsg) throws InterruptedException {

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
		String Expectedmessage = expectedmsg;
		logger.info("Actualmessage=" + Actualmessage);
		Listeners.extenttest.log(Status.INFO, "ActualMessage = " + Actualmessage);
		logger.info("Expectedmessage=" + Expectedmessage);
		Listeners.extenttest.log(Status.INFO, "Expectedmessage = " + Expectedmessage);		
		if (Actualmessage.equals(Expectedmessage)) {			
			logger.info("Pass: Correct warning message displayed for invalid credentials");
			Listeners.extenttest.log(Status.INFO, "Pass: Correct warning message displayed for invalid credentials");
			Assert.assertTrue(true);
		} else {
			
			logger.info("Fail : InCorrect warning message displayed for invalid credentials");
			Listeners.extenttest.log(Status.INFO, "Fail : InCorrect warning message displayed for invalid credentials");
			Assert.assertTrue(false);
		}
		}catch (NoSuchElementException e) {
			// e.printStackTrace();
			logger.info("No Such Element Found :" + e.getMessage());
			logger.info("Fail : InCorrect warning message displayed for invalid credentials");
			Listeners.extenttest.log(Status.INFO, "Fail : InCorrect warning message displayed for invalid credentials");
			Assert.assertTrue(false);
		}


	}

}
