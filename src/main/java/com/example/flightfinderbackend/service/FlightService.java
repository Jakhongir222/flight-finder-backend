package com.example.flightfinderbackend.service;

import com.example.flightfinderbackend.model.Flight;
import com.example.flightfinderbackend.repository.FlightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class FlightService {
    @Autowired
    private FlightRepository flightRepository;

    public List<Flight> getAvailableFlights(String departureDestination, String arrivalDestination, LocalDateTime from, LocalDateTime to) {
        return flightRepository.findAvailableFlights(departureDestination, arrivalDestination, from, to);
    }

    public Flight getFlight(String flightId) {
        return flightRepository.findById(flightId)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Flight not found"));
    }

}

