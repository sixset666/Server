package com.example.demo.exception;

import javax.xml.bind.ValidationException;

public class ValidationExceptionPublisher extends ValidationException {
    public ValidationExceptionPublisher(String message)  {
        super(message); }
}