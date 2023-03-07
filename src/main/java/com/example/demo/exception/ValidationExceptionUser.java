package com.example.demo.exception;

import javax.xml.bind.ValidationException;

public class ValidationExceptionUser extends ValidationException {
    public ValidationExceptionUser(String message)  {
        super(message); }
}
