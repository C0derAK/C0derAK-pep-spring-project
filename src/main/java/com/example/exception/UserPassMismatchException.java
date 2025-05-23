package com.example.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;


@ResponseStatus(HttpStatus.UNAUTHORIZED)
public class UserPassMismatchException extends RuntimeException {
    public UserPassMismatchException(String message) {
        super(message);
    }   
}
