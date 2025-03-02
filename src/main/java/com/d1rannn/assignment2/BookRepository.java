package com.d1rannn.assignment2;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.Service;
import org.springframework.stereotype.Repository;
import org.springframework.beans.factory.annotation.*;
import java.util.*;

// Repository Layer
@Repository
public class BookRepository {
    private final Map<Integer, String> books = new HashMap<>();
    
    public BookRepository() {
        books.put(1, "Spring in Action");
        books.put(2, "Effective Java");
    }
    
    public String getBookById(int id) {
        return books.get(id);
    }
}