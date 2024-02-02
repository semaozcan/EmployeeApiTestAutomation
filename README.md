# Employee Api Automation Project


This project is created to perform automation tests for the Employee API using the Rest Assured library.


-  Java 8 or above
- Maven
- Rest Assured
- Gherkin
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
<img width="1154" alt="Screenshot 2024-02-02 at 15 45 43" src="https://github.com/semaozcanys/EmployeeApiTestAutomation/assets/97299054/25ef6a7c-b143-4b9f-b808-1960fdddf97a">

<img width="1184" alt="Screenshot 2024-02-02 at 09 31 26" src="https://github.com/semaozcanys/EmployeeApiTestAutomation/assets/97299054/b1ceb342-8645-4ede-b784-7eff9fbc9dd5">


After creation for the reports, you can reach from root directory. Example test results exist in root  directory.

```sh
Test Result 1 Test Results - Feature__Employees - 02.02.2024 - 15:31.html
Test Result 2 Test Results - Feature__Employees - 02.02.2024 - 15:48.html
``` 
