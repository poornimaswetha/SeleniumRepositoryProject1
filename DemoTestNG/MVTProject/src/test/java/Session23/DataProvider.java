package Session23;

import org.testng.annotations.Test;

public class DataProvider {
	
	@Test(dataProvider="getdata")
	public  void Params(String Username, String Password) {
		// TODO Auto-generated method stub
		System.out.println("Website got logged in with Username :" +Username+ "Password :"+Password);

	}
	
	@org.testng.annotations.DataProvider
	public Object[][] getdata(){
		Object[][] data=new Object[3][2];
		data[0][0]="arun";
		data[0][1]="12345";
		
		data[1][0]="balaji";
		data[1][1]="23456";
				
		data[2][0]="Chetti";
		data[2][1]="34567";		
		
		return data;
		
	
}

}
