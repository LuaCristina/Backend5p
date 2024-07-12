package com.example.manytoone.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.manytoone.domain.Book;

public interface BookRepository extends CrudRepository<Book,Long> {
    
}