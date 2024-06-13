package com.indigo.Flight.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.indigo.Flight.Service.PassengerServiceI;
import com.indigo.Flight.model.Passenger;

@RestController
public class PassengerController {

	@Autowired
	private PassengerServiceI passengerServiceI;
	
	@PostMapping(value = "/save" , consumes = "application/json")
	public ResponseEntity<Passenger> savePassenger(@RequestBody Passenger passenger){
		Passenger passengerSave = this.passengerServiceI.passengerSave(passenger);
		return new ResponseEntity<>(passengerSave , HttpStatus.CREATED);
		
	}
}
