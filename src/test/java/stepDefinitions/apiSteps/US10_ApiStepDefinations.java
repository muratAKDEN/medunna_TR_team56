package stepDefinitions.apiSteps;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Assert;
import pojos.US10_AppointmentPojo;
import pojos.US10_PhysicianPojo;
import utilities.Authentication;
import utilities.ConfigReader;


import java.util.List;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.*;
import static utilities.Authentication.generateToken;

public class US10_ApiStepDefinations {
    static RequestSpecification spec;

    Response response;
    US10_AppointmentPojo  appointmentPojo;
    US10_PhysicianPojo physicianPojo;
    String token;
    String endPoint = ConfigReader.getProperty("US_010_appointmentsListApi");

    // https://medunna.com/api/appointments?=size=10000


    @Given("user set the URL")
    public void user_set_the_URL() {
        spec = new RequestSpecBuilder().setBaseUri(ConfigReader.getProperty("medunnaUrl")).build();
        spec.pathParams("first","api","second","appointments").
                queryParam("size",10000);
    }

    @Then("user sends GET request for appointments")
    public void user_sends_get_request_for_appointments() {
        String token = Authentication.generateToken();
        response= given().headers(
                "Authorization","Bearer "+ token,
                "Content-Type", ContentType.JSON,
                "Accept",ContentType.JSON
        ).spec(spec).when().get("/{first}/{second}"); // https://medunna.com/api/appointments?=size=10000
        response.prettyPrint();
    }

    @When("user receives response with status code two hundred")
    public void user_receives_response_with_status_code_two_hundred() {
        response.then().assertThat().statusCode(200);
        System.out.println("status code :" + response.statusCode());
    }

    @Then("user verifies that response contains physicianID")
    public void user_verifies_that_response_contains_physician_id() {

        JsonPath jsonPath = response.jsonPath();

        List<Integer> physicianId = jsonPath.getList("physician.id");
        List<Integer> appointmentId = jsonPath.getList("id");

        System.out.println("Number of appointments : " +appointmentId.size());
        System.out.println("Number of physicians : " +physicianId.size());

        assertTrue(physicianId.contains(94228));
        assertTrue(appointmentId.contains(20739));

    }
}
