package stepDefinitions.dbSteps;

import io.cucumber.java.en.*;
import org.junit.Assert;

import java.util.List;

import static stepDefinitions.uiStep.US09_StepDefinitions.hastaToplamSayisi_UI;
import static utilities.DBUtils.*;

public class US09_dbStep {

    public static int hastaToplamSayisi_DB;

    public static List<Object> hastalistesi_DB;


    @Given("Kullanici medunna database e baglanir")
    public void kullanici_medunna_database_e_baglanir() {

        createConnection();
    }


    @Then("Kullanici database'den tum hasta bilgilerini alir")
    public void kullanici_database_den_tum_hasta_bilgilerini_alir() {

        hastalistesi_DB = getColumnData("select * from in_patient", "id");

        hastaToplamSayisi_DB = hastalistesi_DB.size();

        System.out.println("Tüm kayıtlı DB Hasta  Sayısı : " + hastaToplamSayisi_DB);

        closeConnection();



    }



}
