package com.employees.services;

import io.restassured.response.Response;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class EmployeesService extends BaseTest {
    private Response response;

    public void setResponse(Response response) {
        this.response = response;
    }

    public void verifyStatusCode(int expectedStatusCode) {
        response.then().statusCode(expectedStatusCode);
    }

    public void verifyNumberOfRecords(int expectedRecordCount) {
        int actualRecordCount = response.jsonPath().getList("data").size();
        assertThat(actualRecordCount, is(equalTo(expectedRecordCount)));
    }

    public void verifyEmployeeNameWithSalary(int salary, String expectedName) {
        String actualName = response.jsonPath().getString
                ("data.find { it.employee_salary == " + salary + " }.employee_name");
        assertThat(actualName, is(equalTo(expectedName)));
    }
}
