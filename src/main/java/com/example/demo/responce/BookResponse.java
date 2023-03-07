package com.example.demo.responce;

import com.example.demo.entity.BookEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.awt.print.Book;

@Data
@EqualsAndHashCode(callSuper = false)
public class BookResponse extends BaseResponce {
    public BookResponse (boolean success, String message, BookEntity publisher){
        super(success,message);
        this.publisher = publisher;
    }
    public BookResponse(BookEntity publisher){super(true,"Publishing data");}
    private BookEntity publisher;
}
