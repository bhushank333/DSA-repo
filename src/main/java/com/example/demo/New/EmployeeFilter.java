package com.example.demo.New;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeFilter {
    public static void main(String[] args) {

        List<String> employees = Arrays.asList("Alice", "Bob", "Charlie", "David", "Eva");

        char startingLetter = 'D';

        List<String> filteredEmployees = employees.stream()
                .filter(name -> name.charAt(0) == startingLetter)
                .collect(Collectors.toList());

        System.out.println("Employees whose names start with " + startingLetter + ": " + filteredEmployees);
    }
}

