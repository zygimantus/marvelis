package io.swagger.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import java.util.List;
import java.util.Objects;

/**
 * CharacterDataContainer
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-05-06T14:36:16.418+03:00")

public class CharacterDataContainer {

    @JsonProperty("offset")
    private Integer offset = null;

    @JsonProperty("limit")
    private Integer limit = null;

    @JsonProperty("total")
    private Integer total = null;

    @JsonProperty("count")
    private Integer count = null;

    @JsonProperty("results")
    private List results = null;

    public CharacterDataContainer offset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * The requested offset (number of skipped results) of the call.
     *
     * @return offset
  *
     */
    @ApiModelProperty(value = "The requested offset (number of skipped results) of the call.")
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public CharacterDataContainer limit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * The requested result limit.
     *
     * @return limit
  *
     */
    @ApiModelProperty(value = "The requested result limit.")
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public CharacterDataContainer total(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * The total number of resources available given the current filter set.
     *
     * @return total
  *
     */
    @ApiModelProperty(value = "The total number of resources available given the current filter set.")
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public CharacterDataContainer count(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * The total number of results returned by this call.
     *
     * @return count
  *
     */
    @ApiModelProperty(value = "The total number of results returned by this call.")
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public CharacterDataContainer results(List results) {
        this.results = results;
        return this;
    }

    /**
     * The list of characters returned by the call.
     *
     * @return results
  *
     */
    @ApiModelProperty(value = "The list of characters returned by the call.")
    public List getResults() {
        return results;
    }

    public void setResults(List results) {
        this.results = results;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CharacterDataContainer characterDataContainer = (CharacterDataContainer) o;
        return Objects.equals(this.offset, characterDataContainer.offset)
                && Objects.equals(this.limit, characterDataContainer.limit)
                && Objects.equals(this.total, characterDataContainer.total)
                && Objects.equals(this.count, characterDataContainer.count)
                && Objects.equals(this.results, characterDataContainer.results);
    }

    @Override
    public int hashCode() {
        return Objects.hash(offset, limit, total, count, results);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CharacterDataContainer {\n");

        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    results: ").append(toIndentedString(results)).append("\n");
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
