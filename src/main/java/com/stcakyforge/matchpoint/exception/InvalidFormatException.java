package com.stcakyforge.matchpoint.exception;

public class InvalidFormatException extends RuntimeException {

    public InvalidFormatException(){
        super("Bad Request");
    }

    public InvalidFormatException(String message){
        super(message);
    }
}
