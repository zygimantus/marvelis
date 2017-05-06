package io.swagger.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/**
 * ComicPrice
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-05-06T14:36:16.418+03:00")

public class ComicPrice {

    @JsonProperty("type")
    private String type = null;

    @JsonProperty("price")
    private Float price = null;

    public ComicPrice type(String type) {
        this.type = type;
        return this;
    }

    /**
     * A description of the price (e.g. print price, digital price).
     *
     * @return type
  *
     */
    @ApiModelProperty(value = "A description of the price (e.g. print price, digital price).")
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ComicPrice price(Float price) {
        this.price = price;
        return this;
    }

    /**
     * The price (all prices in USD).
     *
     * @return price
  *
     */
    @ApiModelProperty(value = "The price (all prices in USD).")
    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ComicPrice comicPrice = (ComicPrice) o;
        return Objects.equals(this.type, comicPrice.type)
                && Objects.equals(this.price, comicPrice.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, price);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComicPrice {\n");

        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    price: ").append(toIndentedString(price)).append("\n");
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
