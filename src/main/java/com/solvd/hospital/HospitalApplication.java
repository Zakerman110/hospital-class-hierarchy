package com.solvd.hospital;

import com.solvd.hospital.Classes.Transport;
import com.solvd.hospital.Exceptions.IncorrectRangeException;
import com.solvd.hospital.Exceptions.NotFoundException;
import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
public class HospitalApplication {

    private static final Logger LOGGER = Logger.getLogger(HospitalApplication.class);

    public static void main(String[] args) {

        Map<Date, Double> fuel = new HashMap<Date, Double>();
        fuel.put(new Date(2022, 2, 12), 25d);
        fuel.put(new Date(2022, 2, 13), 35d);
        fuel.put(new Date(2022, 2, 14), 20d);
        fuel.put(new Date(2022, 2, 15), 17d);

        Transport porsche = new Transport(4, 4, "CE1111BA", fuel, "porsche", 2022);
        try {
            Map<Date, Double> consumptions = porsche.getLastDaysConsumption(2);
            for(Map.Entry<Date, Double> item : consumptions.entrySet()){

                LOGGER.info("Key: " + item.getKey() + " Value: " + item.getValue());
            }
        } catch (IncorrectRangeException e) {
            LOGGER.error("Too many days inserted");
        } catch (NotFoundException e) {
            LOGGER.error("No fuel consumption data");
        }

        //SpringApplication.run(HospitalApplication.class, args);
    }

}
