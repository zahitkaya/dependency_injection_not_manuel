package com.example.dependency_injection_not_manuel.setter_type;

import com.example.dependency_injection_not_manuel.constructor_type.IEngine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Television {
    private IEngine engine;

    public IEngine getEngine() {
        return engine;
    }

    @Autowired
    public void setEngine(IEngine engine) {
        this.engine = engine;
    }
    public void start(){
        engine.turnOn();
    }
}
