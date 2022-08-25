package stepDefinitions.dbSteps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import utilities.DBUtils;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class US18_dbStep {
    String query ;
    List<Map<String,Object>> actualData;
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
        //System.out.println(DBUtils.getColumnData(query, "last_name")); sadece last_name degerlerini dondurur
        actualData=DBUtils.getQueryResultMap(query); //tum degerleri key value seklinde dondurur
        System.out.println(actualData);
        //System.out.println(DBUtils.getColumnNames(query));
       //actualData = DBUtils.getRowList(query);
       //System.out.println(actualData);

    }

    @Then("kullanici DB ile alinan datalari validate eder")
    public void kullaniciDBIleAlinanDatalariValidateEder() {
        Map<String,Object> expectedData=new HashMap<>();
        expectedData.put("gender","MALE");
        expectedData.put("first_name","DoktorNazli");
        expectedData.put("last_name","k");
        expectedData.put("id",Long.valueOf(164031));
        expectedData.put("phone","555-555-5555");
        expectedData.put("blood_group","Apositive");
        expectedData.put("speciality","ALLERGY_IMMUNOLOGY");
        expectedData.put("user_id",Long.valueOf(165908));
        expectedData.put("created_by","admin-nazli");


        Assert.assertEquals(expectedData.get("gender"),actualData.get(0).get("gender"));
        Assert.assertEquals(expectedData.get("first_name"),actualData.get(0).get("first_name"));
        Assert.assertEquals(expectedData.get("last_name"),actualData.get(0).get("last_name"));
        Assert.assertEquals(expectedData.get("id"),actualData.get(0).get("id"));
        Assert.assertEquals(expectedData.get("phone"),actualData.get(0).get("phone"));
        Assert.assertEquals(expectedData.get("blood_group"),actualData.get(0).get("blood_group"));
        Assert.assertEquals(expectedData.get("speciality"),actualData.get(0).get("speciality"));
        Assert.assertEquals(expectedData.get("user_id"),actualData.get(0).get("user_id"));
        Assert.assertEquals(expectedData.get("created_by"),actualData.get(0).get("created_by"));
    }
}
