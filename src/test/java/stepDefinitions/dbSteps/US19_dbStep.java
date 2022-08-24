package stepDefinitions.dbSteps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import utilities.DBUtils;

import java.util.ArrayList;
import java.util.List;

public class US19_dbStep {
    String query;
    List<Object> actualData;
    String Staff;
    String Id;
    int idNum;

    @Given("ft DB ile Medunna veri tabanina baglanir")
    public void ft_db_ile_medunna_veri_tabanina_baglanir() {
        DBUtils.getConnection();
    }

    @Given("ft DB ile {string} tablosundaki {string} {int} olan personelin verilerini alir")
    public void ft_db_ile_tablosundaki_olan_personelin_verilerini_alir(String staff, String id, Integer num) {
        query = "select * from " + staff + " where " + id + "=" + num + "";
        DBUtils.executeQuery(query);
    }

    @Given("ft DB ile personelin verileri okur")
    public void ft_db_ile_personelin_verileri_okur() {
        System.out.println(DBUtils.getColumnNames(query));
        actualData = DBUtils.getRowList(query);
        System.out.println(actualData);

    }

    @Then("ft DB ile alinan datalari validate eder")
    public void ft_db_ile_alinan_datalari_validate_eder() {
        List<Object> expectedData = new ArrayList<>();
        expectedData.add(0, "217647");
        expectedData.add(1, "huseyin");
        expectedData.add(2, "staff");
        expectedData.add(3, "2022-08-23 21:00:00.0");
        expectedData.add(4, "532-555-2222");
        expectedData.add(5, "MALE");
        expectedData.add(6, "Apositive");

        //System.out.println(expectedData);

        for (int i = 0; i < expectedData.size(); i++) {
            Assert.assertEquals(expectedData.get(i), actualData.get(i).toString());
        }

    }

    @And("ft veritabanı bağlantısını kapat")
    public void ftVeritabanıBağlantısınıKapat() {
        DBUtils.closeConnection();
    }


    @When("ft DB ile {string} tablosundaki butun verilerini alir")
    public void ftDBIleTablosundakiButunVerileriniAlir(String staff) {
        query = "select * from " + staff;
        DBUtils.executeQuery(query);
    }

    @And("ft DB tüm veri kayıtlarını ilgili dosyalara kaydeder")
    public void ftDBTümVeriKayıtlarınıIlgiliDosyalaraKaydeder() {
        //WriteToTxt.savePatientData(idRow)
    }
}
