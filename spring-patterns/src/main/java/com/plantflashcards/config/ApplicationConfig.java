package com.plantflashcards.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.plantflashcards.interceptors.StopwatchInterceptor;

@Configuration
public class ApplicationConfig extends WebMvcConfigurerAdapter {

	@Autowired
	StopwatchInterceptor stopwatchInterceptor;
	
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		System.out.println("Adding interceptor");
		 // registry.addInterceptor(stopwatchInterceptor);
		registry.addInterceptor( new StopwatchInterceptor());
	}
	
}
