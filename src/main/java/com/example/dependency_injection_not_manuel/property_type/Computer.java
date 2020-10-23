package com.example.dependency_injection_not_manuel.property_type;

import com.example.dependency_injection_not_manuel.IEngine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Computer {
    @Autowired
    private IEngine engine;
    public void start(){
        engine.turnOn();
    }
}
