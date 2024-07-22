package com.cydeo.enums;

public enum Vendor {

    VENDOR("Vendor");

    private final String value;

    Vendor(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

}
