@StockAccouhnting
Feature: Validating Login Module
@Login
Scenario: Login Functionality Validation
When Open Browser
When Open Application
When Wait For Username with "name" and "username" with time "10"
When Enter Username as "admin" with "name" and "username"
When Enter Password as "master" with "id" and "password"
When Click On Login with "name" and "btnsubmit"
Then Validate Page Title with "Dashboard « Stock Accounting"
When Wait for Logout with "xpath" and "(//a[text()=' Logout'])[2]" with time "10"
And Click on Logout with "xpath" and "(//a[text()=' Logout'])[2]"
When user closes the browser