package com.amit.taskmanager.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.security.access.prepost.PreAuthorize;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @PreAuthorize("hasAnyRole('ADMIN','MANAGER','EMPLOYEE')")
    @GetMapping("/tasks")
    public String employeeTasks() {

        return "Employee Task Access";
    }
}