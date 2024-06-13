package com.indigo.Flight.model;

import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Passenger {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int passengerid;

	private String passengername;

	private long passengerMobileNumber;

	@ManyToOne
	@JoinColumn(name = "flightId")
	private Flight flight;

	// Default constructor
	public Passenger() {
	}

	// Parameterized constructor
	public Passenger(int passengerid, String passengername, long passengerMobileNumber, Flight flight) {
		super();
		this.passengerid = passengerid;
		this.passengername = passengername;
		this.passengerMobileNumber = passengerMobileNumber;
		this.flight = flight;

	}

	// Getters and setters
	public void setPassengerid(int passengerid) {
		this.passengerid = passengerid;
	}

	public String getPassengername() {
		return passengername;
	}

	public void setPassengername(String passengername) {
		this.passengername = passengername;
	}

	public long getPassengerMobileNumber() {
		return passengerMobileNumber;
	}

	public void setPassengerMobileNumber(long passengerMobileNumber) {
		this.passengerMobileNumber = passengerMobileNumber;
	}

	@Override
	public String toString() {
		return "Passenger [passengerid=" + passengerid + ", passengername=" + passengername + ", passengerMobileNumber="
				+ passengerMobileNumber + "]";
	}

}
