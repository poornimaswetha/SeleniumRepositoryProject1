package ListenersPack;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenersDemo implements ITestListener{
	
	public void onTestStart​(ITestResult result) {
		System.out.println("Test Execution Started");
	}
	
	public void onFinish​(ITestContext context){
		System.out.println("Test Execution Completed");			
	}
	
	public void onTestSuccess​(ITestResult result) {
		System.out.println("Test Execution is Successful");			
	}
	
	public void onTestFailure​(ITestResult result) {
		System.out.println("Test Execution Failed");			
	}
	
	public void onTestSkipped​(ITestResult result) {
		System.out.println("Test Execution got Skipped");			
	}


}
