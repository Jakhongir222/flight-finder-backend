package com.example.flightfinderbackend.model;


import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.List;

@Entity
@Table(name = "flight")
public class Flight {
    @Id
    private String routeId;
    private String departureDestination;
    private String arrivalDestination;
    @ElementCollection
    private List<Itinerary> itineraries;

    public Flight() {}

    public Flight(String routeId, String departureDestination, String arrivalDestination, List<Itinerary> itineraries) {
        this.routeId = routeId;
        this.departureDestination = departureDestination;
        this.arrivalDestination = arrivalDestination;
        this.itineraries = itineraries;
    }

    public String getRouteId() {
        return routeId;
    }

    public void setRouteId(String routeId) {
        this.routeId = routeId;
    }

    public String getDepartureDestination() {
        return departureDestination;
    }

    public void setDepartureDestination(String departureDestination) {
        this.departureDestination = departureDestination;
    }

    public String getArrivalDestination() {
        return arrivalDestination;
    }

    public void setArrivalDestination(String arrivalDestination) {
        this.arrivalDestination = arrivalDestination;
    }

    public List<Itinerary> getItineraries() {
        return itineraries;
    }

    public void setItineraries(List<Itinerary> itineraries) {
        this.itineraries = itineraries;
    }
}
