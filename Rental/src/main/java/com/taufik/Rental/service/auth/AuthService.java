package com.taufik.Rental.service.auth;

import com.taufik.Rental.dto.SignupRequest;
import com.taufik.Rental.dto.UserDto;

public interface AuthService {
    UserDto createCustomer(SignupRequest signupRequest);

    boolean hasCustomerWithEmail(String email);
}
