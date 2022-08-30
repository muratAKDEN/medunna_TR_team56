package stepDefinitions.dbSteps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import utilities.DBUtils;
import utilities.Driver;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class US19_dbStep {

    List<Map<String, Object>> resultList;

    @Given("Admin sataff icin DB ile baglanti kurar")
    public void admin_sataff_icin_db_ile_baglanti_kurar() {
        DBUtils.createConnection();
    }

    @Given("Admin \"{int}\"ile staff sorgulama yapar")
    public void admin_ile_staff_sorgulama_yapar(Integer id) {
        String query = "select * from public.staff where id=" + id;
        resultList = DBUtils.getQueryResultMap(query);
        System.out.println(query);

    }

    @Given("Admin {string} staff bilgisini validate eder")
    public void admin_staff_bilgisini_validate_eder(String last_name) {
        System.out.println(resultList.get(0));
        Assert.assertEquals(last_name,resultList.get(0).get("last_name"));
    }

    @Given("ft DB baglantisini kapatir")
    public void ft_db_baglantisini_kapatir() {
        DBUtils.closeConnection();
    }


}
