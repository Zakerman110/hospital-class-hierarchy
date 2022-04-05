package com.solvd.hospital;

import com.solvd.hospital.Classes.Transport;
import com.solvd.hospital.Exceptions.IncorrectRangeException;
import com.solvd.hospital.Exceptions.NotFoundException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashMap;

@SpringBootApplication
public class HospitalApplication {

    public static void main(String[] args) {

        Transport porsche = new Transport(4, 4, "CE1111BA", new HashMap<>(), "porsche", 2022);
        try {
            porsche.getLastDaysConsumption(2);
        } catch (IncorrectRangeException e) {
            System.out.println("incorrect error");
        } catch (NotFoundException e) {
            System.out.println("not found error");
        }

        //SpringApplication.run(HospitalApplication.class, args);
    }

}
