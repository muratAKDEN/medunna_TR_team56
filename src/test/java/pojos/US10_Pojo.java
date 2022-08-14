package pojos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)



public class US10_Pojo {

    public US10_Pojo() {

    }

    private String createdBy;
    private String createdDate;
    private Integer id;
    private String startDate;
    private String dateTime;
    private String endDate;
    private String status;
    private String anamnesis;
    private String treatment;
    private String diagnosis;
    private String prescription;
    private String description;


    public US10_Pojo(String createdBy, String createdDate, Integer id, String startDate, String dateTime, String endDate, String status, String anamnesis, String treatment, String diagnosis, String prescription, String description) {
        this.createdBy = createdBy;
        this.createdDate = createdDate;
        this.id = id;
        this.startDate = startDate;
        this.dateTime = dateTime;
        this.endDate = endDate;
        this.status = status;
        this.anamnesis = anamnesis;
        this.treatment = treatment;
        this.diagnosis = diagnosis;
        this.prescription = prescription;
        this.description = description;
    }


    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getAnamnesis() {
        return anamnesis;
    }

    public void setAnamnesis(String anamnesis) {
        this.anamnesis = anamnesis;
    }

    public String getTreatment() {
        return treatment;
    }

    public void setTreatment(String treatment) {
        this.treatment = treatment;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public String getPrescription() {
        return prescription;
    }

    public void setPrescription(String prescription) {
        this.prescription = prescription;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "US10_Pojo{" +
                "createdBy='" + createdBy + '\'' +
                ", createdDate='" + createdDate + '\'' +
                ", id=" + id +
                ", startDate='" + startDate + '\'' +
                ", dateTime='" + dateTime + '\'' +
                ", endDate='" + endDate + '\'' +
                ", status='" + status + '\'' +
                ", anamnesis='" + anamnesis + '\'' +
                ", treatment='" + treatment + '\'' +
                ", diagnosis='" + diagnosis + '\'' +
                ", prescription='" + prescription + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    //{
    //        "createdBy": "anonymousUser",
    //        "createdDate": "2021-12-21T22:33:06.907662Z",
    //        "id": 3403,
    //        "startDate": "2021-12-22T17:00:00Z",
    //        "endDate": "2021-12-22T18:00:00Z",
    //        "status": "UNAPPROVED",
    //        "anamnesis": null,
    //        "treatment": null,
    //        "diagnosis": null,
    //        "prescription": "",
    //        "description": "cfgvhbjn",
    //        "physician": {
    //            "createdBy": "oscarlebsack",
    //            "createdDate": "2022-03-01T13:26:00.734890Z",
    //            "id": 10501,
    //            "firstName": "Arif",
    //            "lastName": "Canpol",
    //            "birthDate": "1991-01-31T23:00:00Z",
    //            "phone": "5354334312",
    //            "gender": "MALE",
    //            "bloodGroup": "Apositive",
    //            "adress": "",
    //            "description": "",
    //            "user": {
    //                "createdBy": "anonymousUser",
    //                "createdDate": "2022-03-01T13:19:47.400256Z",
    //                "id": 10097,
    //                "login": "arifcanpol135",
    //                "firstName": "Arif",
    //                "lastName": "Canpol",
    //                "email": "canpolska@gmail.co",
    //                "activated": true,
    //                "langKey": "en",
    //                "imageUrl": null,
    //                "resetDate": null,
    //                "ssn": "331-13-1131"
    //            },
    //            "speciality": "ALLERGY_IMMUNOLOGY",
    //            "country": null,
    //            "cstate": null,
    //            "examFee": 200.00,
    //            "image": "",
    //            "imageContentType": null
    //        },
    //        "patient":
    //        },
    //        "ctests": null
    //    },



}





