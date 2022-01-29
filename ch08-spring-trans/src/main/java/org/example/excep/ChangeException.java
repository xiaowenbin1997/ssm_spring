package org.example.excep;

public class ChangeException extends RuntimeException{
    public ChangeException() {
        super();
    }

    public ChangeException(String message) {
        super(message);
    }
}
