package com.example.manytoone.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.manytoone.domain.Library;
import com.example.manytoone.service.LibraryService;

@RestController
@RequestMapping("/library")
class LibraryController {

        @Autowired
        LibraryService service;

        @GetMapping
        public List<Library> getAll() {
               
                List<Library> books = service.getAll();
                return books;
        }

        @GetMapping("{id}")
        public Library getById(@PathVariable("id") Long id) {
                return service.getById(id);
        }

        @PostMapping
        public Library create(@RequestBody Library book) {
            Library library = service.create(book);
                return library;
        }

        @PutMapping("{id}")
        public Library update(@PathVariable("id") Long id, @RequestBody Library book) {
                return service.update(id, book);
        }

        @DeleteMapping("{id}")
        public boolean delete(@PathVariable("id") Long id) {
                return service.delete(id);
        }
}