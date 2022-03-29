package com.solvd.hospital.Classes;

import com.solvd.hospital.Exceptions.IncorrectRangeException;
import com.solvd.hospital.Exceptions.NotFoundException;

import java.util.Date;
import java.util.Map;

public class Transport extends Vehicle {

    private String model;
    private int year;

    public Transport(int wheels, int seats, String licenseNumber, Map<Date, Double> fuelConsumptionPerDay, String model, int year) {
        super(wheels, seats, licenseNumber, fuelConsumptionPerDay);
        this.model = model;
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public Map<Date, Double> getLastDaysConsumption(int lastNDays) throws NotFoundException, IncorrectRangeException {
        if(getFuelConsumptionPerDay().isEmpty()) throw new NotFoundException("No fuel consumption data");
        if(getFuelConsumptionPerDay().size() < lastNDays) throw new IncorrectRangeException("Too many days inserted");
        return null;
    }

    @Override
    public String shortInformation() {
        return null;
    }

    @Override
    public String detailInformation() {
        return null;
    }
}
