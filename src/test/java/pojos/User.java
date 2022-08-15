package pojos;

        import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class User {
    private int id;
    private String login;
    private String ssn;
    private String firstName;
    private String lastName;
    private String email;
    private String imageUrl;
    private Boolean activated;
    private String langKey;
    private String createdBy;
    private String createdDate;
    private String resetDate;

}
