Feature: Login into the application

Scenario Outline: Positive test validating login
Given Initialize Chrome driver
And Navigate to "https://qaclickacademy.com/" site
And Click on Login link to navigate to the sign in page
When User enters <username> and <password> and logs in
Then Verify user is successfully logged in


Examples:
|username			|password	|
|test99@gmail.com	|123456		|
|test89@gmail.com	|923456		|