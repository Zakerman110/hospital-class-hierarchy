package com.solvd.hospital.Interfaces;

public interface IPerson extends IInformation {

    String getFirstName();

    void setFirstName(String firstName);

    String getLastName();

    void setLastName(String lastName);

    String getDateOfBirth();

    String getFullName();

    String getAge();
}
