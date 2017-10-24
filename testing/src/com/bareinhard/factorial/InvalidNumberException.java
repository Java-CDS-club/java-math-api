package com.bareinhard.factorial;

public class InvalidNumberException extends Exception {
    InvalidNumberException(String message, double value){
        super(message + ": " + value);
    }
}
