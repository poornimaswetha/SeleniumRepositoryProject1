package InterviewExtentReports;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExtentReportsDemo {
	WebDriver driver;
	ExtentReports extent;
	
	@BeforeMethod
	public void Configuration() {
		String reportpath=System.getProperty("user.dir")+"\\reports\\index.html";	
		
		//Prerequisite for Extent Report
		//Configure - ExtentSparkReporter
		ExtentSparkReporter report=new ExtentSparkReporter(reportpath);
		report.config().setReportName("Omayo Test Report");
		report.config().setDocumentTitle("Omayo Test Report Title");
		
		//Attach Report & give info - ExtentReports
		extent = new ExtentReports();
		extent.attachReporter(report);
		extent.setSystemInfo("Operation System","Windows 10");
		extent.setSystemInfo("Tested By","Poornima Devi");
	}
	
	
	@Test
	public void OmayoTest() {
		//Create info pass fail logs - ExtentTest
		ExtentTest etest= extent.createTest("TestCase 1 : OmayoTest : Started");
		//etest info
		etest.info("Omayo Application is Launched");
				
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();// To open the web page 
		options.addArguments("--remote-allow-origins=*");//To allow origins
		driver=new ChromeDriver(options);
				
		//To call the Parent class chrome driver methods use object "driver"
		driver.get("https://omayo.blogspot.com/");
		//Maximize the window
		driver.manage().window().maximize();
		etest.info("Navigated to Omayo Application");
		//etest Pass
		etest.pass("The Actual text matches with expected");
		
		String Actualtext=driver.findElement(By.id("pah")).getText();
		Assert.assertEquals(Actualtext, "PracticeAutomationHere1");
		
	}
	
	@AfterMethod
	public void TearDown() {
		
		driver.close();
		extent.flush();	
		
	}

}
