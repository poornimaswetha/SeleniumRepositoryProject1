package ExcludeInclude;

import org.testng.annotations.Test;

public class ClassEight {

	@Test(priority=1)
	public void testcaseA() {
		System.out.println("testcaseA got executed");		
	}
	@Test(priority=2)
	public void testcaseB() {
		System.out.println("testcaseB got executed");
	}
	@Test(priority=3)
	public void testcaseC() {
		System.out.println("testcaseC got executed");
	}
	@Test(priority=4)
	public void testcaseD() {
		System.out.println("testcaseD got executed");
	}
	
}
