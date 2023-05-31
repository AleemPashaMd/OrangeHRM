Feature: OrangeHRM Application Functionalities Testing

Background: 
Given User should launch chrome Browser

Scenario: Validating OrangeHRM Application LogIn Page Test


When User should enter valid OrangeHRM Application Url Address
Then User should be navigated to OrangeHRM Application LogIn Page
Then User should be close the Browser along with the Application 

Scenario: Validating OrangeHRM Application LogIn Page Test

#Given User should launch chrome Browser
When User should enter valid OrangeHRM Application Url Address
Then User should be navigated to OrangeHRM Application LogIn Page
Then User should enter valid userName and valid password and click on logIn Button
Then User should be navigated to OrangeHRMApplication Home Page
Then User should click on Welcome Admin and click on LogOut
Then User should be close the Browser along with the Application 