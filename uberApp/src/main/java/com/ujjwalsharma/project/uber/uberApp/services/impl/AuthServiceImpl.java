package com.ujjwalsharma.project.uber.uberApp.services.impl;

import com.ujjwalsharma.project.uber.uberApp.dto.DriverDto;
import com.ujjwalsharma.project.uber.uberApp.dto.SignupDto;
import com.ujjwalsharma.project.uber.uberApp.dto.UserDto;
import com.ujjwalsharma.project.uber.uberApp.services.AuthService;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceImpl implements AuthService {
    @Override
    public String login(String email, String password) {
        return "";
    }

    @Override
    public UserDto signup(SignupDto signupDto) {
        return null;
    }

    @Override
    public DriverDto onboardNewDRiver(Long UserId) {
        return null;
    }
}
