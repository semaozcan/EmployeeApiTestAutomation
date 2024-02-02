package com.employees.services;

import io.restassured.RestAssured;

public class BaseTest {
    protected static final String BASE_URI = "https://dummy.restapiexample.com/api/v1";

    static {
        RestAssured.baseURI = BASE_URI;
    }
}
