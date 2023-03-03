package com.calculator.simplecalculator.calculatorlogic;

public class CalculatorLogic {
	//create a method for Addition of Two number 
	public static int addNo(int n1 ,int n2) {
		return n1+n2;
	}
	//create a method for Subtraction of Two number 
	public static int subNo(int n1 ,int n2) {
		return n1-n2;
	}
	//create a method for Division of Two number 
	public static int divNo(int n1 ,int n2) {
		try {
			return n1/n2;
		}
		catch(Exception e) {
			System.out.println(e);
		}
		return n2;
		
	}
	//create a method for Multiplication of Two number 
	public static int mulNo(int n1 ,int n2) {
		
		return n1*n2;
		
		
	}
}
