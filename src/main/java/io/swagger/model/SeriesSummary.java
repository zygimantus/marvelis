package io.swagger.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/**
 * SeriesSummary
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-05-06T14:36:16.418+03:00")

public class SeriesSummary {

    @JsonProperty("resourceURI")
    private String resourceURI = null;

    @JsonProperty("name")
    private String name = null;

    public SeriesSummary resourceURI(String resourceURI) {
        this.resourceURI = resourceURI;
        return this;
    }

    /**
     * The path to the individual series resource.
     *
     * @return resourceURI
  *
     */
    @ApiModelProperty(value = "The path to the individual series resource.")
    public String getResourceURI() {
        return resourceURI;
    }

    public void setResourceURI(String resourceURI) {
        this.resourceURI = resourceURI;
    }

    public SeriesSummary name(String name) {
        this.name = name;
        return this;
    }

    /**
     * The canonical name of the series.
     *
     * @return name
  *
     */
    @ApiModelProperty(value = "The canonical name of the series.")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SeriesSummary seriesSummary = (SeriesSummary) o;
        return Objects.equals(this.resourceURI, seriesSummary.resourceURI)
                && Objects.equals(this.name, seriesSummary.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resourceURI, name);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SeriesSummary {\n");

        sb.append("    resourceURI: ").append(toIndentedString(resourceURI)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}
