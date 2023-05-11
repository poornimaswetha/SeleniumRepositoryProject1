Feature: Search for various product categories that should be possible along with product search
It is good to provide title for the products to search description. 
You can provide the description for the feature here.
@Search  
Scenario: User should be able to search for the product under book category
		Given I visit the website as the guest user
		When I select option books from search dropdown
		And I click on search button
		Then I should see results of books is getting displayed
		But I should not see other category products

