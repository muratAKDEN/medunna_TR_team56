package stepDefinitions.apiSteps;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.java.en.*;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Assert;
import pojos.PatientsPojo;
import utilities.Authentication;
import utilities.ConfigReader;
import java.io.IOException;
import static io.restassured.RestAssured.given;


public class US15_apiStep {
    static RequestSpecification spec;
    static Response response;


    static PatientsPojo expectedData;
    public static void main(String[] args) throws JsonProcessingException {
        expectedData=new PatientsPojo();
        int expectedid=235754;
        expectedData.setId(expectedid);
        expectedData.setFirstName("Kamala");
        expectedData.setLastName("Kuhn");
        expectedData.setPhone("5555555555");
        expectedData.setEmail("deedee.kozey@gmail.com");
        spec = new RequestSpecBuilder().setBaseUri(ConfigReader.getProperty("medunnaUrl")).build();
        spec.pathParams("first", "api", "second", "patients","third",235754);

        String token = Authentication.generateToken();
        response = given().headers(
                "Authorization", "Bearer " + token,
                "Content-Type", ContentType.JSON,
                "Accept", ContentType.JSON
        ).spec(spec).when().get("/{first}/{second}/{third}");  //https://medunna.com/api/patients?=size=5000

        response.prettyPrint();
        ObjectMapper mapper = new ObjectMapper();
        PatientsPojo actualData=mapper.readValue(response.asString(), PatientsPojo .class);
        Assert.assertEquals(expectedData.getEmail(), actualData.getEmail());
        Assert.assertEquals(expectedData.getFirstName(), actualData.getFirstName());
        Assert.assertEquals(expectedData.getLastName(), actualData.getLastName());
        Assert.assertEquals(expectedData.getPhone(), actualData.getPhone());



    }

    @Given("Kullanici end point belirlerrr")

    //url olustur
    public void kullanici_end_point_belirlerrr() {
        spec = new RequestSpecBuilder().setBaseUri(ConfigReader.getProperty("medunnaUrl")).build();
        spec.pathParams("first", "api", "second", "patients","third",235754);


    }
    @Then("Kullanici expected datalari girer")
    public void kullanici_expected_datalari_girer() {

        expectedData=new PatientsPojo();
        int expectedid=235754;

        expectedData.setId(expectedid);
        expectedData.setFirstName("Kamala");
        expectedData.setLastName("Kuhn");
        expectedData.setPhone("5555555555");
        expectedData.setEmail("deedee.kozey@gmail.com");
     //   spec = new RequestSpecBuilder().setBaseUri(ConfigReader.getProperty("medunnaUrl")).build();
      //  spec.pathParams("first", "api", "second", "patients","third",235754);

    }

    @Given("Kullanici request gonderir ve response alir")
    public void kullanici_request_gonderir_ve_response_alir() {
        //  String token="eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJoZWFsdGhwcm9qZWN0dGVhbTU2IiwiYXV0aCI6IlJPTEVfQURNSU4iLCJleHAiOjE2NjA1NzMxMTB9.0rtf4OebybYzpO9zcaLJb_-8_c4_yOsBaxv6xCNQ1UXaJtl86AWXP4xARQklwSflbKP97JcQX4dKxsfKjyje4w";
        String token = Authentication.generateToken();

        response = given().headers(
                "Authorization", "Bearer " + token,
                "Content-Type", ContentType.JSON,
                "Accept", ContentType.JSON
        ).spec(spec).when().get("/{first}/{second}/{third}");  //https://medunna.com/api/patients/235754

        response.prettyPrint();

    }

    @Given("Kullanici status kodun ikiyuz oldugunu dogrularrr")
    public void kullanici_status_kodun_ikiyuz_oldugunu_dogrularr() {
        response.then().assertThat().statusCode(200);
        System.out.println("status code :" + response.statusCode());

    }

    @Given("Kullanici deserialization islemi yaparrr")
    public void kullanici_deserilization_islemi_yaparrr() throws IOException {

        ObjectMapper mapper = new ObjectMapper();
        PatientsPojo actualData=mapper.readValue(response.asString(), PatientsPojo .class);
        Assert.assertEquals(expectedData.getEmail(), actualData.getEmail());
        Assert.assertEquals(expectedData.getFirstName(), actualData.getFirstName());
        Assert.assertEquals(expectedData.getLastName(), actualData.getLastName());




    }
    }


