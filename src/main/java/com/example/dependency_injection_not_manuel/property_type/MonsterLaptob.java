package com.example.dependency_injection_not_manuel.property_type;

import com.example.dependency_injection_not_manuel.IEngine;
import org.springframework.stereotype.Component;

@Component
public class MonsterLaptob implements IEngine {


    @Override
    public void turnOn() {
        System.out.println("Laptob çalıştı");
    }
}
