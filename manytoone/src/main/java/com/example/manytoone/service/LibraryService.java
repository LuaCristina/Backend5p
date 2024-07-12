package com.example.manytoone.service;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.manytoone.domain.Library;
import com.example.manytoone.repository.LibraryRepository;

@Service
public class LibraryService {

      @Autowired
        LibraryRepository repository;

        public List<Library> getAll() {
                try {
                        List<Library> items = new ArrayList<Library>();

                       
                        repository.findAll().forEach(items::add);
                        return items;
                } catch (Exception e) {
                        return null;
                }
        }

        public Library getById(Long id) {
                Optional<Library> categoria = repository.findById(id);
                if (categoria.isPresent()) {
                        return categoria.get();
                }
                return null;
        }

        public Library create(Library categoria) {
                return repository.save(categoria);
        }

        public Library update(Long id, Library item) {
                Optional<Library> existingBookOptional = repository.findById(id);

                if (existingBookOptional.isPresent()) {
                        Library existingBook = existingBookOptional.get();
                        existingBook.setNome(item.getNome());
                        return repository.save(existingBook);
                } else {
                        return null;
                }
        }

        public boolean delete(Long id) {
                try {
                        repository.deleteById(id);
                        return true;
                } catch (Exception e) {
                        return false;
                }
        }
}
