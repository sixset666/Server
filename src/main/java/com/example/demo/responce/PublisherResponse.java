package com.example.demo.responce;

import com.example.demo.entity.PublisherEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class PublisherResponse extends BaseResponce{
    public PublisherResponse(boolean success, String message, PublisherEntity publisher){
        super(success,message);
        this.publisher = publisher;
    }
    public PublisherResponse(PublisherEntity publisher){super(true,"Publising data");}
    private PublisherEntity publisher;
}
