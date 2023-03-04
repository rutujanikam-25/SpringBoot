package edu.coffeeHouse.entity;

public class Coffee {
	private String Coffee_name;
	private int Coffee_price;
	//Getter and Setter method
	public String getCoffee_name() {
		return Coffee_name;
	}
	public void setCoffee_name(String coffee_name) {
		Coffee_name = coffee_name;
	}
	public int getCoffee_price() {
		return Coffee_price;
	}
	public void setCoffee_price(int coffee_price) {
		Coffee_price = coffee_price;
	}
	
	//constructor
	public Coffee(String coffee_name, int coffee_price) {
		super();
		Coffee_name = coffee_name;
		Coffee_price = coffee_price;
	}
	public Coffee() {
		super();
		// TODO Auto-generated constructor stub
	}
	//override toString() Method
	@Override
	public String toString() {
		return "Coffee [Coffee_name=" + Coffee_name + ", Coffee_price=" + Coffee_price + "]";
	}
}
