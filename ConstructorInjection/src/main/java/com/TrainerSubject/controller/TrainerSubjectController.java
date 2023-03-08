package com.TrainerSubject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.TrainerSubject.entity.Trainer;

//RestController annotation is used to create RESTful web services using Spring MVC
@RestController
public class TrainerSubjectController {
	//It is use constructor injection to get trainer instance
	private Trainer trainer;

	public TrainerSubjectController(Trainer trainer) {
		super();
		this.trainer = trainer;
	}

	@GetMapping("/teach")
	public String teach()
	{
		Trainer.teach();
		
		return "Training completed sucessfully!";
	}

	

}
