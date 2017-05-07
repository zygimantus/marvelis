package com.zygimantus.marvelis.api;

import com.karumi.marvelapiclient.CharacterApiClient;
import com.karumi.marvelapiclient.MarvelApiConfig;
import com.karumi.marvelapiclient.MarvelApiException;
import com.karumi.marvelapiclient.model.CharacterDto;
import com.karumi.marvelapiclient.model.CharactersDto;
import com.karumi.marvelapiclient.model.CharactersQuery;
import com.karumi.marvelapiclient.model.MarvelResponse;
import com.karumi.marvelapiclient.model.OrderBy;
import com.zygimantus.marvelis.AController;
import com.zygimantus.marvelis.AppConfig;
import com.zygimantus.marvelis.model.DataTablesRequest;
import com.zygimantus.marvelis.model.JsonResponse;
import java.io.IOException;
import org.aeonbits.owner.ConfigFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;
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

    @Deprecated
    @RequestMapping(value = "characters", method = GET)
    protected MarvelResponse<CharactersDto> characters(
            @RequestParam("length") Integer limit,
            @RequestParam("start") Integer offset,
            @RequestParam(value = "order") String[][] order
    ) throws IOException, MarvelApiException {

        CharacterApiClient characterApiClient = new CharacterApiClient(marvelApiConfig);
        CharactersQuery charactersQuery = CharactersQuery.Builder.create()
                .withLimit(limit)
                .withOffset(offset)
                .build();

        MarvelResponse<CharactersDto> marvelResponse = characterApiClient.getAll(charactersQuery);

        return marvelResponse;
    }

    @RequestMapping(value = "characters", method = POST)
    protected MarvelResponse<CharactersDto> characters(@RequestBody DataTablesRequest dtr) throws IOException, MarvelApiException {

        DataTablesRequest.Order order = dtr.getOrders().get(0);

        OrderBy orderBy;

        switch (order.getColumn()) {
            case 1:
                orderBy = OrderBy.NAME;
                break;
            case 3:
                orderBy = OrderBy.MODIFIED;
                break;
            default:
                orderBy = null;
        }

        CharacterApiClient characterApiClient = new CharacterApiClient(marvelApiConfig);
        CharactersQuery charactersQuery = CharactersQuery.Builder.create()
                .withLimit(dtr.getLength())
                .withOffset(dtr.getStart())
                .withNameStartWith(("".equals(dtr.getSearch().getValue())) ? null : dtr.getSearch().getValue())
                .withOrderBy(orderBy, "asc".equals(order.getDir()))
                .build();

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
