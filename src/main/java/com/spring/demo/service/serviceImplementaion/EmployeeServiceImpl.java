package com.spring.demo.service.serviceImplementaion;

import com.spring.demo.model.Employee;
import com.spring.demo.service.EmployeeService;
import com.spring.demo.springrepo.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }
    @Override
    public void saveEmployee (Employee employee){
        this.employeeRepository.save(employee);

    }
}
