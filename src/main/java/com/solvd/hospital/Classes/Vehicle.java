package com.solvd.hospital.Classes;

import com.solvd.hospital.Exceptions.IncorrectRangeException;
import com.solvd.hospital.Exceptions.NotFoundException;

import java.util.Date;
import java.util.Map;

public abstract class Vehicle {

    private int wheels;
    private int seats;
    private String licenseNumber;
    private Map<Date, Double> fuelConsumptionPerDay;

    public Vehicle(int wheels, int seats, String licenseNumber, Map<Date, Double> fuelConsumptionPerDay) {
        this.wheels = wheels;
        this.seats = seats;
        this.licenseNumber = licenseNumber;
        this.fuelConsumptionPerDay = fuelConsumptionPerDay;
    }

    public abstract Map<Date, Double> getLastDaysConsumption(int lastNDays) throws NotFoundException, IncorrectRangeException;

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    public Map<Date, Double> getFuelConsumptionPerDay() {
        return fuelConsumptionPerDay;
    }

    public void setFuelConsumptionPerDay(Map<Date, Double> fuelConsumptionPerDay) {
        this.fuelConsumptionPerDay = fuelConsumptionPerDay;
    }
}
