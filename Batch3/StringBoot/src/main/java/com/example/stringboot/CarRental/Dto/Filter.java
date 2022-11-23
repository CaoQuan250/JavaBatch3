package com.example.stringboot.CarRental.Dto;

public class Filter {
    private String fuel;
    private String model;

    public Filter() {
    }

    public Filter(String fuel, String model) {
        this.fuel = fuel;
        this.model = model;
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
