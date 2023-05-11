package TestNGPack3;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class ClassSeven {
	
	@AfterTest
	public void creditCarddebitCardquit(){		
		System.out.println("AfterTest creditCarddebitCardquit got executed");	
	}
	
@Test(groups= {"smoke"})
	public void testcase7(){		
		System.out.println("testcase7 got executed");	
	}

}
