package com.amit.taskmanager.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.security.access.prepost.PreAuthorize;

@RestController
@RequestMapping("/manager")
public class ManagerController {

    @PreAuthorize("hasAnyRole('ADMIN','MANAGER')")
    @GetMapping("/tasks")
    public String managerTasks() {

        return "Manager Task Access";
    }
}