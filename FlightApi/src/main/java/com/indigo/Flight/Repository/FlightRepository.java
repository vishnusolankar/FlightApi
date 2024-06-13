package com.indigo.Flight.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.indigo.Flight.model.Flight;

@Repository
public interface FlightRepository extends JpaRepository<Flight, Integer> {

}
