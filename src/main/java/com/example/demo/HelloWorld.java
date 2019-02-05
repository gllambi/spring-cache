package com.example.demo;

import org.springframework.cache.annotation.Cacheable;

public class HelloWorld {

    private String name;

    public void setName(String name) {
        this.name = name;
    }

    @Cacheable(value="helloCache", key="#hello")
    public String printHello(String hello) {
        slowQuery(2000L);
        return hello;
    }

    private void slowQuery(long seconds){
        try {
            Thread.sleep(seconds);
        } catch (InterruptedException e) {
            throw new IllegalStateException(e);
        }
    }
}
