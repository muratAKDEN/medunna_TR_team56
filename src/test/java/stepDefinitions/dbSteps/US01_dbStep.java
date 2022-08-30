package stepDefinitions.dbSteps;

import io.cucumber.java.en.*;
import org.junit.Assert;
import utilities.DBUtils;

import java.util.List;

public class US01_dbStep {

    @Given("Kullanici SSN sutunundaki verileri alir ve dogrular")
    public void kullanici_ssn_sutunundaki_verileri_alir() {
        List<Object> list = DBUtils.getColumnData("select * from jhi_user","ssn" );
        System.out.println(list);
        Assert.assertTrue(list.contains("133-95-7133"));

    }
}