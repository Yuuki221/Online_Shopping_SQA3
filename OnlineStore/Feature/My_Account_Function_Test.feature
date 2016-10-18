Feature: My Account Function 

Scenario: Be able to Navigate to My Account Page 
	Given User is LogIn
	Then User click on My Account button
	Then Message displayed Navigate to My Account Successfully
	
Scenario: Be able to Click Navigate to Purchase History
	When User click on Purchase History link
	Then The Message display Navigate to Purchase History Successfully 
	
Scenario: Be able to go to Accessories Page
	When User click on Product Categories and Accessories
	Then The message display Go to Accessories 


