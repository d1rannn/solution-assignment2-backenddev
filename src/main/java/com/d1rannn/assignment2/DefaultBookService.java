package com.d1rannn.assignment2;

import org.springframework.stereotype.Service;
import org.springframework.context.annotation.Primary;
import org.springframework.beans.factory.annotation.Autowired;

// Primary Service Implementation
@Service
@Primary
public class DefaultBookService implements BookService {
    private final BookRepository repository;
    
    @Autowired
    public DefaultBookService(BookRepository repository) {
        this.repository = repository;
    }
    
    @Override
    public String getBook(int id) {
        return "Default Service: " + repository.getBookById(id);
    }
}