#Author:	Shubham	Kumar

Feature: Hotel Booking Login

Background: User should not logged in before

Scenario: Check the Title
Given User is on hotel booking login page
Then Check the title of the page

Scenario: Successful login with all valid data
Given User is on hotel booking login page
When User enters all valid data
Then Navigate to welcome page

Scenario: Unsuccessful login with invalid valid data
Given User is on hotel booking login page
When User enters invalid data
|capegemini|capsj123|
|dyuisf    |465gfdg |
Then display alert msg

Scenario: Failure in login on leaving the username empty
Given User is on hotel booking login page
When user leaves username blank
And clicks the button
Then display username error msg

Scenario: Failure in login on leaving the password empty
Given User is on hotel booking login page
When user leaves password blank and clicks the button
Then display password error msg