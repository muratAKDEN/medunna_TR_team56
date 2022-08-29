package pojos;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PatientsCountryPojo {
    private Integer id;
    private String name;

    /**
     * No args constructor for use in serialization
     *
     */
    public PatientsCountryPojo() {
    }

    /**
     *
     * @param name
     * @param id
     */
    public PatientsCountryPojo(Integer id, String name) {
        super();
        this.id = id;
        this.name = name;
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

    @Override
    public String toString() {
        return "PatientsCountryPojo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
