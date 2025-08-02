package com.example.demo.testdsa;

import java.util.Arrays;
import java.util.*;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class NonRepeatingNumberFromArray {

    public static int findNonRepeatingNumberUsingStream(int[] arr) {
        // Step 1: Count frequencies using groupingBy
        Map<Integer, Long> frequencyMap = Arrays.stream(arr)
                .boxed()
                .collect(Collectors.groupingBy(
                        x -> x,  // key = number itself
                        LinkedHashMap::new,   // preserve insertion order
                        Collectors.counting() // count occurrences
                ));

        // Step 2: Find the first entry with frequency 1
        return frequencyMap.entrySet()
                .stream()
                .filter(entry -> entry.getValue() == 1)
                .map(Map.Entry::getKey)
                .findFirst()
                .orElse(-1);  // default if no non-repeating number
    }

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
//        int nonRepeatingNumber = findNonRepeatingNumber(array);
        int nonRepeatingNumber = findNonRepeatingNumberUsingStream(array);

        if (nonRepeatingNumber != -1) {
            System.out.println("The non-repeating number is: " + nonRepeatingNumber);
        } else {
            System.out.println("No non-repeating number found in the array.");
        }
    }
}
