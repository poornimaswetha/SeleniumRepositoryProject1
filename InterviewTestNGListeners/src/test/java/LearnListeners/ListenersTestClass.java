package LearnListeners;
import org.junit.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import BaseUtils.Base;
@Listeners(LearnListeners.Listeners.class)//package.Listeners.class
public class ListenersTestClass extends Base{
@Test
	public void LaunchApplication() {
	driver.get("https://ebay.com");
	Assert.assertTrue(false);
		
	}


	
}
