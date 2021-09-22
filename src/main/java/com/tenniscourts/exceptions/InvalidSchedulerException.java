package com.tenniscourts.exceptions;

public class InvalidSchedulerException extends RuntimeException{

    public InvalidSchedulerException(String msg){
        super(msg);
    }

    private InvalidSchedulerException(){}
}
