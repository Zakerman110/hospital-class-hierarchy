package com.solvd.hospital.Classes;

import java.time.LocalDate;

public class Doctor extends Employee {

    private String specialty;

    public Doctor(String firstName, String lastName, String gender, LocalDate birthDate, String address, String phone,
                  Hospital hospital, LocalDate joined, String[] education, Department department, String specialty) {
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
