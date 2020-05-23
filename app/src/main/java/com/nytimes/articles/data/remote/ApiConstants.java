package com.nytimes.articles.data.remote;


/**
 * Keep all the service related constants here.
 * <p>
 * Author: Mohammad Saleem
 * Created: 23/05/2020
 * Modified: 23/05/2020
 */
public class ApiConstants {
    public static final String BASE_URL = "http://api.nytimes.com/";
    public static final long CONNECT_TIMEOUT = 30000;
    public static final long READ_TIMEOUT = 30000;
    public static final long WRITE_TIMEOUT = 30000;
    public static final String API_KEY = "kJwh3NQJeWGCfT8bryIoQ7m4S2nqTg06";

    private ApiConstants(){
        // Private constructor to hide the implicit one
    }

}
