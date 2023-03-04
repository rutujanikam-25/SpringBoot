package edu.coffeeHouse.controller;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import edu.coffeeHouse.entity.Coffee;



@RestController
public class CoffeeProduction {
	//create ArrayList
	private List<Coffee> coffee = new ArrayList<>();
	
	//Adding coffee to the list
		public CoffeeProduction() {
			coffee.addAll(
					List.of(
					new Coffee("Cappuccino", 500), //Coffee class object create
					new Coffee("Espresso", 350), 
					new Coffee("Americano", 450),
					new Coffee("Latte", 550), 
					new Coffee("Caffe mocha", 350), 
					new Coffee("Iced Coffee", 300)
					));
			
			
		}
		
		//To display all the coffee_name and price  in the list
		//@RequestMapping(value = "/CoffeeList", method = RequestMethod.GET)
		@GetMapping("/coffee")    //@GetMappin is a composed aanotation that acts as shortcut for @RequestMapping(method=RequestMethod.GET
		Iterable<Coffee> getAllLeds() {
			return coffee;
		}
}
