package com.solvd.interfaces;

public interface IEmployee extends IPerson {

    double getSalary();

    void setSalary(double salary);

    String getWorkingTime();

    void setWorkingTime();

    String getSpecialty();

    void setSpecialty();
}
