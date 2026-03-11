package com.amit.taskmanager.service;

import com.amit.taskmanager.repository.UserRepository;
import com.amit.taskmanager.repository.RoleRepository;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class AuthServiceTest {

    @InjectMocks
    private AuthService authService;

    @Mock
    private UserRepository userRepository;

    @Mock
    private RoleRepository roleRepository;

    @Test
    void testRegisterUser() {

        System.out.println("Register user test executed");

    }
}