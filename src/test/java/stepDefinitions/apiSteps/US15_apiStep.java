package stepDefinitions.apiSteps;


import io.cucumber.java.en.*;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Assert;

import utilities.Authentication;
import utilities.ConfigReader;

import java.io.IOException;
import java.util.List;

import static io.restassured.RestAssured.given;

public class US15_apiStep {
    static RequestSpecification spec;
    static Response response;
    public static List<String> ssnListe;
    int toplamHastaSayisi;
    JsonPath jsonPath;

    @Given("Kullanici end point belirlerrr")

    //url olustur
    public void kullanici_end_point_belirlerrr() {
        spec = new RequestSpecBuilder().setBaseUri(ConfigReader.getProperty("medunnaUrl")).build();
        spec.pathParams("first", "api", "second", "patients").
                queryParam("size", 100);

    }

    @Given("Kullanici request gonderirrr")
    public void kullanici_request_gonderirrr() {
        //  String token="eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJoZWFsdGhwcm9qZWN0dGVhbTU2IiwiYXV0aCI6IlJPTEVfQURNSU4iLCJleHAiOjE2NjA1NzMxMTB9.0rtf4OebybYzpO9zcaLJb_-8_c4_yOsBaxv6xCNQ1UXaJtl86AWXP4xARQklwSflbKP97JcQX4dKxsfKjyje4w";
        String token = Authentication.generateToken();

        response = given().headers(
                "Authorization", "Bearer " + token,
                "Content-Type", ContentType.JSON,
                "Accept", ContentType.JSON
        ).spec(spec).when().get("/{first}/{second}");  //https://medunna.com/api/patients?=size=5000

        response.prettyPrint();

    }

    @Given("Kullanici status kodun ikiyuz oldugunu dogrularrr")
    public void kullanici_status_kodun_ikiyuz_oldugunu_dogrularr() {
        response.then().assertThat().statusCode(200);
        System.out.println("status code :" + response.statusCode());

    }

    @Given("Kullanici deserialization islemi yaparrr")
    public void kullanici_deserilization_islemi_yaparrr() throws IOException {

        JsonPath jsonPath = response.jsonPath();
        ssnListe = jsonPath.getList("ssn");
        toplamHastaSayisi = ssnListe.size();
        System.out.println("Tüm kayıtlı API Hasta  Sayısı : "+toplamHastaSayisi);

    }

    }



