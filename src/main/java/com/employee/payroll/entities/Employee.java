package com.employee.payroll.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.time.LocalDate;

@Entity // Allows subclass tables with shared primary key
@Data
public abstract class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String email;

    private String phone;

    private String employeeType; // "FULL_TIME" or "PART_TIME"

    private LocalDate joinDate;

    private double bonus;

    private String bankAccountNumber;

    private String ifscCode;

    // 👉 Abstract method to be implemented in subclasses
    public abstract double calculateSalary();
}

