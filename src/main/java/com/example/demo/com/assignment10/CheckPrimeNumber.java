package com.example.demo.com.assignment10;

//1. Write Java program to check whether number is prime or not. 
//( Prime means  a number which is divisible by only two numbers: 1 and itself. 
//So, if any number is divisible by any other number, it is not a prime number.)

public class CheckPrimeNumber {

	public static void getPrimeNumber(int n) {

		int temp = 0;

		for (int i = 2; i <= n - 1; i++) {

			if (n % i == 0) {
				temp += 1;
			}

		}
		if (temp > 0) {
			System.out.println("Number is not prime");
		}
		else {
			System.out.println("Number is Prime");
		}

	}

	public static void main(String[] args) {
		
		getPrimeNumber(8);

	}

}
