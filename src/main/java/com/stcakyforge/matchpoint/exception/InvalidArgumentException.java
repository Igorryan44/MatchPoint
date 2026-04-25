package com.stcakyforge.matchpoint.exception;

public class InvalidArgumentException extends RuntimeException {

    public InvalidArgumentException(){
        super("Email or password is incorrect. Try again");
    }

    public InvalidArgumentException(String message){
        super(message);
    }
}
