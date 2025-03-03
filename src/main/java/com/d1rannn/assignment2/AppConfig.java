package com.d1rannn.assignment2;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Bean;

// Configuration Class
@Configuration
@ComponentScan(basePackages = "com.d1rannn")
public class AppConfig {
    @Bean
    public BookRepository bookRepository() {
        return new BookRepository();
    }
}