package utilities;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class Authentication {

    // public static void main(String[] args) {
    //     String guncelToken = generateToken(ConfigReader.getProperty("adminUsername"), ConfigReader.getProperty("adminPassword"));
    //     System.out.println(guncelToken);
    // }

    public static String generateToken() {
        String username = "healthprojectteam56";
        String password = "Teamproject.56";
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
