package apiTests;

import io.restassured.RestAssured;
import io.restassured.module.jsv.JsonSchemaValidator;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Map;

public class FakerApiTest {
    @Test
    public void testFakerApiWithQuantity20() {
        RestAssured.baseURI = "https://fakerapi.it/api/v1/companies";

        Response response = RestAssured.given()
                .queryParam("_quantity", 20)
                .get();

        // Verify status code 200
        Assert.assertEquals(response.getStatusCode(), 200, "Expected status code to be 200");

        // Verify that the amount of data returned is valid
        int actualCount = response.jsonPath().getList("data").size();
        Assert.assertEquals(actualCount, 20, "Expected 20 companies but got " + actualCount);
    }

    @Test
    public void testFakerApiWithQuantity5() {
        RestAssured.baseURI = "https://fakerapi.it/api/v1/companies";

        Response response = RestAssured.given()
                .queryParam("_quantity", 5)
                .get();

        // Verify status code 200
        Assert.assertEquals(response.getStatusCode(), 200, "Expected status code to be 200");

        // Verify that the amount of data returned is valid
        int actualCount = response.jsonPath().getList("data").size();
        Assert.assertEquals(actualCount, 5, "Expected 5 companies but got " + actualCount);
    }

    @Test
    public void testFakerApiWithQuantity1() {
        RestAssured.baseURI = "https://fakerapi.it/api/v1/companies";

        Response response = RestAssured.given()
                .queryParam("_quantity", 1)
                .get();

        // Verify status code 200
        Assert.assertEquals(response.getStatusCode(), 200, "Expected status code to be 200");

        // Verify that the amount of data returned is valid
        int actualCount = response.jsonPath().getList("data").size();
        Assert.assertEquals(actualCount, 1, "Expected 1 company but got " + actualCount);
    }

    @Test
    public void verifyCompaniesEndpoint() {
        RestAssured.baseURI = "https://fakerapi.it/api/v1/companies";

        Response response = RestAssured.given()
                .queryParam("_quantity", 5) // Request 5 companies
                .get();

        // Verify status code 200
        Assert.assertEquals(response.getStatusCode(), 200, "Status code is not 200");

        // Map the response
        List<Map<String, Object>> companies = response.jsonPath().getList("data");

        // 1. Verify the “id” is must be not null, please use loop function for verify the all data from the endpoint
        for (Map<String, Object> company : companies) {
            Integer companyId = (Integer) company.get("id");
            Assert.assertNotNull(companyId, "The 'id' field should not be null");
        }

        // 2. Verify JSON Schema
        String schemaPath = "schemas/companies_schema.json";
        response.then().assertThat().body(JsonSchemaValidator.matchesJsonSchemaInClasspath(schemaPath));
    }
}
