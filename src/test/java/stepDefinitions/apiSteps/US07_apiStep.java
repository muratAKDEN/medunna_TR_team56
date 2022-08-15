package stepDefinitions.apiSteps;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import utilities.ConfigReader;

public class US07_apiStep {

    static RequestSpecification spec;
    static Response response;



    @Given("Kullanici appointments icin endpoint belirler")
    public void kullanici_appointments_icin_endpoint_belirler() {
        spec=new RequestSpecBuilder().setBaseUri(ConfigReader.getProperty("baseUrl")).build();
        spec.pathParams("first","api","second","appointments").queryParams("page",1,"size",5000);

    }


    /*@Given("Kullanici send request ve get response yapar")
    public void kullanici_send_request_get_response_yapar() {
        String token= Authentication.generateToken();
            response=given().headers("Authorization",
                    "Bearer "+token,
                    "Content-Type", ContentType.JSON,
                    "Accept",ContentType.JSON).
                    spec(spec).when().get("/{first}/{second}");

            response.prettyPrint();

    }*/

    @Then("Kullanici status code ikiYuz olarak dogrular")
    public void kullanici_status_code_ikiYuz_olarak_dogrular() {
        response.then().assertThat().statusCode(200);
        System.out.println("status code :" + response.statusCode());


    }



}
