package com.example.demo.testApis.serviceimp;

import com.example.demo.testApis.model.Employee;
import com.example.demo.testApis.service.EmployeeService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class EmployeeServiceImp implements EmployeeService {


    private List<Employee> employees = new ArrayList<>();
    private Long nextId = 1L;

    public Employee createEmployee(Employee employee) {
        employee.setId(nextId++);
        employees.add(employee);
        return employee;
    }

    public List<Employee> getAllEmployees() {
        return employees;
    }

    public Employee getEmployeeById(Long id) {
        return employees.stream()
                .filter(e -> e.getId().equals(id))
                .findFirst()
                .orElse(null);

    }

    public void updateEmployee(Long id, Employee updatedEmployee) {
        employees.stream()
                .filter(e -> e.getId().equals(id))
                .findFirst()
                .ifPresent(employee -> {
                    employee.setFirstName(updatedEmployee.getFirstName());
                    employee.setLastName(updatedEmployee.getLastName());
                    employee.setEmail(updatedEmployee.getEmail());
                });

       // return updatedEmployee;
    }

    public void deleteEmployee(Long id) {
        employees.removeIf(e -> e.getId().equals(id));
    }
}
