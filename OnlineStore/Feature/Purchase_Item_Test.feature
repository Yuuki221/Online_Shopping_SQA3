Feature: Navigate item details   

Scenario: successfully login in with valid credentials
	Given User is on home page
	When User go to login page
	And User enter username and password
	Then Message display login success
	
Scenario: successfully navigate to product category and accessories
	Given User is on account page
	When User click on product category 
	Then Message display on product category page
	
Scenario: user navigate through the page  
	Given User is on product category page 
	When User click on image of one product 
	Then Message display user can see the detail picture of the item  
