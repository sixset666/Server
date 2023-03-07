package com.example.demo.exception;

import javax.xml.bind.ValidationException;

public class ValidationExceptionBook extends ValidationException {
    public ValidationExceptionBook(String message)  {
        super(message); }
}
