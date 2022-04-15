package com.solvd.hospital.Classes;

import java.time.LocalDate;

public class Nurse extends Employee{

    private String nurseQualification;

    public Nurse(String firstName, String lastName, String gender, LocalDate birthDate, String address, String phone,
                 Hospital hospital, LocalDate joined, String[] education, Department department, String nurseQualification) {
        super(firstName, lastName, gender, birthDate, address, phone, hospital, joined, education, department);
        this.nurseQualification = nurseQualification;
    }

    public String getNurseQualification() {
        return nurseQualification;
    }

    public void setNurseQualification(String nurseQualification) {
        this.nurseQualification = nurseQualification;
    }
}
