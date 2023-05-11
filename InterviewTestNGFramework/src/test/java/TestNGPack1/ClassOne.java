package TestNGPack1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ClassOne {
	
	@BeforeClass
	public void setupenvironment(){
		System.out.println("BeforeClass setupenvironment got executed");			
	}	
	@BeforeMethod
	public void setup() {
		System.out.println("BeforeMethod Setup got executed");
	}	
	@Test(groups= {"smoke"},priority=2)
	public void testcaseZ() {
		System.out.println("testcaseZ got executed");		
	}
	@Test(groups= {"smoke"},priority=3)
	public void testcaseK() {
		System.out.println("testcaseK got executed");
	}
	@Test(groups= {"smoke"},priority=1)
	public void testcaseA() {
		System.out.println("testcaseA got executed");
	}	
	@AfterMethod
	public void Quit() {
		System.out.println("AfterMethod Quit got executed");
	}	
	@AfterClass
	public void Quitenvironment() {
		System.out.println("AfterClass Quitenvironment got executed");
	}	
}
