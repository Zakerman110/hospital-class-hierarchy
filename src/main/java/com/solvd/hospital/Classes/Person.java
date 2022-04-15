package com.solvd.hospital.Classes;

import java.time.LocalDate;
import java.time.Period;

import org.apache.commons.lang3.StringUtils;

import com.solvd.hospital.Interfaces.IPerson;

public abstract class Person implements IPerson {

    private String firstName;
    private String lastName;
    private String gender;
    private final LocalDate birthDate;
    private String address;
    private String phone;
    private Hospital hospital;

    public Person(String firstName, String lastName, String gender, LocalDate birthDate, String address, String phone,
                  Hospital hospital) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.birthDate = birthDate;
        this.address = address;
        this.phone = phone;
        this.hospital = hospital;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Hospital getHospital() {
        return hospital;
    }

    public void setHospital(Hospital hospital) {
        this.hospital = hospital;
    }

    public String getDateOfBirth() {
        return null;
    }

    public String getFullName() {
        return StringUtils.joinWith(" ", firstName, lastName);
    }

    public int getAge() {
        return Period.between(birthDate, LocalDate.now()).getYears();
    }

}
