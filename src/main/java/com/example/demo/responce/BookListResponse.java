package com.example.demo.responce;

import com.example.demo.entity.BookEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class BookListResponse extends BaseResponce {
    public BookListResponse(Iterable<BookEntity> data){
        super(true,"Книги");
        this.data = data;
    }

    private Iterable<BookEntity> data;
}
