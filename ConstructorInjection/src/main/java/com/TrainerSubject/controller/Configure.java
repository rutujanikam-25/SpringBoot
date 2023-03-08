package com.TrainerSubject.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.TrainerSubject.entity.Subject;
import com.TrainerSubject.entity.Trainer;
//Spring Configuration annotation indicates that the class has @Bean definition methods
@Configuration
//It is used to define subject and trainer class 
public class Configure {
	//Spring @Bean Annotation is applied on a method to specify that it returns a bean to be managed by Spring context
	@Bean
	public Subject subject ()
	{
       return new Subject ("IT");
  
    }
	
	@Bean
	public Trainer trainer ()
	{
       return new Trainer (subject());
  
    }
}
