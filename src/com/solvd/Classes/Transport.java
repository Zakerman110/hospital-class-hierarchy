package com.solvd.Classes;

import java.util.Date;
import java.util.Map;

public class Transport extends Vehicle {

    private String licenseNumber;
    private String model;
    private int year;

    public Transport(String licenseNumber, String model, int year) {
        this.licenseNumber = licenseNumber;
        this.model = model;
        this.year = year;
    }

    public Transport() {
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
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
    public Map<Date, Double> getLastDaysConsumption(int lastNDays) {
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
