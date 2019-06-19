Feature: Validate login scenario

Scenario: Verify Login 
Given home page is opened 
And user enters "username" as "Admin"
And user enters "password" as "Admin123"
When User select "respective Ward"
And user click on "Login" button
Then user navigate to home page 
And "username" gets displayed
And login is "successful"

