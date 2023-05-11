Feature: Register in Tutorial Ninja application
# Register in  ninja application
@ninjareg
Scenario Outline: Register in Tutorial Ninja application with valid details
Given I navigate into Register page
When Enter all the details in Register page
|Firstname|Poornima1|
|Lastname|Devi1|
|email|n.poornima1@gmail.com|
|Telephone|33219435|
|Password|Poornima@12346|
And I select Yes for Subscribe newsletter
And I select the privacy policy option
And Click on Continue button to go to next page
Then User should get successfully Registered
