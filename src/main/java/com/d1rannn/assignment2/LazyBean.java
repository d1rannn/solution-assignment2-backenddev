package com.d1rannn.assignment2;
// Lazy Singleton Bean
@Component
@Lazy
public class LazyBean {
    public LazyBean() {
        System.out.println("LazyBean Initialized");
    }
}