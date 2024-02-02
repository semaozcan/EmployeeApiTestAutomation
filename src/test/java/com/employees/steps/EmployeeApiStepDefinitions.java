package com.employees.steps;

import com.employees.services.BaseTest;
import com.employees.services.EmployeesService;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class EmployeeApiStepDefinitions extends BaseTest {

    private String apiUrl;
    private final EmployeesService employeesService = new EmployeesService();

    @Given("the Employee API endpoint is {string}")
    public void setEmployeeApiEndpoint(String apiEndpoint) {
        this.apiUrl = BASE_URI + apiEndpoint;
    }

    @When("I send a GET request to the Employee API")
    public void sendGetRequest() {
        Response response = RestAssured.get(apiUrl);
        employeesService.setResponse(response);
    }

    @Then("the response status code should be {int}")
    public void verifyStatusCode(int expectedStatusCode) {
        employeesService.verifyStatusCode(expectedStatusCode);
    }

    @Then("the number of records should be {int}")
    public void verifyNumberOfRecords(int expectedRecordCount) {
        employeesService.verifyNumberOfRecords(expectedRecordCount);
    }

    @Then("the employee with salary {int} should have the name {string}")
    public void verifyEmployeeNameWithSalary(int salary, String expectedName) {
        employeesService.verifyEmployeeNameWithSalary(salary, expectedName);
    }
}
