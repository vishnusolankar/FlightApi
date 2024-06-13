package com.indigo.Flight.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.indigo.Flight.Repository.FlightRepository;
import com.indigo.Flight.Service.FlightServiceI;
import com.indigo.Flight.model.Flight;
import com.indigo.Flight.model.Passenger;

@Service 
public class FlightServiceImpl implements FlightServiceI {

	@Autowired
	private FlightRepository flightRepository;

	@Override
	public Flight flightBooking(Flight flight) {
	 Flight save = flightRepository.save(flight);
		return save;
	}

	@Override
	public List<Flight> getAllFlightBookingInformation(Flight flight) {
	List<Flight> findAll = flightRepository.findAll();
		return findAll;
	}
	
	
}
