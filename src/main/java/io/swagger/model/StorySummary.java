package io.swagger.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/**
 * StorySummary
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-05-06T14:36:16.418+03:00")

public class StorySummary {

    @JsonProperty("resourceURI")
    private String resourceURI = null;

    @JsonProperty("name")
    private String name = null;

    @JsonProperty("type")
    private String type = null;

    public StorySummary resourceURI(String resourceURI) {
        this.resourceURI = resourceURI;
        return this;
    }

    /**
     * The path to the individual story resource.
     *
     * @return resourceURI
  *
     */
    @ApiModelProperty(value = "The path to the individual story resource.")
    public String getResourceURI() {
        return resourceURI;
    }

    public void setResourceURI(String resourceURI) {
        this.resourceURI = resourceURI;
    }

    public StorySummary name(String name) {
        this.name = name;
        return this;
    }

    /**
     * The canonical name of the story.
     *
     * @return name
  *
     */
    @ApiModelProperty(value = "The canonical name of the story.")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public StorySummary type(String type) {
        this.type = type;
        return this;
    }

    /**
     * The type of the story (interior or cover).
     *
     * @return type
  *
     */
    @ApiModelProperty(value = "The type of the story (interior or cover).")
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        StorySummary storySummary = (StorySummary) o;
        return Objects.equals(this.resourceURI, storySummary.resourceURI)
                && Objects.equals(this.name, storySummary.name)
                && Objects.equals(this.type, storySummary.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resourceURI, name, type);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StorySummary {\n");

        sb.append("    resourceURI: ").append(toIndentedString(resourceURI)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
