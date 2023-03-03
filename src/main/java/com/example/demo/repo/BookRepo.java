package com.example.demo.repo;


import org.springframework.data.repository.CrudRepository;
import com.example.demo.entity.BookEntity;

public interface BookRepo extends CrudRepository<BookEntity, Long> {

}

