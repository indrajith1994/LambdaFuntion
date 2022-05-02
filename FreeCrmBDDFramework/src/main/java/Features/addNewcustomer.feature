@tag

Feature: Adding new customer
  I want to use this template for my feature file
  
Background:
  	Given Web browser is at Guru demo login page

  @Loginguru99 
  Scenario: Login Guru99 page
    When Enter login credentials
    And Click Login button
    Then Validate title of home page
    And Close the browser

  @add_customer
  Scenario: Adding new customer
    When Enter login credentials
    And Click Login button
    And User reach to Add new customer page
    When Enter new customer details
    And Click submit
    Then Validate new customer registered message
