package com.example.dependency_injection_not_manuel;

import com.example.dependency_injection_not_manuel.constructor_type.Bmw;
import com.example.dependency_injection_not_manuel.constructor_type.Car;
import com.example.dependency_injection_not_manuel.constructor_type.IEngine;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DependencyInjectionNotManuelApplication {

    public static void main(String[] args) {
        SpringApplication.run(DependencyInjectionNotManuelApplication.class, args);
        IEngine engine=new Bmw();
        Car c=new Car(engine);
        engine.turnOn();

    }

}
