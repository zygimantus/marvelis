package com.zygimantus.marvelis.api;

import com.karumi.marvelapiclient.CharacterApiClient;
import com.karumi.marvelapiclient.MarvelApiConfig;
import com.karumi.marvelapiclient.MarvelApiException;
import com.karumi.marvelapiclient.model.CharacterDto;
import com.karumi.marvelapiclient.model.MarvelResponse;
import com.zygimantus.marvelis.AppConfig;
import io.swagger.annotations.ApiParam;
import io.swagger.api.V1Api;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.PostConstruct;
import org.aeonbits.owner.ConfigFactory;
import org.joda.time.DateTime;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Zygimantus
 */
@RestController
@RequestMapping
public class MarvelApiController implements V1Api<MarvelResponse> {

    private static String PUBLIC_KEY;
    private static String PRIVATE_KEY;

    private MarvelApiConfig marvelApiConfig;

    private final AppConfig appConfig = ConfigFactory.create(AppConfig.class);

    @PostConstruct
    protected void init() {
        PUBLIC_KEY = appConfig.publicKey();
        PRIVATE_KEY = appConfig.privateKey();

        marvelApiConfig = new MarvelApiConfig.Builder(PUBLIC_KEY, PRIVATE_KEY).debug().build();
    }

    @Override
    public ResponseEntity<Void> getCharacterEventsCollection(Integer characterId, String name, String nameStartsWith, DateTime modifiedSince, List<Integer> creators, List<Integer> series, List<Integer> comics, List<Integer> stories, List<String> orderBy, Integer limit, Integer offset) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ResponseEntity<MarvelResponse> getCharacterIndividual(@ApiParam(value = "A single character id.", required = true) @PathVariable("characterId") Integer characterId) {
        CharacterApiClient characterApiClient = new CharacterApiClient(marvelApiConfig);
        MarvelResponse<CharacterDto> character = null;
        try {
            character = characterApiClient.getCharacter(Integer.toString(characterId));
        } catch (MarvelApiException ex) {
            Logger.getLogger(MarvelApiController.class.getName()).log(Level.SEVERE, null, ex);
        }

        return new ResponseEntity<MarvelResponse>(character, HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Void> getCharacterSeriesCollection(Integer characterId, String title, String titleStartsWith, Integer startYear, DateTime modifiedSince, List<Integer> comics, List<Integer> stories, List<Integer> events, List<Integer> creators, String seriesType, List<String> contains, List<String> orderBy, Integer limit, Integer offset) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ResponseEntity<Void> getCharacterStoryCollection(Integer characterId, DateTime modifiedSince, List<Integer> comics, List<Integer> series, List<Integer> events, List<Integer> creators, List<String> orderBy, Integer limit, Integer offset) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ResponseEntity<Void> getComicCharacterCollection(Integer comicId, String name, String nameStartsWith, DateTime modifiedSince, List<Integer> series, List<Integer> events, List<Integer> stories, List<String> orderBy, Integer limit, Integer offset) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ResponseEntity<Void> getComicIndividual(Integer comicId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ResponseEntity<Void> getComicStoryCollection(Integer comicId, DateTime modifiedSince, List<Integer> series, List<Integer> events, List<Integer> creators, List<Integer> characters, List<String> orderBy, Integer limit, Integer offset) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ResponseEntity<Void> getComicsCharacterCollection(Integer characterId, String format, String formatType, Boolean noVariants, String dateDescriptor, List<Integer> dateRange, String title, String titleStartsWith, Integer startYear, Integer issueNumber, String diamondCode, Integer digitalId, String upc, String isbn, String ean, String issn, Boolean hasDigitalIssue, DateTime modifiedSince, List<Integer> creators, List<Integer> series, List<Integer> events, List<Integer> stories, List<Integer> sharedAppearances, List<Integer> collaborators, List<String> orderBy, Integer limit, Integer offset) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ResponseEntity<Void> getComicsCollection(Integer creatorId, String format, String formatType, Boolean noVariants, String dateDescriptor, List<Integer> dateRange, String title, String titleStartsWith, Integer startYear, Integer issueNumber, String diamondCode, Integer digitalId, String upc, String isbn, String ean, String issn, List<Boolean> hasDigitalIssue, DateTime modifiedSince, List<Integer> characters, List<Integer> series, List<Integer> events, List<Integer> stories, List<Integer> sharedAppearances, List<Integer> collaborators, List<String> orderBy, Integer limit, Integer offset) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ResponseEntity<Void> getComicsCollection(Integer eventId, String format, String formatType, List<Boolean> noVariants, List<String> dateDescriptor, List<Integer> dateRange, String title, String titleStartsWith, Integer startYear, Integer issueNumber, String diamondCode, Integer digitalId, String upc, String isbn, String ean, String issn, List<Boolean> hasDigitalIssue, DateTime modifiedSince, List<Integer> creators, List<Integer> characters, List<Integer> series, List<Integer> events, List<Integer> stories, List<Integer> sharedAppearances, List<Integer> collaborators, List<String> orderBy, Integer limit, Integer offset) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ResponseEntity<Void> getComicsCollection(Integer seriesId, String format, String formatType, List<Boolean> noVariants, List<String> dateDescriptor, List<Integer> dateRange, String title, String titleStartsWith, Integer startYear, Integer issueNumber, String diamondCode, Integer digitalId, String upc, String isbn, String ean, String issn, List<Boolean> hasDigitalIssue, DateTime modifiedSince, List<Integer> creators, List<Integer> characters, List<Integer> events, List<Integer> stories, List<Integer> sharedAppearances, List<Integer> collaborators, List<String> orderBy, Integer limit, Integer offset) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ResponseEntity<Void> getComicsCollection(String format, String formatType, Boolean noVariants, String dateDescriptor, List<Integer> dateRange, String title, String titleStartsWith, Integer startYear, Integer issueNumber, String diamondCode, Integer digitalId, String upc, String isbn, String ean, String issn, Boolean hasDigitalIssue, DateTime modifiedSince, List<Integer> creators, List<Integer> characters, List<Integer> series, List<Integer> events, List<Integer> stories, List<Integer> sharedAppearances, List<Integer> collaborators, List<String> orderBy, Integer limit, Integer offset) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ResponseEntity<Void> getCreatorCollection(String firstName, String middleName, String lastName, String suffix, String nameStartsWith, String firstNameStartsWith, String middleNameStartsWith, String lastNameStartsWith, DateTime modifiedSince, List<Integer> comics, List<Integer> series, List<Integer> events, List<Integer> stories, List<String> orderBy, Integer limit, Integer offset) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ResponseEntity<Void> getCreatorCollection(Integer storyId, String name, String nameStartsWith, DateTime modifiedSince, List<Integer> comics, List<Integer> series, List<Integer> events, List<String> orderBy, Integer limit, Integer offset) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ResponseEntity<Void> getCreatorCollection(Integer seriesId, String firstName, String middleName, String lastName, String suffix, String nameStartsWith, String firstNameStartsWith, String middleNameStartsWith, String lastNameStartsWith, DateTime modifiedSince, List<Integer> comics, List<Integer> events, List<Integer> stories, List<String> orderBy, Integer limit, Integer offset) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ResponseEntity<Void> getCreatorCollection(String name, String nameStartsWith, DateTime modifiedSince, List<Integer> comics, List<Integer> series, List<Integer> events, List<Integer> stories, List<String> orderBy, Integer limit, Integer offset) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ResponseEntity<Void> getCreatorEventsCollection(Integer creatorId, String name, String nameStartsWith, DateTime modifiedSince, List<Integer> characters, List<Integer> series, List<Integer> comics, List<Integer> stories, List<String> orderBy, Integer limit, Integer offset) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ResponseEntity<Void> getCreatorIndividual(Integer creatorId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ResponseEntity<Void> getCreatorSeriesCollection(Integer creatorId, String title, String titleStartsWith, Integer startYear, DateTime modifiedSince, List<Integer> comics, List<Integer> stories, List<Integer> events, List<Integer> characters, String seriesType, List<String> contains, List<String> orderBy, Integer limit, Integer offset) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ResponseEntity<Void> getCreatorStoryCollection(Integer creatorId, DateTime modifiedSince, List<Integer> comics, List<Integer> series, List<Integer> events, List<Integer> characters, List<String> orderBy, Integer limit, Integer offset) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ResponseEntity<Void> getEventCharacterCollection(Integer eventId, String name, String nameStartsWith, DateTime modifiedSince, List<Integer> comics, List<Integer> series, List<Integer> stories, List<String> orderBy, Integer limit, Integer offset) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ResponseEntity<Void> getEventIndividual(Integer eventId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ResponseEntity<Void> getEventSeriesCollection(Integer eventId, String title, String titleStartsWith, Integer startYear, DateTime modifiedSince, List<Integer> comics, List<Integer> stories, List<Integer> creators, List<Integer> characters, String seriesType, List<String> contains, List<String> orderBy, Integer limit, Integer offset) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ResponseEntity<Void> getEventStoryCollection(Integer eventId, DateTime modifiedSince, List<Integer> comics, List<Integer> series, List<Integer> creators, List<Integer> characters, List<String> orderBy, Integer limit, Integer offset) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ResponseEntity<Void> getEventsCollection(Integer storyId, String name, String nameStartsWith, DateTime modifiedSince, List<Integer> creators, List<Integer> characters, List<Integer> series, List<Integer> comics, List<String> orderBy, Integer limit, Integer offset) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ResponseEntity<Void> getEventsCollection(String name, String nameStartsWith, DateTime modifiedSince, List<Integer> creators, List<Integer> characters, List<Integer> series, List<Integer> comics, List<Integer> stories, List<String> orderBy, Integer limit, Integer offset) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ResponseEntity<Void> getIssueEventsCollection(Integer comicId, String name, String nameStartsWith, DateTime modifiedSince, List<Integer> creators, List<Integer> characters, List<Integer> series, List<Integer> stories, List<String> orderBy, Integer limit, Integer offset) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ResponseEntity<Void> getSeriesCharacterWrapper(Integer seriesId, String name, String nameStartsWith, DateTime modifiedSince, List<Integer> comics, List<Integer> events, List<Integer> stories, List<String> orderBy, Integer limit, Integer offset) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ResponseEntity<Void> getSeriesCollection(String title, String titleStartsWith, Integer startYear, DateTime modifiedSince, List<Integer> comics, List<Integer> stories, List<Integer> events, List<Integer> creators, List<Integer> characters, String seriesType, List<String> contains, List<String> orderBy, Integer limit, Integer offset) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ResponseEntity<Void> getSeriesIndividual(Integer seriesId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ResponseEntity<Void> getSeriesStoryCollection(Integer seriesId, DateTime modifiedSince, List<Integer> comics, List<Integer> events, List<Integer> creators, List<Integer> characters, List<String> orderBy, Integer limit, Integer offset) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ResponseEntity<Void> getStoryCollection(DateTime modifiedSince, List<Integer> comics, List<Integer> series, List<Integer> events, List<Integer> creators, List<Integer> characters, List<String> orderBy, Integer limit, Integer offset) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ResponseEntity<Void> getStoryIndividual(Integer storyId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ResponseEntity<Void> getStorySeriesCollection(Integer storyId, List<Integer> events, String title, String titleStartsWith, Integer startYear, DateTime modifiedSince, List<Integer> comics, List<Integer> creators, List<Integer> characters, String seriesType, List<String> contains, List<String> orderBy, Integer limit, Integer offset) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
