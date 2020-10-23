package com.example.dependency_injection_not_manuel.setter_type;

import com.example.dependency_injection_not_manuel.IEngine;

public class PlasmaTv implements IEngine {

    @Override
    public void turnOn() {
        System.out.println("Televizyon çalıştı");
    }
}
