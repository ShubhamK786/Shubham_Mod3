#Author: Shubham 

@Flipkart

Feature: Flipkart Product Booking

Background: User has already looged in with valid credentials and is navigated to home page.

Scenario: Select a product
Given User is on flipkart home page
When User Finds the product from searchbar
Then User selects the product

Scenario: Select Buy now option
Given User is on product page
When User clicks the buy button
Then 