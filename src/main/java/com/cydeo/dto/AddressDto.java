package com.cydeo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class AddressDto {
   private String addressLine1;
   private String addressLine2;
   private String city;
   private String state;
   private String country;
   private String zipCode;
}
