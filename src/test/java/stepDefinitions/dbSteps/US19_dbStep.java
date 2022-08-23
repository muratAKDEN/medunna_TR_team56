package stepDefinitions.dbSteps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import utilities.DBUtils;

import java.util.List;

public class US19_dbStep {
    @Given("ft DB ile Medunna veri tabanina baglanir")
    public void ftDBIleMedunnaVeriTabaninaBaglanir() {
        DBUtils.getConnection();
    }

    @Then("Personel Kimliğini veritabanı kimliğiyle doğrular")
    public void personelKimliğiniVeritabanıKimliğiyleDoğrular() {

    }

    @And("ft DB ile {string} tablosundaki {string} {int} olan staff in verilerini alir")
    public void ftDBIleTablosundakiOlanStaffInVerileriniAlir(String staff, String id, int arg2) {
        String query= "select * from public.staff where id=205227";
        DBUtils.executeQuery(query);
        List<Object> staffList= DBUtils.getColumnData(query,id);
        System.out.println(staffList);
    }

    @Then("ft DB ile alinan datalari validate eder")
    public void ftDBIleAlinanDatalariValidateEder() {

    }
}
