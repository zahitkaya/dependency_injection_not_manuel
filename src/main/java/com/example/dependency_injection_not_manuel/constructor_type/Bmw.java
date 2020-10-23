package com.example.dependency_injection_not_manuel.constructor_type;

import com.example.dependency_injection_not_manuel.IEngine;
import org.springframework.stereotype.Component;


public class Bmw implements IEngine {
    @Override
    public void turnOn() {
        System.out.println("BMW çalıştı");
    }
}
