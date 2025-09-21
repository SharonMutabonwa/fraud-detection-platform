package com.frauddetection.exception;

public class InvalidTransactionDataException extends RuntimeException {
    
    public InvalidTransactionDataException(String message) {
        super(message);
    }
    
    public InvalidTransactionDataException(String message, Throwable cause) {
        super(message, cause);
    }
}