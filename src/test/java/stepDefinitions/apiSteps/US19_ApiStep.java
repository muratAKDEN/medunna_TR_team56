package stepDefinitions.apiSteps;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;;
import org.junit.Assert;
import pojos.US19_StaffPojo;
import utilities.Authentication;
import utilities.ConfigReader;

import static io.restassured.RestAssured.given;
import static utilities.Authentication.generateToken;


public class US19_ApiStep {
    RequestSpecification spec;
    Response response;
    US19_StaffPojo staffPojo;

    @Given("Kullanici {string} icin get request yapar")
    public void kullaniciIcinGetRequestYapar(String id) {
        spec = new RequestSpecBuilder().
                setBaseUri(ConfigReader.getProperty("staffEnd")).build();

        spec.pathParams("param1", "api", "param2", "staff", "param3", "id");

        response = given().spec(spec)
                .headers("Authorization", "Bearer " + Authentication.generateToken(),
                        "Content-Type",
                        ContentType.JSON,
                        "Accept",
                        ContentType.JSON
                ).spec(spec)
                .when()
                .get("/{param1}/{param2}/{param3}");

        response.prettyPrint();

    }

    @And("ft staff bilgilerini kaydeder")
    public void ftStaffBilgileriniKaydeder() throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        staffPojo = mapper.readValue(response.asString(), US19_StaffPojo.class);

        //WriteToTxt.saveAppointData(staffPojo);
    }

    @And("ft gelen datayi validate eder {string} {string} {string} {string} {string} {string}")
    public void ftGelenDatayiValidateEder(int id, String firstName, String lastName, String phone, String ssn, String email) {
        Assert.assertEquals(id, staffPojo.getId());
        Assert.assertEquals(firstName, staffPojo.getFirstName());
        Assert.assertEquals(lastName, staffPojo.getLastName());
        Assert.assertEquals(phone, staffPojo.getPhone());
        //Assert.assertEquals(ssn,staffPojo.getUser().);
        //Assert.assertEquals(email,staffPojo.getUser().);

    }
}
