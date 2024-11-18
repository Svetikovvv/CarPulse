package org.example;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "org.example")
public class ObdServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ObdServerApplication.class, args);
        System.out.println("OBD-II Server is running...");
    }
}
