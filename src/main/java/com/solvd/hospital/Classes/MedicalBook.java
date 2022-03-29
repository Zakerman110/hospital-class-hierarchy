package com.solvd.hospital.Classes;

import com.solvd.hospital.Enums.Blood;

public class MedicalBook {

    private String[] sickness;
    private String[] prescriptions;
    private String[] allergies;
    private Blood blood;

    public MedicalBook(String[] sickness, String[] prescriptions, String[] allergies, Blood blood) {
        this.sickness = sickness;
        this.prescriptions = prescriptions;
        this.allergies = allergies;
        this.blood = blood;
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

    public Blood getBlood() {
        return blood;
    }

    public void setBlood(Blood blood) {
        this.blood = blood;
    }
}
