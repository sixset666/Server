package com.example.demo.responce;

import com.example.demo.entity.PublisherEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class PublisherListResponse extends BaseResponce {
    public PublisherListResponse(Iterable<PublisherEntity> data){
        super(true,"Издательства");
        this.data = data;
    }

    private Iterable<PublisherEntity> data;
}
