package com.example.demo.service;

import java.util.List;

import com.example.demo.exception.InvalidBusLocationException;
import com.example.demo.exception.InvalidBusNumberException;
import com.example.demo.model.Bus;

public interface BusService {
	//endPoint : localhost:1616/saveBus
	Bus saveBus(Bus bus);
   //endPoint : localhost:1616/fetchAllBuses
	List<Bus> fetchBuses();
	//endPoint : localhost:1616/getBusById/{busId}
	Bus getBusById(long busNum);
	//endPoint : localhost:1616/editBus/{busNum}
	Bus updateBus(long busNum,Bus newBus);
	//endPoint : localhost:1616/delBus/{busNum}
	String removeBus(long busNum);
	//endPoint : localhost:1616/searchBuses/{source}/{dest}
	List<Bus>searchBuses(String source,String destination);
	
	//endPoint : localhost:1616/get-total-price
	double getTotalBusPrice();
	//endPoint : localhost:1616/count-total-bus
	int countBus();
	//endPoint : localhost:1616/getAllBus-by-price
	List<Bus> getBusByMinPriceOrder();
	
	Bus getBusByNumber(long busNum) throws InvalidBusNumberException;
	//endPoint : localhost:1616/searchBus/{source}/{dest}
	List<Bus>searchBus(String source,String dest)throws InvalidBusLocationException;
}
