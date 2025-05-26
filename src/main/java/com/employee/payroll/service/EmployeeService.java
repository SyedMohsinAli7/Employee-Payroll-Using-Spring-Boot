package com.employee.payroll.service;


import com.employee.payroll.entities.Employee;
import com.employee.payroll.repositories.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

   private final EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }


    public int getAllEmployees() {
       List<Employee> list =  employeeRepository.findAll();
        return list.size();
    }
}
