package com.example.demo.practice;

import com.example.demo.New.Employee;

public class ConstructorAndSetterClass {

    private Employee dependency;

    // Setter method for dependency injection
    public void setDependency(Employee dependency) {
        this.dependency = dependency;
    }

    // Usage
//    ConstructorAndSetterClass example = new ConstructorAndSetterClass();
//    Employee dependencyIn = new Employee();
//   example.setDependency(dependencyIn);

    // Constructor for dependency injection
    public ConstructorAndSetterClass(Employee dependency) {
        this.dependency = dependency;
    }

    // Usage
    Employee dependencyee = new Employee();
    ConstructorAndSetterClass example = new ConstructorAndSetterClass(dependency);

}
