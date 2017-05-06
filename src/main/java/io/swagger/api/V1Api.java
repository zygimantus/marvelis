package io.swagger.api;

import io.swagger.annotations.*;
import java.util.List;
import org.joda.time.DateTime;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-05-06T14:36:16.418+03:00")

@Api(value = "v1", description = "the v1 API")
public interface V1Api<T> {

    @ApiOperation(value = "Fetches lists of events filtered by a character id.", notes = "Fetches lists of events in which a specific character appears, with optional filters. See notes on individual parameters below.", response = Void.class, tags = {"docspublic",})
    @ApiResponses(value = {
        @ApiResponse(code = 409, message = "Invalid value passed to filter.", response = Void.class)})
    @RequestMapping(value = "/v1/public/characters/{characterId}/events",
            method = RequestMethod.GET)
    ResponseEntity<Void> getCharacterEventsCollection(@ApiParam(value = "The character ID.", required = true) @PathVariable("characterId") Integer characterId,
            @ApiParam(value = "Filter the event list by name.") @RequestParam(value = "name", required = false) String name,
            @ApiParam(value = "Return events with names that begin with the specified string (e.g. Sp).") @RequestParam(value = "nameStartsWith", required = false) String nameStartsWith,
            @ApiParam(value = "Return only events which have been modified since the specified date.") @RequestParam(value = "modifiedSince", required = false) DateTime modifiedSince,
            @ApiParam(value = "Return only events which feature work by the specified creators (accepts a comma-separated list of ids).") @RequestParam(value = "creators", required = false) List<Integer> creators,
            @ApiParam(value = "Return only events which are part of the specified series (accepts a comma-separated list of ids).") @RequestParam(value = "series", required = false) List<Integer> series,
            @ApiParam(value = "Return only events which take place in the specified comics (accepts a comma-separated list of ids).") @RequestParam(value = "comics", required = false) List<Integer> comics,
            @ApiParam(value = "Return only events which contain the specified stories (accepts a comma-separated list of ids).") @RequestParam(value = "stories", required = false) List<Integer> stories,
            @ApiParam(value = "Order the result set by a field or fields. Add a \"-\" to the value sort in descending order. Multiple values are given priority in the order in which they are passed.") @RequestParam(value = "orderBy", required = false) List<String> orderBy,
            @ApiParam(value = "Limit the result set to the specified number of resources.") @RequestParam(value = "limit", required = false) Integer limit,
            @ApiParam(value = "Skip the specified number of resources in the result set.") @RequestParam(value = "offset", required = false) Integer offset);

    @ApiOperation(value = "Fetches a single character by id.", notes = "This method fetches a single character resource.  It is the canonical URI for any character resource provided by the API.", response = Void.class, tags = {"docspublic",})
    @ApiResponses(value = {
        @ApiResponse(code = 404, message = "Character not found.", response = Void.class)})
    @RequestMapping(value = "/v1/public/characters/{characterId}",
            method = RequestMethod.GET)
    ResponseEntity<T> getCharacterIndividual(@ApiParam(value = "A single character id.", required = true) @PathVariable("characterId") Integer characterId);

    @ApiOperation(value = "Fetches lists of series filtered by a character id.", notes = "Fetches lists of comic series in which a specific character appears, with optional filters. See notes on individual parameters below.", response = Void.class, tags = {"docspublic",})
    @ApiResponses(value = {
        @ApiResponse(code = 409, message = "Invalid value passed to filter.", response = Void.class)})
    @RequestMapping(value = "/v1/public/characters/{characterId}/series",
            method = RequestMethod.GET)
    ResponseEntity<Void> getCharacterSeriesCollection(@ApiParam(value = "The character ID", required = true) @PathVariable("characterId") Integer characterId,
            @ApiParam(value = "Filter by series title.") @RequestParam(value = "title", required = false) String title,
            @ApiParam(value = "Return series with titles that begin with the specified string (e.g. Sp).") @RequestParam(value = "titleStartsWith", required = false) String titleStartsWith,
            @ApiParam(value = "Return only series matching the specified start year.") @RequestParam(value = "startYear", required = false) Integer startYear,
            @ApiParam(value = "Return only series which have been modified since the specified date.") @RequestParam(value = "modifiedSince", required = false) DateTime modifiedSince,
            @ApiParam(value = "Return only series which contain the specified comics (accepts a comma-separated list of ids).") @RequestParam(value = "comics", required = false) List<Integer> comics,
            @ApiParam(value = "Return only series which contain the specified stories (accepts a comma-separated list of ids).") @RequestParam(value = "stories", required = false) List<Integer> stories,
            @ApiParam(value = "Return only series which have comics that take place during the specified events (accepts a comma-separated list of ids).") @RequestParam(value = "events", required = false) List<Integer> events,
            @ApiParam(value = "Return only series which feature work by the specified creators (accepts a comma-separated list of ids).") @RequestParam(value = "creators", required = false) List<Integer> creators,
            @ApiParam(value = "Filter the series by publication frequency type.", allowableValues = "COLLECTION, ONE_SHOT, LIMITED, ONGOING") @RequestParam(value = "seriesType", required = false) String seriesType,
            @ApiParam(value = "Return only series containing one or more comics with the specified format.") @RequestParam(value = "contains", required = false) List<String> contains,
            @ApiParam(value = "Order the result set by a field or fields. Add a \"-\" to the value sort in descending order. Multiple values are given priority in the order in which they are passed.") @RequestParam(value = "orderBy", required = false) List<String> orderBy,
            @ApiParam(value = "Limit the result set to the specified number of resources.") @RequestParam(value = "limit", required = false) Integer limit,
            @ApiParam(value = "Skip the specified number of resources in the result set.") @RequestParam(value = "offset", required = false) Integer offset);

    @ApiOperation(value = "Fetches lists of stories filtered by a character id.", notes = "Fetches lists of comic stories  featuring a specific character with optional filters. See notes on individual parameters below.", response = Void.class, tags = {"docspublic",})
    @ApiResponses(value = {
        @ApiResponse(code = 409, message = "Invalid value passed to filter.", response = Void.class)})
    @RequestMapping(value = "/v1/public/characters/{characterId}/stories",
            method = RequestMethod.GET)
    ResponseEntity<Void> getCharacterStoryCollection(@ApiParam(value = "The character ID.", required = true) @PathVariable("characterId") Integer characterId,
            @ApiParam(value = "Return only stories which have been modified since the specified date.") @RequestParam(value = "modifiedSince", required = false) DateTime modifiedSince,
            @ApiParam(value = "Return only stories contained in the specified (accepts a comma-separated list of ids).") @RequestParam(value = "comics", required = false) List<Integer> comics,
            @ApiParam(value = "Return only stories contained the specified series (accepts a comma-separated list of ids).") @RequestParam(value = "series", required = false) List<Integer> series,
            @ApiParam(value = "Return only stories which take place during the specified events (accepts a comma-separated list of ids).") @RequestParam(value = "events", required = false) List<Integer> events,
            @ApiParam(value = "Return only stories which feature work by the specified creators (accepts a comma-separated list of ids).") @RequestParam(value = "creators", required = false) List<Integer> creators,
            @ApiParam(value = "Order the result set by a field or fields. Add a \"-\" to the value sort in descending order. Multiple values are given priority in the order in which they are passed.") @RequestParam(value = "orderBy", required = false) List<String> orderBy,
            @ApiParam(value = "Limit the result set to the specified number of resources.") @RequestParam(value = "limit", required = false) Integer limit,
            @ApiParam(value = "Skip the specified number of resources in the result set.") @RequestParam(value = "offset", required = false) Integer offset);

    @ApiOperation(value = "Fetches lists of characters filtered by a comic id.", notes = "Fetches lists of characters which appear in a specific comic with optional filters. See notes on individual parameters below.", response = Void.class, tags = {"docspublic",})
    @ApiResponses(value = {
        @ApiResponse(code = 409, message = "Invalid value passed to filter.", response = Void.class)})
    @RequestMapping(value = "/v1/public/comics/{comicId}/characters",
            method = RequestMethod.GET)
    ResponseEntity<Void> getComicCharacterCollection(@ApiParam(value = "The comic id.", required = true) @PathVariable("comicId") Integer comicId,
            @ApiParam(value = "Return only characters matching the specified full character name (e.g. Spider-Man).") @RequestParam(value = "name", required = false) String name,
            @ApiParam(value = "Return characters with names that begin with the specified string (e.g. Sp).") @RequestParam(value = "nameStartsWith", required = false) String nameStartsWith,
            @ApiParam(value = "Return only characters which have been modified since the specified date.") @RequestParam(value = "modifiedSince", required = false) DateTime modifiedSince,
            @ApiParam(value = "Return only characters which appear the specified series (accepts a comma-separated list of ids).") @RequestParam(value = "series", required = false) List<Integer> series,
            @ApiParam(value = "Return only characters which appear comics that took place in the specified events (accepts a comma-separated list of ids).") @RequestParam(value = "events", required = false) List<Integer> events,
            @ApiParam(value = "Return only characters which appear the specified stories (accepts a comma-separated list of ids).") @RequestParam(value = "stories", required = false) List<Integer> stories,
            @ApiParam(value = "Order the result set by a field or fields. Add a \"-\" to the value sort in descending order. Multiple values are given priority in the order in which they are passed.") @RequestParam(value = "orderBy", required = false) List<String> orderBy,
            @ApiParam(value = "Limit the result set to the specified number of resources.") @RequestParam(value = "limit", required = false) Integer limit,
            @ApiParam(value = "Skip the specified number of resources in the result set.") @RequestParam(value = "offset", required = false) Integer offset);

    @ApiOperation(value = "Fetches a single comic by id.", notes = "This method fetches a single comic resource.  It is the canonical URI for any comic resource provided by the API.", response = Void.class, tags = {"docspublic",})
    @ApiResponses(value = {
        @ApiResponse(code = 404, message = "Comic not found.", response = Void.class)})
    @RequestMapping(value = "/v1/public/comics/{comicId}",
            method = RequestMethod.GET)
    ResponseEntity<Void> getComicIndividual(@ApiParam(value = "A single comic.", required = true) @PathVariable("comicId") Integer comicId);

    @ApiOperation(value = "Fetches lists of stories filtered by a comic id.", notes = "Fetches lists of comic stories in a specific comic issue, with optional filters. See notes on individual parameters below.", response = Void.class, tags = {"docspublic",})
    @ApiResponses(value = {
        @ApiResponse(code = 409, message = "Invalid value passed to filter.", response = Void.class)})
    @RequestMapping(value = "/v1/public/comics/{comicId}/stories",
            method = RequestMethod.GET)
    ResponseEntity<Void> getComicStoryCollection(@ApiParam(value = "The comic ID.", required = true) @PathVariable("comicId") Integer comicId,
            @ApiParam(value = "Return only stories which have been modified since the specified date.") @RequestParam(value = "modifiedSince", required = false) DateTime modifiedSince,
            @ApiParam(value = "Return only stories contained the specified series (accepts a comma-separated list of ids).") @RequestParam(value = "series", required = false) List<Integer> series,
            @ApiParam(value = "Return only stories which take place during the specified events (accepts a comma-separated list of ids).") @RequestParam(value = "events", required = false) List<Integer> events,
            @ApiParam(value = "Return only stories which feature work by the specified creators (accepts a comma-separated list of ids).") @RequestParam(value = "creators", required = false) List<Integer> creators,
            @ApiParam(value = "Return only stories which feature the specified characters (accepts a comma-separated list of ids).") @RequestParam(value = "characters", required = false) List<Integer> characters,
            @ApiParam(value = "Order the result set by a field or fields. Add a \"-\" to the value sort in descending order. Multiple values are given priority in the order in which they are passed.") @RequestParam(value = "orderBy", required = false) List<String> orderBy,
            @ApiParam(value = "Limit the result set to the specified number of resources.") @RequestParam(value = "limit", required = false) Integer limit,
            @ApiParam(value = "Skip the specified number of resources.") @RequestParam(value = "offset", required = false) Integer offset);

    @ApiOperation(value = "Fetches lists of comics filtered by a character id.", notes = "Fetches lists of comics containing a specific character, with optional filters. See notes on individual parameters below.", response = Void.class, tags = {"docspublic",})
    @ApiResponses(value = {
        @ApiResponse(code = 409, message = "Invalid value passed to filter.", response = Void.class)})
    @RequestMapping(value = "/v1/public/characters/{characterId}/comics",
            method = RequestMethod.GET)
    ResponseEntity<Void> getComicsCharacterCollection(@ApiParam(value = "The character id.", required = true) @PathVariable("characterId") Integer characterId,
            @ApiParam(value = "Filter by the issue format (e.g. comic, digital comic, hardcover).", allowableValues = "COMIC, MAGAZINE, TRADE_PAPERBACK, HARDCOVER, DIGEST, GRAPHIC_NOVEL, DIGITAL_COMIC, INFINITE_COMIC") @RequestParam(value = "format", required = false) String format,
            @ApiParam(value = "Filter by the issue format type (comic or collection).", allowableValues = "COMIC, COLLECTION") @RequestParam(value = "formatType", required = false) String formatType,
            @ApiParam(value = "Exclude variant comics from the result set.") @RequestParam(value = "noVariants", required = false) Boolean noVariants,
            @ApiParam(value = "Return comics within a predefined date range.", allowableValues = "LASTWEEK, THISWEEK, NEXTWEEK, THISMONTH") @RequestParam(value = "dateDescriptor", required = false) String dateDescriptor,
            @ApiParam(value = "Return comics within a predefined date range.  Dates must be specified as date1,date2 (e.g. 2013-01-01,2013-01-02).  Dates are preferably formatted as YYYY-MM-DD but may be sent as any common date format.") @RequestParam(value = "dateRange", required = false) List<Integer> dateRange,
            @ApiParam(value = "Return only issues in series whose title matches the input.") @RequestParam(value = "title", required = false) String title,
            @ApiParam(value = "Return only issues in series whose title starts with the input.") @RequestParam(value = "titleStartsWith", required = false) String titleStartsWith,
            @ApiParam(value = "Return only issues in series whose start year matches the input.") @RequestParam(value = "startYear", required = false) Integer startYear,
            @ApiParam(value = "Return only issues in series whose issue number matches the input.") @RequestParam(value = "issueNumber", required = false) Integer issueNumber,
            @ApiParam(value = "Filter by diamond code.") @RequestParam(value = "diamondCode", required = false) String diamondCode,
            @ApiParam(value = "Filter by digital comic id.") @RequestParam(value = "digitalId", required = false) Integer digitalId,
            @ApiParam(value = "Filter by UPC.") @RequestParam(value = "upc", required = false) String upc,
            @ApiParam(value = "Filter by ISBN.") @RequestParam(value = "isbn", required = false) String isbn,
            @ApiParam(value = "Filter by EAN.") @RequestParam(value = "ean", required = false) String ean,
            @ApiParam(value = "Filter by ISSN.") @RequestParam(value = "issn", required = false) String issn,
            @ApiParam(value = "Include only results which are available digitally.") @RequestParam(value = "hasDigitalIssue", required = false) Boolean hasDigitalIssue,
            @ApiParam(value = "Return only comics which have been modified since the specified date.") @RequestParam(value = "modifiedSince", required = false) DateTime modifiedSince,
            @ApiParam(value = "Return only comics which feature work by the specified creators (accepts a comma-separated list of ids).") @RequestParam(value = "creators", required = false) List<Integer> creators,
            @ApiParam(value = "Return only comics which are part of the specified series (accepts a comma-separated list of ids).") @RequestParam(value = "series", required = false) List<Integer> series,
            @ApiParam(value = "Return only comics which take place in the specified events (accepts a comma-separated list of ids).") @RequestParam(value = "events", required = false) List<Integer> events,
            @ApiParam(value = "Return only comics which contain the specified stories (accepts a comma-separated list of ids).") @RequestParam(value = "stories", required = false) List<Integer> stories,
            @ApiParam(value = "Return only comics in which the specified characters appear together (for example in which BOTH Spider-Man and Wolverine appear).") @RequestParam(value = "sharedAppearances", required = false) List<Integer> sharedAppearances,
            @ApiParam(value = "Return only comics in which the specified creators worked together (for example in which BOTH Stan Lee and Jack Kirby did work).") @RequestParam(value = "collaborators", required = false) List<Integer> collaborators,
            @ApiParam(value = "Order the result set by a field or fields. Add a \"-\" to the value sort in descending order. Multiple values are given priority in the order in which they are passed.") @RequestParam(value = "orderBy", required = false) List<String> orderBy,
            @ApiParam(value = "Limit the result set to the specified number of resources.") @RequestParam(value = "limit", required = false) Integer limit,
            @ApiParam(value = "Skip the specified number of resources in the result set.") @RequestParam(value = "offset", required = false) Integer offset);

    @ApiOperation(value = "Fetches lists of comics filtered by a creator id.", notes = "Fetches lists of comics in which the work of a specific creator appears, with optional filters. See notes on individual parameters below.", response = Void.class, tags = {"docspublic",})
    @ApiResponses(value = {
        @ApiResponse(code = 409, message = "Invalid value passed to filter.", response = Void.class)})
    @RequestMapping(value = "/v1/public/creators/{creatorId}/comics",
            method = RequestMethod.GET)
    ResponseEntity<Void> getComicsCollection(@ApiParam(value = "The creator ID.", required = true) @PathVariable("creatorId") Integer creatorId,
            @ApiParam(value = "Filter by the issue format (e.g. comic, digital comic, hardcover).", allowableValues = "COMIC, MAGAZINE, TRADE_PAPERBACK, HARDCOVER, DIGEST, GRAPHIC_NOVEL, DIGITAL_COMIC, INFINITE_COMIC") @RequestParam(value = "format", required = false) String format,
            @ApiParam(value = "Filter by the issue format type (comic or collection).", allowableValues = "COMIC, COLLECTION") @RequestParam(value = "formatType", required = false) String formatType,
            @ApiParam(value = "Exclude variant comics from the result set.") @RequestParam(value = "noVariants", required = false) Boolean noVariants,
            @ApiParam(value = "Return comics within a predefined date range.", allowableValues = "LASTWEEK, THISWEEK, NEXTWEEK, THISMONTH") @RequestParam(value = "dateDescriptor", required = false) String dateDescriptor,
            @ApiParam(value = "Return comics within a predefined date range.  Dates must be specified as date1,date2 (e.g. 2013-01-01,2013-01-02).  Dates are preferably formatted as YYYY-MM-DD but may be sent as any common date format.") @RequestParam(value = "dateRange", required = false) List<Integer> dateRange,
            @ApiParam(value = "Return only issues in series whose title matches the input.") @RequestParam(value = "title", required = false) String title,
            @ApiParam(value = "Return only issues in series whose title starts with the input.") @RequestParam(value = "titleStartsWith", required = false) String titleStartsWith,
            @ApiParam(value = "Return only issues in series whose start year matches the input.") @RequestParam(value = "startYear", required = false) Integer startYear,
            @ApiParam(value = "Return only issues in series whose issue number matches the input.") @RequestParam(value = "issueNumber", required = false) Integer issueNumber,
            @ApiParam(value = "Filter by diamond code.") @RequestParam(value = "diamondCode", required = false) String diamondCode,
            @ApiParam(value = "Filter by digital comic id.") @RequestParam(value = "digitalId", required = false) Integer digitalId,
            @ApiParam(value = "Filter by UPC.") @RequestParam(value = "upc", required = false) String upc,
            @ApiParam(value = "Filter by ISBN.") @RequestParam(value = "isbn", required = false) String isbn,
            @ApiParam(value = "Filter by EAN.") @RequestParam(value = "ean", required = false) String ean,
            @ApiParam(value = "Filter by ISSN.") @RequestParam(value = "issn", required = false) String issn,
            @ApiParam(value = "Include only results which are available digitally.") @RequestParam(value = "hasDigitalIssue", required = false) List<Boolean> hasDigitalIssue,
            @ApiParam(value = "Return only comics which have been modified since the specified date.") @RequestParam(value = "modifiedSince", required = false) DateTime modifiedSince,
            @ApiParam(value = "Return only comics which feature the specified characters (accepts a comma-separated list of ids).") @RequestParam(value = "characters", required = false) List<Integer> characters,
            @ApiParam(value = "Return only comics which are part of the specified series (accepts a comma-separated list of ids).") @RequestParam(value = "series", required = false) List<Integer> series,
            @ApiParam(value = "Return only comics which take place in the specified events (accepts a comma-separated list of ids).") @RequestParam(value = "events", required = false) List<Integer> events,
            @ApiParam(value = "Return only comics which contain the specified stories (accepts a comma-separated list of ids).") @RequestParam(value = "stories", required = false) List<Integer> stories,
            @ApiParam(value = "Return only comics in which the specified characters appear together (for example in which BOTH Spider-Man and Wolverine appear).") @RequestParam(value = "sharedAppearances", required = false) List<Integer> sharedAppearances,
            @ApiParam(value = "Return only comics in which the specified creators worked together (for example in which BOTH Stan Lee and Jack Kirby did work).") @RequestParam(value = "collaborators", required = false) List<Integer> collaborators,
            @ApiParam(value = "Order the result set by a field or fields. Add a \"-\" to the value sort in descending order. Multiple values are given priority in the order in which they are passed.") @RequestParam(value = "orderBy", required = false) List<String> orderBy,
            @ApiParam(value = "Limit the result set to the specified number of resources.") @RequestParam(value = "limit", required = false) Integer limit,
            @ApiParam(value = "Skip the specified number of resources in the result set.") @RequestParam(value = "offset", required = false) Integer offset);

    @ApiOperation(value = "Fetches lists of comics filtered by an event id.", notes = "Fetches lists of comics which take place during a specific event, with optional filters. See notes on individual parameters below.", response = Void.class, tags = {"docspublic",})
    @ApiResponses(value = {
        @ApiResponse(code = 409, message = "Invalid value passed to filter.", response = Void.class)})
    @RequestMapping(value = "/v1/public/events/{eventId}/comics",
            method = RequestMethod.GET)
    ResponseEntity<Void> getComicsCollection(@ApiParam(value = "The event id.", required = true) @PathVariable("eventId") Integer eventId,
            @ApiParam(value = "Filter by the issue format (e.g. comic, digital comic, hardcover).", allowableValues = "COMIC, MAGAZINE, TRADE_PAPERBACK, HARDCOVER, DIGEST, GRAPHIC_NOVEL, DIGITAL_COMIC, INFINITE_COMIC") @RequestParam(value = "format", required = false) String format,
            @ApiParam(value = "Filter by the issue format type (comic or collection).", allowableValues = "COMIC, COLLECTION") @RequestParam(value = "formatType", required = false) String formatType,
            @ApiParam(value = "Exclude variant comics from the result set.") @RequestParam(value = "noVariants", required = false) List<Boolean> noVariants,
            @ApiParam(value = "Return comics within a predefined date range.") @RequestParam(value = "dateDescriptor", required = false) List<String> dateDescriptor,
            @ApiParam(value = "Return comics within a predefined date range.  Dates must be specified as date1,date2 (e.g. 2013-01-01,2013-01-02).  Dates are preferably formatted as YYYY-MM-DD but may be sent as any common date format.") @RequestParam(value = "dateRange", required = false) List<Integer> dateRange,
            @ApiParam(value = "Return only issues in series whose title matches the input.") @RequestParam(value = "title", required = false) String title,
            @ApiParam(value = "Return only issues in series whose title starts with the input.") @RequestParam(value = "titleStartsWith", required = false) String titleStartsWith,
            @ApiParam(value = "Return only issues in series whose start year matches the input.") @RequestParam(value = "startYear", required = false) Integer startYear,
            @ApiParam(value = "Return only issues in series whose issue number matches the input.") @RequestParam(value = "issueNumber", required = false) Integer issueNumber,
            @ApiParam(value = "Filter by diamond code.") @RequestParam(value = "diamondCode", required = false) String diamondCode,
            @ApiParam(value = "Filter by digital comic id.") @RequestParam(value = "digitalId", required = false) Integer digitalId,
            @ApiParam(value = "Filter by UPC.") @RequestParam(value = "upc", required = false) String upc,
            @ApiParam(value = "Filter by ISBN.") @RequestParam(value = "isbn", required = false) String isbn,
            @ApiParam(value = "Filter by EAN.") @RequestParam(value = "ean", required = false) String ean,
            @ApiParam(value = "Filter by ISSN.") @RequestParam(value = "issn", required = false) String issn,
            @ApiParam(value = "Include only results which are available digitally.") @RequestParam(value = "hasDigitalIssue", required = false) List<Boolean> hasDigitalIssue,
            @ApiParam(value = "Return only comics which have been modified since the specified date.") @RequestParam(value = "modifiedSince", required = false) DateTime modifiedSince,
            @ApiParam(value = "Return only comics which feature work by the specified creators (accepts a comma-separated list of ids).") @RequestParam(value = "creators", required = false) List<Integer> creators,
            @ApiParam(value = "Return only comics which feature the specified characters (accepts a comma-separated list of ids).") @RequestParam(value = "characters", required = false) List<Integer> characters,
            @ApiParam(value = "Return only comics which are part of the specified series (accepts a comma-separated list of ids).") @RequestParam(value = "series", required = false) List<Integer> series,
            @ApiParam(value = "Return only comics which take place in the specified events (accepts a comma-separated list of ids).") @RequestParam(value = "events", required = false) List<Integer> events,
            @ApiParam(value = "Return only comics which contain the specified stories (accepts a comma-separated list of ids).") @RequestParam(value = "stories", required = false) List<Integer> stories,
            @ApiParam(value = "Return only comics in which the specified characters appear together (for example in which BOTH Spider-Man and Wolverine appear).") @RequestParam(value = "sharedAppearances", required = false) List<Integer> sharedAppearances,
            @ApiParam(value = "Return only comics in which the specified creators worked together (for example in which BOTH Stan Lee and Jack Kirby did work).") @RequestParam(value = "collaborators", required = false) List<Integer> collaborators,
            @ApiParam(value = "Order the result set by a field or fields. Add a \"-\" to the value sort in descending order. Multiple values are given priority in the order in which they are passed.") @RequestParam(value = "orderBy", required = false) List<String> orderBy,
            @ApiParam(value = "Limit the result set to the specified number of resources.") @RequestParam(value = "limit", required = false) Integer limit,
            @ApiParam(value = "Skip the specified number of resources in the result set.") @RequestParam(value = "offset", required = false) Integer offset);

    @ApiOperation(value = "Fetches lists of comics filtered by a series id.", notes = "Fetches lists of comics which are published as part of a specific series, with optional filters. See notes on individual parameters below.", response = Void.class, tags = {"docspublic",})
    @ApiResponses(value = {
        @ApiResponse(code = 409, message = "Invalid value passed to filter.", response = Void.class)})
    @RequestMapping(value = "/v1/public/series/{seriesId}/comics",
            method = RequestMethod.GET)
    ResponseEntity<Void> getComicsCollection(@ApiParam(value = "The series ID.", required = true) @PathVariable("seriesId") Integer seriesId,
            @ApiParam(value = "Filter by the issue format (e.g. comic, digital comic, hardcover).", allowableValues = "COMIC, MAGAZINE, TRADE_PAPERBACK, HARDCOVER, DIGEST, GRAPHIC_NOVEL, DIGITAL_COMIC, INFINITE_COMIC") @RequestParam(value = "format", required = false) String format,
            @ApiParam(value = "Filter by the issue format type (comic or collection).", allowableValues = "COMIC, COLLECTION") @RequestParam(value = "formatType", required = false) String formatType,
            @ApiParam(value = "Exclude variant comics from the result set.") @RequestParam(value = "noVariants", required = false) List<Boolean> noVariants,
            @ApiParam(value = "Return comics within a predefined date range.") @RequestParam(value = "dateDescriptor", required = false) List<String> dateDescriptor,
            @ApiParam(value = "Return comics within a predefined date range.  Dates must be specified as date1,date2 (e.g. 2013-01-01,2013-01-02).  Dates are preferably formatted as YYYY-MM-DD but may be sent as any common date format.") @RequestParam(value = "dateRange", required = false) List<Integer> dateRange,
            @ApiParam(value = "Return only issues in series whose title matches the input.") @RequestParam(value = "title", required = false) String title,
            @ApiParam(value = "Return only issues in series whose title starts with the input.") @RequestParam(value = "titleStartsWith", required = false) String titleStartsWith,
            @ApiParam(value = "Return only issues in series whose start year matches the input.") @RequestParam(value = "startYear", required = false) Integer startYear,
            @ApiParam(value = "Return only issues in series whose issue number matches the input.") @RequestParam(value = "issueNumber", required = false) Integer issueNumber,
            @ApiParam(value = "Filter by diamond code.") @RequestParam(value = "diamondCode", required = false) String diamondCode,
            @ApiParam(value = "Filter by digital comic id.") @RequestParam(value = "digitalId", required = false) Integer digitalId,
            @ApiParam(value = "Filter by UPC.") @RequestParam(value = "upc", required = false) String upc,
            @ApiParam(value = "Filter by ISBN.") @RequestParam(value = "isbn", required = false) String isbn,
            @ApiParam(value = "Filter by EAN.") @RequestParam(value = "ean", required = false) String ean,
            @ApiParam(value = "Filter by ISSN.") @RequestParam(value = "issn", required = false) String issn,
            @ApiParam(value = "Include only results which are available digitally.") @RequestParam(value = "hasDigitalIssue", required = false) List<Boolean> hasDigitalIssue,
            @ApiParam(value = "Return only comics which have been modified since the specified date.") @RequestParam(value = "modifiedSince", required = false) DateTime modifiedSince,
            @ApiParam(value = "Return only comics which feature work by the specified creators (accepts a comma-separated list of ids).") @RequestParam(value = "creators", required = false) List<Integer> creators,
            @ApiParam(value = "Return only comics which feature the specified characters (accepts a comma-separated list of ids).") @RequestParam(value = "characters", required = false) List<Integer> characters,
            @ApiParam(value = "Return only comics which take place in the specified events (accepts a comma-separated list of ids).") @RequestParam(value = "events", required = false) List<Integer> events,
            @ApiParam(value = "Return only comics which contain the specified stories (accepts a comma-separated list of ids).") @RequestParam(value = "stories", required = false) List<Integer> stories,
            @ApiParam(value = "Return only comics in which the specified characters appear together (for example in which BOTH Spider-Man and Wolverine appear).") @RequestParam(value = "sharedAppearances", required = false) List<Integer> sharedAppearances,
            @ApiParam(value = "Return only comics in which the specified creators worked together (for example in which BOTH Stan Lee and Jack Kirby did work).") @RequestParam(value = "collaborators", required = false) List<Integer> collaborators,
            @ApiParam(value = "Order the result set by a field or fields. Add a \"-\" to the value sort in descending order. Multiple values are given priority in the order in which they are passed.") @RequestParam(value = "orderBy", required = false) List<String> orderBy,
            @ApiParam(value = "Limit the result set to the specified number of resources.") @RequestParam(value = "limit", required = false) Integer limit,
            @ApiParam(value = "Skip the specified number of resources in the result set.") @RequestParam(value = "offset", required = false) Integer offset);

    @ApiOperation(value = "Fetches lists of comics.", notes = "Fetches lists of comics with optional filters. See notes on individual parameters below.", response = Void.class, tags = {"docspublic",})
    @ApiResponses(value = {
        @ApiResponse(code = 409, message = "Invalid value passed to filter.", response = Void.class)})
    @RequestMapping(value = "/v1/public/comics",
            method = RequestMethod.GET)
    ResponseEntity<Void> getComicsCollection(@ApiParam(value = "Filter by the issue format (e.g. comic, digital comic, hardcover).", allowableValues = "COMIC, MAGAZINE, TRADE_PAPERBACK, HARDCOVER, DIGEST, GRAPHIC_NOVEL, DIGITAL_COMIC, INFINITE_COMIC") @RequestParam(value = "format", required = false) String format,
            @ApiParam(value = "Filter by the issue format type (comic or collection).", allowableValues = "COMIC, COLLECTION") @RequestParam(value = "formatType", required = false) String formatType,
            @ApiParam(value = "Exclude variants (alternate covers, secondary printings, director's cuts, etc.) from the result set.") @RequestParam(value = "noVariants", required = false) Boolean noVariants,
            @ApiParam(value = "Return comics within a predefined date range.", allowableValues = "LASTWEEK, THISWEEK, NEXTWEEK, THISMONTH") @RequestParam(value = "dateDescriptor", required = false) String dateDescriptor,
            @ApiParam(value = "Return comics within a predefined date range.  Dates must be specified as date1,date2 (e.g. 2013-01-01,2013-01-02).  Dates are preferably formatted as YYYY-MM-DD but may be sent as any common date format.") @RequestParam(value = "dateRange", required = false) List<Integer> dateRange,
            @ApiParam(value = "Return only issues in series whose title matches the input.") @RequestParam(value = "title", required = false) String title,
            @ApiParam(value = "Return only issues in series whose title starts with the input.") @RequestParam(value = "titleStartsWith", required = false) String titleStartsWith,
            @ApiParam(value = "Return only issues in series whose start year matches the input.") @RequestParam(value = "startYear", required = false) Integer startYear,
            @ApiParam(value = "Return only issues in series whose issue number matches the input.") @RequestParam(value = "issueNumber", required = false) Integer issueNumber,
            @ApiParam(value = "Filter by diamond code.") @RequestParam(value = "diamondCode", required = false) String diamondCode,
            @ApiParam(value = "Filter by digital comic id.") @RequestParam(value = "digitalId", required = false) Integer digitalId,
            @ApiParam(value = "Filter by UPC.") @RequestParam(value = "upc", required = false) String upc,
            @ApiParam(value = "Filter by ISBN.") @RequestParam(value = "isbn", required = false) String isbn,
            @ApiParam(value = "Filter by EAN.") @RequestParam(value = "ean", required = false) String ean,
            @ApiParam(value = "Filter by ISSN.") @RequestParam(value = "issn", required = false) String issn,
            @ApiParam(value = "Include only results which are available digitally.") @RequestParam(value = "hasDigitalIssue", required = false) Boolean hasDigitalIssue,
            @ApiParam(value = "Return only comics which have been modified since the specified date.") @RequestParam(value = "modifiedSince", required = false) DateTime modifiedSince,
            @ApiParam(value = "Return only comics which feature work by the specified creators (accepts a comma-separated list of ids).") @RequestParam(value = "creators", required = false) List<Integer> creators,
            @ApiParam(value = "Return only comics which feature the specified characters (accepts a comma-separated list of ids).") @RequestParam(value = "characters", required = false) List<Integer> characters,
            @ApiParam(value = "Return only comics which are part of the specified series (accepts a comma-separated list of ids).") @RequestParam(value = "series", required = false) List<Integer> series,
            @ApiParam(value = "Return only comics which take place in the specified events (accepts a comma-separated list of ids).") @RequestParam(value = "events", required = false) List<Integer> events,
            @ApiParam(value = "Return only comics which contain the specified stories (accepts a comma-separated list of ids).") @RequestParam(value = "stories", required = false) List<Integer> stories,
            @ApiParam(value = "Return only comics in which the specified characters appear together (for example in which BOTH Spider-Man and Wolverine appear). Accepts a comma-separated list of ids.") @RequestParam(value = "sharedAppearances", required = false) List<Integer> sharedAppearances,
            @ApiParam(value = "Return only comics in which the specified creators worked together (for example in which BOTH Stan Lee and Jack Kirby did work). Accepts a comma-separated list of ids.") @RequestParam(value = "collaborators", required = false) List<Integer> collaborators,
            @ApiParam(value = "Order the result set by a field or fields. Add a \"-\" to the value sort in descending order. Multiple values are given priority in the order in which they are passed.") @RequestParam(value = "orderBy", required = false) List<String> orderBy,
            @ApiParam(value = "Limit the result set to the specified number of resources.") @RequestParam(value = "limit", required = false) Integer limit,
            @ApiParam(value = "Skip the specified number of resources in the result set.") @RequestParam(value = "offset", required = false) Integer offset);

//    @ApiOperation(value = "Fetches lists of comics filtered by a story id.", notes = "Fetches lists of comics in which a specific story appears, with optional filters. See notes on individual parameters below.", response = Void.class, tags={ "docspublic", })
//    @ApiResponses(value = { 
//        @ApiResponse(code = 409, message = "Invalid value passed to filter.", response = Void.class) })
//    @RequestMapping(value = "/v1/public/stories/{storyId}/comics",
//        method = RequestMethod.GET)
//    ResponseEntity<Void> getComicsCollection(@ApiParam(value = "The story ID.",required=true ) @PathVariable("storyId") Integer storyId,
//         @ApiParam(value = "Filter by the issue format (e.g. comic, digital comic, hardcover).", allowableValues = "COMIC, MAGAZINE, TRADE_PAPERBACK, HARDCOVER, DIGEST, GRAPHIC_NOVEL, DIGITAL_COMIC, INFINITE_COMIC") @RequestParam(value = "format", required = false) String format,
//         @ApiParam(value = "Filter by the issue format type (comic or collection).", allowableValues = "COMIC, COLLECTION") @RequestParam(value = "formatType", required = false) String formatType,
//         @ApiParam(value = "Exclude variant comics from the result set.") @RequestParam(value = "noVariants", required = false) List<Boolean> noVariants,
//         @ApiParam(value = "Return comics within a predefined date range.") @RequestParam(value = "dateDescriptor", required = false) List<String> dateDescriptor,
//         @ApiParam(value = "Return comics within a predefined date range.  Dates must be specified as date1,date2 (e.g. 2013-01-01,2013-01-02).  Dates are preferably formatted as YYYY-MM-DD but may be sent as any common date format.") @RequestParam(value = "dateRange", required = false) List<Integer> dateRange,
//         @ApiParam(value = "Return only issues in series whose title matches the input.") @RequestParam(value = "title", required = false) String title,
//         @ApiParam(value = "Return only issues in series whose title starts with the input.") @RequestParam(value = "titleStartsWith", required = false) String titleStartsWith,
//         @ApiParam(value = "Return only issues in series whose start year matches the input.") @RequestParam(value = "startYear", required = false) Integer startYear,
//         @ApiParam(value = "Return only issues in series whose issue number matches the input.") @RequestParam(value = "issueNumber", required = false) Integer issueNumber,
//         @ApiParam(value = "Filter by diamond code.") @RequestParam(value = "diamondCode", required = false) String diamondCode,
//         @ApiParam(value = "Filter by digital comic id.") @RequestParam(value = "digitalId", required = false) Integer digitalId,
//         @ApiParam(value = "Filter by UPC.") @RequestParam(value = "upc", required = false) String upc,
//         @ApiParam(value = "Filter by ISBN.") @RequestParam(value = "isbn", required = false) String isbn,
//         @ApiParam(value = "Filter by EAN.") @RequestParam(value = "ean", required = false) String ean,
//         @ApiParam(value = "Filter by ISSN.") @RequestParam(value = "issn", required = false) String issn,
//         @ApiParam(value = "Include only results which are available digitally.") @RequestParam(value = "hasDigitalIssue", required = false) List<Boolean> hasDigitalIssue,
//         @ApiParam(value = "Return only comics which have been modified since the specified date.") @RequestParam(value = "modifiedSince", required = false) DateTime modifiedSince,
//         @ApiParam(value = "Return only comics which feature work by the specified creators (accepts a comma-separated list of ids).") @RequestParam(value = "creators", required = false) List<Integer> creators,
//         @ApiParam(value = "Return only comics which feature the specified characters (accepts a comma-separated list of ids).") @RequestParam(value = "characters", required = false) List<Integer> characters,
//         @ApiParam(value = "Return only comics which are part of the specified series (accepts a comma-separated list of ids).") @RequestParam(value = "series", required = false) List<Integer> series,
//         @ApiParam(value = "Return only comics which take place in the specified events (accepts a comma-separated list of ids).") @RequestParam(value = "events", required = false) List<Integer> events,
//         @ApiParam(value = "Return only comics in which the specified characters appear together (for example in which BOTH Spider-Man and Wolverine appear).") @RequestParam(value = "sharedAppearances", required = false) List<Integer> sharedAppearances,
//         @ApiParam(value = "Return only comics in which the specified creators worked together (for example in which BOTH Stan Lee and Jack Kirby did work).") @RequestParam(value = "collaborators", required = false) List<Integer> collaborators,
//         @ApiParam(value = "Order the result set by a field or fields. Add a \"-\" to the value sort in descending order. Multiple values are given priority in the order in which they are passed.") @RequestParam(value = "orderBy", required = false) List<String> orderBy,
//         @ApiParam(value = "Limit the result set to the specified number of resources.") @RequestParam(value = "limit", required = false) Integer limit,
//         @ApiParam(value = "Skip the specified number of resources in the result set.") @RequestParam(value = "offset", required = false) Integer offset);
    @ApiOperation(value = "Fetches lists of creators.", notes = "Fetches lists of comic creators with optional filters. See notes on individual parameters below.", response = Void.class, tags = {"docspublic",})
    @ApiResponses(value = {
        @ApiResponse(code = 409, message = "Invalid value passed to filter.", response = Void.class)})
    @RequestMapping(value = "/v1/public/creators",
            method = RequestMethod.GET)
    ResponseEntity<Void> getCreatorCollection(@ApiParam(value = "Filter by creator first name (e.g. Brian).") @RequestParam(value = "firstName", required = false) String firstName,
            @ApiParam(value = "Filter by creator middle name (e.g. Michael).") @RequestParam(value = "middleName", required = false) String middleName,
            @ApiParam(value = "Filter by creator last name (e.g. Bendis).") @RequestParam(value = "lastName", required = false) String lastName,
            @ApiParam(value = "Filter by suffix or honorific (e.g. Jr., Sr.).") @RequestParam(value = "suffix", required = false) String suffix,
            @ApiParam(value = "Filter by creator names that match critera (e.g. B, St L).") @RequestParam(value = "nameStartsWith", required = false) String nameStartsWith,
            @ApiParam(value = "Filter by creator first names that match critera (e.g. B, St L).") @RequestParam(value = "firstNameStartsWith", required = false) String firstNameStartsWith,
            @ApiParam(value = "Filter by creator middle names that match critera (e.g. Mi).") @RequestParam(value = "middleNameStartsWith", required = false) String middleNameStartsWith,
            @ApiParam(value = "Filter by creator last names that match critera (e.g. Ben).") @RequestParam(value = "lastNameStartsWith", required = false) String lastNameStartsWith,
            @ApiParam(value = "Return only creators which have been modified since the specified date.") @RequestParam(value = "modifiedSince", required = false) DateTime modifiedSince,
            @ApiParam(value = "Return only creators who worked on in the specified comics (accepts a comma-separated list of ids).") @RequestParam(value = "comics", required = false) List<Integer> comics,
            @ApiParam(value = "Return only creators who worked on the specified series (accepts a comma-separated list of ids).") @RequestParam(value = "series", required = false) List<Integer> series,
            @ApiParam(value = "Return only creators who worked on comics that took place in the specified events (accepts a comma-separated list of ids).") @RequestParam(value = "events", required = false) List<Integer> events,
            @ApiParam(value = "Return only creators who worked on the specified stories (accepts a comma-separated list of ids).") @RequestParam(value = "stories", required = false) List<Integer> stories,
            @ApiParam(value = "Order the result set by a field or fields. Add a \"-\" to the value sort in descending order. Multiple values are given priority in the order in which they are passed.") @RequestParam(value = "orderBy", required = false) List<String> orderBy,
            @ApiParam(value = "Limit the result set to the specified number of resources.") @RequestParam(value = "limit", required = false) Integer limit,
            @ApiParam(value = "Skip the specified number of resources in the result set.") @RequestParam(value = "offset", required = false) Integer offset);

    @ApiOperation(value = "Fetches lists of characters filtered by a story id.", notes = "Fetches lists of comic characters appearing in a single story, with optional filters. See notes on individual parameters below.", response = Void.class, tags = {"docspublic",})
    @ApiResponses(value = {
        @ApiResponse(code = 409, message = "Invalid value passed to filter.", response = Void.class)})
    @RequestMapping(value = "/v1/public/stories/{storyId}/characters",
            method = RequestMethod.GET)
    ResponseEntity<Void> getCreatorCollection(@ApiParam(value = "The story ID.", required = true) @PathVariable("storyId") Integer storyId,
            @ApiParam(value = "Return only characters matching the specified full character name (e.g. Spider-Man).") @RequestParam(value = "name", required = false) String name,
            @ApiParam(value = "Return characters with names that begin with the specified string (e.g. Sp).") @RequestParam(value = "nameStartsWith", required = false) String nameStartsWith,
            @ApiParam(value = "Return only characters which have been modified since the specified date.") @RequestParam(value = "modifiedSince", required = false) DateTime modifiedSince,
            @ApiParam(value = "Return only characters which appear in the specified comics (accepts a comma-separated list of ids).") @RequestParam(value = "comics", required = false) List<Integer> comics,
            @ApiParam(value = "Return only characters which appear the specified series (accepts a comma-separated list of ids).") @RequestParam(value = "series", required = false) List<Integer> series,
            @ApiParam(value = "Return only characters which appear comics that took place in the specified events (accepts a comma-separated list of ids).") @RequestParam(value = "events", required = false) List<Integer> events,
            @ApiParam(value = "Order the result set by a field or fields. Add a \"-\" to the value sort in descending order. Multiple values are given priority in the order in which they are passed.") @RequestParam(value = "orderBy", required = false) List<String> orderBy,
            @ApiParam(value = "Limit the result set to the specified number of resources.") @RequestParam(value = "limit", required = false) Integer limit,
            @ApiParam(value = "Skip the specified number of resources in the result set.") @RequestParam(value = "offset", required = false) Integer offset);

    @ApiOperation(value = "Fetches lists of creators filtered by a series id.", notes = "Fetches lists of comic creators whose work appears in a specific series, with optional filters. See notes on individual parameters below.", response = Void.class, tags = {"docspublic",})
    @ApiResponses(value = {
        @ApiResponse(code = 409, message = "Invalid value passed to filter.", response = Void.class)})
    @RequestMapping(value = "/v1/public/series/{seriesId}/creators",
            method = RequestMethod.GET)
    ResponseEntity<Void> getCreatorCollection(@ApiParam(value = "The series ID.", required = true) @PathVariable("seriesId") Integer seriesId,
            @ApiParam(value = "Filter by creator first name (e.g. brian).") @RequestParam(value = "firstName", required = false) String firstName,
            @ApiParam(value = "Filter by creator middle name (e.g. Michael).") @RequestParam(value = "middleName", required = false) String middleName,
            @ApiParam(value = "Filter by creator last name (e.g. Bendis).") @RequestParam(value = "lastName", required = false) String lastName,
            @ApiParam(value = "Filter by suffix or honorific (e.g. Jr., Sr.).") @RequestParam(value = "suffix", required = false) String suffix,
            @ApiParam(value = "Filter by creator names that match critera (e.g. B, St L).") @RequestParam(value = "nameStartsWith", required = false) String nameStartsWith,
            @ApiParam(value = "Filter by creator first names that match critera (e.g. B, St L).") @RequestParam(value = "firstNameStartsWith", required = false) String firstNameStartsWith,
            @ApiParam(value = "Filter by creator middle names that match critera (e.g. Mi).") @RequestParam(value = "middleNameStartsWith", required = false) String middleNameStartsWith,
            @ApiParam(value = "Filter by creator last names that match critera (e.g. Ben).") @RequestParam(value = "lastNameStartsWith", required = false) String lastNameStartsWith,
            @ApiParam(value = "Return only creators which have been modified since the specified date.") @RequestParam(value = "modifiedSince", required = false) DateTime modifiedSince,
            @ApiParam(value = "Return only creators who worked on in the specified comics (accepts a comma-separated list of ids).") @RequestParam(value = "comics", required = false) List<Integer> comics,
            @ApiParam(value = "Return only creators who worked on comics that took place in the specified events (accepts a comma-separated list of ids).") @RequestParam(value = "events", required = false) List<Integer> events,
            @ApiParam(value = "Return only creators who worked on the specified stories (accepts a comma-separated list of ids).") @RequestParam(value = "stories", required = false) List<Integer> stories,
            @ApiParam(value = "Order the result set by a field or fields. Add a \"-\" to the value sort in descending order. Multiple values are given priority in the order in which they are passed.") @RequestParam(value = "orderBy", required = false) List<String> orderBy,
            @ApiParam(value = "Limit the result set to the specified number of resources.") @RequestParam(value = "limit", required = false) Integer limit,
            @ApiParam(value = "Skip the specified number of resources in the result set.") @RequestParam(value = "offset", required = false) Integer offset);

//    @ApiOperation(value = "Fetches lists of creators filtered by a comic id.", notes = "Fetches lists of comic creators whose work appears in a specific comic, with optional filters. See notes on individual parameters below.", response = Void.class, tags={ "docspublic", })
//    @ApiResponses(value = { 
//        @ApiResponse(code = 409, message = "Invalid value passed to filter.", response = Void.class) })
//    @RequestMapping(value = "/v1/public/comics/{comicId}/creators",
//        method = RequestMethod.GET)
//    ResponseEntity<Void> getCreatorCollection(@ApiParam(value = "The comic id.",required=true ) @PathVariable("comicId") Integer comicId,
//         @ApiParam(value = "Filter by creator first name (e.g. brian).") @RequestParam(value = "firstName", required = false) String firstName,
//         @ApiParam(value = "Filter by creator middle name (e.g. Michael).") @RequestParam(value = "middleName", required = false) String middleName,
//         @ApiParam(value = "Filter by creator last name (e.g. Bendis).") @RequestParam(value = "lastName", required = false) String lastName,
//         @ApiParam(value = "Filter by suffix or honorific (e.g. Jr., Sr.).") @RequestParam(value = "suffix", required = false) String suffix,
//         @ApiParam(value = "Filter by creator names that match critera (e.g. B, St L).") @RequestParam(value = "nameStartsWith", required = false) String nameStartsWith,
//         @ApiParam(value = "Filter by creator first names that match critera (e.g. B, St L).") @RequestParam(value = "firstNameStartsWith", required = false) String firstNameStartsWith,
//         @ApiParam(value = "Filter by creator middle names that match critera (e.g. Mi).") @RequestParam(value = "middleNameStartsWith", required = false) String middleNameStartsWith,
//         @ApiParam(value = "Filter by creator last names that match critera (e.g. Ben).") @RequestParam(value = "lastNameStartsWith", required = false) String lastNameStartsWith,
//         @ApiParam(value = "Return only creators which have been modified since the specified date.") @RequestParam(value = "modifiedSince", required = false) DateTime modifiedSince,
//         @ApiParam(value = "Return only creators who worked on in the specified comics (accepts a comma-separated list of ids).") @RequestParam(value = "comics", required = false) List<Integer> comics,
//         @ApiParam(value = "Return only creators who worked on the specified series (accepts a comma-separated list of ids).") @RequestParam(value = "series", required = false) List<Integer> series,
//         @ApiParam(value = "Return only creators who worked on the specified stories (accepts a comma-separated list of ids).") @RequestParam(value = "stories", required = false) List<Integer> stories,
//         @ApiParam(value = "Order the result set by a field or fields. Add a \"-\" to the value sort in descending order. Multiple values are given priority in the order in which they are passed.") @RequestParam(value = "orderBy", required = false) List<String> orderBy,
//         @ApiParam(value = "Limit the result set to the specified number of resources.") @RequestParam(value = "limit", required = false) Integer limit,
//         @ApiParam(value = "Skip the specified number of resources in the result set.") @RequestParam(value = "offset", required = false) Integer offset);
    @ApiOperation(value = "Fetches lists of characters.", notes = "Fetches lists of comic characters with optional filters. See notes on individual parameters below.", response = Void.class, tags = {"docspublic",})
    @ApiResponses(value = {
        @ApiResponse(code = 409, message = "Invalid value passed to filter.", response = Void.class)})
    @RequestMapping(value = "/v1/public/characters",
            method = RequestMethod.GET)
    ResponseEntity<Void> getCreatorCollection(@ApiParam(value = "Return only characters matching the specified full character name (e.g. Spider-Man).") @RequestParam(value = "name", required = false) String name,
            @ApiParam(value = "Return characters with names that begin with the specified string (e.g. Sp).") @RequestParam(value = "nameStartsWith", required = false) String nameStartsWith,
            @ApiParam(value = "Return only characters which have been modified since the specified date.") @RequestParam(value = "modifiedSince", required = false) DateTime modifiedSince,
            @ApiParam(value = "Return only characters which appear in the specified comics (accepts a comma-separated list of ids).") @RequestParam(value = "comics", required = false) List<Integer> comics,
            @ApiParam(value = "Return only characters which appear the specified series (accepts a comma-separated list of ids).") @RequestParam(value = "series", required = false) List<Integer> series,
            @ApiParam(value = "Return only characters which appear in the specified events (accepts a comma-separated list of ids).") @RequestParam(value = "events", required = false) List<Integer> events,
            @ApiParam(value = "Return only characters which appear the specified stories (accepts a comma-separated list of ids).") @RequestParam(value = "stories", required = false) List<Integer> stories,
            @ApiParam(value = "Order the result set by a field or fields. Add a \"-\" to the value sort in descending order. Multiple values are given priority in the order in which they are passed.") @RequestParam(value = "orderBy", required = false) List<String> orderBy,
            @ApiParam(value = "Limit the result set to the specified number of resources.") @RequestParam(value = "limit", required = false) Integer limit,
            @ApiParam(value = "Skip the specified number of resources in the result set.") @RequestParam(value = "offset", required = false) Integer offset);

//    @ApiOperation(value = "Fetches lists of creators filtered by a story id.", notes = "Fetches lists of comic creators whose work appears in a specific story, with optional filters. See notes on individual parameters below.", response = Void.class, tags={ "docspublic", })
//    @ApiResponses(value = { 
//        @ApiResponse(code = 409, message = "Invalid value passed to filter.", response = Void.class) })
//    @RequestMapping(value = "/v1/public/stories/{storyId}/creators",
//        method = RequestMethod.GET)
//    ResponseEntity<Void> getCreatorCollection(@ApiParam(value = "The story ID.",required=true ) @PathVariable("storyId") Integer storyId,
//         @ApiParam(value = "Filter by creator first name (e.g. brian).") @RequestParam(value = "firstName", required = false) String firstName,
//         @ApiParam(value = "Filter by creator middle name (e.g. Michael).") @RequestParam(value = "middleName", required = false) String middleName,
//         @ApiParam(value = "Filter by creator last name (e.g. Bendis).") @RequestParam(value = "lastName", required = false) String lastName,
//         @ApiParam(value = "Filter by suffix or honorific (e.g. Jr., Sr.).") @RequestParam(value = "suffix", required = false) String suffix,
//         @ApiParam(value = "Filter by creator names that match critera (e.g. B, St L).") @RequestParam(value = "nameStartsWith", required = false) String nameStartsWith,
//         @ApiParam(value = "Filter by creator first names that match critera (e.g. B, St L).") @RequestParam(value = "firstNameStartsWith", required = false) String firstNameStartsWith,
//         @ApiParam(value = "Filter by creator middle names that match critera (e.g. Mi).") @RequestParam(value = "middleNameStartsWith", required = false) String middleNameStartsWith,
//         @ApiParam(value = "Filter by creator last names that match critera (e.g. Ben).") @RequestParam(value = "lastNameStartsWith", required = false) String lastNameStartsWith,
//         @ApiParam(value = "Return only creators which have been modified since the specified date.") @RequestParam(value = "modifiedSince", required = false) DateTime modifiedSince,
//         @ApiParam(value = "Return only creators who worked on in the specified comics (accepts a comma-separated list of ids).") @RequestParam(value = "comics", required = false) List<Integer> comics,
//         @ApiParam(value = "Return only creators who worked on the specified series (accepts a comma-separated list of ids).") @RequestParam(value = "series", required = false) List<Integer> series,
//         @ApiParam(value = "Return only creators who worked on comics that took place in the specified events (accepts a comma-separated list of ids).") @RequestParam(value = "events", required = false) List<Integer> events,
//         @ApiParam(value = "Order the result set by a field or fields. Add a \"-\" to the value sort in descending order. Multiple values are given priority in the order in which they are passed.") @RequestParam(value = "orderBy", required = false) List<String> orderBy,
//         @ApiParam(value = "Limit the result set to the specified number of resources.") @RequestParam(value = "limit", required = false) Integer limit,
//         @ApiParam(value = "Skip the specified number of resources in the result set.") @RequestParam(value = "offset", required = false) Integer offset);
//    @ApiOperation(value = "Fetches lists of creators filtered by an event id.", notes = "Fetches lists of comic creators whose work appears in a specific event, with optional filters. See notes on individual parameters below.", response = Void.class, tags={ "docspublic", })
//    @ApiResponses(value = { 
//        @ApiResponse(code = 409, message = "Invalid value passed to filter.", response = Void.class) })
//    @RequestMapping(value = "/v1/public/events/{eventId}/creators",
//        method = RequestMethod.GET)
//    ResponseEntity<Void> getCreatorCollection(@ApiParam(value = "The event ID.",required=true ) @PathVariable("eventId") Integer eventId,
//         @ApiParam(value = "Filter by creator first name (e.g. brian).") @RequestParam(value = "firstName", required = false) String firstName,
//         @ApiParam(value = "Filter by creator middle name (e.g. Michael).") @RequestParam(value = "middleName", required = false) String middleName,
//         @ApiParam(value = "Filter by creator last name (e.g. Bendis).") @RequestParam(value = "lastName", required = false) String lastName,
//         @ApiParam(value = "Filter by suffix or honorific (e.g. Jr., Sr.).") @RequestParam(value = "suffix", required = false) String suffix,
//         @ApiParam(value = "Filter by creator names that match critera (e.g. B, St L).") @RequestParam(value = "nameStartsWith", required = false) String nameStartsWith,
//         @ApiParam(value = "Filter by creator first names that match critera (e.g. B, St L).") @RequestParam(value = "firstNameStartsWith", required = false) String firstNameStartsWith,
//         @ApiParam(value = "Filter by creator middle names that match critera (e.g. Mi).") @RequestParam(value = "middleNameStartsWith", required = false) String middleNameStartsWith,
//         @ApiParam(value = "Filter by creator last names that match critera (e.g. Ben).") @RequestParam(value = "lastNameStartsWith", required = false) String lastNameStartsWith,
//         @ApiParam(value = "Return only creators which have been modified since the specified date.") @RequestParam(value = "modifiedSince", required = false) DateTime modifiedSince,
//         @ApiParam(value = "Return only creators who worked on in the specified comics (accepts a comma-separated list of ids).") @RequestParam(value = "comics", required = false) List<Integer> comics,
//         @ApiParam(value = "Return only creators who worked on the specified series (accepts a comma-separated list of ids).") @RequestParam(value = "series", required = false) List<Integer> series,
//         @ApiParam(value = "Return only creators who worked on the specified stories (accepts a comma-separated list of ids).") @RequestParam(value = "stories", required = false) List<Integer> stories,
//         @ApiParam(value = "Order the result set by a field or fields. Add a \"-\" to the value sort in descending order. Multiple values are given priority in the order in which they are passed.") @RequestParam(value = "orderBy", required = false) List<String> orderBy,
//         @ApiParam(value = "Limit the result set to the specified number of resources.") @RequestParam(value = "limit", required = false) Integer limit,
//         @ApiParam(value = "Skip the specified number of resources in the result set.") @RequestParam(value = "offset", required = false) Integer offset);
    @ApiOperation(value = "Fetches lists of events filtered by a creator id.", notes = "Fetches lists of events featuring the work of a specific creator with optional filters. See notes on individual parameters below.", response = Void.class, tags = {"docspublic",})
    @ApiResponses(value = {
        @ApiResponse(code = 409, message = "Invalid value passed to filter.", response = Void.class)})
    @RequestMapping(value = "/v1/public/creators/{creatorId}/events",
            method = RequestMethod.GET)
    ResponseEntity<Void> getCreatorEventsCollection(@ApiParam(value = "The creator ID.", required = true) @PathVariable("creatorId") Integer creatorId,
            @ApiParam(value = "Filter the event list by name.") @RequestParam(value = "name", required = false) String name,
            @ApiParam(value = "Return events with names that begin with the specified string (e.g. Sp).") @RequestParam(value = "nameStartsWith", required = false) String nameStartsWith,
            @ApiParam(value = "Return only events which have been modified since the specified date.") @RequestParam(value = "modifiedSince", required = false) DateTime modifiedSince,
            @ApiParam(value = "Return only events which feature the specified characters (accepts a comma-separated list of ids).") @RequestParam(value = "characters", required = false) List<Integer> characters,
            @ApiParam(value = "Return only events which are part of the specified series (accepts a comma-separated list of ids).") @RequestParam(value = "series", required = false) List<Integer> series,
            @ApiParam(value = "Return only events which take place in the specified comics (accepts a comma-separated list of ids).") @RequestParam(value = "comics", required = false) List<Integer> comics,
            @ApiParam(value = "Return only events which contain the specified stories (accepts a comma-separated list of ids).") @RequestParam(value = "stories", required = false) List<Integer> stories,
            @ApiParam(value = "Order the result set by a field or fields. Add a \"-\" to the value sort in descending order. Multiple values are given priority in the order in which they are passed.") @RequestParam(value = "orderBy", required = false) List<String> orderBy,
            @ApiParam(value = "Limit the result set to the specified number of resources.") @RequestParam(value = "limit", required = false) Integer limit,
            @ApiParam(value = "Skip the specified number of resources in the result set.") @RequestParam(value = "offset", required = false) Integer offset);

    @ApiOperation(value = "Fetches a single creator by id.", notes = "This method fetches a single creator resource.  It is the canonical URI for any creator resource provided by the API.", response = Void.class, tags = {"docspublic",})
    @ApiResponses(value = {
        @ApiResponse(code = 404, message = "Creator not found.", response = Void.class)})
    @RequestMapping(value = "/v1/public/creators/{creatorId}",
            method = RequestMethod.GET)
    ResponseEntity<Void> getCreatorIndividual(@ApiParam(value = "A single creator id.", required = true) @PathVariable("creatorId") Integer creatorId);

    @ApiOperation(value = "Fetches lists of series filtered by a creator id.", notes = "Fetches lists of comic series in which a specific creator's work appears, with optional filters. See notes on individual parameters below.", response = Void.class, tags = {"docspublic",})
    @ApiResponses(value = {
        @ApiResponse(code = 409, message = "Invalid value passed to filter.", response = Void.class)})
    @RequestMapping(value = "/v1/public/creators/{creatorId}/series",
            method = RequestMethod.GET)
    ResponseEntity<Void> getCreatorSeriesCollection(@ApiParam(value = "The creator ID.", required = true) @PathVariable("creatorId") Integer creatorId,
            @ApiParam(value = "Filter by series title.") @RequestParam(value = "title", required = false) String title,
            @ApiParam(value = "Return series with titles that begin with the specified string (e.g. Sp).") @RequestParam(value = "titleStartsWith", required = false) String titleStartsWith,
            @ApiParam(value = "Return only series matching the specified start year.") @RequestParam(value = "startYear", required = false) Integer startYear,
            @ApiParam(value = "Return only series which have been modified since the specified date.") @RequestParam(value = "modifiedSince", required = false) DateTime modifiedSince,
            @ApiParam(value = "Return only series which contain the specified comics (accepts a comma-separated list of ids).") @RequestParam(value = "comics", required = false) List<Integer> comics,
            @ApiParam(value = "Return only series which contain the specified stories (accepts a comma-separated list of ids).") @RequestParam(value = "stories", required = false) List<Integer> stories,
            @ApiParam(value = "Return only series which have comics that take place during the specified events (accepts a comma-separated list of ids).") @RequestParam(value = "events", required = false) List<Integer> events,
            @ApiParam(value = "Return only series which feature the specified characters (accepts a comma-separated list of ids).") @RequestParam(value = "characters", required = false) List<Integer> characters,
            @ApiParam(value = "Filter the series by publication frequency type.", allowableValues = "COLLECTION, ONE_SHOT, LIMITED, ONGOING") @RequestParam(value = "seriesType", required = false) String seriesType,
            @ApiParam(value = "Return only series containing one or more comics with the specified format.") @RequestParam(value = "contains", required = false) List<String> contains,
            @ApiParam(value = "Order the result set by a field or fields. Add a \"-\" to the value sort in descending order. Multiple values are given priority in the order in which they are passed.") @RequestParam(value = "orderBy", required = false) List<String> orderBy,
            @ApiParam(value = "Limit the result set to the specified number of resources.") @RequestParam(value = "limit", required = false) Integer limit,
            @ApiParam(value = "Skip the specified number of resources in the result set.") @RequestParam(value = "offset", required = false) Integer offset);

    @ApiOperation(value = "Fetches lists of stories filtered by a creator id.", notes = "Fetches lists of comic stories by a specific creator with optional filters. See notes on individual parameters below.", response = Void.class, tags = {"docspublic",})
    @ApiResponses(value = {
        @ApiResponse(code = 409, message = "Invalid value passed to filter.", response = Void.class)})
    @RequestMapping(value = "/v1/public/creators/{creatorId}/stories",
            method = RequestMethod.GET)
    ResponseEntity<Void> getCreatorStoryCollection(@ApiParam(value = "The ID of the creator.", required = true) @PathVariable("creatorId") Integer creatorId,
            @ApiParam(value = "Return only stories which have been modified since the specified date.") @RequestParam(value = "modifiedSince", required = false) DateTime modifiedSince,
            @ApiParam(value = "Return only stories contained in the specified comics (accepts a comma-separated list of ids).") @RequestParam(value = "comics", required = false) List<Integer> comics,
            @ApiParam(value = "Return only stories contained the specified series (accepts a comma-separated list of ids).") @RequestParam(value = "series", required = false) List<Integer> series,
            @ApiParam(value = "Return only stories which take place during the specified events (accepts a comma-separated list of ids).") @RequestParam(value = "events", required = false) List<Integer> events,
            @ApiParam(value = "Return only stories which feature the specified characters (accepts a comma-separated list of ids).") @RequestParam(value = "characters", required = false) List<Integer> characters,
            @ApiParam(value = "Order the result set by a field or fields. Add a \"-\" to the value sort in descending order. Multiple values are given priority in the order in which they are passed.") @RequestParam(value = "orderBy", required = false) List<String> orderBy,
            @ApiParam(value = "Limit the result set to the specified number of resources.") @RequestParam(value = "limit", required = false) Integer limit,
            @ApiParam(value = "Skip the specified number of resources in the result set.") @RequestParam(value = "offset", required = false) Integer offset);

    @ApiOperation(value = "Fetches lists of characters filtered by an event id.", notes = "Fetches lists of characters which appear in a specific event, with optional filters. See notes on individual parameters below.", response = Void.class, tags = {"docspublic",})
    @ApiResponses(value = {
        @ApiResponse(code = 409, message = "Invalid value passed to filter.", response = Void.class)})
    @RequestMapping(value = "/v1/public/events/{eventId}/characters",
            method = RequestMethod.GET)
    ResponseEntity<Void> getEventCharacterCollection(@ApiParam(value = "The event ID", required = true) @PathVariable("eventId") Integer eventId,
            @ApiParam(value = "Return only characters matching the specified full character name (e.g. Spider-Man).") @RequestParam(value = "name", required = false) String name,
            @ApiParam(value = "Return characters with names that begin with the specified string (e.g. Sp).") @RequestParam(value = "nameStartsWith", required = false) String nameStartsWith,
            @ApiParam(value = "Return only characters which have been modified since the specified date.") @RequestParam(value = "modifiedSince", required = false) DateTime modifiedSince,
            @ApiParam(value = "Return only characters which appear in the specified comics (accepts a comma-separated list of ids).") @RequestParam(value = "comics", required = false) List<Integer> comics,
            @ApiParam(value = "Return only characters which appear the specified series (accepts a comma-separated list of ids).") @RequestParam(value = "series", required = false) List<Integer> series,
            @ApiParam(value = "Return only characters which appear the specified stories (accepts a comma-separated list of ids).") @RequestParam(value = "stories", required = false) List<Integer> stories,
            @ApiParam(value = "Order the result set by a field or fields. Add a \"-\" to the value sort in descending order. Multiple values are given priority in the order in which they are passed.") @RequestParam(value = "orderBy", required = false) List<String> orderBy,
            @ApiParam(value = "Limit the result set to the specified number of resources.") @RequestParam(value = "limit", required = false) Integer limit,
            @ApiParam(value = "Skip the specified number of resources in the result set.") @RequestParam(value = "offset", required = false) Integer offset);

    @ApiOperation(value = "Fetches a single event by id.", notes = "This method fetches a single event resource.  It is the canonical URI for any event resource provided by the API.", response = Void.class, tags = {"docspublic",})
    @ApiResponses(value = {
        @ApiResponse(code = 404, message = "Event not found.", response = Void.class)})
    @RequestMapping(value = "/v1/public/events/{eventId}",
            method = RequestMethod.GET)
    ResponseEntity<Void> getEventIndividual(@ApiParam(value = "A single event.", required = true) @PathVariable("eventId") Integer eventId);

    @ApiOperation(value = "Fetches lists of series filtered by an event id.", notes = "Fetches lists of comic series in which a specific event takes place, with optional filters. See notes on individual parameters below.", response = Void.class, tags = {"docspublic",})
    @ApiResponses(value = {
        @ApiResponse(code = 409, message = "Invalid value passed to filter.", response = Void.class)})
    @RequestMapping(value = "/v1/public/events/{eventId}/series",
            method = RequestMethod.GET)
    ResponseEntity<Void> getEventSeriesCollection(@ApiParam(value = "The event ID.", required = true) @PathVariable("eventId") Integer eventId,
            @ApiParam(value = "Filter by series title.") @RequestParam(value = "title", required = false) String title,
            @ApiParam(value = "Return series with titles that begin with the specified string (e.g. Sp).") @RequestParam(value = "titleStartsWith", required = false) String titleStartsWith,
            @ApiParam(value = "Return only series matching the specified start year.") @RequestParam(value = "startYear", required = false) Integer startYear,
            @ApiParam(value = "Return only series which have been modified since the specified date.") @RequestParam(value = "modifiedSince", required = false) DateTime modifiedSince,
            @ApiParam(value = "Return only series which contain the specified comics (accepts a comma-separated list of ids).") @RequestParam(value = "comics", required = false) List<Integer> comics,
            @ApiParam(value = "Return only series which contain the specified stories (accepts a comma-separated list of ids).") @RequestParam(value = "stories", required = false) List<Integer> stories,
            @ApiParam(value = "Return only series which feature work by the specified creators (accepts a comma-separated list of ids).") @RequestParam(value = "creators", required = false) List<Integer> creators,
            @ApiParam(value = "Return only series which feature the specified characters (accepts a comma-separated list of ids).") @RequestParam(value = "characters", required = false) List<Integer> characters,
            @ApiParam(value = "Filter the series by publication frequency type.", allowableValues = "COLLECTION, ONE_SHOT, LIMITED, ONGOING") @RequestParam(value = "seriesType", required = false) String seriesType,
            @ApiParam(value = "Return only series containing one or more comics with the specified format.") @RequestParam(value = "contains", required = false) List<String> contains,
            @ApiParam(value = "Order the result set by a field or fields. Add a \"-\" to the value sort in descending order. Multiple values are given priority in the order in which they are passed.") @RequestParam(value = "orderBy", required = false) List<String> orderBy,
            @ApiParam(value = "Limit the result set to the specified number of resources.") @RequestParam(value = "limit", required = false) Integer limit,
            @ApiParam(value = "Skip the specified number of resources in the result set.") @RequestParam(value = "offset", required = false) Integer offset);

    @ApiOperation(value = "Fetches lists of stories filtered by an event id.", notes = "Fetches lists of comic stories from a specific event, with optional filters. See notes on individual parameters below.", response = Void.class, tags = {"docspublic",})
    @ApiResponses(value = {
        @ApiResponse(code = 409, message = "Invalid value passed to filter.", response = Void.class)})
    @RequestMapping(value = "/v1/public/events/{eventId}/stories",
            method = RequestMethod.GET)
    ResponseEntity<Void> getEventStoryCollection(@ApiParam(value = "The ID of the event.", required = true) @PathVariable("eventId") Integer eventId,
            @ApiParam(value = "Return only stories which have been modified since the specified date.") @RequestParam(value = "modifiedSince", required = false) DateTime modifiedSince,
            @ApiParam(value = "Return only stories contained in the specified (accepts a comma-separated list of ids).") @RequestParam(value = "comics", required = false) List<Integer> comics,
            @ApiParam(value = "Return only stories contained the specified series (accepts a comma-separated list of ids).") @RequestParam(value = "series", required = false) List<Integer> series,
            @ApiParam(value = "Return only stories which feature work by the specified creators (accepts a comma-separated list of ids).") @RequestParam(value = "creators", required = false) List<Integer> creators,
            @ApiParam(value = "Return only stories which feature the specified characters (accepts a comma-separated list of ids).") @RequestParam(value = "characters", required = false) List<Integer> characters,
            @ApiParam(value = "Order the result set by a field or fields. Add a \"-\" to the value sort in descending order. Multiple values are given priority in the order in which they are passed.") @RequestParam(value = "orderBy", required = false) List<String> orderBy,
            @ApiParam(value = "Limit the result set to the specified number of resources.") @RequestParam(value = "limit", required = false) Integer limit,
            @ApiParam(value = "Skip the specified number of resources in the result set.") @RequestParam(value = "offset", required = false) Integer offset);

    @ApiOperation(value = "Fetches lists of events filtered by a story id.", notes = "Fetches lists of events in which a specific story appears, with optional filters. See notes on individual parameters below.", response = Void.class, tags = {"docspublic",})
    @ApiResponses(value = {
        @ApiResponse(code = 409, message = "Invalid value passed to filter.", response = Void.class)})
    @RequestMapping(value = "/v1/public/stories/{storyId}/events",
            method = RequestMethod.GET)
    ResponseEntity<Void> getEventsCollection(@ApiParam(value = "The story ID.", required = true) @PathVariable("storyId") Integer storyId,
            @ApiParam(value = "Filter the event list by name.") @RequestParam(value = "name", required = false) String name,
            @ApiParam(value = "Return events with names that begin with the specified string (e.g. Sp).") @RequestParam(value = "nameStartsWith", required = false) String nameStartsWith,
            @ApiParam(value = "Return only events which have been modified since the specified date.") @RequestParam(value = "modifiedSince", required = false) DateTime modifiedSince,
            @ApiParam(value = "Return only events which feature work by the specified creators (accepts a comma-separated list of ids).") @RequestParam(value = "creators", required = false) List<Integer> creators,
            @ApiParam(value = "Return only events which feature the specified characters (accepts a comma-separated list of ids).") @RequestParam(value = "characters", required = false) List<Integer> characters,
            @ApiParam(value = "Return only events which are part of the specified series (accepts a comma-separated list of ids).") @RequestParam(value = "series", required = false) List<Integer> series,
            @ApiParam(value = "Return only events which take place in the specified comics (accepts a comma-separated list of ids).") @RequestParam(value = "comics", required = false) List<Integer> comics,
            @ApiParam(value = "Order the result set by a field or fields. Add a \"-\" to the value sort in descending order. Multiple values are given priority in the order in which they are passed.") @RequestParam(value = "orderBy", required = false) List<String> orderBy,
            @ApiParam(value = "Limit the result set to the specified number of resources.") @RequestParam(value = "limit", required = false) Integer limit,
            @ApiParam(value = "Skip the specified number of resources in the result set.") @RequestParam(value = "offset", required = false) Integer offset);

//    @ApiOperation(value = "Fetches lists of events filtered by a series id.", notes = "Fetches lists of events which occur in a specific series, with optional filters. See notes on individual parameters below.", response = Void.class, tags={ "docspublic", })
//    @ApiResponses(value = { 
//        @ApiResponse(code = 409, message = "Invalid value passed to filter.", response = Void.class) })
//    @RequestMapping(value = "/v1/public/series/{seriesId}/events",
//        method = RequestMethod.GET)
//    ResponseEntity<Void> getEventsCollection(@ApiParam(value = "The series ID.",required=true ) @PathVariable("seriesId") Integer seriesId,
//         @ApiParam(value = "Filter the event list by name.") @RequestParam(value = "name", required = false) String name,
//         @ApiParam(value = "Return events with names that begin with the specified string (e.g. Sp).") @RequestParam(value = "nameStartsWith", required = false) String nameStartsWith,
//         @ApiParam(value = "Return only events which have been modified since the specified date.") @RequestParam(value = "modifiedSince", required = false) DateTime modifiedSince,
//         @ApiParam(value = "Return only events which feature work by the specified creators (accepts a comma-separated list of ids).") @RequestParam(value = "creators", required = false) List<Integer> creators,
//         @ApiParam(value = "Return only events which feature the specified characters (accepts a comma-separated list of ids).") @RequestParam(value = "characters", required = false) List<Integer> characters,
//         @ApiParam(value = "Return only events which take place in the specified comics (accepts a comma-separated list of ids).") @RequestParam(value = "comics", required = false) List<Integer> comics,
//         @ApiParam(value = "Return only events which contain the specified stories (accepts a comma-separated list of ids).") @RequestParam(value = "stories", required = false) List<Integer> stories,
//         @ApiParam(value = "Order the result set by a field or fields. Add a \"-\" to the value sort in descending order. Multiple values are given priority in the order in which they are passed.") @RequestParam(value = "orderBy", required = false) List<String> orderBy,
//         @ApiParam(value = "Limit the result set to the specified number of resources.") @RequestParam(value = "limit", required = false) Integer limit,
//         @ApiParam(value = "Skip the specified number of resources in the result set.") @RequestParam(value = "offset", required = false) Integer offset);
    @ApiOperation(value = "Fetches lists of events.", notes = "Fetches lists of events with optional filters. See notes on individual parameters below.", response = Void.class, tags = {"docspublic",})
    @ApiResponses(value = {
        @ApiResponse(code = 409, message = "Invalid value passed to filter.", response = Void.class)})
    @RequestMapping(value = "/v1/public/events",
            method = RequestMethod.GET)
    ResponseEntity<Void> getEventsCollection(@ApiParam(value = "Return only events which match the specified name.") @RequestParam(value = "name", required = false) String name,
            @ApiParam(value = "Return events with names that begin with the specified string (e.g. Sp).") @RequestParam(value = "nameStartsWith", required = false) String nameStartsWith,
            @ApiParam(value = "Return only events which have been modified since the specified date.") @RequestParam(value = "modifiedSince", required = false) DateTime modifiedSince,
            @ApiParam(value = "Return only events which feature work by the specified creators (accepts a comma-separated list of ids).") @RequestParam(value = "creators", required = false) List<Integer> creators,
            @ApiParam(value = "Return only events which feature the specified characters (accepts a comma-separated list of ids).") @RequestParam(value = "characters", required = false) List<Integer> characters,
            @ApiParam(value = "Return only events which are part of the specified series (accepts a comma-separated list of ids).") @RequestParam(value = "series", required = false) List<Integer> series,
            @ApiParam(value = "Return only events which take place in the specified comics (accepts a comma-separated list of ids).") @RequestParam(value = "comics", required = false) List<Integer> comics,
            @ApiParam(value = "Return only events which take place in the specified stories (accepts a comma-separated list of ids).") @RequestParam(value = "stories", required = false) List<Integer> stories,
            @ApiParam(value = "Order the result set by a field or fields. Add a \"-\" to the value sort in descending order. Multiple values are given priority in the order in which they are passed.") @RequestParam(value = "orderBy", required = false) List<String> orderBy,
            @ApiParam(value = "Limit the result set to the specified number of resources.") @RequestParam(value = "limit", required = false) Integer limit,
            @ApiParam(value = "Skip the specified number of resources in the result set.") @RequestParam(value = "offset", required = false) Integer offset);

    @ApiOperation(value = "Fetches lists of events filtered by a comic id.", notes = "Fetches lists of events in which a specific comic appears, with optional filters. See notes on individual parameters below.", response = Void.class, tags = {"docspublic",})
    @ApiResponses(value = {
        @ApiResponse(code = 409, message = "Invalid value passed to filter.", response = Void.class)})
    @RequestMapping(value = "/v1/public/comics/{comicId}/events",
            method = RequestMethod.GET)
    ResponseEntity<Void> getIssueEventsCollection(@ApiParam(value = "The comic ID.", required = true) @PathVariable("comicId") Integer comicId,
            @ApiParam(value = "Filter the event list by name.") @RequestParam(value = "name", required = false) String name,
            @ApiParam(value = "Return events with names that begin with the specified string (e.g. Sp).") @RequestParam(value = "nameStartsWith", required = false) String nameStartsWith,
            @ApiParam(value = "Return only events which have been modified since the specified date.") @RequestParam(value = "modifiedSince", required = false) DateTime modifiedSince,
            @ApiParam(value = "Return only events which feature work by the specified creators (accepts a comma-separated list of ids).") @RequestParam(value = "creators", required = false) List<Integer> creators,
            @ApiParam(value = "Return only events which feature the specified characters (accepts a comma-separated list of ids).") @RequestParam(value = "characters", required = false) List<Integer> characters,
            @ApiParam(value = "Return only events which are part of the specified series (accepts a comma-separated list of ids).") @RequestParam(value = "series", required = false) List<Integer> series,
            @ApiParam(value = "Return only events which contain the specified stories (accepts a comma-separated list of ids).") @RequestParam(value = "stories", required = false) List<Integer> stories,
            @ApiParam(value = "Order the result set by a field or fields. Add a \"-\" to the value sort in descending order. Multiple values are given priority in the order in which they are passed.") @RequestParam(value = "orderBy", required = false) List<String> orderBy,
            @ApiParam(value = "Limit the result set to the specified number of resources.") @RequestParam(value = "limit", required = false) Integer limit,
            @ApiParam(value = "Skip the specified number of resources in the result set.") @RequestParam(value = "offset", required = false) Integer offset);

    @ApiOperation(value = "Fetches lists of characters filtered by a series id.", notes = "Fetches lists of characters which appear in specific series, with optional filters. See notes on individual parameters below.", response = Void.class, tags = {"docspublic",})
    @ApiResponses(value = {
        @ApiResponse(code = 409, message = "Invalid value passed to filter.", response = Void.class)})
    @RequestMapping(value = "/v1/public/series/{seriesId}/characters",
            method = RequestMethod.GET)
    ResponseEntity<Void> getSeriesCharacterWrapper(@ApiParam(value = "The series id.", required = true) @PathVariable("seriesId") Integer seriesId,
            @ApiParam(value = "Return only characters matching the specified full character name (e.g. Spider-Man).") @RequestParam(value = "name", required = false) String name,
            @ApiParam(value = "Return characters with names that begin with the specified string (e.g. Sp).") @RequestParam(value = "nameStartsWith", required = false) String nameStartsWith,
            @ApiParam(value = "Return only characters which have been modified since the specified date.") @RequestParam(value = "modifiedSince", required = false) DateTime modifiedSince,
            @ApiParam(value = "Return only characters which appear in the specified comics (accepts a comma-separated list of ids).") @RequestParam(value = "comics", required = false) List<Integer> comics,
            @ApiParam(value = "Return only characters which appear comics that took place in the specified events (accepts a comma-separated list of ids).") @RequestParam(value = "events", required = false) List<Integer> events,
            @ApiParam(value = "Return only characters which appear the specified stories (accepts a comma-separated list of ids).") @RequestParam(value = "stories", required = false) List<Integer> stories,
            @ApiParam(value = "Order the result set by a field or fields. Add a \"-\" to the value sort in descending order. Multiple values are given priority in the order in which they are passed.") @RequestParam(value = "orderBy", required = false) List<String> orderBy,
            @ApiParam(value = "Limit the result set to the specified number of resources.") @RequestParam(value = "limit", required = false) Integer limit,
            @ApiParam(value = "Skip the specified number of resources in the result set.") @RequestParam(value = "offset", required = false) Integer offset);

    @ApiOperation(value = "Fetches lists of series.", notes = "Fetches lists of comic series with optional filters. See notes on individual parameters below.", response = Void.class, tags = {"docspublic",})
    @ApiResponses(value = {
        @ApiResponse(code = 409, message = "Invalid value passed to filter.", response = Void.class)})
    @RequestMapping(value = "/v1/public/series",
            method = RequestMethod.GET)
    ResponseEntity<Void> getSeriesCollection(@ApiParam(value = "Return only series matching the specified title.") @RequestParam(value = "title", required = false) String title,
            @ApiParam(value = "Return series with titles that begin with the specified string (e.g. Sp).") @RequestParam(value = "titleStartsWith", required = false) String titleStartsWith,
            @ApiParam(value = "Return only series matching the specified start year.") @RequestParam(value = "startYear", required = false) Integer startYear,
            @ApiParam(value = "Return only series which have been modified since the specified date.") @RequestParam(value = "modifiedSince", required = false) DateTime modifiedSince,
            @ApiParam(value = "Return only series which contain the specified comics (accepts a comma-separated list of ids).") @RequestParam(value = "comics", required = false) List<Integer> comics,
            @ApiParam(value = "Return only series which contain the specified stories (accepts a comma-separated list of ids).") @RequestParam(value = "stories", required = false) List<Integer> stories,
            @ApiParam(value = "Return only series which have comics that take place during the specified events (accepts a comma-separated list of ids).") @RequestParam(value = "events", required = false) List<Integer> events,
            @ApiParam(value = "Return only series which feature work by the specified creators (accepts a comma-separated list of ids).") @RequestParam(value = "creators", required = false) List<Integer> creators,
            @ApiParam(value = "Return only series which feature the specified characters (accepts a comma-separated list of ids).") @RequestParam(value = "characters", required = false) List<Integer> characters,
            @ApiParam(value = "Filter the series by publication frequency type.", allowableValues = "COLLECTION, ONE_SHOT, LIMITED, ONGOING") @RequestParam(value = "seriesType", required = false) String seriesType,
            @ApiParam(value = "Return only series containing one or more comics with the specified format.") @RequestParam(value = "contains", required = false) List<String> contains,
            @ApiParam(value = "Order the result set by a field or fields. Add a \"-\" to the value sort in descending order. Multiple values are given priority in the order in which they are passed.") @RequestParam(value = "orderBy", required = false) List<String> orderBy,
            @ApiParam(value = "Limit the result set to the specified number of resources.") @RequestParam(value = "limit", required = false) Integer limit,
            @ApiParam(value = "Skip the specified number of resources in the result set.") @RequestParam(value = "offset", required = false) Integer offset);

    @ApiOperation(value = "Fetches a single comic series by id.", notes = "This method fetches a single comic series resource.  It is the canonical URI for any comic series resource provided by the API.", response = Void.class, tags = {"docspublic",})
    @ApiResponses(value = {
        @ApiResponse(code = 404, message = "Series not found.", response = Void.class)})
    @RequestMapping(value = "/v1/public/series/{seriesId}",
            method = RequestMethod.GET)
    ResponseEntity<Void> getSeriesIndividual(@ApiParam(value = "Filter by series title.", required = true) @PathVariable("seriesId") Integer seriesId);

    @ApiOperation(value = "Fetches lists of stories filtered by a series id.", notes = "Fetches lists of comic stories from a specific series with optional filters. See notes on individual parameters below.", response = Void.class, tags = {"docspublic",})
    @ApiResponses(value = {
        @ApiResponse(code = 409, message = "Invalid value passed to filter.", response = Void.class)})
    @RequestMapping(value = "/v1/public/series/{seriesId}/stories",
            method = RequestMethod.GET)
    ResponseEntity<Void> getSeriesStoryCollection(@ApiParam(value = "The series ID.", required = true) @PathVariable("seriesId") Integer seriesId,
            @ApiParam(value = "Return only stories which have been modified since the specified date.") @RequestParam(value = "modifiedSince", required = false) DateTime modifiedSince,
            @ApiParam(value = "Return only stories contained in the specified (accepts a comma-separated list of ids).") @RequestParam(value = "comics", required = false) List<Integer> comics,
            @ApiParam(value = "Return only stories which take place during the specified events (accepts a comma-separated list of ids).") @RequestParam(value = "events", required = false) List<Integer> events,
            @ApiParam(value = "Return only stories which feature work by the specified creators (accepts a comma-separated list of ids).") @RequestParam(value = "creators", required = false) List<Integer> creators,
            @ApiParam(value = "Return only stories which feature the specified characters (accepts a comma-separated list of ids).") @RequestParam(value = "characters", required = false) List<Integer> characters,
            @ApiParam(value = "Order the result set by a field or fields. Add a \"-\" to the value sort in descending order. Multiple values are given priority in the order in which they are passed.") @RequestParam(value = "orderBy", required = false) List<String> orderBy,
            @ApiParam(value = "Limit the result set to the specified number of resources.") @RequestParam(value = "limit", required = false) Integer limit,
            @ApiParam(value = "Skip the specified number of resources in the result set.") @RequestParam(value = "offset", required = false) Integer offset);

    @ApiOperation(value = "Fetches lists of stories.", notes = "Fetches lists of comic stories with optional filters. See notes on individual parameters below.", response = Void.class, tags = {"docspublic",})
    @ApiResponses(value = {
        @ApiResponse(code = 409, message = "Invalid value passed to filter.", response = Void.class)})
    @RequestMapping(value = "/v1/public/stories",
            method = RequestMethod.GET)
    ResponseEntity<Void> getStoryCollection(@ApiParam(value = "Return only stories which have been modified since the specified date.") @RequestParam(value = "modifiedSince", required = false) DateTime modifiedSince,
            @ApiParam(value = "Return only stories contained in the specified (accepts a comma-separated list of ids).") @RequestParam(value = "comics", required = false) List<Integer> comics,
            @ApiParam(value = "Return only stories contained the specified series (accepts a comma-separated list of ids).") @RequestParam(value = "series", required = false) List<Integer> series,
            @ApiParam(value = "Return only stories which take place during the specified events (accepts a comma-separated list of ids).") @RequestParam(value = "events", required = false) List<Integer> events,
            @ApiParam(value = "Return only stories which feature work by the specified creators (accepts a comma-separated list of ids).") @RequestParam(value = "creators", required = false) List<Integer> creators,
            @ApiParam(value = "Return only stories which feature the specified characters (accepts a comma-separated list of ids).") @RequestParam(value = "characters", required = false) List<Integer> characters,
            @ApiParam(value = "Order the result set by a field or fields. Add a \"-\" to the value sort in descending order. Multiple values are given priority in the order in which they are passed.") @RequestParam(value = "orderBy", required = false) List<String> orderBy,
            @ApiParam(value = "Limit the result set to the specified number of resources.") @RequestParam(value = "limit", required = false) Integer limit,
            @ApiParam(value = "Skip the specified number of resources in the result set.") @RequestParam(value = "offset", required = false) Integer offset);

    @ApiOperation(value = "Fetches a single comic story by id.", notes = "This method fetches a single comic story resource.  It is the canonical URI for any comic story resource provided by the API.", response = Void.class, tags = {"docspublic",})
    @ApiResponses(value = {
        @ApiResponse(code = 404, message = "Story not found.", response = Void.class)})
    @RequestMapping(value = "/v1/public/stories/{storyId}",
            method = RequestMethod.GET)
    ResponseEntity<Void> getStoryIndividual(@ApiParam(value = "Filter by story id.", required = true) @PathVariable("storyId") Integer storyId);

    @ApiOperation(value = "Fetches lists of series filtered by a story id.", notes = "Fetches lists of comic series in which the specified story takes place. See notes on individual parameters below.", response = Void.class, tags = {"docspublic",})
    @ApiResponses(value = {
        @ApiResponse(code = 409, message = "Invalid value passed to filter.", response = Void.class)})
    @RequestMapping(value = "/v1/public/stories/{storyId}/series",
            method = RequestMethod.GET)
    ResponseEntity<Void> getStorySeriesCollection(@ApiParam(value = "The story ID.", required = true) @PathVariable("storyId") Integer storyId,
            @ApiParam(value = "Return only series which have comics that take place during the specified events (accepts a comma-separated list of ids).") @RequestParam(value = "events", required = false) List<Integer> events,
            @ApiParam(value = "Filter by series title.") @RequestParam(value = "title", required = false) String title,
            @ApiParam(value = "Return series with titles that begin with the specified string (e.g. Sp).") @RequestParam(value = "titleStartsWith", required = false) String titleStartsWith,
            @ApiParam(value = "Return only series matching the specified start year.") @RequestParam(value = "startYear", required = false) Integer startYear,
            @ApiParam(value = "Return only series which have been modified since the specified date.") @RequestParam(value = "modifiedSince", required = false) DateTime modifiedSince,
            @ApiParam(value = "Return only series which contain the specified comics (accepts a comma-separated list of ids).") @RequestParam(value = "comics", required = false) List<Integer> comics,
            @ApiParam(value = "Return only series which feature work by the specified creators (accepts a comma-separated list of ids).") @RequestParam(value = "creators", required = false) List<Integer> creators,
            @ApiParam(value = "Return only series which feature the specified characters (accepts a comma-separated list of ids).") @RequestParam(value = "characters", required = false) List<Integer> characters,
            @ApiParam(value = "Filter the series by publication frequency type.", allowableValues = "COLLECTION, ONE_SHOT, LIMITED, ONGOING") @RequestParam(value = "seriesType", required = false) String seriesType,
            @ApiParam(value = "Return only series containing one or more comics with the specified format.") @RequestParam(value = "contains", required = false) List<String> contains,
            @ApiParam(value = "Order the result set by a field or fields. Add a \"-\" to the value sort in descending order. Multiple values are given priority in the order in which they are passed.") @RequestParam(value = "orderBy", required = false) List<String> orderBy,
            @ApiParam(value = "Limit the result set to the specified number of resources.") @RequestParam(value = "limit", required = false) Integer limit,
            @ApiParam(value = "Skip the specified number of resources in the result set.") @RequestParam(value = "offset", required = false) Integer offset);

}
