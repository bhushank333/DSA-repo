package com.example.demo.practice;

public class StarPattern {

    public static void main(String[] args) {
        int rows = 5; // You can change the number of rows as per your requirement

        // Outer loop for the number of rows
        for (int i = 1; i <= rows; i++) {
            // Inner loop for printing stars in each row
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            // Move to the next line after printing stars in a row
            System.out.println();
        }
    }
}
