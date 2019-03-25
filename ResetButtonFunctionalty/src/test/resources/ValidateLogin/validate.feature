Feature: Reset functionality on login page of Application

Scenario Outline: Verification of reset button with numbers of credential

Given Open the firefox and launch the application
When Enter the Username <username> and Password <password>
Then Reset the credential

Examples: 
	
|username		|password		|
|"user11"		|"pswd11"		|
|"user22"		|"pswd22"		|
|"user33"		|"pswd33"		|
|"user44"		|"pswd44"		|
