package AssertionsTestNG;

import org.junit.Assert;
import org.testng.annotations.Test;

public class Falseassert {
@Test
	public void FailAsrt()  {
		int a=5,b=7;
		Assert.assertFalse(a<b);
	}

}
