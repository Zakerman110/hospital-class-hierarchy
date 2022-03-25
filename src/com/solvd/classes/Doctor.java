package com.solvd.classes;

import java.util.Date;

public class Doctor extends Employee{

    private String specialty;

    public Doctor(String firstName, String lastName, String gender, Date birthDate, String address, String phone,
                  Hospital hospital, Date joined, String[] education, Department department, String specialty) {
        super(firstName, lastName, gender, birthDate, address, phone, hospital, joined, education, department);
        this.specialty = specialty;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }
}
