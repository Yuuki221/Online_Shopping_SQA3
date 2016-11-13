Feature: Login Action

Scenario: Successfully Login with Valid Credentials
	Given User is on Home Page
	When User Navigate to LogIn Page
	And User enters UserName and Password
	Then Message displayed Login Successfully
	
Scenario: Successfully Navigate to Home Page after Login
	Given User is Logged In
	When User Click Home Button
	Then Message display user now on home again
	
Scenario: Successfully Logged Out 
	Given User is Logged In and on home page
	When User click on Account button 
	Then Message displayed on account page
	When User Click Logout
	Then Message displayed Logout Successfully  
	


	