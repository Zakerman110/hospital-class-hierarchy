package com.solvd.hospital.Classes;

import java.time.LocalDate;

public final class Surgeon extends Doctor {

    private static int count;

    public Surgeon(String firstName, String lastName, String gender, LocalDate birthDate, String address, String phone,
                   Hospital hospital, LocalDate joined, String[] education, Department department, String specialty) {
        super(firstName, lastName, gender, birthDate, address, phone, hospital, joined, education, department, specialty);
        count++;
    }

    public static int getCount() {
        return count;
    }
}
