package io.swagger.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import java.util.Objects;

/**
 * ComicDate
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-05-06T14:36:16.418+03:00")

public class ComicDate {

    @JsonProperty("type")
    private String type = null;

    @JsonProperty("date")
    private Date date = null;

    public ComicDate type(String type) {
        this.type = type;
        return this;
    }

    /**
     * A description of the date (e.g. onsale date, FOC date).
     *
     * @return type
  *
     */
    @ApiModelProperty(value = "A description of the date (e.g. onsale date, FOC date).")
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ComicDate date(Date date) {
        this.date = date;
        return this;
    }

    /**
     * The date.
     *
     * @return date
  *
     */
    @ApiModelProperty(value = "The date.")
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ComicDate comicDate = (ComicDate) o;
        return Objects.equals(this.type, comicDate.type)
                && Objects.equals(this.date, comicDate.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, date);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComicDate {\n");

        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    date: ").append(toIndentedString(date)).append("\n");
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
