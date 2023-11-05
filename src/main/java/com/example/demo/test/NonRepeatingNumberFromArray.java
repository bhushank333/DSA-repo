package com.example.demo.test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class NonRepeatingNumberFromArray {

    public static int findNonRepeatingNumber(int[] arr) {
        Map<Integer, Integer> countMap = new HashMap<>();

////        // Count occurrences of each number in the array
        for (int num : arr) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        // Find the non-repeating number
        for (int num : arr) {
            if (countMap.get(num) == 1) {
                return num;
            }
        }

        // If there is no non-repeating number, return a default value (e.g., -1)
        return -1;

    }

    public static void main(String[] args) {
        int[] array = { 4, 3, 4, 2, 3, 5, 2 };
        int nonRepeatingNumber = findNonRepeatingNumber(array);

        if (nonRepeatingNumber != -1) {
            System.out.println("The non-repeating number is: " + nonRepeatingNumber);
        } else {
            System.out.println("No non-repeating number found in the array.");
        }
    }
}
