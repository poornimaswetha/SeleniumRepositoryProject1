package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class search {
	
	 	@Given("^I visit the website as the guest user$")
	    public void i_visit_the_website_as_the_guest_user()  {
	 		System.out.println("I visit the website as the guest user");   
	    }

	    @When("^I select option books from search dropdown$")
	    public void i_select_option_books_from_search_dropdown()  {
	    	System.out.println("I select option books from search dropdown");  
	    }

	    @Then("^I should see results of books is getting displayed$")
	    public void i_should_see_results_of_books_is_getting_displayed() {
	    	System.out.println("I click on search button");  
	    }

	    @And("^I click on search button$")
	    public void i_click_on_search_button() {
	    	System.out.println("I should see results of books is getting displayed");
	    }

	    @But("^I should not see other category products$")
	    public void i_should_not_see_other_category_products() {
	    	System.out.println("I should not see other category products");
	    }

}
