Feature: Facebook Login 
User can login to facebook to post commands and share photos

Scenario: Successful login


Given user is on FB login page
When user provides correct credentials
And Click on login button
Then user is on homepage
And sees the title of the page is facebook
