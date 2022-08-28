package pojos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class US19_StaffPojo {
    /*
  {
   "createdBy": "team63admin",
   "createdDate": "2022-08-21T05:17:00.483627Z",
   "id": 212059,
   "firstName": "feerf",
   "lastName": "rgsrfbrdtf",
   "birthDate": "2022-08-20T21:00:00Z",
   "phone": "5555555555",
   "gender": "MALE",
   "bloodGroup": "Apositive",
   "adress": "",
   "description": "",
   "user": {
       "createdBy": "anonymousUser",
       "createdDate": "2022-03-31T16:54:08.825242Z",
       "id": 45612,
       "login": "team91adminn",
       "firstName": "team",
       "lastName": "91",
       "email": "skdfgsd@gmail.com",
       "activated": true,
       "langKey": "en",
       "imageUrl": null,
       "resetDate": null,
       "ssn": "810-91-9103"
   },
   "country": null,
   "cstate": null
}
    */
    private String createdBy;
    private String createdDate;
    private int id;
    private String firstName;
    private String lastName;
    private String birthDate;
    private String phone;
    private String gender;
    private User user;

    public US19_StaffPojo() {
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "US19_StaffPojo{" +
                "createdBy='" + createdBy + '\'' +
                ", createdDate='" + createdDate + '\'' +
                ", id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", phone='" + phone + '\'' +
                ", gender='" + gender + '\'' +
                ", user=" + user +
                '}';
    }
}
