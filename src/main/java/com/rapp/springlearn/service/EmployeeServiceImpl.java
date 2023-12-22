package com.rapp.springlearn.service;

import com.rapp.springlearn.model.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
@Service
public class EmployeeServiceImpl implements EmployeeService {
    private List<Employee> employeeList = new ArrayList<>();

    /**
     *
     * @param employee
     * @return
     */
    @Override
    public Employee save(Employee employee) {

        if(employee.getEmployeeId() ==null || employee.getEmployeeId().isEmpty()){
            employee.setEmployeeId(UUID.randomUUID().toString());
        }
        employeeList.add(employee);
        return employee;
    }

    /**
     *
     * @param empId
     * @return
     */
    @Override
    public Employee getEmployee(String empId) {
        return employeeList.stream()
                .filter(emploee-> emploee.getEmployeeId().equalsIgnoreCase(empId))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Employee not found"));
    }

    /**
     *
     * @return
     */
    @Override
    public List<Employee> getAllEmployee() {
        return null;
    }

    /**
     *
     * @param id
     * @return
     */
    @Override
    public Employee getEmployeeById(String id) {
        return null;
    }

    /**
     *
     * @param id
     * @return
     */
    @Override
    public String deleteEmployeeById(String id) {
        return null;
    }

    @Override
    public List<Employee> getAllEmployees() {
        return null;
    }


}
