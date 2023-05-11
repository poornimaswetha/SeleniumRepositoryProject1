package AssertionsTestNG;

import org.junit.Assert;
import org.testng.annotations.Test;

public class FailAssert {
@Test
	public void FailAsrt() {
	// TODO Auto-generated method stub
	// Manually fail the assert

	int age=5;
	if(age<18) {
		Assert.fail("Age Cannot be less than 18");

	}
}
}
