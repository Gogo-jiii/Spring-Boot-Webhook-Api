package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WebhookApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebhookApiApplication.class, args);
		System.out.println("server started...");
	}

}
