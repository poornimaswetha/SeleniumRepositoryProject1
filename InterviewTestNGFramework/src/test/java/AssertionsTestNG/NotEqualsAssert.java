package AssertionsTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class NotEqualsAssert {
@Test
	public  void NotEquals(){
	
		SoftAssert sa=new SoftAssert();
		// TestNG Assertions - Assert Equals
		sa.assertEquals(8,5); 	
		// TestNG Assertions - AssertNotEquals	
		sa.assertNotEquals("Hi","Hi");
		//Asserts used till now will not throw any exception if they fail. 
		//The @Test will not fail either. 
        //If you need the test method to fail at the end, showing all exceptions,
		//you need to use assertAll()
		sa.assertAll();
		
	}

}
