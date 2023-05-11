package stepdefinitions;
import java.time.Duration;
import java.util.Map;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;



public class NinjaRegister {
	WebDriver driver;
	@Before // Hooks - Run before first step of each scenario
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	}
		//Background - @Given - BG run after Hooks - Like a Precondition each scenario
	 @Given("^I navigate into Register page$")
	    public void i_navigate_into_register_page() {		
		driver.get("http://tutorialsninja.com/demo/index.php?route=account/register");

	}
	 
	 @When("^Enter all the details in Register page$")
	    public void enter_all_the_details_in_register_page(DataTable data) {
		 Map<String, String> datamap =data.asMap(String.class, String.class);
		 driver.findElement(By.id("input-firstname")).sendKeys(datamap.get("Firstname"));
		 driver.findElement(By.id("input-lastname")).sendKeys(datamap.get("Lastname"));
		 driver.findElement(By.id("input-email")).sendKeys(datamap.get("email"));
		 driver.findElement(By.id("input-telephone")).sendKeys(datamap.get("Telephone"));
		 driver.findElement(By.id("input-password")).sendKeys(datamap.get("Password"));
		 driver.findElement(By.id("input-confirm")).sendKeys(datamap.get("Password"));
	 }

	 @And("^I select the privacy policy option$")
	    public void i_select_the_privacy_policy_option() {
		 driver.findElement(By.name("agree")).click();
		 
	 }
	
	
	  @And("^I select Yes for Subscribe newsletter$")
	  public void i_select_yes_for_subscribe_newsletter() {
		   driver.findElement(By.xpath("//input[@name='newsletter'][@value='1']")).click();
	 
	  }
	   
	   @And("^Click on Continue button to go to next page$")
	    public void click_on_continue_button_to_go_to_next_page() throws Exception {
	    driver.findElement(By.xpath("//input[@value='Continue']")).click();
	    Thread.sleep(3000);
	   }
	   
	   @Then("^User should get successfully Registered$")
	    public void user_should_get_successfully_registered() {
		   WebElement Accountregister = null;
		   try {
		   Accountregister = driver.findElement(By.xpath("//ul[@class='breadcrumb']//a [text()='Account']"));
		   }
		   catch(Exception e){
			   System.out.println("Registration is failed");
		   }
		//Assert.assertNotNull("Registration is failed", Accountregister);
		   Assert.fail();
	   }
	   
		@After // Hooks - Runs after first step of each scenario
		public void teardown() {
		driver.quit();
		}
	  
	
}
