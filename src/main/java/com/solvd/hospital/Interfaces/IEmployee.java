package com.solvd.hospital.Interfaces;

public interface IEmployee extends IPerson {

    double getSalary();

    void setSalary(double salary);

    String getWorkingTime();

    void setWorkingTime();

    String getSpecialty();

    void setSpecialty();
}
