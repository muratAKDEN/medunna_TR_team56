package pojos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.github.javafaker.Country;

@JsonIgnoreProperties(ignoreUnknown = true)
public class US09_Pojo {
    private String createdBy;
    private String createdDate;
    private int id;
    private String firstName;
    private String lastName;
    private String birthDate;
    private String phone;
    private String gender;
    private String bloodGroup;
    private String adress;
    private String email;
    private Country country;
    private User user;

}
