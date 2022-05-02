@tag
Feature: Login Guru99 demo site

  @Gurudemo_Login
  Scenario: Login Guru99 page
    Given Web browser is at Guru demo login page
    When Enter login credentials
    And Click Login button
    Then Validate title of home page
    And Close the browser
    
    #Scenario: Testing sceanrio 1
#
    #Given I have an endpoint url "https://gorest.co.in/public-api/users"
    When I have 1 book here
    When I have note here
    #Then I should validate the response code and success message after Post request
#
  #Scenario: Testing sceanrio 2
#
    #Given I have an endpoint url "https://gorest.co.in/public-api/users"
    When I have 4 books here
    When I have notes here
    #Then I should validate the response code and success message after Post request
