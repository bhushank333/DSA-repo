package com.example.demo.com.assignment10;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Fibonacci {

    public static List<Integer> generateFibonacci(int count) {
        int[] fib = new int[count];
        fib[0] = 0;
        if (count > 1) fib[1] = 1;

        IntStream.range(2, count)
                .forEach(i -> fib[i] = fib[i - 1] + fib[i - 2]);

        return Arrays.stream(fib).boxed().collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<Integer> fibonacci = generateFibonacci(10);
        System.out.println("Fibonacci: " + fibonacci);  // [0, 1, 1, 2, 3, 5, 8, 13, 21, 34]
    }


//    public static void main(String args[]) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter no");
//        int a = sc.nextInt();
//        int n1 = 0, n2 = 1, n3, i, count = a;
//        System.out.print(n1 + " " + n2);//printing 0 and 1
//
//        for (i = 2; i < count; ++i)//loop starts from 2 because 0 and 1 are already printed
//        {
//            n3 = n1 + n2;
//            System.out.print(" " + n3);
//            n1 = n2;
//            n2 = n3;
//        }
//
//    }
}