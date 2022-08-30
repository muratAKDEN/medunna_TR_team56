package stepDefinitions.apiSteps;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.java.en.*;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Assert;
import pojos.US19_StaffPojo;
import utilities.Authentication;
import utilities.ConfigReader;
import java.io.IOException;
import static io.restassured.RestAssured.given;


public class US19_ApiStep {
    static RequestSpecification spec;
    static Response response;
    static US19_StaffPojo expectedData;


    @Given("ft end point belirlerrr")

    //url olustur
    public void ft_end_point_belirlerrr() {
        spec = new RequestSpecBuilder().
                setBaseUri(ConfigReader.getProperty("medunnaUrl")).build();

        spec.pathParams("param1", "api", "param2", "staff","param3", 214870);

    }

    @Given("ft request gonderirrr")
    public void ft_request_gonderirrr() {
        String token= Authentication.generateToken();
        response = given()
                .headers("Authorization", "Bearer " + token,
                        "Content-Type",
                        ContentType.JSON,
                        "Accept",
                        ContentType.JSON
                ).spec(spec)
                .when()
                .get("/{param1}/{param2}/{param3}");

        response.prettyPrint();

    }

    @Given("ft status kodun ikiyuz oldugunu dogrularrr")
    public void ft_status_kodun_ikiyuz_oldugunu_dogrularr() {
        response.then().assertThat().statusCode(200);
        System.out.println("status code :" + response.statusCode());

    }

    @Given("ft deserialization islemi yaparrr")
    public void ft_deserilization_islemi_yaparrr() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        US19_StaffPojo actualData= mapper.readValue(response.asString(), US19_StaffPojo.class);
        Assert.assertEquals(expectedData.getId(), actualData.getId());
        Assert.assertEquals(expectedData.getFirstName(), actualData.getFirstName());
        Assert.assertEquals(expectedData.getLastName(), actualData.getLastName());
        Assert.assertEquals(expectedData.getPhone(), actualData.getPhone());
        //Assert.assertEquals(ssn,staffPojo.getUser().getSsn());
        //Assert.assertEquals(email,staffPojo.getUser().getEmail());


    }
    @Given("ft expected datalari girer")
    public void ftexpecteddatalarigirer() {
        expectedData=new US19_StaffPojo();
        int expectedid=214870;

        expectedData.setId(expectedid);
        expectedData.setFirstName("Katharine");
        expectedData.setLastName("Ryan");
        expectedData.setPhone("541-789-5632");
    }

}
