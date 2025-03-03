package com.d1rannn.assignment2;

import org.springframework.stereotype.Component;
import org.springframework.context.annotation.Lazy;

// Lazy Singleton Bean
@Component
@Lazy
public class LazyBean {
    public LazyBean() {
        System.out.println("LazyBean Initialized");
    }
}