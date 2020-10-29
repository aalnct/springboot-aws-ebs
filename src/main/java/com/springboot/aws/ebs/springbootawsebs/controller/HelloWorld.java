package com.springboot.aws.ebs.springbootawsebs.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello-world")
public class HelloWorld {

	@GetMapping
	public String helloWorld(){
		return "testing";
	}
	
}
