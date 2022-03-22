package com.solvd;

import java.util.Date;

public class Patient extends Person{

    private Date accepted;
    private String[] sickness;
    private String[] prescriptions;
    private String[] allergies; // to delete/change
    private Room room;
    private Blood blood;

    public Patient(String firstName, String lastName, String gender, Date birthDate, String address, String phone, Hospital hospital, Date accepted, String[] sickness, String[] prescriptions, String[] allergies, Room room, Blood blood) {
        super(firstName, lastName, gender, birthDate, address, phone, hospital);
        this.accepted = accepted;
        this.sickness = sickness;
        this.prescriptions = prescriptions;
        this.allergies = allergies;
        this.room = room;
        this.blood = blood;
    }

    public Patient() {
    }

    public Date getAccepted() {
        return accepted;
    }

    public void setAccepted(Date accepted) {
        this.accepted = accepted;
    }

    public String[] getSickness() {
        return sickness;
    }

    public void setSickness(String[] sickness) {
        this.sickness = sickness;
    }

    public String[] getPrescriptions() {
        return prescriptions;
    }

    public void setPrescriptions(String[] prescriptions) {
        this.prescriptions = prescriptions;
    }

    public String[] getAllergies() {
        return allergies;
    }

    public void setAllergies(String[] allergies) {
        this.allergies = allergies;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public Blood getBlood() {
        return blood;
    }

    public void setBlood(Blood blood) {
        this.blood = blood;
    }
}
