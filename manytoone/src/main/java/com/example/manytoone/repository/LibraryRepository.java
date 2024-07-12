package com.example.manytoone.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.manytoone.domain.Library;

public interface LibraryRepository extends CrudRepository<Library,Long> {
    
}