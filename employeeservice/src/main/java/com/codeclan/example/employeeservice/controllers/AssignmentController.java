package com.codeclan.example.employeeservice.controllers;

import com.codeclan.example.employeeservice.models.Assignment;
import com.codeclan.example.employeeservice.models.Employee;
import com.codeclan.example.employeeservice.repositories.AssignmentRepository;
import com.codeclan.example.employeeservice.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class AssignmentController {

    @Autowired
    AssignmentRepository assignmentRepository;

    @GetMapping(value = "/assignments")
    public List<Assignment> getAllAssignments(){
        return assignmentRepository.findAll();
    }

    @GetMapping(value = "/assignments/{id}")
    public Optional<Assignment> getAssignment(@PathVariable Long id){
        return assignmentRepository.findById(id);
    }
}
