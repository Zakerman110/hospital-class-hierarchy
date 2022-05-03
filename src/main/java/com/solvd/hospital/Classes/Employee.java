package com.solvd.hospital.Classes;

import java.time.LocalDate;

import com.solvd.hospital.Interfaces.IEmployee;

public class Employee extends Person implements IEmployee {

    private LocalDate joined;
    private String[] education;
    private Department department;

    public Employee(String firstName, String lastName, String gender, LocalDate birthDate, String address, String phone,
                    Hospital hospital, LocalDate joined, String[] education, Department department) {
        super(firstName, lastName, gender, birthDate, address, phone, hospital);
        this.joined = joined;
        this.education = education;
        this.department = department;
    }

    public LocalDate getJoined() {
        return joined;
    }

    public void setJoined(LocalDate joined) {
        this.joined = joined;
    }

    public String[] getEducation() {
        return education;
    }

    public void setEducation(String[] education) {
        this.education = education;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

}
