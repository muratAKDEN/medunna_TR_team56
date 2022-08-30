package stepDefinitions.dbSteps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import utilities.DBUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static utilities.DBUtils.getColumnData;
import static utilities.DBUtils.getQueryResultMap;


public class US27_dbStep {

    public static List<Object> namelistesi_DB;
    public static List<Object> subjectlistesi_DB;
    public static List<Object> emaillistesi_DB;
    public static List<Object> messagelistesi_DB;
    public static List<Map<String, Object>> tamMessageListesi_DB;
    String query;

    @Given("Admin medunna database'e baglanir")
    public void admin_medunna_database_e_baglanir() {
        DBUtils.getConnection();

    }

    @When("Admin database'den tum mesajlari alir")
    public void admin_database_den_tum_mesajlari_alir() {
        query = "select * from public.cmessage";

        //tamMessageListesi_DB = getQueryResultMap(query);
        messagelistesi_DB = getColumnData(query, "message");
        namelistesi_DB = getColumnData(query, "name");
        emaillistesi_DB = getColumnData(query, "email");
        subjectlistesi_DB = getColumnData(query, "subject");

     // System.out.println(messagelistesi_DB);
     // System.out.println(namelistesi_DB);
     // System.out.println(emaillistesi_DB);
     // System.out.println(subjectlistesi_DB);

    }

    @Then("Admin alinan mesajlari dogrular")
    public void admin_alinan_mesajlari_dogrular() {

        List<Object> expectedNames = new ArrayList<>();
        expectedNames.add("Furkan");
        List<Object> expectedSubject = new ArrayList<>();
        expectedSubject.add("Proje Odevim");
        List<Object> expectedEmail = new ArrayList<>();
        expectedEmail.add("enes@gmail.com");
        List<Object> expectedMessage = new ArrayList<>();
        expectedMessage.add("Proje odevimi bitirdim");

        Assert.assertTrue(namelistesi_DB.containsAll(expectedNames));
        Assert.assertTrue(messagelistesi_DB.containsAll(expectedMessage));
        Assert.assertTrue(emaillistesi_DB.containsAll(expectedEmail));
        Assert.assertTrue(subjectlistesi_DB.containsAll(expectedSubject));


    }




}


