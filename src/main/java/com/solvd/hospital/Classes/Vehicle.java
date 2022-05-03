package com.solvd.hospital.Classes;

import java.time.LocalDate;
import java.util.Map;
import java.util.TreeMap;

import com.solvd.hospital.Exceptions.IncorrectRangeException;
import com.solvd.hospital.Exceptions.NotFoundException;

public abstract class Vehicle {

    private int wheels;
    private int seats;
    private String licenseNumber;
    private TreeMap<LocalDate, Double> fuelConsumptionPerDay;

    public Vehicle(int wheels, int seats, String licenseNumber, TreeMap<LocalDate, Double> fuelConsumptionPerDay) {
        this.wheels = wheels;
        this.seats = seats;
        this.licenseNumber = licenseNumber;
        this.fuelConsumptionPerDay = fuelConsumptionPerDay;
    }

    public abstract Map<LocalDate, Double> getLastDaysConsumption(int lastNDays) throws NotFoundException, IncorrectRangeException;

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

    public TreeMap<LocalDate, Double> getFuelConsumptionPerDay() {
        return fuelConsumptionPerDay;
    }

    public void setFuelConsumptionPerDay(TreeMap<LocalDate, Double> fuelConsumptionPerDay) {
        this.fuelConsumptionPerDay = fuelConsumptionPerDay;
    }
}
