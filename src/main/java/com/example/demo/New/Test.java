package com.example.demo.New;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test {

    public static void main(String[] arg){

        try {
            throw new InvalidInputException("invalid input");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        List<Employee> employees = Arrays.asList(
                new Employee("Alice", "HR"),
                new Employee("Bob", "IT"),
                new Employee("Charlie", "Finance"),
                new Employee("David", "IT"),
                new Employee("Eva", "Finance")
        );

        List<Employee> sortedEmployees = employees.stream()
                .sorted((e1, e2) -> e1.getDepartment().compareTo(e2.getDepartment()))
                .collect(Collectors.toList());

        // Display the sorted employees
        sortedEmployees.forEach(System.out::println);

    }

    
}
