Feature: Search for various product categories that should be possible along with product search
It is good to provide title for the products to search description. 
You can provide the description for the feature here.
  
	Background: Going to the website as guest user
  Given I visit the website as the guest user
  @Books @dev @All
  Scenario: User should be able to search for the products under book category
    
    When I select the books option from the search dropdown
  	And I click on the search icon option   
    Then I should see the page having as Amazon Best Reads is getting displayed
    But I should not see other category products
    
 @Baby @wip @All
 Scenario: User should be able to search for the products under baby category
    
    When I select the baby option from the search dropdown
  	And I click on the search icon option   
    Then I should see the page having as offers on baby products is getting displayed
    But I should not see other category products
 