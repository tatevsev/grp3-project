package com.cydeo.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum ClientVendorType {

    VENDOR("Vendor"),CLIENT("Client");

    private final String Value;


}
