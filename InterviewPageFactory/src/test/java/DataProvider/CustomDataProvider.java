package DataProvider;

import org.testng.annotations.DataProvider;

public class CustomDataProvider {


	@DataProvider(name="LoginDP")	
	public Object[][] getData() {
		Object[][] Logindata=new Object[1][3];
		Logindata[0][0]="https://tutorialsninja.com/demo/index.php?route=account/login";
		Logindata[0][1]="poornimadevi123@gmail.com";
		Logindata[0][2]="poornima@123";
		return Logindata;	
				
	}

	
}