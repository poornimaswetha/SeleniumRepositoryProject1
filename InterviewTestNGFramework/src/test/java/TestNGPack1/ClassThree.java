package TestNGPack1;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ClassThree {
	
@BeforeTest
	public void netbanking(){		
		System.out.println("BeforeTest netbanking got executed");	
	}

@Test(groups= {"smoke"})
	public void testcase3(){		
		System.out.println("testcase3 got executed");	
	}

}
