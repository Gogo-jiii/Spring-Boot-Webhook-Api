package com.example.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class TestController {

	@GetMapping("/test")
	public String name() {
		return "hello world!";
	}
	
	@GetMapping(value = "/callHelloClient")
	public String getHelloClient() {
		String uri = "http://localhost:8080/test";
		RestTemplate restTemplate = new RestTemplate();
		String result = restTemplate.getForObject(uri, String.class);
		return result;
	}
	
	@GetMapping(value = "/getMarvel")
	public String getMarvelData() {
		String url = "https://simplifiedcoding.net/demos/marvel";
		RestTemplate restTemplate = new RestTemplate();
		String result = restTemplate.getForObject(url, String.class);
		return result;
	}
	
	@GetMapping(value = "/getWebhook")
	public String getWebhook() {
		System.out.println("hiiiiiiiii");
		return "webhook";
	}
}
