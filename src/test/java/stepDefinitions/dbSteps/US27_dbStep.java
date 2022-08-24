package stepDefinitions.dbSteps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import utilities.ConfigReader;
import utilities.DBUtils;

import javax.management.Query;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import static utilities.DBUtils.createConnection;
import static utilities.DBUtils.getColumnData;

public class US27_dbStep {

    public static int toplamMesajSayisi_DB;

    public static List<Object> namelistesi_DB;
    public static List<Object> subjectlistesi_DB;
    public static List<Object> emaillistesi_DB;
    public static List<Object> messagelistesi_DB;
    public static Connection connection;

    @Given("Admin medunna database'e baglanir")
    public void admin_medunna_database_e_baglanir() {
        String url= ConfigReader.getProperty("db_url");
        String username=ConfigReader.getProperty("db_username");
        String password=ConfigReader.getProperty("db_password");
        try {
            connection = DriverManager.getConnection(url, username, password);
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    @When("Admin database'den tum mesajlari alir")
    public void admin_database_den_tum_mesajlari_alir() {

        namelistesi_DB = getColumnData("select * from public.cmessages", "name");
        subjectlistesi_DB = getColumnData("select * from public.cmessages", "subject");
        emaillistesi_DB = getColumnData("select * from public.cmessages", "email");
        messagelistesi_DB = getColumnData("select * from public.cmessages", "message");
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
        Assert.assertTrue(emaillistesi_DB.containsAll(expectedEmail));
        Assert.assertTrue(subjectlistesi_DB.containsAll(expectedSubject));
        Assert.assertTrue(messagelistesi_DB.containsAll(expectedMessage));

    }

}
