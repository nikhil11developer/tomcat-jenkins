package com.example.tomcatjenkins.controller;
//THIS IS A COMMENT
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class HelloController {
        @GetMapping("/hello")
	public String hello() {
		return "hello  master developer b1 version";
	}

	@GetMapping("/bello")
	public String bello() {
		return "bello master developer c1 version";
	}
	
}
