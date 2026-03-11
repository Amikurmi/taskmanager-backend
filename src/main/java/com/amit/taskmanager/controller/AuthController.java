package com.amit.taskmanager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.amit.taskmanager.dto.LoginRequest;
import com.amit.taskmanager.dto.RegisterRequest;
import com.amit.taskmanager.service.AuthService;

import jakarta.validation.Valid;

import com.amit.taskmanager.entity.User;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private AuthService authService;

    @PostMapping("/register")
    public User register(@Valid @RequestBody RegisterRequest request) {

        return authService.register(request);
    }

    @PostMapping("/login")
    public String login(@RequestBody LoginRequest request){

        return authService.login(request.getEmail(), request.getPassword());
    }
}