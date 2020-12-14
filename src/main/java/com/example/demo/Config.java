package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import brave.context.log4j2.ThreadContextScopeDecorator;
import brave.propagation.CurrentTraceContext.ScopeDecorator;

@Configuration
class Config {
	

	@Bean
	ScopeDecorator threadContextScopeDecorator() {
		return ThreadContextScopeDecorator.get();
	}	
}
