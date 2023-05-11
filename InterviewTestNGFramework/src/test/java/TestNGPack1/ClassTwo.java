package TestNGPack1;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ClassTwo {	
	@AfterSuite
	public void PaymentSuitequit(){		
		System.out.println("AfterSuite PaymentSuitequit got executed");	
	}
	@BeforeTest
	public void creditCarddebitCard(){		
		System.out.println("BeforeTest creditCarddebitCard got executed");	
	}	
@Test
	public void testcase2(){		
		System.out.println("testcase2 got executed");	
	}
}
