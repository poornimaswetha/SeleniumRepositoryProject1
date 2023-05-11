Feature: Login to omayo application to check valid and invalid user name and password
@Login
Scenario Outline: User should be able to login with valid credentials
Background:
Given Navigate to omayo url
When I enter Username as "<Username>" and Password as "<Password>" to the fields
And I click in Login button
Then User should be able to login as expected "<Expected>" login status
Examples: 
|Username				|Password				|Expected	|
|poornimadevir	|Poornimaah@555	|Fail			|
|SeleniumByArun	|Test143$		 		|Pass			|
|ShaliniN     	|Shalini@123   	|Fail			|
