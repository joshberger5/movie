package com.movie.movie.exceptions;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
@AllArgsConstructor
public enum ErrorResponseDetail {
    NOT_IMPLEMENTED_YET("501", "Not Implemented Yet", HttpStatus.NOT_IMPLEMENTED);

    private final String errorCode;
    private final String errorMessage;
    private final HttpStatus httpStatus;
}