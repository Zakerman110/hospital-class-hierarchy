package com.solvd.interfaces;

public interface IPerson extends IInformation {

    String getFirstName();

    void setFirstName();

    String getLastName();

    void setLastName();

    String getDateOfBirth();

    String getFullName();

    String getAge();
}
