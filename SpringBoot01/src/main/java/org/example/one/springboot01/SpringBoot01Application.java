package org.example.one.springboot01;

import org.example.one.springboot01.Custom.Car;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBoot01Application {

    public static void main(String[] args) {

        ApplicationContext context=  SpringApplication.run(SpringBoot01Application.class, args);
        System.out.println("hey Spring Boot 01");
        Car car = context.getBean(Car.class);
        car.m1();
    }

}
