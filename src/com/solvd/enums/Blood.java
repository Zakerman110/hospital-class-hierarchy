package com.solvd.enums;

public enum Blood {

    O("first group"),
    A("second group"),
    B("third group"),
    AB("fourth group");

    private final String value;

    Blood(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
