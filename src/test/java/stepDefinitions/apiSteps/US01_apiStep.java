package stepDefinitions.apiSteps;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Assert;
import pojos.US01_pojo;
import utilities.Authentication;
import utilities.ConfigReader;

import java.io.IOException;

import static io.restassured.RestAssured.given;


public class US01_apiStep {
    static RequestSpecification spec;
    static Response response;
    static US01_pojo registrant =new US01_pojo();

    @Given("Kullanici tum kayit edilenler icin end point belirler")

 //url olustur
    public void kullanici_tum_kayit_edilenler_icin_end_point_belirler() {
        spec = new RequestSpecBuilder().setBaseUri(ConfigReader.getProperty("medunnaUrl")).build();
        spec.pathParams("first","api","second","users").
                queryParams("page",1,"size",5000);

    }
    @Given("Kullanici request gonderir")
    public void kullanici_request_gonderir() {
    //  String token="eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJoZWFsdGhwcm9qZWN0dGVhbTU2IiwiYXV0aCI6IlJPTEVfQURNSU4iLCJleHAiOjE2NjA1NzMxMTB9.0rtf4OebybYzpO9zcaLJb_-8_c4_yOsBaxv6xCNQ1UXaJtl86AWXP4xARQklwSflbKP97JcQX4dKxsfKjyje4w";
       String token =Authentication.generateToken();

        response= given().headers(
              "Authorization","Bearer "+ token,
                "Content-Type", ContentType.JSON,
                "Accept",ContentType.JSON
        ).spec(spec).when().get("/{first}/{second}");  //https://medunna.com/api/users?page=1&size=5000

          response.prettyPrint();

    }
    @Given("Kullanici status kodun ikiyuz oldugunu dogrular")
    public void kullanici_status_kodun_ikiyuz_oldugunu_dogrular() {
    response.then().assertThat().statusCode(200);
    System.out.println("status code :" + response.statusCode());

    }
    @Given("Kullanici tum kayit edilenlerin sayisinin beklenen sonucla ayni olduğunu dogrular")
    public void kullanici_tum_kayit_edilenlerin_sayisinin_beklenen_sonucla_ayni_oldugunu_dogrular() {

    }
    @Given("Kullanici  bilgileri dogrularr")
    public void kullanici_bilgileri_dogrularr() throws IOException {

        ObjectMapper mapper = new ObjectMapper();
        US01_pojo actualData=mapper.readValue(response.asString(), US01_pojo .class);
        Assert.assertEquals(registrant.getEmail(), actualData.getEmail());
        Assert.assertEquals(registrant.getFirstName(), actualData.getFirstName());
        Assert.assertEquals(registrant.getLastName(), actualData.getLastName());
        Assert.assertEquals(registrant.getLogin(), actualData.getLogin());
        Assert.assertEquals(registrant.getSsn(), actualData.getSsn());




    }
    //////////////////////////////////////////////////////////
    @Then("Kullanici expected datalari girerr")
    public void kullanici_expected_datalari_girerr() {
        Faker faker = new Faker();

        registrant.setEmail (faker.internet().emailAddress());
        registrant.setFirstName (faker.name().firstName());
        registrant.setLastName (faker.name().lastName());
        registrant.setLogin(faker.name().username());
        registrant.setSsn (faker.idNumber().ssnValid());
        registrant.setPassword (faker.internet().password(7,16,true,true,true));

    }


    @When("Kullanici request gonderir ve response alirr")
    public void kullanici_request_gonderir_ve_response_alirr() {
response= given().spec(spec).contentType(ContentType.JSON).body(registrant).when().post("/{first}/{second}");


    }
    @Then("Kullanici API icin Url set ederr")
    public void kullanici_apı_icin_url_set_ederr() {
        spec = new RequestSpecBuilder().setBaseUri(ConfigReader.getProperty("medunnaUrl")).build();
        spec.pathParams("first","api","second","register");
        }
    }


