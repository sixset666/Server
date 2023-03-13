package com.example.demo.repo;


import org.springframework.data.repository.CrudRepository;
import com.example.demo.entity.BookEntity;

public interface BookRepo extends CrudRepository<BookEntity, Long> {

    Iterable<BookEntity> findDistinctByPublishing_PublisherOrPublishing_Citi(String title, String city);
}

