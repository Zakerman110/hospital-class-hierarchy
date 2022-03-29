package com.solvd.hospital.Interfaces;

import java.util.List;

public interface IPatient extends IPerson {

    boolean IsCured();

    List<String> getCurrentIllnesses();
}
