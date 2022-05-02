Feature: Access to Petstore orders
  For Post,Get,Delete,Get

  Scenario: Post Request - new order
    Given I have an endpoint url "https://petstore.swagger.io/v2/store/order"
    When I hit the post request with header
    Then I should validate the response code and success message after Post request
    Then I should validate all the headers from the response
    Then Body has below given json details
      | Key      | Value |
      | id       |    42 |
      | petId    |  3234 |
      | quantity |     1 |

  Scenario: Get Request - order history
    Given I have an endpoint url "https://petstore.swagger.io/v2/store/order/42"
    When I hit the get request
    Then I should validate the response code and response body after Get request

  Scenario: Delete Request - delete Post request data
    Given I have an endpoint url "https://petstore.swagger.io/v2/store/order/42"
    When I hit the delete request
    Then I should validate the response code after Delete request
