package com.exampleepam.restaurant.exception;

/**
 * Exception to be thrown when a user already exists in DB
 */
public class UserAlreadyExistAuthenticationException extends Exception {

    public UserAlreadyExistAuthenticationException() {
    }



    public UserAlreadyExistAuthenticationException(String msg) {
        super(msg);
    }

    public UserAlreadyExistAuthenticationException(String message, Throwable cause) {
        super(message, cause);
    }

    public UserAlreadyExistAuthenticationException(Throwable cause) {
        super(cause);
    }

    public UserAlreadyExistAuthenticationException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
