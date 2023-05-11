package ExtentReportsPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

	public class ExtentReportTest {

		WebDriver driver;
		ExtentReports extent;
		
		@BeforeMethod
		public void configuration() {
			String reportpath = System.getProperty("user.dir")+"\\Reports\\ExtRep.html";
			ExtentSparkReporter reporter = new ExtentSparkReporter(reportpath);
			reporter.config().setReportName("Omayo Test Report");
			reporter.config().setDocumentTitle("Omayo Test Report Title");
			extent=new ExtentReports();
			extent.attachReporter(reporter);
			extent.setSystemInfo("Operating System", "Windows 10");
			extent.setSystemInfo("Tested By", "Poornimadevi");
			
		}
		

		@Test
		public  void mone() throws InterruptedException {
			// TODO Auto-generated method stub
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.get("http://omayo.blogspot.com/");
			
			extent.createTest("Omayo Blogspot Website")
				.info(" Info : Omayo is Launched")
				.log(Status.PASS, "Omayo Blogspot Website is Launched, and it passed!");
			extent.flush();
			
			driver.manage().window().maximize();
			Thread.sleep(2000);
		
			String actualText = driver.findElement(By.id("pah")).getText();
			System.out.println(actualText);
			AssertJUnit.assertEquals(actualText,"PracticeAutomationHereABC");
			
			
		}

		@AfterMethod
		public void closure(){
			extent.createTest("Omayo Blogspot Website")
			.info(" Info : Omayo is Launched")
			.log(Status.FAIL, "Actual Text is not matching with Expected, and it Failed!");
			extent.flush();
			driver.close();
			
		}


	}


