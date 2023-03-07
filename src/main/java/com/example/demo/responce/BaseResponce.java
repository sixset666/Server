package com.example.demo.responce;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class BaseResponce {

    protected boolean success;
    protected String message;
}
