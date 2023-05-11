package TestNGTimeoutExpectedExceptionsEnabled;

import org.openqa.selenium.NoSuchElementException;
import org.testng.annotations.Test;
//Program with Test parameters
//enabled=False,timeout=10000;(expectedExceptions= {NoSuchElementException.class})
public class TestNGTestParams {

		@Test
		public void flipkart() {
			System.out.println("flipkart got executed");		
		}
		
		@Test
		public void amazon() throws InterruptedException  {
			System.out.println("amazon got executed");
		
		}
		/*@Test(enabled=false)
		public void amazon() throws InterruptedException  {
			System.out.println("amazon got executed");
			Thread.sleep(3000);
		}*/
		
		
		/*@Test(timeOut=5000)
		public void amazon() throws InterruptedException  {
			System.out.println("amazon got executed");
			Thread.sleep(3000);
		}*/
		
		
		@Test(expectedExceptions= {NoSuchElementException.class})
		public void Almeera() throws InterruptedException  {
			System.out.println("Almeera got executed");
			Thread.sleep(3000);
		}
		@Test
		public void dmart() {
			System.out.println("dmart got executed");
		}
		
		@Test
		public void walmart() {
			System.out.println("walmart got executed");
		}

	}


