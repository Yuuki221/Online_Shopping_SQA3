Feature: Login Action

Scenario: Successful Login with Valid Credentials
	Given User is on Home Page
	When User Navigate to LogIn Page
	And User enters UserName and Password
	Then Message displayed Login Successfully
	
Scenario: Successful Logout 
	When User LogOut from the Application
	Then Message displayed LogOut Successfully 
	
Scenario Outline: Successful Login with Valid Credentials
	Given User is on Home Page
	When User Navigate to LogIn Page
	And User enters "<username>" and "<password>"
	Then Message displayed Login Successfully 
Examples:
	| username   | password |
	|testuser_1  | Test@153 |
	|testuser_2  | Test@153 |
	|testuser_434| Test@123 |
	