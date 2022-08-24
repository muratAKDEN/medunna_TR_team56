package stepDefinitions.dbSteps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import utilities.DBUtils;

import java.util.ArrayList;
import java.util.List;

public class US18_dbStep {
    String query ;
    List<Object> actualData;
    String Physician;
    String Id;
    int idNum;

    @Given("kullanici DB ile Medunna veri tabanina baglanir")
    public void kullaniciDBIleMedunnaVeriTabaninaBaglanir() {
        DBUtils.getConnection();
    }

    @And("kullanici DB ile {string} tablosundaki {string} {int} olan doktorun verilerini alir")
    public void kullaniciDBIleTablosundakiOlanDoktorunVerileriniAlir(String physician, String id, int num) {
        Physician=physician; Id=id; idNum=num;
        query="select * from "+physician+" where "+id+"="+num+"";
        DBUtils.executeQuery(query);

    }

    @And("kullanici DB ile doktorun verileri okur")
    public void kullaniciDBIleDoktorunVerileriOkur() {
       System.out.println(DBUtils.getColumnNames(query));
       actualData = DBUtils.getRowList(query);
       System.out.println(actualData);

    }

    @Then("kullanici DB ile alinan datalari validate eder")
    public void kullaniciDBIleAlinanDatalariValidateEder() {
        List<Object> expectedData = new ArrayList<>();
        expectedData.add(0, "164031");
        expectedData.add(1, "DoktorNazli");
        expectedData.add(2, "k");
        expectedData.add(3, "1980-08-09 21:00:00.0");
        expectedData.add(4,"555-555-5555");
        expectedData.add(5,"MALE");
        expectedData.add(6,"Apositive");

        //System.out.println(expectedData);

        for (int i = 0; i < expectedData.size(); i++) {
            Assert.assertEquals(expectedData.get(i), actualData.get(i).toString());

        }
    }
}
