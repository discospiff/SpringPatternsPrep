package com.plantflashcards;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.plantflashcards.interceptors.StopwatchInterceptor;

@SpringBootApplication
public class Application extends WebMvcConfigurerAdapter {

	@Autowired
	StopwatchInterceptor stopwatchInterceptor;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 	SpringApplication.run(Application.class, args);
	}
	
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		System.out.println("Adding interceptor");
		 // registry.addInterceptor(stopwatchInterceptor);
		registry.addInterceptor(stopwatchInterceptor);
	}

}
