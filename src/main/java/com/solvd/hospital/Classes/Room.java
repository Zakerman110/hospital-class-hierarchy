package com.solvd.hospital.Classes;

public class Room {

    private int roomNumber;
    private Hospital hospital;

    public Room(int roomNumber, Hospital hospital) {
        this.roomNumber = roomNumber;
        this.hospital = hospital;
    }

    public Room() {
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public Hospital getHospital() {
        return hospital;
    }

    public void setHospital(Hospital hospital) {
        this.hospital = hospital;
    }
}
