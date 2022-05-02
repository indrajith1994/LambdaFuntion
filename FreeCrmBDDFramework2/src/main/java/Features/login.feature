@tag
Feature: Free CRM login feature
  I want to use this template for my feature file

  Background: 

  #@tag1
  #Scenario: Free CRM login test scenario
  #Given User is already available in login page
  #When title of the page is Free CRM
  #Then user enters username and password
  #Then user click on login button
  #Then user is on home page
  #
  #@tag2
  #Scenario: Free CRM login test scenario
  #Given User is already available in login page
  #When title of the page is Free CRM
  #Then user enters username and password
  #Then user click on login button
  #Then user is on home page
  @FreeCRM
  Scenario Outline: Free CRM login test scenario with example - outline
    Given I want to write a step with <name> as userid
    When title of the page is Free CRM
    Then user enters <value> and password
    Then user click on login button
    Then I verify the <status> in step
    And Close the browser

    Examples: 
      | name    | value                      | status    |
      | "ijith" | "indrajith.1994@gmail.com" | "success" |
      | "ttrk"  | "indrath.1@gmail.com"      | "Fail"    |