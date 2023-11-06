package com.example.demo.test;

public class FindExponential {

    public static double calculateExponential(double base, double exponent) {
        return Math.pow(base, exponent);
    }

    public static void main(String[] args) {
        double base = 2.0;
        double exponent = 3.0;
        double result = calculateExponential(base, exponent);

        System.out.println(base + " raised to the power of " + exponent + " is: " + result);
    }
}
