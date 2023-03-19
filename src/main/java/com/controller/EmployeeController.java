package com.controller;

import com.dao.EmployeeRepository;
import com.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;

    @PostMapping(("/saveEmployee"))
    public void saveEmployee(@RequestBody Employee employee) {
        employeeRepository.save(employee);
    }
}
