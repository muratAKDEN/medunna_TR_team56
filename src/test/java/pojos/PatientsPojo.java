package pojos;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PatientsPojo {

    private String createdBy;
    private String createdDate;
    private Integer id;
    private String firstName;
    private String lastName;
    private Object birthDate;
    private String phone;
    private String gender;
    private String bloodGroup;
    private Object adress;
    private String email;
    private Object description;
    private PatientsUserPojo user;
    private Object appointments;
    private Object inPatients;
    private PatientsCountryPojo country;
    private PatientsStatePojo cstate;

    /**
     * No args constructor for use in serialization
     *
     */
    public PatientsPojo() {
    }

    /**
     *
     * @param lastName
     * @param country
     * @param appointments
     * @param gender
     * @param description
     * @param adress
     * @param birthDate
     * @param firstName
     * @param bloodGroup
     * @param createdDate
     * @param cstate
     * @param createdBy
     * @param phone
     * @param inPatients
     * @param id
     * @param user
     * @param email
     */
    public PatientsPojo(String createdBy, String createdDate, Integer id, String firstName, String lastName, Object birthDate, String phone, String gender, String bloodGroup, Object adress, String email, Object description, PatientsUserPojo user, Object appointments, Object inPatients, PatientsCountryPojo country, PatientsStatePojo cstate) {
        super();
        this.createdBy = createdBy;
        this.createdDate = createdDate;
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.phone = phone;
        this.gender = gender;
        this.bloodGroup = bloodGroup;
        this.adress = adress;
        this.email = email;
        this.description = description;
        this.user = user;
        this.appointments = appointments;
        this.inPatients = inPatients;
        this.country = country;
        this.cstate = cstate;
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

    public Object getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Object birthDate) {
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

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public Object getAdress() {
        return adress;
    }

    public void setAdress(Object adress) {
        this.adress = adress;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Object getDescription() {
        return description;
    }

    public void setDescription(Object description) {
        this.description = description;
    }

    public PatientsUserPojo getUser() {
        return user;
    }

    public void setUser(PatientsUserPojo user) {
        this.user = user;
    }

    public Object getAppointments() {
        return appointments;
    }

    public void setAppointments(Object appointments) {
        this.appointments = appointments;
    }

    public Object getInPatients() {
        return inPatients;
    }

    public void setInPatients(Object inPatients) {
        this.inPatients = inPatients;
    }

    public PatientsCountryPojo getCountry() {
        return country;
    }

    public void setCountry(PatientsCountryPojo country) {
        this.country = country;
    }

    public PatientsStatePojo getCstate() {
        return cstate;
    }

    public void setCstate(PatientsStatePojo cstate) {
        this.cstate = cstate;
    }

    @Override
    public String toString() {
        return "PatientsPojo{" +
                "createdBy='" + createdBy + '\'' +
                ", createdDate='" + createdDate + '\'' +
                ", id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthDate=" + birthDate +
                ", phone='" + phone + '\'' +
                ", gender='" + gender + '\'' +
                ", bloodGroup='" + bloodGroup + '\'' +
                ", adress=" + adress +
                ", email='" + email + '\'' +
                ", description=" + description +
                ", user=" + user +
                ", appointments=" + appointments +
                ", inPatients=" + inPatients +
                ", country=" + country +
                ", cstate=" + cstate +
                '}';
    }
}
