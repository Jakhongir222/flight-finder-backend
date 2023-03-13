package com.example.flightfinderbackend.controller;

import com.example.flightfinderbackend.model.Booking;
import com.example.flightfinderbackend.model.Flight;
import com.example.flightfinderbackend.service.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/flights")
public class FlightController {
    @Autowired
    private FlightService flightService;

    @GetMapping("/available")
    public List<Flight> getAvailableFlights(@RequestParam String departureDestination,
                                            @RequestParam String arrivalDestination,
                                            @RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) LocalDateTime from,
                                            @RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) LocalDateTime to) {
        return flightService.getAvailableFlights(departureDestination, arrivalDestination, from, to);
    }

    @GetMapping("/{flightId}")
    public Flight getFlight(@PathVariable String flightId) {
        return flightService.getFlight(flightId);
    }


}

