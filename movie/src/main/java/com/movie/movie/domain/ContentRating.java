package com.movie.movie.domain;

public enum ContentRating {
    G("G"),
    PG("PG"),
    PG_13("PG-13"),
    R("R"),
    NC_17("NC-17");

    public final String rating;

    ContentRating(String rating) {
        this.rating = rating;
    }
}
