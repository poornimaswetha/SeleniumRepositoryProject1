package ListenersPack;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNGListeners implements ITestListener {
	@Override
	public void onStart(ITestContext context) {
		System.out.println("Context Name = " + context.getName());
	}
	@Override
	public void onFinish(ITestContext context) {
		System.out.println(context.getPassedTests());
		}	

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Test Started…"+result.getStartMillis());
	}

	@Override
    public void onTestSuccess(ITestResult result) {
    System.out.println("Test Success. "+result.getEndMillis());
    }
	
	@Override
	public void onTestFailure(ITestResult result) {
	System.out.println("Test Failed. "+result.getTestName());
	}
	
	@Override
	public void onTestSkipped(ITestResult result) {
	System.out.println("Test Skipped. "+result.getTestName());
	}
	
	
}
