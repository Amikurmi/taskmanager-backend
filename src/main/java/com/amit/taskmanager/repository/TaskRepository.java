package com.amit.taskmanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.amit.taskmanager.entity.Task;

public interface TaskRepository extends JpaRepository<Task, Long> {

    
}