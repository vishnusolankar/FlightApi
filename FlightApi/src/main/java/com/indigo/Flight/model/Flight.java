package com.indigo.Flight.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
//import javax.xml.bind.annotation.XmlRootElement;

@Entity
//@XmlRootElement
public class Flight {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int flightId;

	private String flightname;

	private String flightPickupLocation;

	private String flightDropLocation;

	private double flightPrice;

	private double flightTime;

	private Date date;

	@OneToMany(mappedBy = "flight", cascade = CascadeType.ALL)

	private List<Passenger> passengers = new ArrayList<>();

	public void setFlightId(int flightId) {
		this.flightId = flightId;
	}

	public String getFlightname() {
		return flightname;
	}

	public void setFlightname(String flightname) {
		this.flightname = flightname;
	}

	public String getFlightPickupLocation() {
		return flightPickupLocation;
	}

	public void setFlightPickupLocation(String flightPickupLocation) {
		this.flightPickupLocation = flightPickupLocation;
	}

	public String getFlightDropLocation() {
		return flightDropLocation;
	}

	public void setFlightDropLocation(String flightDropLocation) {
		this.flightDropLocation = flightDropLocation;
	}

	public double getFlightPrice() {
		return flightPrice;
	}

	public void setFlightPrice(double flightPrice) {
		this.flightPrice = flightPrice;
	}

	public double getFlightTime() {
		return flightTime;
	}

	public void setFlightTime(double flightTime) {
		this.flightTime = flightTime;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Flight(int flightId, String flightname, String flightPickupLocation, String flightDropLocation,
			double flightPrice, double flightTime, Date date, List<Passenger> passengers) {
		super();
		this.flightId = flightId;
		this.flightname = flightname;
		this.flightPickupLocation = flightPickupLocation;
		this.flightDropLocation = flightDropLocation;
		this.flightPrice = flightPrice;
		this.flightTime = flightTime;
		this.date = date;
		this.passengers = passengers;
	}

}
