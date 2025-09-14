Feature: Login Feature
#Description

Background:
Given I am in the login page
@smoke
Scenario: Valid Scenario
	
	When I insert valid email
	And I insert valid Password
	And I click on login button
	Then I should be navigated to the Dashboard
	
@sanity
Scenario: Invalid Scenario
	
	When I insert invalid email
	When I insert invalid Password
	When I click on login button
	Then I should not be navigated to the Dashboard
@smoke	
Scenario Outline:
	When I insert invalid '<email>' and '<password>'
	
	When I click on login button
	Then I should not be navigated to the Dashboard
Examples:
|email        |password  |
|john@do3e.com|489343ss2s|
|doe@john.com |23424564yu|
|sss@john.com |23424564yu|





