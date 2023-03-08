package com.TrainerSubject.entity;

public class Trainer {
	private static Subject subject;
    //constructor 
	public Trainer(Subject subject) {
		super();
		this.subject = subject;
	}
	public static void teach ()
	{
		System.out.println("Trainer is teaching "+ subject.getSubjectName());
	}
	

}
