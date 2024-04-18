package com.example.demo.repository;

import com.example.demo.model.Book;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BookRepo
    extends MongoRepository<Book, Integer>{
}
