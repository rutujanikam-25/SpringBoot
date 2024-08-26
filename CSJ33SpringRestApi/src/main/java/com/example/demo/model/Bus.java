package com.example.demo.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

import org.springframework.format.annotation.DateTimeFormat;
@Entity
public class Bus {
	@Id
	@GeneratedValue
	private long busNumber;
	@Pattern(regexp="[A-Za-z\\s]+",message="location should contain only alphabets")
	private String sourceLocation;
	@Pattern(regexp="[A-Za-z\\s]+",message="destination should contain only alphabets")
	private String destinationLocation;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private LocalDate startingDate;
	@NotBlank(message="Bus route not be blank")
	private String busRoute;
	private double busPrice;
	
	public Bus() {
		super();
	}
	public Bus(long busNumber, String sourceLocation, String destinationLocation, LocalDate startingDate,
			String busRoute, double busPrice) {
		super();
		this.busNumber = busNumber;
		this.sourceLocation = sourceLocation;
		this.destinationLocation = destinationLocation;
		this.startingDate = startingDate;
		this.busRoute = busRoute;
		this.busPrice = busPrice;
	}
	
	public long getBusNumber() {
		return busNumber;
	}
	public void setBusNumber(long busNumber) {
		this.busNumber = busNumber;
	}
	public String getSourceLocation() {
		return sourceLocation;
	}
	public void setSourceLocation(String sourceLocation) {
		this.sourceLocation = sourceLocation;
	}
	public String getDestinationLocation() {
		return destinationLocation;
	}
	public void setDestinationLocation(String destinationLocation) {
		this.destinationLocation = destinationLocation;
	}
	public LocalDate getStartingDate() {
		return startingDate;
	}
	public void setStartingDate(LocalDate startingDate) {
		this.startingDate = startingDate;
	}
	public String getBusRoute() {
		return busRoute;
	}
	public void setBusRoute(String busRoute) {
		this.busRoute = busRoute;
	}
	public double getBusPrice() {
		return busPrice;
	}
	public void setBusPrice(double busPrice) {
		this.busPrice = busPrice;
	}
	@Override
	public String toString() {
		return "Bus [busNumber=" + busNumber + ", sourceLocation=" + sourceLocation + ", destinationLocation="
				+ destinationLocation + ", startingDate=" + startingDate + ", busRoute=" + busRoute + ", busPrice="
				+ busPrice + "]";
	}
	
	

}
