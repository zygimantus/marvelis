package io.swagger.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import java.util.List;
import java.util.Objects;

/**
 * Series
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-05-06T14:36:16.418+03:00")

public class Series {

    @JsonProperty("id")
    private Integer id = null;

    @JsonProperty("title")
    private String title = null;

    @JsonProperty("description")
    private String description = null;

    @JsonProperty("resourceURI")
    private String resourceURI = null;

    @JsonProperty("urls")
    private List urls = null;

    @JsonProperty("startYear")
    private Integer startYear = null;

    @JsonProperty("endYear")
    private Integer endYear = null;

    @JsonProperty("rating")
    private String rating = null;

    @JsonProperty("modified")
    private Date modified = null;

    @JsonProperty("thumbnail")
    private Image thumbnail = null;

    @JsonProperty("comics")
    private ComicList comics = null;

    @JsonProperty("stories")
    private StoryList stories = null;

    @JsonProperty("events")
    private EventList events = null;

    @JsonProperty("characters")
    private CharacterList characters = null;

    @JsonProperty("creators")
    private CreatorList creators = null;

    @JsonProperty("next")
    private SeriesSummary next = null;

    @JsonProperty("previous")
    private SeriesSummary previous = null;

    public Series id(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * The unique ID of the series resource.
     *
     * @return id
  *
     */
    @ApiModelProperty(value = "The unique ID of the series resource.")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Series title(String title) {
        this.title = title;
        return this;
    }

    /**
     * The canonical title of the series.
     *
     * @return title
  *
     */
    @ApiModelProperty(value = "The canonical title of the series.")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Series description(String description) {
        this.description = description;
        return this;
    }

    /**
     * A description of the series.
     *
     * @return description
  *
     */
    @ApiModelProperty(value = "A description of the series.")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Series resourceURI(String resourceURI) {
        this.resourceURI = resourceURI;
        return this;
    }

    /**
     * The canonical URL identifier for this resource.
     *
     * @return resourceURI
  *
     */
    @ApiModelProperty(value = "The canonical URL identifier for this resource.")
    public String getResourceURI() {
        return resourceURI;
    }

    public void setResourceURI(String resourceURI) {
        this.resourceURI = resourceURI;
    }

    public Series urls(List urls) {
        this.urls = urls;
        return this;
    }

    /**
     * A set of public web site URLs for the resource.
     *
     * @return urls
  *
     */
    @ApiModelProperty(value = "A set of public web site URLs for the resource.")
    public List getUrls() {
        return urls;
    }

    public void setUrls(List urls) {
        this.urls = urls;
    }

    public Series startYear(Integer startYear) {
        this.startYear = startYear;
        return this;
    }

    /**
     * The first year of publication for the series.
     *
     * @return startYear
  *
     */
    @ApiModelProperty(value = "The first year of publication for the series.")
    public Integer getStartYear() {
        return startYear;
    }

    public void setStartYear(Integer startYear) {
        this.startYear = startYear;
    }

    public Series endYear(Integer endYear) {
        this.endYear = endYear;
        return this;
    }

    /**
     * The last year of publication for the series (conventionally, 2099 for
     * ongoing series) .
     *
     * @return endYear
  *
     */
    @ApiModelProperty(value = "The last year of publication for the series (conventionally, 2099 for ongoing series) .")
    public Integer getEndYear() {
        return endYear;
    }

    public void setEndYear(Integer endYear) {
        this.endYear = endYear;
    }

    public Series rating(String rating) {
        this.rating = rating;
        return this;
    }

    /**
     * The age-appropriateness rating for the series.
     *
     * @return rating
  *
     */
    @ApiModelProperty(value = "The age-appropriateness rating for the series.")
    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public Series modified(Date modified) {
        this.modified = modified;
        return this;
    }

    /**
     * The date the resource was most recently modified.
     *
     * @return modified
  *
     */
    @ApiModelProperty(value = "The date the resource was most recently modified.")
    public Date getModified() {
        return modified;
    }

    public void setModified(Date modified) {
        this.modified = modified;
    }

    public Series thumbnail(Image thumbnail) {
        this.thumbnail = thumbnail;
        return this;
    }

    /**
     * The representative image for this series.
     *
     * @return thumbnail
  *
     */
    @ApiModelProperty(value = "The representative image for this series.")
    public Image getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(Image thumbnail) {
        this.thumbnail = thumbnail;
    }

    public Series comics(ComicList comics) {
        this.comics = comics;
        return this;
    }

    /**
     * A resource list containing comics in this series.
     *
     * @return comics
  *
     */
    @ApiModelProperty(value = "A resource list containing comics in this series.")
    public ComicList getComics() {
        return comics;
    }

    public void setComics(ComicList comics) {
        this.comics = comics;
    }

    public Series stories(StoryList stories) {
        this.stories = stories;
        return this;
    }

    /**
     * A resource list containing stories which occur in comics in this series.
     *
     * @return stories
  *
     */
    @ApiModelProperty(value = "A resource list containing stories which occur in comics in this series.")
    public StoryList getStories() {
        return stories;
    }

    public void setStories(StoryList stories) {
        this.stories = stories;
    }

    public Series events(EventList events) {
        this.events = events;
        return this;
    }

    /**
     * A resource list containing events which take place in comics in this
     * series.
     *
     * @return events
  *
     */
    @ApiModelProperty(value = "A resource list containing events which take place in comics in this series.")
    public EventList getEvents() {
        return events;
    }

    public void setEvents(EventList events) {
        this.events = events;
    }

    public Series characters(CharacterList characters) {
        this.characters = characters;
        return this;
    }

    /**
     * A resource list containing characters which appear in comics in this
     * series.
     *
     * @return characters
  *
     */
    @ApiModelProperty(value = "A resource list containing characters which appear in comics in this series.")
    public CharacterList getCharacters() {
        return characters;
    }

    public void setCharacters(CharacterList characters) {
        this.characters = characters;
    }

    public Series creators(CreatorList creators) {
        this.creators = creators;
        return this;
    }

    /**
     * A resource list of creators whose work appears in comics in this series.
     *
     * @return creators
  *
     */
    @ApiModelProperty(value = "A resource list of creators whose work appears in comics in this series.")
    public CreatorList getCreators() {
        return creators;
    }

    public void setCreators(CreatorList creators) {
        this.creators = creators;
    }

    public Series next(SeriesSummary next) {
        this.next = next;
        return this;
    }

    /**
     * A summary representation of the series which follows this series.
     *
     * @return next
  *
     */
    @ApiModelProperty(value = "A summary representation of the series which follows this series.")
    public SeriesSummary getNext() {
        return next;
    }

    public void setNext(SeriesSummary next) {
        this.next = next;
    }

    public Series previous(SeriesSummary previous) {
        this.previous = previous;
        return this;
    }

    /**
     * A summary representation of the series which preceded this series.
     *
     * @return previous
  *
     */
    @ApiModelProperty(value = "A summary representation of the series which preceded this series.")
    public SeriesSummary getPrevious() {
        return previous;
    }

    public void setPrevious(SeriesSummary previous) {
        this.previous = previous;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Series series = (Series) o;
        return Objects.equals(this.id, series.id)
                && Objects.equals(this.title, series.title)
                && Objects.equals(this.description, series.description)
                && Objects.equals(this.resourceURI, series.resourceURI)
                && Objects.equals(this.urls, series.urls)
                && Objects.equals(this.startYear, series.startYear)
                && Objects.equals(this.endYear, series.endYear)
                && Objects.equals(this.rating, series.rating)
                && Objects.equals(this.modified, series.modified)
                && Objects.equals(this.thumbnail, series.thumbnail)
                && Objects.equals(this.comics, series.comics)
                && Objects.equals(this.stories, series.stories)
                && Objects.equals(this.events, series.events)
                && Objects.equals(this.characters, series.characters)
                && Objects.equals(this.creators, series.creators)
                && Objects.equals(this.next, series.next)
                && Objects.equals(this.previous, series.previous);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, description, resourceURI, urls, startYear, endYear, rating, modified, thumbnail, comics, stories, events, characters, creators, next, previous);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Series {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    resourceURI: ").append(toIndentedString(resourceURI)).append("\n");
        sb.append("    urls: ").append(toIndentedString(urls)).append("\n");
        sb.append("    startYear: ").append(toIndentedString(startYear)).append("\n");
        sb.append("    endYear: ").append(toIndentedString(endYear)).append("\n");
        sb.append("    rating: ").append(toIndentedString(rating)).append("\n");
        sb.append("    modified: ").append(toIndentedString(modified)).append("\n");
        sb.append("    thumbnail: ").append(toIndentedString(thumbnail)).append("\n");
        sb.append("    comics: ").append(toIndentedString(comics)).append("\n");
        sb.append("    stories: ").append(toIndentedString(stories)).append("\n");
        sb.append("    events: ").append(toIndentedString(events)).append("\n");
        sb.append("    characters: ").append(toIndentedString(characters)).append("\n");
        sb.append("    creators: ").append(toIndentedString(creators)).append("\n");
        sb.append("    next: ").append(toIndentedString(next)).append("\n");
        sb.append("    previous: ").append(toIndentedString(previous)).append("\n");
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
