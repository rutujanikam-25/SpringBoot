package com.calculator.simplecalculator.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.calculator.simplecalculator.calculatorlogic.CalculatorLogic;

@RestController
public class Calculator {
	
	
	@GetMapping("/calculator/add")
	public String calculate(@RequestParam(value="n1",required=true,defaultValue="1")int n1,
			@RequestParam(value="n2",required=true,defaultValue="2")int n2)//It is a calculate method is use for the take parameter
	{
		
		return "<h1> The sum is "+CalculatorLogic.addNo(n1, n2)+"</h1>";//call CalculatorLogic class addNo() method
	}
	@GetMapping("/calculator/sub")
	public String calculate1(@RequestParam(value="n1",required=true,defaultValue="1")int n1,
			@RequestParam(value="n2",required=true,defaultValue="2")int n2)//It is a calculate1 method is use for the take parameter
	{
		
		return "<h1> The substraction is "+CalculatorLogic.subNo(n1, n2)+"</h1>";//call CalculatorLogic class subNo() method
	}
	@GetMapping("/calculator/mul")
	public String calculate2(@RequestParam(value="n1",required=true,defaultValue="1")int n1,
			@RequestParam(value="n2",required=true,defaultValue="2")int n2)//It is a calculate2 method is use for the take parameter
	{
		
		return "<h1> The multiplication is "+CalculatorLogic.mulNo(n1, n2)+"</h1>";//call CalculatorLogic class mulNo() method
	}
	@GetMapping("/calculator/div")
	public String calculate3(@RequestParam(value="n1",required=true,defaultValue="1")int n1,
			@RequestParam(value="n2",required=true,defaultValue="2")int n2)//It is a calculate3 method is use for the take parameter
	{
		
		return "<h1> The Division is "+CalculatorLogic.divNo(n1, n2)+"</h1>";//call CalculatorLogic class divNo() method
	}

}
