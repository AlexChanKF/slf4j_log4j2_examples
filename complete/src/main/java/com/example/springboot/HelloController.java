package com.example.springboot;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	private static final Logger LOGGER = LogManager.getLogger(HelloController.class);

	@GetMapping("/")
	public String index() {
		LOGGER.info("[HelloController](index)");
		return "Greetings from Spring Boot!";
	}

}
