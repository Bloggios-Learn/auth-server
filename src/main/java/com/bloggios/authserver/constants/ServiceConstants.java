package com.bloggios.authserver.constants;

import lombok.experimental.UtilityClass;

/**
 * Owner - Rohit Parihar and Bloggios
 * Author - rohit
 * Project - auth-server
 * Package - com.bloggios.authserver.constants
 * Created_on - April 30 - 2024
 * Created_at - 12:40
 */

@UtilityClass
public class ServiceConstants {

    public static final String RANDOM_UUID = "randomUUID";
    public static final String UUID_GENERATOR = "org.hibernate.id.UUIDGenerator";
    public static final String BREADCRUMB_ID = "breadcrumbId";
    public static final String EMAIL_REGEX = "^[A-Za-z0-9+_.-]+@(.+)$";
    public static final String PASSWORD_REGEX = "^(?=.*[0-9])(?=.*[a-zA-Z])(?=.*[@#$%^&+=!])(?=\\S+$).{9,}$";
    public static final String X_FORWARDED_FOR = "X-Forwarded-For";
    public static final String BLOGGIOS_IN = "bloggios.in";
    public static final String BLOGGIOS_CLOUD = "bloggios.cloud";
    public static final String BLOGGIOS_COM = "bloggios.com";
    public static final String ADMIN_ROLE = "admin";
    public static final String USER_ROLE = "user";
    public static final String DUMMY_ROLE = "dummy";
    public static final String DEFAULT_NORMALIZER = "default_normalizer_keyword";
    public static final String DEFAULT_AUTOCOMPLETE = "default_autocomplete_text";
    public static final String VERBATIM = "verbatim";
    public static final String AUTHORITY = "authority";
    public static final String REMOTE_ADDRESS = "remoteAddress";
    public static final String USER_EMAIL = "userEmail";
    public static final String ENVIRONMENT = "environment";
    public static final String TOKEN_TYPE = "type";
    public static final Object EXTENDED_TOKEN = "extended";
    public static final Object NORMAL_TOKEN = "normal";
    public static final String ORIGIN = "origin";
    public static final String LOCAL_ORIGIN = "bloggios_auth";
    public static final String AUTHORIZATION = "Authorization";
    public static final Integer MINUTES_7 = 1000 * 60 * 7;
    public static final String BLOGGIOS_EMAIL_SERVICE_APPLICATION = "bloggios-email-service";
    public static final String USERNAME = "username";
}
