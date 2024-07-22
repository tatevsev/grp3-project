package com.cydeo.enums;

public enum Client {

    CLIENT("Client");

    private final String Value;

    Client(String value) {
        Value = value;
    }

    public String getValue() {
        return Value;
    }
}
