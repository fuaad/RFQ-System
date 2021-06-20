package com.RFQ.RFQSystem.exception;
/**
 * @author Fuhad Ali
 *
 */
public class UserNotFoundException extends RuntimeException {
    public UserNotFoundException(String message) {
        super(message);
    }
}
