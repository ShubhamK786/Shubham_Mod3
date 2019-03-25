#Author: Shubham 

@HotelBooking

Feature: HotelBooking

Background: User has already looged in with valid credentials and is navigated to hotel booking page.

Scenario: Check the title
Given User is on hotel booking page
Then Check the title of the page

Scenario: Successful hotel booking with all valid data
Given User is on hotel booking page
When User enters all valid data
Then Navigate to welcome page

Scenario: Failure in hotel booking on leaving the first name empty
Given User is on hotel booking page
When user leaves first name blank
And clicks the button
Then display alert msg

Scenario: Failure in hotel booking on leaving the last name empty
Given User is on hotel booking page
When user leaves last name blank and clicks the button
Then display alert msg

Scenario: Failure in hotel booking on incorrect email format
Given User is on hotel booking page
When user enters invalid email and clicks the button
Then display alert msg

Scenario: Failure in hotel booking on leaving the email empty
Given User is on hotel booking page
When user leaves email blank and clicks the button
Then display alert msg

Scenario: Failure in hotel booking on leaving the mobile no empty
Given User is on hotel booking page
When user leaves mobile no blank and clicks the button
Then display alert msg

Scenario: Failure in hotel booking on invalid mobile
Given User is on hotel booking page
When user enters invalid mobile and clicks the button
|7722005480|
|0810000000|
|4878965455|
|2145785|
||
Then display alert msg

Scenario: Failure in hotel booking on not selecting the city
Given User is on hotel booking page
When user does not select city and clicks the button
Then display alert msg

Scenario: Failure in hotel booking on not selecting the state
Given User is on hotel booking page
When user does not select state and clicks the button
Then display alert msg

Scenario Outline: Validate the no od rooms alloted
Given User is on hotel booking page
When user enters <noOfGuests>
Then allocate rooms such that 1 room for minimum 3 guests
Examples:
|noOfGuests|
|"2"|
|"6"|
|"9"|

Scenario: Failure in hotel booking on leaving the CardHolderName empty
Given User is on hotel booking page
When user leaves CardHolderName blank and clicks the button
Then display alert msg

Scenario: Failure in hotel booking on leaving the CardHolderName empty
Given User is on hotel booking page
When user leaves CardHolderName blank and clicks the button
Then display alert msg

Scenario: Failure in hotel booking on leaving the DebitCardNo empty
Given User is on hotel booking page
When user leaves DebitCardNo blank and clicks the button
Then display alert msg

Scenario: Failure in hotel booking on leaving the CVV empty
Given User is on hotel booking page
When user leaves CVV blank and clicks the button
Then display alert msg

Scenario: Failure in hotel booking on leaving the expireMonth empty
Given User is on hotel booking page
When user leaves expireMonth blank and clicks the button
Then display alert msg

Scenario: Failure in hotel booking on leaving the expireYear empty
Given User is on hotel booking page
When user leaves expireYear blank and clicks the button
Then display alert msg