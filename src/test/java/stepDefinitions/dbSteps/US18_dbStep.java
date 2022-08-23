package stepDefinitions.dbSteps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import utilities.DBUtils;

import java.util.List;

public class US18_dbStep {
    @Given("kullanici DB ile Medunna veri tabanina baglanir")
    public void kullaniciDBIleMedunnaVeriTabaninaBaglanir() {
        DBUtils.getConnection();
    }

    @And("kullanici DB ile {string} tablosundaki {string} {int} olan doktorun verilerini alir")
    public void kullaniciDBIleTablosundakiOlanDoktorunVerileriniAlir(String physician, String id, int num) {
        String query= "select * from public.physician where id=164031";
        DBUtils.executeQuery(query);
       List<Object> physicianList= DBUtils.getColumnData(query,id);
        System.out.println(physicianList);
    }
}
