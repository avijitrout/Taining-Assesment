Feature: feature to Logining in
Scenario: Login feature
Given Open the chrome and launch the application
When Enter the Username and Password
Then Click on login 
Then Close the browser


Scenario: Add to cart and remove from art
Given Open the chrome and launch the application
When Enter the Username and Password
Then Click on login 
Given Add item to cart
Then Remove From Cart
Then Close the browser
