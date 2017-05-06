package io.swagger.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import java.util.List;
import java.util.Objects;

/**
 * EventList
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-05-06T14:36:16.418+03:00")

public class EventList {

    @JsonProperty("available")
    private Integer available = null;

    @JsonProperty("returned")
    private Integer returned = null;

    @JsonProperty("collectionURI")
    private String collectionURI = null;

    @JsonProperty("items")
    private List items = null;

    public EventList available(Integer available) {
        this.available = available;
        return this;
    }

    /**
     * The number of total available events in this list. Will always be greater
     * than or equal to the \"returned\" value.
     *
     * @return available
  *
     */
    @ApiModelProperty(value = "The number of total available events in this list. Will always be greater than or equal to the \"returned\" value.")
    public Integer getAvailable() {
        return available;
    }

    public void setAvailable(Integer available) {
        this.available = available;
    }

    public EventList returned(Integer returned) {
        this.returned = returned;
        return this;
    }

    /**
     * The number of events returned in this collection (up to 20).
     *
     * @return returned
  *
     */
    @ApiModelProperty(value = "The number of events returned in this collection (up to 20).")
    public Integer getReturned() {
        return returned;
    }

    public void setReturned(Integer returned) {
        this.returned = returned;
    }

    public EventList collectionURI(String collectionURI) {
        this.collectionURI = collectionURI;
        return this;
    }

    /**
     * The path to the full list of events in this collection.
     *
     * @return collectionURI
  *
     */
    @ApiModelProperty(value = "The path to the full list of events in this collection.")
    public String getCollectionURI() {
        return collectionURI;
    }

    public void setCollectionURI(String collectionURI) {
        this.collectionURI = collectionURI;
    }

    public EventList items(List items) {
        this.items = items;
        return this;
    }

    /**
     * The list of returned events in this collection.
     *
     * @return items
  *
     */
    @ApiModelProperty(value = "The list of returned events in this collection.")
    public List getItems() {
        return items;
    }

    public void setItems(List items) {
        this.items = items;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        EventList eventList = (EventList) o;
        return Objects.equals(this.available, eventList.available)
                && Objects.equals(this.returned, eventList.returned)
                && Objects.equals(this.collectionURI, eventList.collectionURI)
                && Objects.equals(this.items, eventList.items);
    }

    @Override
    public int hashCode() {
        return Objects.hash(available, returned, collectionURI, items);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EventList {\n");

        sb.append("    available: ").append(toIndentedString(available)).append("\n");
        sb.append("    returned: ").append(toIndentedString(returned)).append("\n");
        sb.append("    collectionURI: ").append(toIndentedString(collectionURI)).append("\n");
        sb.append("    items: ").append(toIndentedString(items)).append("\n");
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
