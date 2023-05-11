package com.icnetbanking.utilities;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.icnetbanking.testcases.BaseClass;


public class CaptureScreenShot extends BaseClass{

	public  String TakeScreenshot(String testname) {	
	
	   /* try {
	        driver= (WebDriver) result.getTestClass().getRealClass().getDeclaredField("driver").get(result.getInstance());
	    } catch (IllegalArgumentException | IllegalAccessException | NoSuchFieldException | SecurityException e) {
	        e.printStackTrace();
	    }*/
				
		// Take a ScreenShot
		Date d = new Date();
		//date converted to string using tostring() 
		//replace the string date : and space with _
		String TimeStamp = d.toString().replace(":", "_").replace(" ", "_");
		File sourcefile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String destfile = System.getProperty("user.dir")+"\\Screenshots\\"+testname+"_" + TimeStamp + ".png";
		try {
			FileUtils.copyFile(sourcefile, new File(destfile));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return destfile;
	}

}
