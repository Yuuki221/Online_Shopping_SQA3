Feature: Shopping and checkout function

Scenario: Successfully review Product Details
	Given User Logged in and is on Home Page
	When User Click On BuyNow Button 
	Then Message displayed for Successfully go to product details page

Scenario: Successfully add item to shopping cart			
	When User click Add to Cart
	Then Display Message Successfully Add item to Shopping Cart

Scenario: Successfully go to checkout page 
	When User click on Go to Checkout
	Then Display Message for Navigate to Checkout Page Successfully