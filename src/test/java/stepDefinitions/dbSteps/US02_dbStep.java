package stepDefinitions.dbSteps;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import utilities.DBUtils;

import java.util.List;

public class US02_dbStep { @Given("Kullanici connection olusturur")
public void kullanici_connection_olusturur() {
    DBUtils.createConnection();
}
    @Given("Kullanici email sutunundaki verileri alir ve dogrular")
    public void kullanici_email_sutunundaki_verileri_alir() {
        List<Object> list = DBUtils.getColumnData("select * from jhi_user","email" );
        System.out.println(list);
        Assert.assertTrue(list.contains("Madagascar"));




    }
}
