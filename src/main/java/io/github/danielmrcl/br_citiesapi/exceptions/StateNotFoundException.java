package io.github.danielmrcl.br_citiesapi.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class StateNotFoundException extends Exception {
    public StateNotFoundException(String message) {
        super(message);
    }
}
