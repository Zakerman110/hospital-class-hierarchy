package com.solvd.hospital;

import com.solvd.hospital.Classes.Transport;
import com.solvd.hospital.Exceptions.IncorrectRangeException;
import com.solvd.hospital.Exceptions.NotFoundException;
import com.solvd.hospital.Interfaces.MyPredicate;
import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;
import java.util.*;

import static org.apache.commons.lang3.RandomUtils.nextDouble;

@SpringBootApplication
public class HospitalApplication {

    private static final Logger LOGGER = Logger.getLogger(HospitalApplication.class);

    public static void main(String[] args) {

        TreeMap<LocalDate, Double> fuel = new TreeMap<>();
        fuel.put(LocalDate.of(2022, 2, 12), nextDouble(30, 70));
        fuel.put(LocalDate.of(2022, 2, 13), nextDouble(30, 70));
        fuel.put(LocalDate.of(2022, 2, 14), nextDouble(30, 70));
        fuel.put(LocalDate.of(2022, 2, 15), nextDouble(30, 70));
        fuel.put(LocalDate.of(2022, 2, 16), nextDouble(30, 70));
        fuel.put(LocalDate.of(2022, 2, 17), nextDouble(30, 70));

        Transport porsche = new Transport(4, 4, "CE1111BA", fuel, "porsche", 2022);
        try {
            Map<LocalDate, Double> consumptions = porsche.getLastDaysConsumption(2);
            for(Map.Entry<LocalDate, Double> item : consumptions.entrySet()){

                LOGGER.info("Last days: Date: " + item.getKey() + " Value: " + item.getValue());
            }
        } catch (IncorrectRangeException e) {
            LOGGER.error("Too many days inserted");
        } catch (NotFoundException e) {
            LOGGER.error("No fuel consumption data");
        }

        // Фунціональний інтерфейс
        MyPredicate predicate = x -> x > 50;
        Map<LocalDate, Double> consumptions = porsche.getConsumption(predicate);
        for(Map.Entry<LocalDate, Double> item : consumptions.entrySet()){

            LOGGER.info("Consumption: Date: " + item.getKey() + " Value: " + item.getValue());
        }

        //SpringApplication.run(HospitalApplication.class, args);
    }

}
