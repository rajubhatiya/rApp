package com.rapp.springlearn.service;

import com.rapp.springlearn.model.Employee;

import java.util.List;

public interface EmployeeService {

    Employee save(Employee employee);

    Employee getEmployee(String empId);
    List<Employee> getAllEmployee();

    Employee getEmployeeById(String id);
    String deleteEmployeeById(String id);

    List<Employee> getAllEmployees();
}
