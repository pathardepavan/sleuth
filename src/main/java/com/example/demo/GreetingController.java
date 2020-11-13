package com.example.demo;

import java.util.concurrent.atomic.AtomicLong;


import org.slf4j.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class GreetingController {	
	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();
	Logger logger = LoggerFactory.getLogger(GreetingController.class);

	@GetMapping("/greeting")
	public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
		logger.info("test the logging");
		logger.info("logging 2 lines");
		return new Greeting(counter.incrementAndGet(), String.format(template, name));
	}
}

