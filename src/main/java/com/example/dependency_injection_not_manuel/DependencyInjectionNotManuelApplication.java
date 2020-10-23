package com.example.dependency_injection_not_manuel;

import com.example.dependency_injection_not_manuel.property_type.Computer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DependencyInjectionNotManuelApplication {

    public static void main(String[] args) {
        ApplicationContext ctx=SpringApplication.run(DependencyInjectionNotManuelApplication.class, args);
        Computer computer= (Computer) ctx.getBean(Computer.class);
        computer.start();


    }

}
