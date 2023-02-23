@Customer
Feature: validating Customer Module
@Customer1
Scenario Outline: Customer creation Functionality Validation
When Open Browser
When Open Application
When Wait For Username with "name" and "username" with time "10"
When Enter Username as "admin" with "name" and "username"
When Enter Password as "master" with "id" and "password"
When Click On Login with "name" and "btnsubmit"
When Wait For Customer with "xpath" and"(//a[.='Customers'])[2]" with time "10"
When Click On Customer with "xpath" and "(//a[.='Customers'])[2]"
When Wait For AddButton with "xpath" and "(//a[@data-caption='Add'])[1]" with time "10"
When Click On AddButton with "xpath" and "(//a[@data-caption='Add'])[1]" 
When Wait For Customer Number with "name" and "x_Customer_Number" with time "10"
Then Capture Data with "name" and "x_Customer_Number"
When Enter in "<CustomerName>" with "id" and "x_Customer_Name" 
When Enter in "<address>" with "xpath" and "//*[@id='x_Address']" 
When Enter in "<city>" with "xpath" and "//*[@id='x_City']" 
When Enter in "<country>" with "xpath" and "//*[@id='x_Country']" 
When Enter in "<cperson>" with "xpath" and "//*[@id='x_Contact_Person']" 
When Enter in "<pnumber>" with "xpath" and "//*[@id='x_Phone_Number']" 
When Enter in "<mail>" with "xpath" and "//*[@id='x__Email']" 
When Enter in "<mnumber>" with "xpath" and "//*[@id='x_Mobile_Number']" 
When Enter in "<note>" with "xpath" and "//*[@id='x_Notes']" 
When Click On Add Button with "id" and "btnAction"
When Wait For Ok Button with "xpath" and "//button[.='OK!']" with time "10"
When Click On Ok Button with "xpath" and "//button[.='OK!']"
When Wait For Alert with "xpath" and "//button[@class='ajs-button btn btn-primary']"with time "10"
When Click On Alert with "xpath" and "//button[@class='ajs-button btn btn-primary']"
Then user validate the Customer table
And Click on Logout with "xpath" and "(//a[text()=' Logout'])[2]"
When user closes the browser
Examples:
|CustomerName|address|city|country|cperson|pnumber|mail|mnumber|note|
|VTSSainath|SRnagar|Hyderabad|India|VRK|0402345678|test@gmail.com|9700337753|Best|