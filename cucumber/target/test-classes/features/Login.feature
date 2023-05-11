Feature: Login into UPS application
# This featue is to login the ups web application
@smoke @Login @All
Scenario Outline: User should be able to login with valid Credentials
Given I navigate into application URL
When I enter Username as "<Username>" Password as "<Password>" into the fields
And I Click on login button
Then User should be able to login as per "<expected>" login status
Examples:
|Username				|Password			 	|expected	|
|poornimadevir	|Poornimaah@555	|Fail			|
|SeleniumByArun	|Test143$		 		|Pass			|
|ShaliniN     	|Shalini@123   	|Fail			|