package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class Frontend {
	
	@GetMapping("/get/{message}")
	public String getMessage(@PathVariable String message) {
		return message;
	}

}
