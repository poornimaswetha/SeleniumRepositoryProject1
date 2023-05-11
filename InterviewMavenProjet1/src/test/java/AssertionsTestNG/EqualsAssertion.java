package AssertionsTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class EqualsAssertion {
@Test
	public  void Example1(){
		// TestNG Assertions - Assert Equals
		Assert.assertEquals(8,5); 	
		// TestNG Assertions - Assert Equals	
		Assert.assertEquals("Hi","Bye"); 
	}

}
