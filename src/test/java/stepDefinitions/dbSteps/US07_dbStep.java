package stepDefinitions.dbSteps;

import io.cucumber.java.en.*;
import org.junit.Assert;
import utilities.DBUtils;

import java.util.List;

public class US07_dbStep {


    @Given("Kullanici Medunna db ile baglanti kurar")
    public void kullaniciMedunnaDbIleBaglantiKurar() {

      DBUtils.getConnection();


    }


    @When("Kullanici gerekli sorgulamayi yaparak butun appointmentleri cagirir")
    public void kullaniciGerekliSorgulamayiYaparakButunAppointmentleriCagirir() {

        String query="select * from public.appointments";
        DBUtils.executeQuery(query);


        List<Object> idList=DBUtils.getColumnData(query,"id");

        System.out.println(idList);


    }

    @Then("Daha once olusturulan appointment id ile dogrulama yapar")
    public void dahaOnceOlusturulanAppointmentIdIleDogrulamaYapar() {


        String Query2="select * from public.appointment where public.appointment.id=159174";
        DBUtils.executeQuery(Query2);

        Assert.assertTrue(Query2.toString().contains("159174"));

    }

}
