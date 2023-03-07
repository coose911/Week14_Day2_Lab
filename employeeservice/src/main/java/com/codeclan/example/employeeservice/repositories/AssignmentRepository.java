package com.codeclan.example.employeeservice.repositories;

import com.codeclan.example.employeeservice.models.Assignment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AssignmentRepository extends JpaRepository<Assignment, Long> {
}
