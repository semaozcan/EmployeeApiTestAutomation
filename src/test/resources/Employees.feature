Feature: Employee API Test

  Scenario: Verify the Employee API response
    Given the Employee API endpoint is "/employees"
    When I send a GET request to the Employee API
    Then the response status code should be 200
    And the number of records should be 24
    And the employee with salary 313500 should have the name "Haley Kennedy"
