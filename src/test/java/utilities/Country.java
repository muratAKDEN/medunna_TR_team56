package utilities;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import pojos.CountryPostPut;

import static io.restassured.RestAssured.given;
import static utilities.Authentication.generateToken;

public class Country {

        public static Response postRequest(String endPoint, CountryPostPut data) {
            Response response = given().headers(
                    "Authorization",
                    "Bearer " + generateToken(),
                    "Content-Type",
                    ContentType.JSON,
                    "Accept",
                    ContentType.JSON).body(data).contentType(ContentType.JSON).when().post(endPoint);
            return response;
        }
        public static Response putRequest(String endPoint, CountryPostPut data) {
            Response response = given().headers(
                    "Authorization",
                    "Bearer " + generateToken(),
                    "Content-Type",
                    ContentType.JSON,
                    "Accept",
                    ContentType.JSON).body(data).contentType(ContentType.JSON).when().put(endPoint);
            return response;
        }
    }


