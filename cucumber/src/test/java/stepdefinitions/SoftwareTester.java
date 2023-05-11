package stepdefinitions;

	import io.cucumber.java.en.And;
	import io.cucumber.java.en.Given;
	import io.cucumber.java.en.Then;
	import io.cucumber.java.en.When;
	
	public class SoftwareTester {

		    @Given("^Im a \"(.*)\" software Tester$")
		    public void im_a_something_software_tester(String testertype){
		       System.out.println(">> --Im a "+testertype+" software Tester");
		    }

		    @When("^I go to work$")
		    public void i_go_to_work()  {
		    	System.out.println(">> --I go to work");
		    }

		    
		    @And("^I \"([a-zA-Z]{1,})\" with it$")
		    public void i_something_with_it(String bossreaction)  {
		    	System.out.println(">> --I "+bossreaction+" with it");
		    }
		    
		    @Then("^My boss \"([a-zA-Z]{1,})\" me$")
		    public void my_boss_something_me(String worktype) {
		    	System.out.println(">> --My boss "+worktype+" me");
		    	
		    }


		}	
