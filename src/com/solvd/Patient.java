package com.solvd;

import java.util.Date;

public class Patient extends Person{

    private Date accepted;
    private MedicalBook medicalBook;
    private Room room;

    public Patient(String firstName, String lastName, String gender, Date birthDate, String address, String phone, Hospital hospital, Date accepted, MedicalBook medicalBook, Room room) {
        super(firstName, lastName, gender, birthDate, address, phone, hospital);
        this.accepted = accepted;
        this.medicalBook = medicalBook;
        this.room = room;
    }

    public Patient() {
    }

    public Date getAccepted() {
        return accepted;
    }

    public void setAccepted(Date accepted) {
        this.accepted = accepted;
    }

    public MedicalBook getMedicalBook() {
        return medicalBook;
    }

    public void setMedicalBook(MedicalBook medicalBook) {
        this.medicalBook = medicalBook;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }
}
