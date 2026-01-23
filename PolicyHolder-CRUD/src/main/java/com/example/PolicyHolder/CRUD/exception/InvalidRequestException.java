package com.example.PolicyHolder.CRUD.exception;



public class InvalidRequestException extends RuntimeException {
    public InvalidRequestException(String message) {
        super(message);
    }
}
