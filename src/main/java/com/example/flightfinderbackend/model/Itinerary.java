package com.example.flightfinderbackend.model;


import jakarta.persistence.Embeddable;

@Embeddable
public class Itinerary {

    private String flightId;
    private String departureAt;
    private String arrivalAt;
    private int availableSeats;
    private Prices prices;

    public Itinerary() {}

    public Itinerary(String flightId, String departureAt, String arrivalAt, int availableSeats, Prices prices) {
        this.flightId = flightId;
        this.departureAt = departureAt;
        this.arrivalAt = arrivalAt;
        this.availableSeats = availableSeats;
        this.prices = prices;
    }

    public String getFlightId() {
        return flightId;
    }

    public void setFlightId(String flightId) {
        this.flightId = flightId;
    }

    public String getDepartureAt() {
        return departureAt;
    }

    public void setDepartureAt(String departureAt) {
        this.departureAt = departureAt;
    }

    public String getArrivalAt() {
        return arrivalAt;
    }

    public void setArrivalAt(String arrivalAt) {
        this.arrivalAt = arrivalAt;
    }

    public int getAvailableSeats() {
        return availableSeats;
    }

    public void setAvailableSeats(int availableSeats) {
        this.availableSeats = availableSeats;
    }

    public Prices getPrices() {
        return prices;
    }

    public void setPrices(Prices prices) {
        this.prices = prices;
    }
}
