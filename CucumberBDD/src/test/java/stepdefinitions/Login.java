package stepdefinitions;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Login{

WebDriver driver;

	@Given("^I navigate into application URL$")
	public void I_navigate_into_application_URL() {	
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
		driver.get("http://omayo.blogspot.com/");
	}

	@When("^I enter Username as \"([^\"]*)\" Password as \"([^\"]*)\" into the fields$")
	public void When_I_enter_Username_as_Username_Password_as_Password_into_the_fields(String Username, String Password) throws InterruptedException{
		driver.findElement(By.name("userid")).sendKeys(Username);
		driver.findElement(By.name("pswrd")).sendKeys(Password);
		Thread.sleep(3000);

	}

	@And("^I Click on login button$")
	public void i_click_on_login_button() throws Throwable {

		driver.findElement(By.cssSelector("Input[value='Login']")).click();
		Thread.sleep(3000);
	}

	@Then("^User should be able to login as per \"([^\"]*)\" login status$")
	public void user_should_be_able_to_login_as_per_something_login_status(String expected) {
		String actual = null;
		try {
			Alert alert = driver.switchTo().alert();			
			if (alert.getText().contains("Error Password or Username")) {
				actual = "Fail";
			}
		} catch (Exception e) {
			actual = "Pass";
		}
		
		Assert.assertEquals(expected, actual);
		

	}
	
	@After
	public void teardown() {
	driver.quit();
}
}
