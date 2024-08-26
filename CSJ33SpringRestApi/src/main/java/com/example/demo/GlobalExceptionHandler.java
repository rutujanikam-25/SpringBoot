package com.example.demo;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.exception.InvalidBusLocationException;
import com.example.demo.exception.InvalidBusNumberException;



@ControllerAdvice
public class GlobalExceptionHandler {
	/*@ExceptionHandler(InvalidBusNumberException.class)
	public ResponseEntity<String>checkCorrectBusNumber(InvalidBusNumberException e)
	{
	return new ResponseEntity<String>(e.getMessage(),HttpStatus.BAD_REQUEST);	
	}

	@ExceptionHandler(InvalidBusLocationException.class)
	public ResponseEntity<String>Invalidbuslocation(InvalidBusLocationException e)
	{
	return new ResponseEntity<String>(e.getMessage(),HttpStatus.BAD_REQUEST);	
	}
	/*
	 * If any attribute or field in the class will not match with the given validation rule then the below method
	 * called or invoke and the object of method argument not valid exception is instatlized
	 */
	
	@ExceptionHandler(MethodArgumentNotValidException.class)
	@ResponseBody
	public String checkFieldError(MethodArgumentNotValidException e)
	{
		//BindingResult getBindingResult() is the method of
		//MethodArgumentNotValidException object
		//FieldError getFieldEror() is the method BindingResult inteface
		//String GetDefaultMessage() is the method of fieldError class
		
		String errorMsg=e.getBindingResult().getFieldError().getDefaultMessage();
		return "<h4><font color='red'>"+errorMsg+"</font?</h4>";
	}
}
