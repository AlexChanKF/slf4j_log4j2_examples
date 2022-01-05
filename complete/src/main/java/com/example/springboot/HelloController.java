package com.example.springboot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	private static final Logger LOGGER = LoggerFactory.getLogger(Application.class);

	@GetMapping("/")
	public String index() {
		LOGGER.info("[HelloController](index)");
		return "Greetings from Spring Boot!";
	}

}
