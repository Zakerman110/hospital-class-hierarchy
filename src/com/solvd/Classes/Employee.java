package com.solvd.Classes;

import com.solvd.Interfaces.IEmployee;

import java.util.Date;

public class Employee extends Person implements IEmployee {

    private Date joined;
    private String[] education;
    private Department department;

    public Employee(String firstName, String lastName, String gender, Date birthDate, String address, String phone,
                    Hospital hospital, Date joined, String[] education, Department department) {
        super(firstName, lastName, gender, birthDate, address, phone, hospital);
        this.joined = joined;
        this.education = education;
        this.department = department;
    }

    public Date getJoined() {
        return joined;
    }

    public void setJoined(Date joined) {
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

    @Override
    public double getSalary() {
        return 0;
    }

    @Override
    public void setSalary(double salary) {

    }

    @Override
    public String getWorkingTime() {
        return null;
    }

    @Override
    public void setWorkingTime() {

    }

    @Override
    public String getSpecialty() {
        return null;
    }

    @Override
    public void setSpecialty() {

    }
}
