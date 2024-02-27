package com.taufik.Rental.dto;


import com.taufik.Rental.enums.UserRole;
import lombok.Data;

@Data
public class UserDto {

    private Long id;
    private String name;
    private  String email;
    private UserRole userRole;
}
