package com.solvd.classes;

import java.util.Date;

public final class Surgeon extends Doctor {

    public static int count;

    public Surgeon(String firstName, String lastName, String gender, Date birthDate, String address, String phone,
                  Hospital hospital, Date joined, String[] education, Department department, String specialty) {
        super(firstName, lastName, gender, birthDate, address, phone, hospital, joined, education, department, specialty);
        count++;
    }
}
