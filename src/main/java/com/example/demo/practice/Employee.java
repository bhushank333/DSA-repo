package com.example.demo.practice;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class Employee {
    private String fName;
    private String lName;
    private String department;
    private int salary;
}
