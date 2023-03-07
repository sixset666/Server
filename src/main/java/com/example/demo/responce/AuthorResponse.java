package com.example.demo.responce;

import com.example.demo.entity.AuthorEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class AuthorResponse extends BaseResponce{
    public AuthorResponse(boolean success, String message, AuthorEntity author){
        super(success,message);
        this.author = author;
    }
    public AuthorResponse (AuthorEntity author){super(true,"Author data");}
    private AuthorEntity author;
}
