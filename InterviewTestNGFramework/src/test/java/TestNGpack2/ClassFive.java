package TestNGpack2;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
public class ClassFive {
	@BeforeSuite
	public void PaymentSuite(){		
		System.out.println("BeforeSuite PaymentSuite got executed");	
	}	
@Test
	public void testcase5(){		
		System.out.println("testcase5 got executed");
		
	}
}
