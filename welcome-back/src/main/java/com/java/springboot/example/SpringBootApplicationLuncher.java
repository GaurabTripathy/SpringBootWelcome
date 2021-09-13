package com.java.springboot.example;

import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * This Luncher for the spring boot application.
 * 
 * @author gaurab.tripathy
 *
 */
@ComponentScan(basePackages= {"com.example.package"})
public class SpringBootApplicationLuncher {
	public static void main(String[] args) {
		SpringApplication.run(HelloWorldController.class, args);
	}
}
