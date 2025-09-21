package com.frauddetection.exception;

public class TransactionNotFoundException extends RuntimeException {
    
    public TransactionNotFoundException(String message) {
        super(message);
    }
    
    public TransactionNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
    
    public TransactionNotFoundException(Long transactionId) {
        super("Transaction not found with ID: " + transactionId);
    }
    
    public TransactionNotFoundException(String field, String value) {
        super("Transaction not found with " + field + ": " + value);
    }
}