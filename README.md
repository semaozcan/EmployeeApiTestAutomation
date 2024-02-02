# Employee Api Automation Project


This project is created to perform automation tests for the Employee API using the Rest Assured library.


-  Java 8 or above
- Maven
- Rest Assured
- Cucumber

## Test Scenarios

This project includes a basic test scenario that uses Rest Assured to verify the correct functionality of the Employee API.

### Scenario: Verify Employee API Response

1. **Set API Endpoint:**
   Specify that the API endpoint is "/employees".

    ```java
    given().baseUri("https://dummy.restapiexample.com/api/v1").basePath("/employees")
    ```

2. **Send GET Request:**
   Send a GET request to the Employee API.

    ```java
    when().get()
    ```

3. **Response Checks:**
    - Verify that the response status code is 200.
    - Check that the total number of records is 24.
    - Confirm that the employee with a salary of 313500 has the name "Haley Kennedy".

    ```java
    then()
         .statusCode(200)
         .body("size()", is(24))
         .body("find { it.salary == 313500 }.name", equalTo("Haley Kennedy"));
    ```

## How to Run

Open the terminal in the project's main directory and run the following command to execute the tests:

```bash
mvn test
```
*OR*
```sh
Open the [Employees.feature] in the project s main directory and run.
``` 

## How to check reports
![Screenshot 2024-02-02 at 15.45.43.png](..%2F..%2FDesktop%2FScreenshot%202024-02-02%20at%2015.45.43.png)

![Screenshot 2024-02-02 at 09.31.26.png](..%2F..%2FDesktop%2FScreenshot%202024-02-02%20at%2009.31.26.png)

After creation for the reports, you can reach from root directory. Example test results exist in root  directory.

```sh
Test Result 1 Test Results - Feature__Employees - 02.02.2024 - 15:31.html
Test Result 2 Test Results - Feature__Employees - 02.02.2024 - 15:48.html
``` 
