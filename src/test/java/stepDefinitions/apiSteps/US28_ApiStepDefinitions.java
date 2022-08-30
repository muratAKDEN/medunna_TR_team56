package stepDefinitions.apiSteps;


    import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.codehaus.jackson.map.ObjectMapper;
import org.junit.Assert;
import pojos.Country;
import pojos.Patient;
import utilities.Authentication;
import utilities.Driver;

        import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

        import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

    public class US28_ApiStepDefinitions {

        Response response;
        Country country;
        Country countryPut=new Country();

        @Given("Kullanici country icin request gonderir ve response alir")
        public void kullanici_country_icin_request_gonderir_ve_response_alir() {

            String endpoint="https://medunna.com/api/countries/224234";


            response = given().headers(
                    "Authorization",
                    "Bearer " + Authentication.generateToken(),
                    "Content-Type",
                    ContentType.JSON,
                    "Accept",
                    ContentType.JSON).when().get(endpoint);

        }

        @Given("Kullanici statuscodeun {int} oldugunu dogrular")
        public void kullanici_statuscodeun_oldugunu_dogrular(Integer statuscode) {
            response.then().assertThat().statusCode(statuscode);
        }

        @Given("Kullanici gelen Json Country datalarini javaya donusturur")
        public void kullanici_gelen_json_country_datalarini_javaya_donusturur() throws IOException {
            ObjectMapper obj=new ObjectMapper();
            country = obj.readValue(response.asString(), Country.class);
        }

        @Given("Kullanici API ile gelen bilgileri dogrular")
        public void kullanici_apı_ile_gelen_bilgileri_dogrular() {
            String countryName="Bremen";
            assertEquals(countryName,country.getName());

        }


        //______Scenario:Kullanıcı, API kullanarak mevcut ülkeleri güncelleyebilmelir

        @Given("Admin mevcut countryi gunceller")
        public void adminMevcutCountryiGunceller() {

            countryPut.setName("Bremen");
            countryPut.setId(224234);
        }


        @Given("Admin country icin put request gonderir ve response alir")
        public void adminCountryIcinPutRequestGonderirVeResponseAlir() {
            String endpoint="https://medunna.com/api/countries";

            response = given().headers(
                    "Authorization",
                    "Bearer " + Authentication.generateToken(),
                    "Content-Type",
                    ContentType.JSON,
                    "Accept",
                    ContentType.JSON).contentType(ContentType.JSON).body(countryPut).when().put(endpoint);
            response.prettyPrint();
        }

        @And("Admin statuscodeun {int} oldugunu dogrular")
        public void adminStatuscodeunOldugunuDogrular(int statuscode) {
            response.then().assertThat().statusCode(statuscode);
        }


        @And("Admin API ile gelen bilgileri gunceller")
        public void adminAPIIleGelenBilgileriGunceller() throws IOException {
            ObjectMapper obj=new ObjectMapper();
            Country countryActualData=obj.readValue(response.asString(),Country.class);
            assertEquals(countryPut.getId(), countryActualData.getId());
            assertEquals(countryPut.getName(), countryActualData.getName());

            //2. yol
            JsonPath json=response.jsonPath();
            assertEquals(countryPut.getId(),json.getInt("id"));
            assertEquals(countryPut.getName(),json.getString("name"));
        }


    }

