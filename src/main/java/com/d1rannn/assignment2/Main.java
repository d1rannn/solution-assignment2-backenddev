package com.d1rannn.assignment2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

// Main Application
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        
        // Fetching Primary Service
        BookService primaryService = context.getBean(BookService.class);
        System.out.println(primaryService.getBook(1));
        
        // Fetching Alternative Service
        BookService alternativeService = context.getBean("alternativeBookService", BookService.class);
        System.out.println(alternativeService.getBook(2));
        
        // Fetching Lazy Bean
        LazyBean lazyBean = context.getBean(LazyBean.class);
        
        context.close();
    }
}