package com.zygimantus.marvelis.api;

import com.zygimantus.marvelis.AController;
import com.zygimantus.marvelis.model.JsonResponse;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 *
 * @author Zygimantus
 * @param <T>
 */
public abstract class ApiController<T> extends AController<T> {

    @ExceptionHandler(Exception.class)
    public final JsonResponse handleAllException(Exception ex) {

        return new JsonResponse(HttpStatus.INTERNAL_SERVER_ERROR,
                ex.getLocalizedMessage());
    }

}
