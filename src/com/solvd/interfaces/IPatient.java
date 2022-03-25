package com.solvd.interfaces;

import java.util.List;

public interface IPatient extends IPerson {

    boolean IsCured();

    List<String> getCurrentIllnesses();
}
