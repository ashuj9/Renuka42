Feature: login
Background:
Given Url: "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
Then orangeHrm login page is opened sucessfully

Scenario: Validate login with valid credentials
Given valid UserName "Admin"
Then UserName entered sucessfully
Given valid Password "admin123"
Then Password entered sucessfully
And click on login button
Then dashboard page is displayed sucessfully


Scenario: Validate login with empty credentials
Given valid UserName " "
Then UserName entered sucessfully
Given valid Password " "
Then Password entered sucessfully
And click on login button
Then " username and password should n't be empty" is displayed

