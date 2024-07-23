package com.cydeo.dto;


import lombok.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class AddressDto {

   private Long id;
   private String addressLine1;
   private String addressLine2;
   private String city;
   private String state;
   private String country;
   private String zipCode;
}
