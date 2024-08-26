package com.example.demo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.exception.InvalidBusLocationException;
import com.example.demo.exception.InvalidBusNumberException;
import com.example.demo.model.Bus;
import com.example.demo.repository.BusRepos;
import com.example.demo.service.BusService;

@Service
public class BusServiceImpl implements BusService{
	@Autowired
      private BusRepos busRepos;
	@Override
	public Bus saveBus(Bus bus) {
		Bus busObj=busRepos.save(bus);
		return busObj;
	}

	@Override
	public List<Bus> fetchBuses() {
		//Incase CrudRepository 
		//iterable<Bus> findAll()
		//incase ofJPARepository
		//List<Bus> findAll();
		
		return (List<Bus>) busRepos.findAll();
	}

	@Override
	public Bus getBusById(long busNum) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Bus updateBus(long busNum, Bus newBus) {
		int updateStatus=busRepos.updateBus(busNum, newBus.getSourceLocation(), newBus.getDestinationLocation(), newBus.getBusPrice(),
				newBus.getStartingDate(),newBus.getBusRoute());
		if(updateStatus>0)
		{
			return newBus;
		}
		return null;
	}

	@Override
	public String removeBus(long busNum) {
		if(busRepos.existsById(busNum))
		{
		 busRepos.deleteById(busNum);
		 return "success";
		}
		return "fail";
	}

	@Override
	public List<Bus> searchBuses(String source, String destination) {
		List<Bus> list=busRepos.searchBus(source, destination);
		return list;
	}

	@Override
	public double getTotalBusPrice() {
		return busRepos.gettotalPrice();
	}

	@Override
	public int countBus() {
		//long count():This method is the method
		/*
		 * of crudRepository which return long as return type
		 */
		int noOfBus=(int)busRepos.count();
		return noOfBus;
	}

	@Override
	public List<Bus> getBusByMinPriceOrder() {
		return busRepos.fetchBusInAsc();
	}

	@Override
	public Bus getBusByNumber(long busNum) throws InvalidBusNumberException {
		if(busRepos.existsById(busNum))
		{
			Bus bus=busRepos.findById(busNum).get();
					return bus;
		}
		throw new InvalidBusNumberException("Not a valid bus");
	}

	@Override
	public List<Bus> searchBus(String source, String dest) throws InvalidBusLocationException {
	List<Bus>list=busRepos.searchBus(source,dest);
	if(list !=null)
	{
		return list;
	}
	throw new InvalidBusLocationException("Invalid Location");
	}

}
