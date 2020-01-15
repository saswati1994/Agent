package com.test.AgentRegistration.exception;

public class UserExistsException extends Exception {

    public UserExistsException(final String message){
        super(message);
    }
}
