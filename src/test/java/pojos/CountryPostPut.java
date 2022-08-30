package pojos;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
@JsonIgnoreProperties(ignoreUnknown = true)

public class CountryPostPut {




        private String name;

        public CountryPostPut(String name) {
            this.name = name;
        }

        public CountryPostPut() {
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "CountryPost{" +
                    "name='" + name + '\'' +
                    '}';
        }
    }

