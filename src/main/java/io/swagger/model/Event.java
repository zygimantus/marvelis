package io.swagger.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import java.util.List;
import java.util.Objects;

/**
 * Event
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-05-06T14:36:16.418+03:00")

public class Event {

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

    @JsonProperty("modified")
    private Date modified = null;

    @JsonProperty("start")
    private Date start = null;

    @JsonProperty("end")
    private Date end = null;

    @JsonProperty("thumbnail")
    private Image thumbnail = null;

    @JsonProperty("comics")
    private ComicList comics = null;

    @JsonProperty("stories")
    private StoryList stories = null;

    @JsonProperty("series")
    private SeriesList series = null;

    @JsonProperty("characters")
    private CharacterList characters = null;

    @JsonProperty("creators")
    private CreatorList creators = null;

    @JsonProperty("next")
    private EventSummary next = null;

    @JsonProperty("previous")
    private EventSummary previous = null;

    public Event id(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * The unique ID of the event resource.
     *
     * @return id
  *
     */
    @ApiModelProperty(value = "The unique ID of the event resource.")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Event title(String title) {
        this.title = title;
        return this;
    }

    /**
     * The title of the event.
     *
     * @return title
  *
     */
    @ApiModelProperty(value = "The title of the event.")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Event description(String description) {
        this.description = description;
        return this;
    }

    /**
     * A description of the event.
     *
     * @return description
  *
     */
    @ApiModelProperty(value = "A description of the event.")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Event resourceURI(String resourceURI) {
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

    public Event urls(List urls) {
        this.urls = urls;
        return this;
    }

    /**
     * A set of public web site URLs for the event.
     *
     * @return urls
  *
     */
    @ApiModelProperty(value = "A set of public web site URLs for the event.")
    public List getUrls() {
        return urls;
    }

    public void setUrls(List urls) {
        this.urls = urls;
    }

    public Event modified(Date modified) {
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

    public Event start(Date start) {
        this.start = start;
        return this;
    }

    /**
     * The date of publication of the first issue in this event.
     *
     * @return start
  *
     */
    @ApiModelProperty(value = "The date of publication of the first issue in this event.")
    public Date getStart() {
        return start;
    }

    public void setStart(Date start) {
        this.start = start;
    }

    public Event end(Date end) {
        this.end = end;
        return this;
    }

    /**
     * The date of publication of the last issue in this event.
     *
     * @return end
  *
     */
    @ApiModelProperty(value = "The date of publication of the last issue in this event.")
    public Date getEnd() {
        return end;
    }

    public void setEnd(Date end) {
        this.end = end;
    }

    public Event thumbnail(Image thumbnail) {
        this.thumbnail = thumbnail;
        return this;
    }

    /**
     * The representative image for this event.
     *
     * @return thumbnail
  *
     */
    @ApiModelProperty(value = "The representative image for this event.")
    public Image getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(Image thumbnail) {
        this.thumbnail = thumbnail;
    }

    public Event comics(ComicList comics) {
        this.comics = comics;
        return this;
    }

    /**
     * A resource list containing the comics in this event.
     *
     * @return comics
  *
     */
    @ApiModelProperty(value = "A resource list containing the comics in this event.")
    public ComicList getComics() {
        return comics;
    }

    public void setComics(ComicList comics) {
        this.comics = comics;
    }

    public Event stories(StoryList stories) {
        this.stories = stories;
        return this;
    }

    /**
     * A resource list containing the stories in this event.
     *
     * @return stories
  *
     */
    @ApiModelProperty(value = "A resource list containing the stories in this event.")
    public StoryList getStories() {
        return stories;
    }

    public void setStories(StoryList stories) {
        this.stories = stories;
    }

    public Event series(SeriesList series) {
        this.series = series;
        return this;
    }

    /**
     * A resource list containing the series in this event.
     *
     * @return series
  *
     */
    @ApiModelProperty(value = "A resource list containing the series in this event.")
    public SeriesList getSeries() {
        return series;
    }

    public void setSeries(SeriesList series) {
        this.series = series;
    }

    public Event characters(CharacterList characters) {
        this.characters = characters;
        return this;
    }

    /**
     * A resource list containing the characters which appear in this event.
     *
     * @return characters
  *
     */
    @ApiModelProperty(value = "A resource list containing the characters which appear in this event.")
    public CharacterList getCharacters() {
        return characters;
    }

    public void setCharacters(CharacterList characters) {
        this.characters = characters;
    }

    public Event creators(CreatorList creators) {
        this.creators = creators;
        return this;
    }

    /**
     * A resource list containing creators whose work appears in this event.
     *
     * @return creators
  *
     */
    @ApiModelProperty(value = "A resource list containing creators whose work appears in this event.")
    public CreatorList getCreators() {
        return creators;
    }

    public void setCreators(CreatorList creators) {
        this.creators = creators;
    }

    public Event next(EventSummary next) {
        this.next = next;
        return this;
    }

    /**
     * A summary representation of the event which follows this event.
     *
     * @return next
  *
     */
    @ApiModelProperty(value = "A summary representation of the event which follows this event.")
    public EventSummary getNext() {
        return next;
    }

    public void setNext(EventSummary next) {
        this.next = next;
    }

    public Event previous(EventSummary previous) {
        this.previous = previous;
        return this;
    }

    /**
     * A summary representation of the event which preceded this event.
     *
     * @return previous
  *
     */
    @ApiModelProperty(value = "A summary representation of the event which preceded this event.")
    public EventSummary getPrevious() {
        return previous;
    }

    public void setPrevious(EventSummary previous) {
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
        Event event = (Event) o;
        return Objects.equals(this.id, event.id)
                && Objects.equals(this.title, event.title)
                && Objects.equals(this.description, event.description)
                && Objects.equals(this.resourceURI, event.resourceURI)
                && Objects.equals(this.urls, event.urls)
                && Objects.equals(this.modified, event.modified)
                && Objects.equals(this.start, event.start)
                && Objects.equals(this.end, event.end)
                && Objects.equals(this.thumbnail, event.thumbnail)
                && Objects.equals(this.comics, event.comics)
                && Objects.equals(this.stories, event.stories)
                && Objects.equals(this.series, event.series)
                && Objects.equals(this.characters, event.characters)
                && Objects.equals(this.creators, event.creators)
                && Objects.equals(this.next, event.next)
                && Objects.equals(this.previous, event.previous);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, description, resourceURI, urls, modified, start, end, thumbnail, comics, stories, series, characters, creators, next, previous);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Event {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    resourceURI: ").append(toIndentedString(resourceURI)).append("\n");
        sb.append("    urls: ").append(toIndentedString(urls)).append("\n");
        sb.append("    modified: ").append(toIndentedString(modified)).append("\n");
        sb.append("    start: ").append(toIndentedString(start)).append("\n");
        sb.append("    end: ").append(toIndentedString(end)).append("\n");
        sb.append("    thumbnail: ").append(toIndentedString(thumbnail)).append("\n");
        sb.append("    comics: ").append(toIndentedString(comics)).append("\n");
        sb.append("    stories: ").append(toIndentedString(stories)).append("\n");
        sb.append("    series: ").append(toIndentedString(series)).append("\n");
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
