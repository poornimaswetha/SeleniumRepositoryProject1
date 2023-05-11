package TestNGpack2;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class ClassFour {
	@AfterTest
	public void netbankingquit(){		
		System.out.println("AfterTest netbankingquit got executed");	
	}
@Test(groups= {"smoke"})
	public void testcase4(){		
		System.out.println("testcase4 got executed");	
	}

}
