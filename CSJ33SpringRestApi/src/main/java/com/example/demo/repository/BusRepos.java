package com.example.demo.repository;

import java.time.LocalDate;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Bus;

@Repository
public interface BusRepos extends CrudRepository<Bus, Long>{
	@Transactional
	@Modifying
	@Query("update Bus b set b.sourceLocation=:src, b.destinationLocation=:dest,b.busPrice=:price,b.startingDate=:sd,b.busRoute=:br where b.busNumber=:bnum")
     public int updateBus(@Param("bnum") long BusNum,
    		 @Param("src")String busSrc,
    		 @Param("dest")String busDest,
    		 @Param("price")double busPrice,
    		 @Param("sd")LocalDate busDate,
    		 @Param("br")String busRoute
    		 );
	@Query("select b from Bus b where b.sourceLocation=:p1 and b.destinationLocation=:p2")
	public List<Bus> searchBus
	(@Param("p1")String src,
			@Param("p2") String dest);
			
	
	
	@Query("select SUM(b.busPrice)from Bus b")
	public double gettotalPrice();
	
	@Query("select b from Bus b order by b.busPrice ")
	public List<Bus>fetchBusInAsc();
	public Bus getById(long busNum);
}