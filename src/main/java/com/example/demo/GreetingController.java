package com.example.demo;

import java.util.concurrent.atomic.AtomicLong;

import org.apache.logging.log4j.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;




@RestController
public class GreetingController {	
	
	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();
	Logger logger = LogManager.getLogger(GreetingController.class);

	@GetMapping("/greeting")
	public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
		logger.info("test the logging");
		logger.info("logging 2 lines");
		
		//api
		System.out.println(org.apache.logging.log4j.Logger.class.getResource("/org/ap‌​ache/logging/log4j/Logger.class"));
		//core
		System.out.println(org.apache.logging.log4j.Logger.class.getResource("/org/ap‌​ache/logging/log4j/core/Appender.class"));
		//config
		System.out.println(org.apache.logging.log4j.Logger.class.getResource("/log4j2.xml"));
		return new Greeting(counter.incrementAndGet(), String.format(template, name));
	}
}

