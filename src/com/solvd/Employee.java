package com.solvd;

import java.util.Date;

public class Employee extends Person {

    private Date joined;
    private String[] education;
    private Department department;

    public Employee(String firstName, String lastName, String gender, Date birthDate, String address, String phone, Hospital hospital, Date joined, String[] education, Department department) {
        super(firstName, lastName, gender, birthDate, address, phone, hospital);
        this.joined = joined;
        this.education = education;
        this.department = department;
    }

    public Employee() {
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
}
