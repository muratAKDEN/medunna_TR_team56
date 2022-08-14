package utilities;


import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;


import java.util.HashMap;
import java.util.Map;

import static hooks.Hooks.spec;
import static io.restassured.RestAssured.given;

public class Authentication {

    public static String generateToken(){

        spec.pathParams("first", "api", "second", "authenticate");
        //Set the expected data
        Map<String, Object> expectedData = new HashMap<>();
        expectedData.put("username","user-healthprojectteam56" );
        expectedData.put("password", "Teamproject.56");
        expectedData.put("rememberMe","true" );
        //Send the Post request and get the data
        Response response = given().spec(spec).contentType(ContentType.JSON).
                body(expectedData).when().post("/{first}/{second}");
        response.prettyPrint();
        JsonPath json = response.jsonPath();
        return json.getString("id_token");
    }
    public static String generateToken(String username, String password) {

        Map<String, Object> map = new HashMap<>();
        map.put("username", username);
        map.put("password", password);
        map.put("rememberme", true);

        String endPoint = "https://www.medunna.com/api/authenticate";

        Response response = given().contentType(ContentType.JSON).body(map).when().post(endPoint);

        JsonPath token = response.jsonPath();

        return token.getString("id_token");

    }

}
