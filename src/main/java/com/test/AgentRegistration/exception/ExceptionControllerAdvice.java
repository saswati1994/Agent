package com.test.AgentRegistration.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;

@ControllerAdvice
public class ExceptionControllerAdvice {

    @ExceptionHandler(Exception.class)
    public String exceptionHandler(final Exception e){

        return "Error Occured";
    }


    @ExceptionHandler(UserExistsException.class)
    public String exceptionHandler(final UserExistsException e){

        return "error";
    }



}
