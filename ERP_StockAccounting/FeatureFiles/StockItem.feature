Feature: validating Stock Module
@StockItemCreation
Scenario: Stock Item Creation Functionality Validation
When Open Browser
When Open Application
When Wait For Username with "name" and "username" with time "10"
When Enter Username as "admin" with "name" and "username"
When Enter Password as "master" with "id" and "password"
When Click On Login with "name" and "btnsubmit"
And Wait For Stock Items with "xpath" and "//a[.='Stock Items ']" with time "10"
And Mouse drag to Stock Items with "xpath" and "//a[.='Stock Items ']"
And Mouse Click on Stock Categories with "xpath" and "(//a[.='Stock Categories'])[2]" 
And Wait for Add +icon button with "xpath" and "(//a[@data-caption='Add'])[1]" with time "10"
And Click on Add +icon button with "xpath" and "(//a[@data-caption='Add'])[1]"
And Wait for Category Name with "xpath" and "//input[@id='x_Category_Name']" with time "10"
And Enter Category Name as "Stationary" with "xpath" and "//input[@id='x_Category_Name']"
When Click On Add Button with "id" and "btnAction"
When Wait For Ok Button with "xpath" and "//button[.='OK!']" with time "10"
When Click On Ok Button with "xpath" and "//button[.='OK!']"
When Wait For Alert with "xpath" and "//button[@class='ajs-button btn btn-primary']"with time "10"
When Click On Alert with "xpath" and "//button[@class='ajs-button btn btn-primary']"
Then user validate the Stock Category table
When Wait for Logout with "xpath" and "(//a[text()=' Logout'])[2]" with time "10"
And Click on Logout with "xpath" and "(//a[text()=' Logout'])[2]"
When user closes the browser