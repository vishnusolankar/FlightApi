package com.indigo.Flight.Service;

import java.util.List;

import com.indigo.Flight.model.Flight;
import com.indigo.Flight.model.Passenger;

public interface FlightServiceI {

	Flight flightBooking (Flight flight);
	
	List<Flight> getAllFlightBookingInformation(Flight flight);
}
