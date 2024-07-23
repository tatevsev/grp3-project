package com.cydeo.dto;


import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {

    private Long id;
    private String userName;
    private String password;
    private String firstName;
    private String lastName;
    private long phone;

    private boolean enabled;

}
