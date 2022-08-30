package pojos;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PatientsCountry_1_Pojo {
    private Integer id;
    private String name;

    /**
     * No args constructor for use in serialization
     *
     */
    public PatientsCountry_1_Pojo() {
    }

    /**
     *
     * @param name
     * @param id
     */
    public PatientsCountry_1_Pojo(Integer id, String name) {
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
        return "PatientsCountry_1_Pojo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
