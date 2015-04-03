package com.recursivechaos.injectorwrapper;

import com.recursivechaos.injectorcore.service.InjectorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

// Removed @SpringBootApplication and replaced with the necessary  annotations
// and set the ComponentScan to the parent package.
@Configuration
@ComponentScan("com.recursivechaos")
public class InjectorWrapperApplication implements CommandLineRunner {

    @Autowired
    InjectorService injectorService;

    public static void main(String[] args) {
        SpringApplication.run(InjectorWrapperApplication.class, args);
    }

    @Override
    public void run(String... strings) throws Exception {
        System.out.println("Hello " + injectorService.getGreeting());
    }
}
