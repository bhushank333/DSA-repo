package com.example.demo.testApis.service;

import com.example.demo.testApis.model.Employee;

import java.util.List;

public interface EmployeeService {

    public Employee createEmployee(Employee employee);

    public List<Employee> getAllEmployees();

    public Employee getEmployeeById(Long id);

    public void updateEmployee(Long id, Employee updatedEmployee);

    public void deleteEmployee(Long id);
}
