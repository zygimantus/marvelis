package com.zygimantus.marvelis.api;

import com.github.codingricky.marvel.RestClient;
import com.github.codingricky.marvel.model.MarvelCharacter;
import com.github.codingricky.marvel.model.Result;
import com.github.codingricky.marvel.parameter.CharacterParameters;
import com.karumi.marvelapiclient.MarvelApiConfig;
import com.zygimantus.marvelis.AController;
import com.zygimantus.marvelis.AppConfig;
import com.zygimantus.marvelis.JsonResponse;
import gumi.builders.UrlBuilder;
import java.io.IOException;
import java.util.List;
import org.aeonbits.owner.ConfigFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Zygimantus
 */
@RestController
@RequestMapping
public class ApiController extends AController<JsonResponse> {

    private static String PUBLIC_KEY;
    private static String PRIVATE_KEY;

    MarvelApiConfig marvelApiConfig;
    RestClient restClient;

    protected final AppConfig appConfig = ConfigFactory.create(AppConfig.class);

    @Override
    protected void init() {
        PUBLIC_KEY = appConfig.publicKey();
        PRIVATE_KEY = appConfig.privateKey();

        restClient = new RestClient(PRIVATE_KEY, PUBLIC_KEY);
//        marvelApiConfig = new MarvelApiConfig.Builder(PUBLIC_KEY, PRIVATE_KEY).debug().build();
    }

    @Override
    protected JsonResponse page() {

        return new JsonResponse(HttpStatus.OK);
    }

    @RequestMapping(value = "test", produces = "application/json")
    protected String test(@RequestParam(value = "limit", required = false) String limit,
            @RequestParam(value = "offset", required = false) String offset) throws IOException {

        System.out.println(limit);
        System.out.println(offset);

        CharacterParameters characterParameters = new CharacterParameters();

        UrlBuilder urlBuilder = UrlBuilder.empty();
        urlBuilder.addParameter("limit", limit);
        urlBuilder.addParameter("offset", offset);

        characterParameters.addParameters(urlBuilder);

        Result<MarvelCharacter> characters = restClient.getCharacters(characterParameters);

        String list = characters.getRawResponse();

        return list;
    }

    @RequestMapping("characters")
    protected List<MarvelCharacter> characters(@RequestParam(value = "limit", required = false) String limit,
            @RequestParam(value = "offset", required = false) String offset) throws IOException {

        CharacterParameters characterParameters = new CharacterParameters();

        UrlBuilder urlBuilder = UrlBuilder.empty();
        urlBuilder.addParameter("limit", limit);
        urlBuilder.addParameter("offset", offset);

        characterParameters.addParameters(urlBuilder);

        Result<MarvelCharacter> characters = restClient.getCharacters(characterParameters);

        List<MarvelCharacter> list = characters.getData().getResults();

        return list;
    }

    @RequestMapping("character/{id}")
    protected MarvelCharacter character(@PathVariable("id") int id) throws IOException {

//        CharacterApiClient characterApiClient = new CharacterApiClient(marvelApiConfig);
//        CharactersQuery spider = CharactersQuery.Builder.create().withOffset(0).withLimit(10).build();
//        MarvelResponse<CharactersDto> all = characterApiClient.getAll(spider);
        Result<MarvelCharacter> character = restClient.getCharacter(id);

        MarvelCharacter one = character.getData().getResults().get(0);

        return one;
    }

    @ExceptionHandler(Exception.class)
    public final JsonResponse handleAllException(Exception ex) {

        return new JsonResponse(HttpStatus.INTERNAL_SERVER_ERROR,
                ex.getLocalizedMessage());
    }
}
