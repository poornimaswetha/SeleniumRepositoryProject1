package com.icnetbanking.testdata;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;

public class CustomDataProvider {

	@DataProvider(name = "CustomdpNinjaLogin")
	public Object[][] getData(Method method) {
		Object[][] data_TC_002 = { { "swetha2010@gmail.com", "selenium@123" } };

		Object[][] data_TC_003 = { { "latha@gmail.com", "selenium@123" } };
		String methodname=method.getName();
		
		if(methodname.equals("CheckInValidUserPwdforLogin")) {
			return data_TC_002;
		}else if(methodname.equals("CheckInValidUserValidPwdforLogin")){
			return data_TC_003;
		}else {
			return new Object[][] {{"No Test Data"},{"No Test Data"}};
		}
		
	}



}
