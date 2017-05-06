package io.swagger.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import java.util.Objects;

/**
 * Story
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-05-06T14:36:16.418+03:00")

public class Story {

    @JsonProperty("id")
    private Integer id = null;

    @JsonProperty("title")
    private String title = null;

    @JsonProperty("description")
    private String description = null;

    @JsonProperty("resourceURI")
    private String resourceURI = null;

    @JsonProperty("type")
    private String type = null;

    @JsonProperty("modified")
    private Date modified = null;

    @JsonProperty("thumbnail")
    private Image thumbnail = null;

    @JsonProperty("comics")
    private ComicList comics = null;

    @JsonProperty("series")
    private SeriesList series = null;

    @JsonProperty("events")
    private EventList events = null;

    @JsonProperty("characters")
    private CharacterList characters = null;

    @JsonProperty("creators")
    private CreatorList creators = null;

    @JsonProperty("originalissue")
    private ComicSummary originalissue = null;

    public Story id(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * The unique ID of the story resource.
     *
     * @return id
  *
     */
    @ApiModelProperty(value = "The unique ID of the story resource.")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Story title(String title) {
        this.title = title;
        return this;
    }

    /**
     * The story title.
     *
     * @return title
  *
     */
    @ApiModelProperty(value = "The story title.")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Story description(String description) {
        this.description = description;
        return this;
    }

    /**
     * A short description of the story.
     *
     * @return description
  *
     */
    @ApiModelProperty(value = "A short description of the story.")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Story resourceURI(String resourceURI) {
        this.resourceURI = resourceURI;
        return this;
    }

    /**
     * The canonical URL identifier for this resource.
     *
     * @return resourceURI
  *
     */
    @ApiModelProperty(value = "The canonical URL identifier for this resource. ")
    public String getResourceURI() {
        return resourceURI;
    }

    public void setResourceURI(String resourceURI) {
        this.resourceURI = resourceURI;
    }

    public Story type(String type) {
        this.type = type;
        return this;
    }

    /**
     * The story type e.g. interior story, cover, text story.
     *
     * @return type
  *
     */
    @ApiModelProperty(value = "The story type e.g. interior story, cover, text story.")
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Story modified(Date modified) {
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

    public Story thumbnail(Image thumbnail) {
        this.thumbnail = thumbnail;
        return this;
    }

    /**
     * The representative image for this story.
     *
     * @return thumbnail
  *
     */
    @ApiModelProperty(value = "The representative image for this story.")
    public Image getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(Image thumbnail) {
        this.thumbnail = thumbnail;
    }

    public Story comics(ComicList comics) {
        this.comics = comics;
        return this;
    }

    /**
     * A resource list containing comics in which this story takes place.
     *
     * @return comics
  *
     */
    @ApiModelProperty(value = "A resource list containing comics in which this story takes place.")
    public ComicList getComics() {
        return comics;
    }

    public void setComics(ComicList comics) {
        this.comics = comics;
    }

    public Story series(SeriesList series) {
        this.series = series;
        return this;
    }

    /**
     * A resource list containing series in which this story appears.
     *
     * @return series
  *
     */
    @ApiModelProperty(value = "A resource list containing series in which this story appears.")
    public SeriesList getSeries() {
        return series;
    }

    public void setSeries(SeriesList series) {
        this.series = series;
    }

    public Story events(EventList events) {
        this.events = events;
        return this;
    }

    /**
     * A resource list of the events in which this story appears.
     *
     * @return events
  *
     */
    @ApiModelProperty(value = "A resource list of the events in which this story appears.")
    public EventList getEvents() {
        return events;
    }

    public void setEvents(EventList events) {
        this.events = events;
    }

    public Story characters(CharacterList characters) {
        this.characters = characters;
        return this;
    }

    /**
     * A resource list of characters which appear in this story.
     *
     * @return characters
  *
     */
    @ApiModelProperty(value = "A resource list of characters which appear in this story.")
    public CharacterList getCharacters() {
        return characters;
    }

    public void setCharacters(CharacterList characters) {
        this.characters = characters;
    }

    public Story creators(CreatorList creators) {
        this.creators = creators;
        return this;
    }

    /**
     * A resource list of creators who worked on this story.
     *
     * @return creators
  *
     */
    @ApiModelProperty(value = "A resource list of creators who worked on this story.")
    public CreatorList getCreators() {
        return creators;
    }

    public void setCreators(CreatorList creators) {
        this.creators = creators;
    }

    public Story originalissue(ComicSummary originalissue) {
        this.originalissue = originalissue;
        return this;
    }

    /**
     * A summary representation of the issue in which this story was originally
     * published.
     *
     * @return originalissue
  *
     */
    @ApiModelProperty(value = "A summary representation of the issue in which this story was originally published.")
    public ComicSummary getOriginalissue() {
        return originalissue;
    }

    public void setOriginalissue(ComicSummary originalissue) {
        this.originalissue = originalissue;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Story story = (Story) o;
        return Objects.equals(this.id, story.id)
                && Objects.equals(this.title, story.title)
                && Objects.equals(this.description, story.description)
                && Objects.equals(this.resourceURI, story.resourceURI)
                && Objects.equals(this.type, story.type)
                && Objects.equals(this.modified, story.modified)
                && Objects.equals(this.thumbnail, story.thumbnail)
                && Objects.equals(this.comics, story.comics)
                && Objects.equals(this.series, story.series)
                && Objects.equals(this.events, story.events)
                && Objects.equals(this.characters, story.characters)
                && Objects.equals(this.creators, story.creators)
                && Objects.equals(this.originalissue, story.originalissue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, description, resourceURI, type, modified, thumbnail, comics, series, events, characters, creators, originalissue);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Story {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    resourceURI: ").append(toIndentedString(resourceURI)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    modified: ").append(toIndentedString(modified)).append("\n");
        sb.append("    thumbnail: ").append(toIndentedString(thumbnail)).append("\n");
        sb.append("    comics: ").append(toIndentedString(comics)).append("\n");
        sb.append("    series: ").append(toIndentedString(series)).append("\n");
        sb.append("    events: ").append(toIndentedString(events)).append("\n");
        sb.append("    characters: ").append(toIndentedString(characters)).append("\n");
        sb.append("    creators: ").append(toIndentedString(creators)).append("\n");
        sb.append("    originalissue: ").append(toIndentedString(originalissue)).append("\n");
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
