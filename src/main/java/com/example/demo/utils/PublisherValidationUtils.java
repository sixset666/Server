package com.example.demo.utils;

import com.example.demo.entity.PublisherEntity;
import com.example.demo.exception.ValidationExceptionPublisher;

public class PublisherValidationUtils {
    public static void validationPublisher(PublisherEntity data) throws ValidationExceptionPublisher {
        String title = data.getPublisher();
        if (title == null || title.isBlank()){
            throw new ValidationExceptionPublisher("Название не должно быть пустым");
        }
        String city = data.getCity();
        if (city == null || city.isBlank()){
            throw new ValidationExceptionPublisher("Издательство должно иметь адрес");
        }
    }
}
