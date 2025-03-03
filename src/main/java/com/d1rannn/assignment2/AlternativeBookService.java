package com.d1rannn.assignment2;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

// Alternative Service Implementation
@Service
public class AlternativeBookService implements BookService {
    private final BookRepository repository;
    
    @Autowired
    public AlternativeBookService(BookRepository repository) {
        this.repository = repository;
    }
    
    @Override
    public String getBook(int id) {
        return "Alternative Service: " + repository.getBookById(id);
    }
} 
