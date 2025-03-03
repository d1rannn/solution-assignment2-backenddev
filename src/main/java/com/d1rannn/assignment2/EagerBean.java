package com.d1rannn.assignment2;

import org.springframework.stereotype.Component;

// Eager Singleton Bean
@Component
public class EagerBean {
    public EagerBean() {
        System.out.println("EagerBean Initialized");
    }
}