package io.swagger.api;

import io.swagger.annotations.*;
import java.util.List;
import org.joda.time.DateTime;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-05-06T14:36:16.418+03:00")

//@Controller
public class V1ApiController implements V1Api<Void> {

    public ResponseEntity<Void> getCharacterEventsCollection(@ApiParam(value = "The character ID.", required = true) @PathVariable("characterId") Integer characterId,
            @ApiParam(value = "Filter the event list by name.") @RequestParam(value = "name", required = false) String name,
            @ApiParam(value = "Return events with names that begin with the specified string (e.g. Sp).") @RequestParam(value = "nameStartsWith", required = false) String nameStartsWith,
            @ApiParam(value = "Return only events which have been modified since the specified date.") @RequestParam(value = "modifiedSince", required = false) DateTime modifiedSince,
            @ApiParam(value = "Return only events which feature work by the specified creators (accepts a comma-separated list of ids).") @RequestParam(value = "creators", required = false) List<Integer> creators,
            @ApiParam(value = "Return only events which are part of the specified series (accepts a comma-separated list of ids).") @RequestParam(value = "series", required = false) List<Integer> series,
            @ApiParam(value = "Return only events which take place in the specified comics (accepts a comma-separated list of ids).") @RequestParam(value = "comics", required = false) List<Integer> comics,
            @ApiParam(value = "Return only events which contain the specified stories (accepts a comma-separated list of ids).") @RequestParam(value = "stories", required = false) List<Integer> stories,
            @ApiParam(value = "Order the result set by a field or fields. Add a \"-\" to the value sort in descending order. Multiple values are given priority in the order in which they are passed.") @RequestParam(value = "orderBy", required = false) List<String> orderBy,
            @ApiParam(value = "Limit the result set to the specified number of resources.") @RequestParam(value = "limit", required = false) Integer limit,
            @ApiParam(value = "Skip the specified number of resources in the result set.") @RequestParam(value = "offset", required = false) Integer offset) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Void> getCharacterIndividual(@ApiParam(value = "A single character id.", required = true) @PathVariable("characterId") Integer characterId) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Void> getCharacterSeriesCollection(@ApiParam(value = "The character ID", required = true) @PathVariable("characterId") Integer characterId,
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
            @ApiParam(value = "Skip the specified number of resources in the result set.") @RequestParam(value = "offset", required = false) Integer offset) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Void> getCharacterStoryCollection(@ApiParam(value = "The character ID.", required = true) @PathVariable("characterId") Integer characterId,
            @ApiParam(value = "Return only stories which have been modified since the specified date.") @RequestParam(value = "modifiedSince", required = false) DateTime modifiedSince,
            @ApiParam(value = "Return only stories contained in the specified (accepts a comma-separated list of ids).") @RequestParam(value = "comics", required = false) List<Integer> comics,
            @ApiParam(value = "Return only stories contained the specified series (accepts a comma-separated list of ids).") @RequestParam(value = "series", required = false) List<Integer> series,
            @ApiParam(value = "Return only stories which take place during the specified events (accepts a comma-separated list of ids).") @RequestParam(value = "events", required = false) List<Integer> events,
            @ApiParam(value = "Return only stories which feature work by the specified creators (accepts a comma-separated list of ids).") @RequestParam(value = "creators", required = false) List<Integer> creators,
            @ApiParam(value = "Order the result set by a field or fields. Add a \"-\" to the value sort in descending order. Multiple values are given priority in the order in which they are passed.") @RequestParam(value = "orderBy", required = false) List<String> orderBy,
            @ApiParam(value = "Limit the result set to the specified number of resources.") @RequestParam(value = "limit", required = false) Integer limit,
            @ApiParam(value = "Skip the specified number of resources in the result set.") @RequestParam(value = "offset", required = false) Integer offset) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Void> getComicCharacterCollection(@ApiParam(value = "The comic id.", required = true) @PathVariable("comicId") Integer comicId,
            @ApiParam(value = "Return only characters matching the specified full character name (e.g. Spider-Man).") @RequestParam(value = "name", required = false) String name,
            @ApiParam(value = "Return characters with names that begin with the specified string (e.g. Sp).") @RequestParam(value = "nameStartsWith", required = false) String nameStartsWith,
            @ApiParam(value = "Return only characters which have been modified since the specified date.") @RequestParam(value = "modifiedSince", required = false) DateTime modifiedSince,
            @ApiParam(value = "Return only characters which appear the specified series (accepts a comma-separated list of ids).") @RequestParam(value = "series", required = false) List<Integer> series,
            @ApiParam(value = "Return only characters which appear comics that took place in the specified events (accepts a comma-separated list of ids).") @RequestParam(value = "events", required = false) List<Integer> events,
            @ApiParam(value = "Return only characters which appear the specified stories (accepts a comma-separated list of ids).") @RequestParam(value = "stories", required = false) List<Integer> stories,
            @ApiParam(value = "Order the result set by a field or fields. Add a \"-\" to the value sort in descending order. Multiple values are given priority in the order in which they are passed.") @RequestParam(value = "orderBy", required = false) List<String> orderBy,
            @ApiParam(value = "Limit the result set to the specified number of resources.") @RequestParam(value = "limit", required = false) Integer limit,
            @ApiParam(value = "Skip the specified number of resources in the result set.") @RequestParam(value = "offset", required = false) Integer offset) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Void> getComicIndividual(@ApiParam(value = "A single comic.", required = true) @PathVariable("comicId") Integer comicId) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Void> getComicStoryCollection(@ApiParam(value = "The comic ID.", required = true) @PathVariable("comicId") Integer comicId,
            @ApiParam(value = "Return only stories which have been modified since the specified date.") @RequestParam(value = "modifiedSince", required = false) DateTime modifiedSince,
            @ApiParam(value = "Return only stories contained the specified series (accepts a comma-separated list of ids).") @RequestParam(value = "series", required = false) List<Integer> series,
            @ApiParam(value = "Return only stories which take place during the specified events (accepts a comma-separated list of ids).") @RequestParam(value = "events", required = false) List<Integer> events,
            @ApiParam(value = "Return only stories which feature work by the specified creators (accepts a comma-separated list of ids).") @RequestParam(value = "creators", required = false) List<Integer> creators,
            @ApiParam(value = "Return only stories which feature the specified characters (accepts a comma-separated list of ids).") @RequestParam(value = "characters", required = false) List<Integer> characters,
            @ApiParam(value = "Order the result set by a field or fields. Add a \"-\" to the value sort in descending order. Multiple values are given priority in the order in which they are passed.") @RequestParam(value = "orderBy", required = false) List<String> orderBy,
            @ApiParam(value = "Limit the result set to the specified number of resources.") @RequestParam(value = "limit", required = false) Integer limit,
            @ApiParam(value = "Skip the specified number of resources.") @RequestParam(value = "offset", required = false) Integer offset) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Void> getComicsCharacterCollection(@ApiParam(value = "The character id.", required = true) @PathVariable("characterId") Integer characterId,
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
            @ApiParam(value = "Skip the specified number of resources in the result set.") @RequestParam(value = "offset", required = false) Integer offset) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Void> getComicsCollection(@ApiParam(value = "The creator ID.", required = true) @PathVariable("creatorId") Integer creatorId,
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
            @ApiParam(value = "Skip the specified number of resources in the result set.") @RequestParam(value = "offset", required = false) Integer offset) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Void> getComicsCollection(@ApiParam(value = "The event id.", required = true) @PathVariable("eventId") Integer eventId,
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
            @ApiParam(value = "Skip the specified number of resources in the result set.") @RequestParam(value = "offset", required = false) Integer offset) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Void> getComicsCollection(@ApiParam(value = "The series ID.", required = true) @PathVariable("seriesId") Integer seriesId,
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
            @ApiParam(value = "Skip the specified number of resources in the result set.") @RequestParam(value = "offset", required = false) Integer offset) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Void> getComicsCollection(@ApiParam(value = "Filter by the issue format (e.g. comic, digital comic, hardcover).", allowableValues = "COMIC, MAGAZINE, TRADE_PAPERBACK, HARDCOVER, DIGEST, GRAPHIC_NOVEL, DIGITAL_COMIC, INFINITE_COMIC") @RequestParam(value = "format", required = false) String format,
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
            @ApiParam(value = "Skip the specified number of resources in the result set.") @RequestParam(value = "offset", required = false) Integer offset) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

//    public ResponseEntity<Void> getComicsCollection(@ApiParam(value = "The story ID.",required=true ) @PathVariable("storyId") Integer storyId,
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
//         @ApiParam(value = "Skip the specified number of resources in the result set.") @RequestParam(value = "offset", required = false) Integer offset) {
//        // do some magic!
//        return new ResponseEntity<Void>(HttpStatus.OK);
//    }
    public ResponseEntity<Void> getCreatorCollection(@ApiParam(value = "Filter by creator first name (e.g. Brian).") @RequestParam(value = "firstName", required = false) String firstName,
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
            @ApiParam(value = "Skip the specified number of resources in the result set.") @RequestParam(value = "offset", required = false) Integer offset) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Void> getCreatorCollection(@ApiParam(value = "The story ID.", required = true) @PathVariable("storyId") Integer storyId,
            @ApiParam(value = "Return only characters matching the specified full character name (e.g. Spider-Man).") @RequestParam(value = "name", required = false) String name,
            @ApiParam(value = "Return characters with names that begin with the specified string (e.g. Sp).") @RequestParam(value = "nameStartsWith", required = false) String nameStartsWith,
            @ApiParam(value = "Return only characters which have been modified since the specified date.") @RequestParam(value = "modifiedSince", required = false) DateTime modifiedSince,
            @ApiParam(value = "Return only characters which appear in the specified comics (accepts a comma-separated list of ids).") @RequestParam(value = "comics", required = false) List<Integer> comics,
            @ApiParam(value = "Return only characters which appear the specified series (accepts a comma-separated list of ids).") @RequestParam(value = "series", required = false) List<Integer> series,
            @ApiParam(value = "Return only characters which appear comics that took place in the specified events (accepts a comma-separated list of ids).") @RequestParam(value = "events", required = false) List<Integer> events,
            @ApiParam(value = "Order the result set by a field or fields. Add a \"-\" to the value sort in descending order. Multiple values are given priority in the order in which they are passed.") @RequestParam(value = "orderBy", required = false) List<String> orderBy,
            @ApiParam(value = "Limit the result set to the specified number of resources.") @RequestParam(value = "limit", required = false) Integer limit,
            @ApiParam(value = "Skip the specified number of resources in the result set.") @RequestParam(value = "offset", required = false) Integer offset) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Void> getCreatorCollection(@ApiParam(value = "The series ID.", required = true) @PathVariable("seriesId") Integer seriesId,
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
            @ApiParam(value = "Skip the specified number of resources in the result set.") @RequestParam(value = "offset", required = false) Integer offset) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

//    public ResponseEntity<Void> getCreatorCollection(@ApiParam(value = "The comic id.",required=true ) @PathVariable("comicId") Integer comicId,
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
//         @ApiParam(value = "Skip the specified number of resources in the result set.") @RequestParam(value = "offset", required = false) Integer offset) {
//        // do some magic!
//        return new ResponseEntity<Void>(HttpStatus.OK);
//    }
    public ResponseEntity<Void> getCreatorCollection(@ApiParam(value = "Return only characters matching the specified full character name (e.g. Spider-Man).") @RequestParam(value = "name", required = false) String name,
            @ApiParam(value = "Return characters with names that begin with the specified string (e.g. Sp).") @RequestParam(value = "nameStartsWith", required = false) String nameStartsWith,
            @ApiParam(value = "Return only characters which have been modified since the specified date.") @RequestParam(value = "modifiedSince", required = false) DateTime modifiedSince,
            @ApiParam(value = "Return only characters which appear in the specified comics (accepts a comma-separated list of ids).") @RequestParam(value = "comics", required = false) List<Integer> comics,
            @ApiParam(value = "Return only characters which appear the specified series (accepts a comma-separated list of ids).") @RequestParam(value = "series", required = false) List<Integer> series,
            @ApiParam(value = "Return only characters which appear in the specified events (accepts a comma-separated list of ids).") @RequestParam(value = "events", required = false) List<Integer> events,
            @ApiParam(value = "Return only characters which appear the specified stories (accepts a comma-separated list of ids).") @RequestParam(value = "stories", required = false) List<Integer> stories,
            @ApiParam(value = "Order the result set by a field or fields. Add a \"-\" to the value sort in descending order. Multiple values are given priority in the order in which they are passed.") @RequestParam(value = "orderBy", required = false) List<String> orderBy,
            @ApiParam(value = "Limit the result set to the specified number of resources.") @RequestParam(value = "limit", required = false) Integer limit,
            @ApiParam(value = "Skip the specified number of resources in the result set.") @RequestParam(value = "offset", required = false) Integer offset) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

//    public ResponseEntity<Void> getCreatorCollection(@ApiParam(value = "The story ID.",required=true ) @PathVariable("storyId") Integer storyId,
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
//         @ApiParam(value = "Skip the specified number of resources in the result set.") @RequestParam(value = "offset", required = false) Integer offset) {
//        // do some magic!
//        return new ResponseEntity<Void>(HttpStatus.OK);
//    }
//    public ResponseEntity<Void> getCreatorCollection(@ApiParam(value = "The event ID.",required=true ) @PathVariable("eventId") Integer eventId,
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
//         @ApiParam(value = "Skip the specified number of resources in the result set.") @RequestParam(value = "offset", required = false) Integer offset) {
//        // do some magic!
//        return new ResponseEntity<Void>(HttpStatus.OK);
//    }
    public ResponseEntity<Void> getCreatorEventsCollection(@ApiParam(value = "The creator ID.", required = true) @PathVariable("creatorId") Integer creatorId,
            @ApiParam(value = "Filter the event list by name.") @RequestParam(value = "name", required = false) String name,
            @ApiParam(value = "Return events with names that begin with the specified string (e.g. Sp).") @RequestParam(value = "nameStartsWith", required = false) String nameStartsWith,
            @ApiParam(value = "Return only events which have been modified since the specified date.") @RequestParam(value = "modifiedSince", required = false) DateTime modifiedSince,
            @ApiParam(value = "Return only events which feature the specified characters (accepts a comma-separated list of ids).") @RequestParam(value = "characters", required = false) List<Integer> characters,
            @ApiParam(value = "Return only events which are part of the specified series (accepts a comma-separated list of ids).") @RequestParam(value = "series", required = false) List<Integer> series,
            @ApiParam(value = "Return only events which take place in the specified comics (accepts a comma-separated list of ids).") @RequestParam(value = "comics", required = false) List<Integer> comics,
            @ApiParam(value = "Return only events which contain the specified stories (accepts a comma-separated list of ids).") @RequestParam(value = "stories", required = false) List<Integer> stories,
            @ApiParam(value = "Order the result set by a field or fields. Add a \"-\" to the value sort in descending order. Multiple values are given priority in the order in which they are passed.") @RequestParam(value = "orderBy", required = false) List<String> orderBy,
            @ApiParam(value = "Limit the result set to the specified number of resources.") @RequestParam(value = "limit", required = false) Integer limit,
            @ApiParam(value = "Skip the specified number of resources in the result set.") @RequestParam(value = "offset", required = false) Integer offset) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Void> getCreatorIndividual(@ApiParam(value = "A single creator id.", required = true) @PathVariable("creatorId") Integer creatorId) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Void> getCreatorSeriesCollection(@ApiParam(value = "The creator ID.", required = true) @PathVariable("creatorId") Integer creatorId,
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
            @ApiParam(value = "Skip the specified number of resources in the result set.") @RequestParam(value = "offset", required = false) Integer offset) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Void> getCreatorStoryCollection(@ApiParam(value = "The ID of the creator.", required = true) @PathVariable("creatorId") Integer creatorId,
            @ApiParam(value = "Return only stories which have been modified since the specified date.") @RequestParam(value = "modifiedSince", required = false) DateTime modifiedSince,
            @ApiParam(value = "Return only stories contained in the specified comics (accepts a comma-separated list of ids).") @RequestParam(value = "comics", required = false) List<Integer> comics,
            @ApiParam(value = "Return only stories contained the specified series (accepts a comma-separated list of ids).") @RequestParam(value = "series", required = false) List<Integer> series,
            @ApiParam(value = "Return only stories which take place during the specified events (accepts a comma-separated list of ids).") @RequestParam(value = "events", required = false) List<Integer> events,
            @ApiParam(value = "Return only stories which feature the specified characters (accepts a comma-separated list of ids).") @RequestParam(value = "characters", required = false) List<Integer> characters,
            @ApiParam(value = "Order the result set by a field or fields. Add a \"-\" to the value sort in descending order. Multiple values are given priority in the order in which they are passed.") @RequestParam(value = "orderBy", required = false) List<String> orderBy,
            @ApiParam(value = "Limit the result set to the specified number of resources.") @RequestParam(value = "limit", required = false) Integer limit,
            @ApiParam(value = "Skip the specified number of resources in the result set.") @RequestParam(value = "offset", required = false) Integer offset) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Void> getEventCharacterCollection(@ApiParam(value = "The event ID", required = true) @PathVariable("eventId") Integer eventId,
            @ApiParam(value = "Return only characters matching the specified full character name (e.g. Spider-Man).") @RequestParam(value = "name", required = false) String name,
            @ApiParam(value = "Return characters with names that begin with the specified string (e.g. Sp).") @RequestParam(value = "nameStartsWith", required = false) String nameStartsWith,
            @ApiParam(value = "Return only characters which have been modified since the specified date.") @RequestParam(value = "modifiedSince", required = false) DateTime modifiedSince,
            @ApiParam(value = "Return only characters which appear in the specified comics (accepts a comma-separated list of ids).") @RequestParam(value = "comics", required = false) List<Integer> comics,
            @ApiParam(value = "Return only characters which appear the specified series (accepts a comma-separated list of ids).") @RequestParam(value = "series", required = false) List<Integer> series,
            @ApiParam(value = "Return only characters which appear the specified stories (accepts a comma-separated list of ids).") @RequestParam(value = "stories", required = false) List<Integer> stories,
            @ApiParam(value = "Order the result set by a field or fields. Add a \"-\" to the value sort in descending order. Multiple values are given priority in the order in which they are passed.") @RequestParam(value = "orderBy", required = false) List<String> orderBy,
            @ApiParam(value = "Limit the result set to the specified number of resources.") @RequestParam(value = "limit", required = false) Integer limit,
            @ApiParam(value = "Skip the specified number of resources in the result set.") @RequestParam(value = "offset", required = false) Integer offset) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Void> getEventIndividual(@ApiParam(value = "A single event.", required = true) @PathVariable("eventId") Integer eventId) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Void> getEventSeriesCollection(@ApiParam(value = "The event ID.", required = true) @PathVariable("eventId") Integer eventId,
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
            @ApiParam(value = "Skip the specified number of resources in the result set.") @RequestParam(value = "offset", required = false) Integer offset) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Void> getEventStoryCollection(@ApiParam(value = "The ID of the event.", required = true) @PathVariable("eventId") Integer eventId,
            @ApiParam(value = "Return only stories which have been modified since the specified date.") @RequestParam(value = "modifiedSince", required = false) DateTime modifiedSince,
            @ApiParam(value = "Return only stories contained in the specified (accepts a comma-separated list of ids).") @RequestParam(value = "comics", required = false) List<Integer> comics,
            @ApiParam(value = "Return only stories contained the specified series (accepts a comma-separated list of ids).") @RequestParam(value = "series", required = false) List<Integer> series,
            @ApiParam(value = "Return only stories which feature work by the specified creators (accepts a comma-separated list of ids).") @RequestParam(value = "creators", required = false) List<Integer> creators,
            @ApiParam(value = "Return only stories which feature the specified characters (accepts a comma-separated list of ids).") @RequestParam(value = "characters", required = false) List<Integer> characters,
            @ApiParam(value = "Order the result set by a field or fields. Add a \"-\" to the value sort in descending order. Multiple values are given priority in the order in which they are passed.") @RequestParam(value = "orderBy", required = false) List<String> orderBy,
            @ApiParam(value = "Limit the result set to the specified number of resources.") @RequestParam(value = "limit", required = false) Integer limit,
            @ApiParam(value = "Skip the specified number of resources in the result set.") @RequestParam(value = "offset", required = false) Integer offset) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Void> getEventsCollection(@ApiParam(value = "The story ID.", required = true) @PathVariable("storyId") Integer storyId,
            @ApiParam(value = "Filter the event list by name.") @RequestParam(value = "name", required = false) String name,
            @ApiParam(value = "Return events with names that begin with the specified string (e.g. Sp).") @RequestParam(value = "nameStartsWith", required = false) String nameStartsWith,
            @ApiParam(value = "Return only events which have been modified since the specified date.") @RequestParam(value = "modifiedSince", required = false) DateTime modifiedSince,
            @ApiParam(value = "Return only events which feature work by the specified creators (accepts a comma-separated list of ids).") @RequestParam(value = "creators", required = false) List<Integer> creators,
            @ApiParam(value = "Return only events which feature the specified characters (accepts a comma-separated list of ids).") @RequestParam(value = "characters", required = false) List<Integer> characters,
            @ApiParam(value = "Return only events which are part of the specified series (accepts a comma-separated list of ids).") @RequestParam(value = "series", required = false) List<Integer> series,
            @ApiParam(value = "Return only events which take place in the specified comics (accepts a comma-separated list of ids).") @RequestParam(value = "comics", required = false) List<Integer> comics,
            @ApiParam(value = "Order the result set by a field or fields. Add a \"-\" to the value sort in descending order. Multiple values are given priority in the order in which they are passed.") @RequestParam(value = "orderBy", required = false) List<String> orderBy,
            @ApiParam(value = "Limit the result set to the specified number of resources.") @RequestParam(value = "limit", required = false) Integer limit,
            @ApiParam(value = "Skip the specified number of resources in the result set.") @RequestParam(value = "offset", required = false) Integer offset) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

//    public ResponseEntity<Void> getEventsCollection(@ApiParam(value = "The series ID.",required=true ) @PathVariable("seriesId") Integer seriesId,
//         @ApiParam(value = "Filter the event list by name.") @RequestParam(value = "name", required = false) String name,
//         @ApiParam(value = "Return events with names that begin with the specified string (e.g. Sp).") @RequestParam(value = "nameStartsWith", required = false) String nameStartsWith,
//         @ApiParam(value = "Return only events which have been modified since the specified date.") @RequestParam(value = "modifiedSince", required = false) DateTime modifiedSince,
//         @ApiParam(value = "Return only events which feature work by the specified creators (accepts a comma-separated list of ids).") @RequestParam(value = "creators", required = false) List<Integer> creators,
//         @ApiParam(value = "Return only events which feature the specified characters (accepts a comma-separated list of ids).") @RequestParam(value = "characters", required = false) List<Integer> characters,
//         @ApiParam(value = "Return only events which take place in the specified comics (accepts a comma-separated list of ids).") @RequestParam(value = "comics", required = false) List<Integer> comics,
//         @ApiParam(value = "Return only events which contain the specified stories (accepts a comma-separated list of ids).") @RequestParam(value = "stories", required = false) List<Integer> stories,
//         @ApiParam(value = "Order the result set by a field or fields. Add a \"-\" to the value sort in descending order. Multiple values are given priority in the order in which they are passed.") @RequestParam(value = "orderBy", required = false) List<String> orderBy,
//         @ApiParam(value = "Limit the result set to the specified number of resources.") @RequestParam(value = "limit", required = false) Integer limit,
//         @ApiParam(value = "Skip the specified number of resources in the result set.") @RequestParam(value = "offset", required = false) Integer offset) {
//        // do some magic!
//        return new ResponseEntity<Void>(HttpStatus.OK);
//    }
    public ResponseEntity<Void> getEventsCollection(@ApiParam(value = "Return only events which match the specified name.") @RequestParam(value = "name", required = false) String name,
            @ApiParam(value = "Return events with names that begin with the specified string (e.g. Sp).") @RequestParam(value = "nameStartsWith", required = false) String nameStartsWith,
            @ApiParam(value = "Return only events which have been modified since the specified date.") @RequestParam(value = "modifiedSince", required = false) DateTime modifiedSince,
            @ApiParam(value = "Return only events which feature work by the specified creators (accepts a comma-separated list of ids).") @RequestParam(value = "creators", required = false) List<Integer> creators,
            @ApiParam(value = "Return only events which feature the specified characters (accepts a comma-separated list of ids).") @RequestParam(value = "characters", required = false) List<Integer> characters,
            @ApiParam(value = "Return only events which are part of the specified series (accepts a comma-separated list of ids).") @RequestParam(value = "series", required = false) List<Integer> series,
            @ApiParam(value = "Return only events which take place in the specified comics (accepts a comma-separated list of ids).") @RequestParam(value = "comics", required = false) List<Integer> comics,
            @ApiParam(value = "Return only events which take place in the specified stories (accepts a comma-separated list of ids).") @RequestParam(value = "stories", required = false) List<Integer> stories,
            @ApiParam(value = "Order the result set by a field or fields. Add a \"-\" to the value sort in descending order. Multiple values are given priority in the order in which they are passed.") @RequestParam(value = "orderBy", required = false) List<String> orderBy,
            @ApiParam(value = "Limit the result set to the specified number of resources.") @RequestParam(value = "limit", required = false) Integer limit,
            @ApiParam(value = "Skip the specified number of resources in the result set.") @RequestParam(value = "offset", required = false) Integer offset) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Void> getIssueEventsCollection(@ApiParam(value = "The comic ID.", required = true) @PathVariable("comicId") Integer comicId,
            @ApiParam(value = "Filter the event list by name.") @RequestParam(value = "name", required = false) String name,
            @ApiParam(value = "Return events with names that begin with the specified string (e.g. Sp).") @RequestParam(value = "nameStartsWith", required = false) String nameStartsWith,
            @ApiParam(value = "Return only events which have been modified since the specified date.") @RequestParam(value = "modifiedSince", required = false) DateTime modifiedSince,
            @ApiParam(value = "Return only events which feature work by the specified creators (accepts a comma-separated list of ids).") @RequestParam(value = "creators", required = false) List<Integer> creators,
            @ApiParam(value = "Return only events which feature the specified characters (accepts a comma-separated list of ids).") @RequestParam(value = "characters", required = false) List<Integer> characters,
            @ApiParam(value = "Return only events which are part of the specified series (accepts a comma-separated list of ids).") @RequestParam(value = "series", required = false) List<Integer> series,
            @ApiParam(value = "Return only events which contain the specified stories (accepts a comma-separated list of ids).") @RequestParam(value = "stories", required = false) List<Integer> stories,
            @ApiParam(value = "Order the result set by a field or fields. Add a \"-\" to the value sort in descending order. Multiple values are given priority in the order in which they are passed.") @RequestParam(value = "orderBy", required = false) List<String> orderBy,
            @ApiParam(value = "Limit the result set to the specified number of resources.") @RequestParam(value = "limit", required = false) Integer limit,
            @ApiParam(value = "Skip the specified number of resources in the result set.") @RequestParam(value = "offset", required = false) Integer offset) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Void> getSeriesCharacterWrapper(@ApiParam(value = "The series id.", required = true) @PathVariable("seriesId") Integer seriesId,
            @ApiParam(value = "Return only characters matching the specified full character name (e.g. Spider-Man).") @RequestParam(value = "name", required = false) String name,
            @ApiParam(value = "Return characters with names that begin with the specified string (e.g. Sp).") @RequestParam(value = "nameStartsWith", required = false) String nameStartsWith,
            @ApiParam(value = "Return only characters which have been modified since the specified date.") @RequestParam(value = "modifiedSince", required = false) DateTime modifiedSince,
            @ApiParam(value = "Return only characters which appear in the specified comics (accepts a comma-separated list of ids).") @RequestParam(value = "comics", required = false) List<Integer> comics,
            @ApiParam(value = "Return only characters which appear comics that took place in the specified events (accepts a comma-separated list of ids).") @RequestParam(value = "events", required = false) List<Integer> events,
            @ApiParam(value = "Return only characters which appear the specified stories (accepts a comma-separated list of ids).") @RequestParam(value = "stories", required = false) List<Integer> stories,
            @ApiParam(value = "Order the result set by a field or fields. Add a \"-\" to the value sort in descending order. Multiple values are given priority in the order in which they are passed.") @RequestParam(value = "orderBy", required = false) List<String> orderBy,
            @ApiParam(value = "Limit the result set to the specified number of resources.") @RequestParam(value = "limit", required = false) Integer limit,
            @ApiParam(value = "Skip the specified number of resources in the result set.") @RequestParam(value = "offset", required = false) Integer offset) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Void> getSeriesCollection(@ApiParam(value = "Return only series matching the specified title.") @RequestParam(value = "title", required = false) String title,
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
            @ApiParam(value = "Skip the specified number of resources in the result set.") @RequestParam(value = "offset", required = false) Integer offset) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Void> getSeriesIndividual(@ApiParam(value = "Filter by series title.", required = true) @PathVariable("seriesId") Integer seriesId) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Void> getSeriesStoryCollection(@ApiParam(value = "The series ID.", required = true) @PathVariable("seriesId") Integer seriesId,
            @ApiParam(value = "Return only stories which have been modified since the specified date.") @RequestParam(value = "modifiedSince", required = false) DateTime modifiedSince,
            @ApiParam(value = "Return only stories contained in the specified (accepts a comma-separated list of ids).") @RequestParam(value = "comics", required = false) List<Integer> comics,
            @ApiParam(value = "Return only stories which take place during the specified events (accepts a comma-separated list of ids).") @RequestParam(value = "events", required = false) List<Integer> events,
            @ApiParam(value = "Return only stories which feature work by the specified creators (accepts a comma-separated list of ids).") @RequestParam(value = "creators", required = false) List<Integer> creators,
            @ApiParam(value = "Return only stories which feature the specified characters (accepts a comma-separated list of ids).") @RequestParam(value = "characters", required = false) List<Integer> characters,
            @ApiParam(value = "Order the result set by a field or fields. Add a \"-\" to the value sort in descending order. Multiple values are given priority in the order in which they are passed.") @RequestParam(value = "orderBy", required = false) List<String> orderBy,
            @ApiParam(value = "Limit the result set to the specified number of resources.") @RequestParam(value = "limit", required = false) Integer limit,
            @ApiParam(value = "Skip the specified number of resources in the result set.") @RequestParam(value = "offset", required = false) Integer offset) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Void> getStoryCollection(@ApiParam(value = "Return only stories which have been modified since the specified date.") @RequestParam(value = "modifiedSince", required = false) DateTime modifiedSince,
            @ApiParam(value = "Return only stories contained in the specified (accepts a comma-separated list of ids).") @RequestParam(value = "comics", required = false) List<Integer> comics,
            @ApiParam(value = "Return only stories contained the specified series (accepts a comma-separated list of ids).") @RequestParam(value = "series", required = false) List<Integer> series,
            @ApiParam(value = "Return only stories which take place during the specified events (accepts a comma-separated list of ids).") @RequestParam(value = "events", required = false) List<Integer> events,
            @ApiParam(value = "Return only stories which feature work by the specified creators (accepts a comma-separated list of ids).") @RequestParam(value = "creators", required = false) List<Integer> creators,
            @ApiParam(value = "Return only stories which feature the specified characters (accepts a comma-separated list of ids).") @RequestParam(value = "characters", required = false) List<Integer> characters,
            @ApiParam(value = "Order the result set by a field or fields. Add a \"-\" to the value sort in descending order. Multiple values are given priority in the order in which they are passed.") @RequestParam(value = "orderBy", required = false) List<String> orderBy,
            @ApiParam(value = "Limit the result set to the specified number of resources.") @RequestParam(value = "limit", required = false) Integer limit,
            @ApiParam(value = "Skip the specified number of resources in the result set.") @RequestParam(value = "offset", required = false) Integer offset) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Void> getStoryIndividual(@ApiParam(value = "Filter by story id.", required = true) @PathVariable("storyId") Integer storyId) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Void> getStorySeriesCollection(@ApiParam(value = "The story ID.", required = true) @PathVariable("storyId") Integer storyId,
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
            @ApiParam(value = "Skip the specified number of resources in the result set.") @RequestParam(value = "offset", required = false) Integer offset) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

}
