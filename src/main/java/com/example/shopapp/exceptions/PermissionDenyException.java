package com.example.shopapp.exceptions;

public class PermissionDenyException extends Exception {
    public PermissionDenyException(String message){
        super(message);
    }
}
