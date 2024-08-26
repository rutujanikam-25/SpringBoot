package com.example.demo.controller;

import java.time.LocalDate;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.exception.InvalidBusLocationException;
import com.example.demo.exception.InvalidBusNumberException;
import com.example.demo.model.Bus;
import com.example.demo.service.BusService;

@RestController

public class BusRestController {
	@Autowired
	private BusService busService;
	/*
	 * Post-create a resource from endPoint API---@PostMapping
	 * GET-fetch                              ----@GetMapping
	 * PUT-update                            -----@PutMapping
	 * DElETE-remove                         -----@DeleteMapping
	 * PATCH-partial update                  -----@PatchMapping
	 * 
	 * 
	 */
	//1
	@PostMapping(path="/saveBus")
	public  Bus addBus(@Valid @RequestBody Bus bus)
	{
		return busService.saveBus(bus);
	}
	//2
	@GetMapping(path="/fetchAllBuses")
	public  List<Bus> getAllBuses()
	{
		return busService.fetchBuses();
	}
	//3
	@PutMapping(path="/editBus/{busNum}")
	public Bus updateMyBus(@PathVariable long busNum, @RequestBody Bus newBus)
	{
		return busService.updateBus(busNum, newBus);
	}
	@GetMapping("/searchBuses/{src}/{dest}")
	public List<Bus>searchBuses(
			@PathVariable("src")String s,
			@PathVariable("dest")String d)
	{
		return busService.searchBuses(s, d);
	}
	//creating api to delete bus object
	//localhost:1616/delBus/100
	@DeleteMapping("/delBus/{bno}")
	public String deleteBus(@PathVariable long bno)
	{
		String str=busService.removeBus(bno);
		return "<h2><font color='red'>"+str+"</font><h2>";
	}
	
	@GetMapping("/get-total-price")
	public String getToatalPrice()
	{
		double price=busService.getTotalBusPrice();
		return "<h2><font color='blue'>"+" "+"Total price:"+" "+price+"</font></h2>";
	}
	@GetMapping(path="count-total-bus")
	public String getTotalCount()
	{
		int nob=busService.countBus();
		return "<h2><font color='green'>"+" "+nob+" "+"buses running"+"</font></h2>";
	}
	//localhost:1616/getAllBus-by-price
	@GetMapping("/getAllBus-by-price")
	public ResponseEntity<List<Bus>>getAllBus()
	{
		List<Bus> listOfBus=busService.getBusByMinPriceOrder();
		return new ResponseEntity<List<Bus>>(listOfBus,HttpStatus.FOUND);
	}
	@GetMapping("/getBusById/{busNum}")
	 public Bus getBusById(@PathVariable long busNum) throws InvalidBusNumberException {
	        return busService.getBusByNumber(busNum);
	    }
	

    
	  @GetMapping("/searchBus/{source}/{dest}")
	    public List<Bus> searchBus(@PathVariable("source") String source,
	    		@PathVariable("dest") String dest) throws InvalidBusLocationException  {
	        return busService.searchBus(source, dest);
	    }
}
