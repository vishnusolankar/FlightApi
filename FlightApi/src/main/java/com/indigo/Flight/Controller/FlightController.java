package com.indigo.Flight.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.indigo.Flight.Service.FlightServiceI;
import com.indigo.Flight.model.Flight;

@RestController
public class FlightController {
	
	@Autowired
	private FlightServiceI flightServiceI;
	
	@PostMapping(value = "/booking/passenger/{passengerid}" , consumes = {"application/json","application/xml"} ,produces = {"application/json","application/xml"})
	public ResponseEntity<Flight> FlightBooking ( @RequestBody Flight flight ,@PathVariable Integer passengerid ){
		Flight booking = flightServiceI.flightBooking(flight);
		
		return new ResponseEntity<Flight>(booking , HttpStatus.OK);
		
	}
	
	@GetMapping(value = "/Information" , produces = "application/json")
	public ResponseEntity<List<Flight>> getAllFlightBookingInformation(Flight flight){
		List<Flight> allFlightBookingInformation = flightServiceI.getAllFlightBookingInformation(flight);
		
		return new ResponseEntity<>(allFlightBookingInformation,HttpStatus.OK);
		
	}

}
