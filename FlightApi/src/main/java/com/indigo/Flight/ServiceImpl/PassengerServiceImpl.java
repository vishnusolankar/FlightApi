package com.indigo.Flight.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.indigo.Flight.Repository.PassengerRepository;
import com.indigo.Flight.Service.PassengerServiceI;
import com.indigo.Flight.model.Passenger;

@Service
public class PassengerServiceImpl implements PassengerServiceI {

	@Autowired
	private PassengerRepository passengerRepository;

	@Override
	public Passenger passengerSave(Passenger passenger) {
		Passenger save = this.passengerRepository.save(passenger);
		return save;
	}

	
	
	
}
