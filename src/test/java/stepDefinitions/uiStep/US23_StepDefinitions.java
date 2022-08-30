package stepDefinitions.uiStep;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.US22_23_Pages;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static utilities.ReusableMethods.waitFor;

public class US23_StepDefinitions {

    US22_23_Pages invoice = new US22_23_Pages();
    JavascriptExecutor js;
    Faker fake;
    Actions action;
    static List<WebElement> patientWebElementIDList;
    static List<String> patientIDList;
    static String patientID;
    static List<WebElement> staffWebElementIDList;
    static List<String> staffIDList;
    static List<WebElement> doctorWebElementIDList;
    static List<String> doctorIDList;
    static List<WebElement> staffAppointmentListCreateInvoice;
    static List<String> staffInvoiceIDList;
    static Select select;
    //backround
    @Given("kullanici medunna anasayfasina gider")
    public void kullanici_medunna_anasayfasina_gider() {
        Driver.getDriver().get("https://www.medunna.com");
    }

    //TC001
    @Given("kullanici hasta rolu ile oturum acar")
    public void kullanici_hasta_rolu_ile_oturum_acar() {
        invoice.accountMenu.click();
        invoice.accountSignIn.click();
        invoice.usernameBox.sendKeys(ConfigReader.getProperty("patientUsername"));
        invoice.passwordBox.sendKeys(ConfigReader.getProperty("patientPassword"));
        invoice.submitSignIn.click();
    }
    @Then("kullanici hasta mypage acilir butonuna tiklar")
    public void kullanici_hasta_mypage_acilir_butonuna_tiklar() {
        invoice.patientMyPageButton.click();
    }
    @Then("kullanici make an appointment butonuna tiklar")
    public void kullanici_make_an_appointment_butonuna_tiklar() {
        invoice.patientMakeAnAppointmentButton.click();
    }
    @Then("kullanici randevu bilgilerini doldurur")
    public void kullanici_randevu_bilgilerini_doldurur() {
        LocalDateTime istenenTarih=LocalDateTime.now();
        istenenTarih=istenenTarih.plusDays(1);
        DateTimeFormatter formatliTarih = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String appointmentDate=istenenTarih.format(formatliTarih);
        invoice.patientPhoneTextBox.sendKeys("5321588992");
        invoice.patientDateTextBox.sendKeys(appointmentDate);
        waitFor(5);
    }
    @Then("kullanici send an appointment butonunu tiklar")
    public void kullanici_send_an_appointment_butonunu_tiklar() {
        invoice.patientSendRequestButton.click();
        waitFor(2);
        invoice.patientMyPageButton.click();
        waitFor(2);
        invoice.patientMyAppointmentButton.click();
        waitFor(2);
        patientWebElementIDList=Driver.getDriver().findElements(By.xpath("//tr//td[1]"));
        System.out.println(patientWebElementIDList);
        patientIDList=new ArrayList<>();
        waitFor(2);
        for (WebElement each:patientWebElementIDList
        ) {
            System.out.println(each.getText());
            if (each!=null) {
                patientIDList.add(each.getText());
            }
        }
        System.out.println(patientIDList);
        Collections.sort(patientIDList);
        System.out.println(patientIDList);
        patientID= patientIDList.get(patientIDList.size()-1);
        System.out.println(patientID);
    }


    //TC002
    @Given("kullanici staff rolu ile oturum acar")
    public void kullanici_staff_rolu_ile_oturum_acar() {
        invoice.accountMenu.click();
        invoice.accountSignIn.click();
        invoice.usernameBox.sendKeys(ConfigReader.getProperty("staffUser"));
        waitFor(2);
        invoice.passwordBox.sendKeys(ConfigReader.getProperty("password"));
        invoice.submitSignIn.click();
        waitFor(2);
    }
    @Then("kullanici staff mypage acilir butonuna tiklar")
    public void kullanici_staff_mypage_acilir_butonuna_tiklar() {
        invoice.staffMyPageButton.click();
        waitFor(2);
    }
    @Then("kullanici search patient butonuna tiklar")
    public void kullanici_search_patient_butonuna_tiklar() {
        invoice.staffSearchPatientButton.click();
        waitFor(2);
    }
    @Then("kullanici patient SSN bolumune {string} nolu SSN no girer")
    public void kullanici_patient_ssn_bolumune_nolu_ssn_no_girer(String SSN) {
        invoice.staffPatientSSNTextBox.sendKeys(SSN);
        waitFor(2);
    }
    @Then("kullanici show appointments butonuna tiklar")
    public void kullanici_show_appointments_butonuna_tiklar() {
        invoice.staffShowAppointmentsButton.click();
        waitFor(2);
    }
    @Then("kullanici alinan randevunun edit butonuna tiklar")
    public void kullanici_alinan_randevunun_edit_butonuna_tiklar() {
        js= (JavascriptExecutor) Driver.getDriver();
        staffWebElementIDList=Driver.getDriver().findElements(By.xpath("//tr//td[1]"));
        waitFor(2);
        staffIDList=new ArrayList<>();
        for (int i = 0; i < staffWebElementIDList.size()-1; i++) {
            staffIDList.add(staffWebElementIDList.get(i).getText());
        }
        waitFor(2);
        for (int i = 0; i <staffIDList.size()-1 ; i++) {
            if (staffIDList.get(i).equals(patientID)){
                WebElement staffAppointmentEditButton= Driver.getDriver().findElement(By.xpath("//tr["+(i+1)+"]//td[13]//a[@class='btn btn-warning btn-sm']"));
                js.executeScript("arguments[0].click();", staffAppointmentEditButton);

            }
        }
    }
    @Then("kullanici status bolumune pending secenegini secer")
    public void kullanici_status_bolumune_pending_secenegini_secer() {

        waitFor(2);
        LocalDateTime istenenTarih=LocalDateTime.now();
        istenenTarih=istenenTarih.plusDays(1);
        DateTimeFormatter formatliTarih = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String startDateTime=istenenTarih.format(formatliTarih);
        System.out.println(startDateTime);

        LocalDateTime istenenTarih1=LocalDateTime.now();
        istenenTarih1=istenenTarih1.plusDays(1);
        DateTimeFormatter formatliTarih1 = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String endDateTime=istenenTarih1.format(formatliTarih1);
        System.out.println(endDateTime);
        invoice.startDateTime.sendKeys(startDateTime);
        invoice.endDateTime.sendKeys(endDateTime);

        select=new Select(invoice.staffAppointmentStatusSelect);
        select.selectByVisibleText("PENDING");
        waitFor(2);

        LocalDateTime istenenSaatStart=LocalDateTime.now();
        istenenSaatStart=istenenSaatStart.plusDays(1);
        DateTimeFormatter formatliSaatStart = DateTimeFormatter.ofPattern("HH");
        String startHour=istenenSaatStart.format(formatliSaatStart);
        System.out.println(startHour);

        LocalDateTime istenenDakikaStart=LocalDateTime.now();
        istenenDakikaStart=istenenDakikaStart.plusDays(1).plusMinutes(5);
        DateTimeFormatter formatliDakikaStart = DateTimeFormatter.ofPattern("mm");
        String startMinute=istenenDakikaStart.format(formatliDakikaStart);
        System.out.println(startMinute);


        action=new Actions(Driver.getDriver());
        action.click(invoice.startDateTime).perform();
        action.sendKeys(Keys.ARROW_RIGHT,Keys.ARROW_RIGHT,Keys.ARROW_RIGHT,startHour,Keys.ARROW_RIGHT,startMinute).perform();
        waitFor(3);
        LocalDateTime istenenSaatEnd=LocalDateTime.now();
        istenenSaatEnd=istenenSaatEnd.plusDays(1);
        DateTimeFormatter formatliSaatEnd = DateTimeFormatter.ofPattern("HH");
        String endHour=istenenSaatEnd.format(formatliSaatEnd);
        System.out.println(endHour);

        LocalDateTime istenenDakikaEnd=LocalDateTime.now();
        istenenDakikaEnd=istenenDakikaEnd.plusDays(1).plusMinutes(10);
        DateTimeFormatter formatliDakikaEnd = DateTimeFormatter.ofPattern("mm");
        String endMinute=istenenDakikaEnd.format(formatliDakikaEnd);
        System.out.println(endMinute);

        action=new Actions(Driver.getDriver());
        action.click(invoice.endDateTime).perform();
        action.sendKeys(Keys.ARROW_RIGHT,Keys.ARROW_RIGHT,Keys.ARROW_RIGHT,endHour,Keys.ARROW_RIGHT,endMinute).perform();
        waitFor(3);
    }
    @Then("kullanici Physician bolumune {string} ID nolu doktor atamasini yapar")
    public void kullanici_physician_bolumune_id_nolu_doktor_atamasini_yapar(String appointmentID) {
        js= (JavascriptExecutor) Driver.getDriver();
        action=new Actions(Driver.getDriver());
        js.executeScript("arguments[0].scrollIntoView(true);", invoice.staffAppointmentDoctorSelect);
        //action.click(invoice.staffAppointmentDoctorSelect).perform();
        //action.click(invoice.staffAppointmentDoctorSelect).perform();
        //action.click(invoice.staffAppointmentDoctorSelect).perform();
        //action.click(invoice.staffAppointmentDoctorSelect).perform();
        //action.click(invoice.staffAppointmentDoctorSelect).perform();
        //action.click(invoice.staffAppointmentDoctorSelect).perform();

        ReusableMethods.waitForPageToLoad(30);
        select=new Select(invoice.staffAppointmentDoctorSelect);
        waitFor(3);
        select.selectByVisibleText(appointmentID);
    }
    @Then("kullanici save butonuna tiklar")
    public void kullanici_save_butonuna_tiklar() {
        waitFor(2);
        js= (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].click();", invoice.staffCreateAppointmentSaveButton);
        waitFor(4);
    }

    //TC003
    @Given("kullanici doktor rolu ile oturum acar")
    public void kullanici_doktor_rolu_ile_oturum_acar() {
        invoice.accountMenu.click();
        invoice.accountSignIn.click();
        invoice.usernameBox.sendKeys(ConfigReader.getProperty("doctorUser"));
        invoice.passwordBox.sendKeys(ConfigReader.getProperty("password"));
        invoice.submitSignIn.click();
        waitFor(2);
    }
    @Then("kullanici doktor mypage acilir butonuna tiklar")
    public void kullanici_doktor_mypage_acilir_butonuna_tiklar() {
        invoice.doctorMyPageButton.click();
    }
    @Then("kullanici my appointments butonuna tiklar")
    public void kullanici_my_appointments_butonuna_tiklar() {
        invoice.doctorMyAppointmentPageButton.click();
    }
    @Then("kullanici atanan randevunun edit butonuna tiklar")
    public void kullanici_atanan_randevunun_edit_butonuna_tiklar() {
        waitFor(3);
        js= (JavascriptExecutor) Driver.getDriver();
        waitFor(2);
        doctorWebElementIDList=Driver.getDriver().findElements(By.xpath("//tr//td[1]"));
        doctorIDList=new ArrayList<>();
        for (int i = 0; i < doctorWebElementIDList.size()-1; i++) {
            doctorIDList.add(doctorWebElementIDList.get(i).getText());
        }
        waitFor(2);
        for (int i = 0; i <doctorIDList.size()-1 ; i++) {
            if (doctorIDList.get(i).equals(patientID)){
                WebElement doctorAppointmentEditButton = Driver.getDriver().findElement(By.xpath("//tr["+(i+1)+"]//td[13]//a[@class='btn btn-primary btn-sm']"));
                js.executeScript("arguments[0].click();", doctorAppointmentEditButton);
            }
        }
        waitFor(5);

    }
    @Then("kullanici Request A Test butonuna tiklar")
    public void kullanici_request_a_test_butonuna_tiklar() {
        waitFor(2);
        invoice.doctorRequestATestButton.click();
    }
    @Then("kullanici cccs, Sodium ve Urea testlerini secer")
    public void kullanici_cccs_sodium_ve_urea_testlerini_secer() {
        waitFor(2);
        js= (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].click();", invoice.doctorcccsTestCheckBox);
        js.executeScript("arguments[0].click();", invoice.doctorUreaTestCheckBox);
        js.executeScript("arguments[0].click();", invoice.doctorgshTestCheckBox);

    }
    @Then("kullanici test bolumu save butonuna tiklar")
    public void kullanici_test_bolumu_save_butonuna_tiklar() {
        waitFor(2);
        js= (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].click();", invoice.doctorTestSaveButton);
    }
    @Then("kullanici status kutusundan completed secenegini secer")
    public void kullanici_status_kutusundan_completed_secenegini_secer() {
        select=new Select(invoice.doctorStatusSelect);
        select.selectByValue("COMPLETED");
    }
    @Then("kullanici anamneis, treatment, diagnosis kutularini doldurur")
    public void kullanici_anamneis_treatment_diagnosis_kutularini_doldurur() {
        invoice.doctorCreateAppointmentAnamnesis.sendKeys("deneme");
        invoice.doctorCreateAppointmentTreatment.sendKeys("deneme");
        invoice.doctorCreateAppointmentDiagnosis.sendKeys("deneme");
    }
    @Then("kullanici create bolumu save butonuna tiklar")
    public void kullanici_create_bolumu_save_butonuna_tiklar() {
        js= (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].scrollIntoView(true);", invoice.doctorCreateAppointmentSaveButton);
        ReusableMethods.waitForVisibility(invoice.doctorOptionVisibility,20);
        waitFor(20);
        invoice.doctorCreateAppointmentSaveButton.click();
        //js.executeScript("arguments[0].click();", invoice.doctorCreateAppointmentSaveButton);
        waitFor(10);
    }

    //TC004
    @Then("kullanici fatura icin hastanin payment butonuna tiklar")
    public void kullanici_fatura_icin_hastanin_payment_butonuna_tiklar() {
        waitFor(5);
        js= (JavascriptExecutor) Driver.getDriver();
        staffAppointmentListCreateInvoice=new ArrayList<>();
        staffAppointmentListCreateInvoice=Driver.getDriver().findElements(By.xpath("//tr//td[1]"));
        System.out.println(staffAppointmentListCreateInvoice);
        staffInvoiceIDList=new ArrayList<>();
        for (int i = 0; i < staffAppointmentListCreateInvoice.size()-1; i++) {
            staffInvoiceIDList.add(staffAppointmentListCreateInvoice.get(i).getText());
        }
        System.out.println(staffInvoiceIDList);
        waitFor(2);
        for (int i = 0; i <staffInvoiceIDList.size()-1 ; i++) {
            if (staffInvoiceIDList.get(i).equals(patientID)){
                WebElement staffCreateInvoiceButton = Driver.getDriver().findElement(By.xpath("//tr["+(i+1)+"]//td[13]//a[@class='btn btn-success btn-sm']"));
                js.executeScript("arguments[0].scrollIntoView(true);", staffCreateInvoiceButton);
                waitFor(3);
                js.executeScript("arguments[0].click();", staffCreateInvoiceButton);
                //js.executeScript("arguments[0].click();", staffCreateInvoiceButton);
            }
        }
    }
    @Then("kullanici create invoice butonuna tiklar")
    public void kullanici_create_invoice_butonuna_tiklar() {
        waitFor(3);
        js= (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].click();", invoice.staffAppointmentCreateInvoiceButton);
    }
    @Then("kullanici create or edit sayfasinda save butonuna tiklar")
    public void kullanici_create_or_edit_sayfasinda_save_butonuna_tiklar() {
        waitFor(3);
        js= (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].click();", invoice.staffCreateInvoiceSaveButton);
    }

    @Then("kullanici show invoice butonuna tiklar")
    public void kullanici_show_invoice_butonuna_tiklar() {
        waitFor(3);
        js= (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].scrollIntoView(true);", invoice.staffShowInvoiceButton);
        waitFor(5);
        js.executeScript("arguments[0].click();", invoice.staffShowInvoiceButton);

    }
    @Then("kullanici faturanin olustugunu dogrular")
    public void kullanici_faturanin_olustugunu_dogrular() {
        Assert.assertTrue(invoice.staffInvoiceIsDisplayed.isDisplayed());
    }
}
