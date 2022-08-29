package pojos;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PatientsStatePojo {

    private Integer id;
    private String name;
    private PatientsCountry_1_Pojo country;

    /**
     * No args constructor for use in serialization
     *
     */
    public PatientsStatePojo() {
    }

    /**
     *
     * @param country
     * @param name
     * @param id
     */
    public PatientsStatePojo(Integer id, String name, PatientsCountry_1_Pojo country) {
        super();
        this.id = id;
        this.name = name;
        this.country = country;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PatientsCountry_1_Pojo getCountry() {
        return country;
    }

    public void setCountry(PatientsCountry_1_Pojo country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "PatientsStatePojo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", country=" + country +
                '}';
    }
}
