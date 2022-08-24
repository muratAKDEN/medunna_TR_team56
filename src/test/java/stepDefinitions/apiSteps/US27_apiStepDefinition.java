package stepDefinitions.apiSteps;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import pojos.US27_Message;
import utilities.ConfigReader;


import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.hasItem;
import static org.junit.Assert.assertEquals;
import static hooks.Hooks.spec;
import static utilities.Authentication.generateToken;

public class US27_apiStepDefinition {

    US27_Message expectedData = new US27_Message();
    Response response;

    @Given("kullanici url'i hazirlar")
    public void kullanici_url_i_hazirlar() {
        //spec.params("first","api", "second", "c-messages");

    }

    @When("kullanici expected datayi hazirlar")
    public void kullanici_expected_datayi_hazirlar() {

        expectedData.setName("Furkan");
        expectedData.setEmail("enes@gmail.com");
        expectedData.setSubject("Proje Odevim");
        expectedData.setMessage("Proje odevimi bitirdim");
    }

    @When("kullanici post request gonderir ve response u kaydeder")
    public void kullanici_post_request_gonderir_ve_response_u_kaydeder() {
        response = given().headers("Authorization",
                        "Bearer " + generateToken(),
                        "Content-Type",
                        ContentType.JSON,
                        "Accept",
                        ContentType.JSON).
                body(expectedData).
                contentType(ContentType.JSON).
                when().post(ConfigReader.getProperty("endPointPost"));
        response.prettyPrint();
    }

    @Then("kullanici gerekli dogrulamayi yapar")
    public void kullanici_gerekli_dogrulamayi_yapar() {

        response.then().assertThat().statusCode(201);
        US27_Message actualData = response.as(US27_Message.class);

        assertEquals(expectedData.getName(), actualData.getName());
        assertEquals(expectedData.getEmail(), actualData.getEmail());
        assertEquals(expectedData.getSubject(), actualData.getSubject());
        assertEquals(expectedData.getMessage(), actualData.getMessage());
    }

    @When("kullanici get request gonderir ve response'u kaydeder")
    public void kullanici_get_request_gonderir_ve_response_u_kaydeder() {
        response = given().headers("Authorization",
                "Bearer " + generateToken(),
                "Content-Type",
                ContentType.JSON,
                "Accept",
                ContentType.JSON).when().get(ConfigReader.getProperty("endPointGet"));
        response.prettyPrint();
    }

    @Then("kullanici iletiyi okumak icin gerekli dogrulamayi yapar")
    public void kullanici_iletiyi_okumak_icin_gerekli_dogrulamayi_yapar() {
        response.then().assertThat().statusCode(200);
        US27_Message actualData = response.as(US27_Message.class);

        assertEquals(expectedData.getName(), actualData.getName());
        assertEquals(expectedData.getEmail(), actualData.getEmail());
        assertEquals(expectedData.getSubject(), actualData.getSubject());
        assertEquals(expectedData.getMessage(), actualData.getMessage());

      /*
        body("name",hasItem(expectedData.getName()),
                "email",hasItem(expectedData.getEmail()),
                        "subject",hasItem(expectedData.getSubject()),
                                "message",hasItem(expectedData.getMessage()));

       */
    }


}


