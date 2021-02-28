package Models;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonPropertyOrder;
import org.codehaus.jackson.map.annotate.JsonSerialize;

@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
@JsonPropertyOrder({
        "name"
})
@JsonIgnoreProperties(ignoreUnknown = true)
public class Location {

    @JsonProperty("name")
    String name;

    public String getName() { return name;  }
}
