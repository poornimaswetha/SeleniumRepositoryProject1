package AssertionsTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TrueAssert {
	@Test
	public void TrueAssrt(){
		int a=5,b=7;
		// TestNG Assertions - Assert Equals	
		Assert.assertTrue(a<b); 
		

	}

}
