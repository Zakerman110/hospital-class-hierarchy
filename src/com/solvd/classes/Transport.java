package com.solvd.classes;

public class Transport {

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
}
