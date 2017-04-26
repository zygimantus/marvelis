package com.zygimantus.marvelis.api;

import com.github.codingricky.marvel.RestClient;
import com.github.codingricky.marvel.model.MarvelCharacter;
import com.github.codingricky.marvel.model.Result;
import com.karumi.marvelapiclient.MarvelApiConfig;
import com.zygimantus.marvelis.AController;
import com.zygimantus.marvelis.AppConfig;
import com.zygimantus.marvelis.JsonResponse;
import java.io.IOException;
import org.aeonbits.owner.ConfigFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
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

    protected static final int BLACK_WIDOW_ID = 1009189;

    MarvelApiConfig marvelApiConfig;
    RestClient restClient;

    protected final AppConfig appConfig = ConfigFactory.create(AppConfig.class);

    @Override
    protected void init() {
//        marvelApiConfig = new MarvelApiConfig.Builder(PUBLIC_KEY, PRIVATE_KEY).debug().build();

        PUBLIC_KEY = appConfig.publicKey();
        PRIVATE_KEY = appConfig.privateKey();

        restClient = new RestClient(PRIVATE_KEY, PUBLIC_KEY);
    }

    @Override
    protected JsonResponse page() {

        return new JsonResponse(HttpStatus.OK);
    }

    @RequestMapping("character/{id}")
    protected MarvelCharacter character(@PathVariable("id") int id) throws IOException {

//        CharacterApiClient characterApiClient = new CharacterApiClient(marvelApiConfig);
//        CharactersQuery spider = CharactersQuery.Builder.create().withOffset(0).withLimit(10).build();
//        MarvelResponse<CharactersDto> all = characterApiClient.getAll(spider);
        Result<MarvelCharacter> character = restClient.getCharacter(id);

        MarvelCharacter one = character.getData().getResults().get(0);

        System.out.println(one.toString());

        return one;
    }

    @ExceptionHandler(Exception.class)
    public final JsonResponse handleAllException(Exception ex) {

        return new JsonResponse(HttpStatus.INTERNAL_SERVER_ERROR,
                ex.getLocalizedMessage());
    }
}
