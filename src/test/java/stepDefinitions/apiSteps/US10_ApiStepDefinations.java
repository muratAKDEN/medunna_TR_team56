package stepDefinitions.apiSteps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import utilities.Authentication;

import java.util.List;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertTrue;

public class US10_ApiStepDefinations {

    static Response response;

    @Given("user set the URL")
    public void user_set_the_URL() {
        String url ="medunnaUrl";
    }

    @Then("user sends GET request for appointments")
    public void user_sends_get_request_for_appointments() {
        String token = Authentication.generateToken();
        response= given().headers(
                "Authorization","Bearer "+ token,
                "Content-Type", ContentType.JSON,
                "Accept",ContentType.JSON
        ).when().get("https://medunna.com/api/appointments?page=1&size=5000");
       //medunna.com/api/appointments/?page=1&size=5000
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
