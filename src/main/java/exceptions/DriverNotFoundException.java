package main.java.exceptions;


public class DriverNotFoundException extends RuntimeException {
    public DriverNotFoundException(String s) {
        throw new RuntimeException(s);
    }
}
