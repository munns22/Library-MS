package com.demo.SampleLibrary.error;

public class InvalidMembershipException extends Exception{
    public InvalidMembershipException() {
        super();
    }

    public InvalidMembershipException(String message) {
        super(message);
    }

    public InvalidMembershipException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidMembershipException(Throwable cause) {
        super(cause);
    }

    protected InvalidMembershipException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
