package com.solvd.hospital.Classes;

import java.time.LocalDate;
import java.util.List;

import com.solvd.hospital.Interfaces.IPatient;

public class Patient extends Person implements IPatient {

    private LocalDate accepted;
    private MedicalBook medicalBook;
    private Room room;

    public Patient(String firstName, String lastName, String gender, LocalDate birthDate, String address, String phone,
                   Hospital hospital, LocalDate accepted, MedicalBook medicalBook, Room room) {
        super(firstName, lastName, gender, birthDate, address, phone, hospital);
        this.accepted = accepted;
        this.medicalBook = medicalBook;
        this.room = room;
    }

    public LocalDate getAccepted() {
        return accepted;
    }

    public void setAccepted(LocalDate accepted) {
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

    @Override
    public boolean IsCured() {
        return false;
    }

    @Override
    public List<String> getCurrentIllnesses() {
        return null;
    }
}
