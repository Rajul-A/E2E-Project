Feature: Login into Application

Scenario Outline: Positive test validating login

Given Initialize browser with chrome
And Navigate to "http://qaclickacademy.com" site
And Click on Login link in home oage to land on Secure sign in page
When User enters <username> and <password> and logs in
Then Verify that user is succesfully logged

Examples:
| username | password |
|Rajul@gmail.com | 123|
|rajulkjshdkjsgmail | 345 |


