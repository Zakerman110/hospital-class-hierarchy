package com.solvd.classes;

import com.solvd.interfaces.IInformation;

import java.util.Date;
import java.util.Map;

public abstract class Vehicle implements IInformation {

    private int wheels;
    private int seats;
    private String licenseNumber;
    private Map<Date, Double> fuelConsumptionPerDay;

    public abstract Map<Date, Double> getLastDaysConsumption(int lastNDays);
}
