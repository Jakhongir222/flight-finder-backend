package com.example.flightfinderbackend.model;


import jakarta.persistence.Embeddable;

@Embeddable
public class Prices {

    private String currency;
    private double adult;
    private double child;

    public Prices() {}

    public Prices(String currency, double adult, double child) {
        this.currency = currency;
        this.adult = adult;
        this.child = child;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public double getAdult() {
        return adult;
    }

    public void setAdult(double adult) {
        this.adult = adult;
    }

    public double getChild() {
        return child;
    }

    public void setChild(double child) {
        this.child = child;
    }
}
