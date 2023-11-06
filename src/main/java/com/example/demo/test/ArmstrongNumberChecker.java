package com.example.demo.test;

import java.util.Scanner;

public class ArmstrongNumberChecker {


        public static boolean isArmstrongNumber(int number) {
            int originalNumber = number;
            int sum = 0;
            int digits = String.valueOf(number).length();

            while (number != 0) {
                int digit = number % 10;
                sum += Math.pow(digit, digits);
                number /= 10;
            }

            return sum == originalNumber;
        }

        public static void main(String[] args) {
            int number = 153;
            boolean isArmstrong = isArmstrongNumber(number);
            System.out.println(number + " is Armstrong number: " + isArmstrong);
        }
    }


//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter a number to check if it's an Armstrong number: ");
//        int number = scanner.nextInt();
//        int temp = number;
//        int numberOfDigits = String.valueOf(number).length();
//        int sum = 0;
//
//        while (temp != 0) {
//            int digit = temp % 10;
//            sum += Math.pow(digit, numberOfDigits);
//            temp /= 10;
//        }
//
//        if (sum == number) {
//            System.out.println(number + " is an Armstrong number.");
//        } else {
//            System.out.println(number + " is not an Armstrong number.");
//        }
//       // scanner.close();
//    }

