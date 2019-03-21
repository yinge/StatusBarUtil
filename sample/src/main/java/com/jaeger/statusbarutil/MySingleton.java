package com.jaeger.statusbarutil;

public class MySingleton {
    private static MySingleton instance = new MySingleton();

    private MySingleton() {
        throw new RuntimeException("this class can not be initialized");
    }

    public static MySingleton getInstance() {
        return instance;
    }
}