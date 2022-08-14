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
        String username="healthprojectteam56";
        String password="Teamproject.56";
        Map<String, Object> map = new HashMap<>();
        map.put("username", username);
        map.put("password", password);
        map.put("rememberme", true);

        String endPoint = "https://www.medunna.com/api/authenticate";

        Response response = given().contentType(ContentType.JSON).body(map).when().post(endPoint);

        JsonPath token = response.jsonPath();

        return token.getString("id_token");
    }
    public static String generateToken(){
        RequestSpecification spec;
        spec=new RequestSpecBuilder().setBaseUri(ConfigReader.getProperty("medunnaUrl")).build();
        spec.pathParams("first","api","second","authenticate");

        Map<String,Object>expectedData=new HashMap<>();
        expectedData.put("username","user-healthprojectteam56");
        expectedData.put("password","Teamproject.56");

        Response response=given().spec(spec).contentType(ContentType.JSON).body(expectedData).when().post("/{first}/{second}");
        response.prettyPrint();

        JsonPath jsonPath=response.jsonPath();


        return jsonPath.getString("id_token");

    }


}
