package com.example.demo.testdsa;

import java.util.stream.IntStream;

public class PrimeNumberChecker {

    public static boolean isPrimeCheck(int number) {
        if (number <= 1) return false;

        return IntStream.rangeClosed(2, (int) Math.sqrt(number))
                .noneMatch(i -> number % i == 0);
    }

    public static boolean isPrimeTest(int number) {
        if (number <= 1) return false;  // 0 and 1 are not prime
        if (number == 2) return true;   // 2 is prime
        if (number % 2 == 0) return false; // Even numbers > 2 are not prime

        // Check only odd numbers up to sqrt(number)
        for (int i = 3; i <= Math.sqrt(number); i += 2) {
            if (number % i == 0) return false;
        }
        return true;
    }

    // Separated function to check if a number is prime
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int number = 17;

        if (isPrime(number) && isPrimeCheck(number) && isPrimeTest(number)) {
            System.out.println("The number is prime.");
        } else {
            System.out.println("The number is not prime.");
        }
    }
}

//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter a number to check if it's a prime number: ");
//        int number = scanner.nextInt();
//
//        if (isPrime(number)) {
//            System.out.println(number + " is a prime number.");
//        } else {
//            System.out.println(number + " is not a prime number.");
//        }
//        scanner.close();
//    }
//
//    static boolean isPrime(int number) {
//        if (number <= 1) {
//            return false;
//        }
//        for (int i = 2; i <= Math.sqrt(number); i++) {
//            if (number % i == 0) {
//                return false;
//            }
//        }
//        return true;
//    }


//public static boolean isPrime(int number) {
//    if (number <= 1) return false;  // 0 and 1 are not prime
//    if (number == 2) return true;   // 2 is prime
//    if (number % 2 == 0) return false; // Even numbers > 2 are not prime
//
//    // Check only odd numbers up to sqrt(number)
//    for (int i = 3; i <= Math.sqrt(number); i += 2) {
//        if (number % i == 0) return false;
//    }
//    return true;
//}

//public static boolean isPrimeCheck(int number) {
//    if (number <= 1) return false;
//
//    return IntStream.rangeClosed(2, (int)Math.sqrt(number))
//            .noneMatch(i -> number % i == 0);
//}