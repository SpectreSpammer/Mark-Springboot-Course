package com.onepieceofjava.MarkSpringBootTutorial.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

	@GetMapping("/message")
	public String message() {
		return "Hello! Welcome to Springboot";
	}
}
