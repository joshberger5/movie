package com.movie.movie.exceptions;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class MovieException extends Exception {
    private final ErrorResponseDetail errorResponseDetail;
}
