Feature: Purchase item

Scenario: successfully on Checkout page 
	Given User is on an item details page
	When User click add to cart
	And User choose go to checkout

Scenario: successfully filling out checkout information 
	Given User is on an checkout page
	When User click continue
	Then Message display user is now on checkout form 
	When User fill out the form
	
Scenario: successfully purchase item 
	Given User filled out the form
	And User click on purchase 
	Then Message display user purchase complete  