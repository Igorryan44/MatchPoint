package com.stcakyforge.matchpoint.exception;

public class ConflictException extends RuntimeException {

    public ConflictException (){
        super("User already exists, try again with another data.");
    }

    public ConflictException(String message) {
        super(message);
    }
}
