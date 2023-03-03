package com.example.demo.response;

import com.example.demo.entity.BookEntity;
import lombok.Data;
import lombok.RequiredArgsConstructor;

    @Data
    @RequiredArgsConstructor
    public class BookListResponse extends BaseResponse {
        private Iterable<BookEntity> data;

        public BookListResponse(Iterable<BookEntity> data) {
            super(true, "Список книг");

            this.data = data;


        }


    }
