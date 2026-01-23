package com.example.PolicyHolder.CRUD.exception;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestBody;

@ControllerAdvice
public class PolicyHolderExceptionController {

    @ExceptionHandler(InvalidRequestException.class)
    public ResponseEntity<Object> exception(InvalidRequestException exception){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Request fields cannot be null");
    }
}
