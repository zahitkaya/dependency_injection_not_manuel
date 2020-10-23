package com.example.dependency_injection_not_manuel.constructor_type;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {
    private IEngine engine;

    @Autowired
    public Car(IEngine engine){
        this.engine=engine;
    }

    public void start(){
        engine.turnOn();
    }

}
