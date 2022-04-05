package com.solvd.hospital.Classes;

import com.solvd.hospital.Exceptions.IncorrectRangeException;
import com.solvd.hospital.Exceptions.NotFoundException;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.apache.log4j.Level;
import org.apache.log4j.Logger; // deal with differences between imports

import java.util.Date;
import java.util.Map;

public class Transport extends Vehicle {

    private String model;
    private int year;
    private static final Logger LOGGER = Logger.getLogger(Transport.class);

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
        if(getFuelConsumptionPerDay().isEmpty())
        {
            LOGGER.error("No fuel consumption data");
            throw new NotFoundException("No fuel consumption data");
        }
        int size = getFuelConsumptionPerDay().size();
        if(size < lastNDays)
        {
            LOGGER.error("Too many days inserted");
            throw new IncorrectRangeException("Too many days inserted", size);
        }
        return null;
    }
}
