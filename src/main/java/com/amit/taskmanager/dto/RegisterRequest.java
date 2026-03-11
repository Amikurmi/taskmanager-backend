package com.amit.taskmanager.dto;

import jakarta.validation.constraints.*;

public class RegisterRequest {


    @NotBlank(message = "Name is Required")
    private String name;

    @Email(message = "Invalid Email Format")
    @NotBlank(message = "Email Required")
    private String email;

    @Size(min = 6, message = "Password must be atleast 6 character")
    private String password;

    @NotBlank(message = "Role is Required")
    private String role;

    public RegisterRequest() {
    }

    public String getName(){
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getRole() {
        return role;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setRole(String role) {
        this.role = role;
    }   
}