package com.solvd;

import java.util.Date;

public class Nurse extends Employee{

    private String nurseQualification;

    public Nurse(String firstName, String lastName, String gender, Date birthDate, String address, String phone, Hospital hospital, Date joined, String[] education, Department department, String nurseQualification) {
        super(firstName, lastName, gender, birthDate, address, phone, hospital, joined, education, department);
        this.nurseQualification = nurseQualification;
    }

    public Nurse() {
    }

    public String getNurseQualification() {
        return nurseQualification;
    }

    public void setNurseQualification(String nurseQualification) {
        this.nurseQualification = nurseQualification;
    }
}
