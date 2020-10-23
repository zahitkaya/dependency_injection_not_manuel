package com.example.dependency_injection_not_manuel.constructor_type;

import com.example.dependency_injection_not_manuel.IEngine;
import com.example.dependency_injection_not_manuel.property_type.Computer;
import org.springframework.stereotype.Component;


public class Car {
    private IEngine engine;


    public Car(IEngine engine){
        this.engine=engine;
    }

    public void start(){
        engine.turnOn();
    }

}
