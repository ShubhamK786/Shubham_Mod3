#Author: Shubham Kumar

Feature: Submit functionality of email registration form of Application 

 Scenario: Verification of all the data with correct syntax
  
  Given Open the firefox and launch the application
  When Enter the username, password, confirm password, first name,last name, gender, dateOfBirth, email, address, city, phone, hobbies 
  Then Submit the Data    
    
