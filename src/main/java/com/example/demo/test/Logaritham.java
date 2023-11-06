package com.example.demo.test;

public class Logaritham {

    public static double calculateLogarithm(double base, double number) {
        return Math.log(number) / Math.log(base);
    }

    public static void main(String[] args) {
        double base = 2.0;
        double number = 8.0;
        double logarithm = calculateLogarithm(base, number);

        System.out.println("Log base " + base + " of " + number + " is: " + logarithm);
    }
}
