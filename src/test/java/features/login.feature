Feature: Login into Application

Scenario Outline: Positive test validating login
Given Initialize the browser with chrome
And Navigate to "https://apps.staging.aamc.org/mrs/#/" Site
#And Click on Login link in home page to land on Secure sign in Page
When User enters <username> and <password> and logs in
Then Verify that user is succesfully logged in 
And close browsers

Examples:
|username			    |password	|
|TESTee1594905711286	|Password1!		|






