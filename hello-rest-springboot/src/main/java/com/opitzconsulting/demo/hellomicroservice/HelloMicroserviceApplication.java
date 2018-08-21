package com.opitzconsulting.demo.hellomicroservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.web.WebApplicationInitializer;

@SpringBootApplication
public class HelloMicroserviceApplication extends SpringBootServletInitializer
		implements WebApplicationInitializer {

    public static void main(String[] args) {

	SpringApplication.run(HelloMicroserviceApplication.class, args);
    }
}