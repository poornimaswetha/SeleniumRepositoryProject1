package stepdefinitions;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Loginomaya {
	WebDriver driver;
	
		@Before 
		//@Before - Hooks - Run before first step of each scenario 
		// @Before("@Login") - Run -  Run before first step of only login scenario 
		public void Setup() {
			WebDriverManager.chromedriver().setup();
	  		driver = new ChromeDriver();	  		
	  		driver.manage().window().maximize();
	  		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));		
		}
		
		@After 
		// Hooks - Runs after first step of each scenario
		// @After("@Login") - Run -  Run after first step of only login scenario 
		public void Teardown() {
			driver.quit();			
		}
		
		//Background - @Given - BG run after Hooks - Like a Precondition each scenario
	  	@Given("^Navigate to omayo url$")
	    public void navigate_to_omayo_url()  {	  		
	  		driver.get("http://omayo.blogspot.com/");	        
	        System.out.println("Navigeted Omayo website");
	    }

	    @When("^I enter Username as \"([^\"]*)\" and Password as \"([^\"]*)\" to the fields$")
	    public void i_enter_username_something_and_password_something_to_the_fields(String Username, String Password) throws InterruptedException  {
	        driver.findElement(By.name("userid")).sendKeys(Username);
	        driver.findElement(By.name("pswrd")).sendKeys(Password);
	        Thread.sleep(3000);
	        System.out.println("Entered UserName and Password");
	    }
	 
	    @And("^I click in Login button$")
	    public void i_click_in_login_button() throws InterruptedException {
	    	driver.findElement(By.cssSelector("Input[value='Login']")).click();
			Thread.sleep(3000); 
			System.out.println("Clicked Login Button");
	    }
	    
	    
	    @Then("^User should be able to login as expected \"([^\"]*)\" login status$")
	    public void user_should_be_able_to_login_as_expected_something_login_status(String Expected){
	      String Actual=null;
	      try {
	    	  Alert alrt=driver.switchTo().alert();
	    	  if (alrt.getText().contains("Error Password or Username")) {
	    		Actual="Fail";	    		
	    	  }
	      }
	      catch(Exception e) {
	    	  Actual = "Pass";	    	  
	      	  }	      
	      Assert.assertEquals(Expected, Actual);     
	  
	      	
	    }
	    
	 
	   
	
	 
	    
}

