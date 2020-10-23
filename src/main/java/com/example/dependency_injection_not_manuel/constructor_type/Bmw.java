package com.example.dependency_injection_not_manuel.constructor_type;

public class Bmw implements IEngine {
    @Override
    public void turnOn() {
        System.out.println("BMW çalıştı");
    }
}
