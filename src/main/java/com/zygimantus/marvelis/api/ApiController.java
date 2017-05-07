package com.zygimantus.marvelis.api;

import com.karumi.marvelapiclient.CharacterApiClient;
import com.karumi.marvelapiclient.MarvelApiConfig;
import com.karumi.marvelapiclient.MarvelApiException;
import com.karumi.marvelapiclient.model.CharacterDto;
import com.karumi.marvelapiclient.model.CharactersDto;
import com.karumi.marvelapiclient.model.CharactersQuery;
import com.karumi.marvelapiclient.model.MarvelResponse;
import com.zygimantus.marvelis.AController;
import com.zygimantus.marvelis.AppConfig;
import com.zygimantus.marvelis.JsonResponse;
import java.io.IOException;
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

    protected final AppConfig appConfig = ConfigFactory.create(AppConfig.class);

    @Override
    protected void init() {

        PUBLIC_KEY = appConfig.publicKey();
        PRIVATE_KEY = appConfig.privateKey();

        marvelApiConfig = new MarvelApiConfig.Builder(PUBLIC_KEY, PRIVATE_KEY).debug().build();
    }

    @Override
    protected JsonResponse page() {

        return new JsonResponse(HttpStatus.OK);
    }

    @RequestMapping("characters")
    protected MarvelResponse<CharactersDto> characters(@RequestParam("length") Integer limit,
            @RequestParam("start") Integer offset) throws IOException, MarvelApiException {

        CharacterApiClient characterApiClient = new CharacterApiClient(marvelApiConfig);
        CharactersQuery charactersQuery = CharactersQuery.Builder.create().withLimit(limit).withOffset(offset).build();
        MarvelResponse<CharactersDto> marvelResponse = characterApiClient.getAll(charactersQuery);

        return marvelResponse;
    }

    @RequestMapping("characters/{id}")
    protected MarvelResponse<CharacterDto> character(@PathVariable("id") String id) throws IOException, MarvelApiException {

        CharacterApiClient characterApiClient = new CharacterApiClient(marvelApiConfig);
        MarvelResponse<CharacterDto> marvelResponse = characterApiClient.getCharacter(id);

        return marvelResponse;
    }

    @ExceptionHandler(Exception.class)
    public final JsonResponse handleAllException(Exception ex) {

        return new JsonResponse(HttpStatus.INTERNAL_SERVER_ERROR,
                ex.getLocalizedMessage());
    }
}
