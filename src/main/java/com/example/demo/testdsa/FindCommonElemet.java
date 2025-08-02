package com.example.demo.testdsa;

import java.util.*;
import java.util.stream.Collectors;

public class FindCommonElemet {

    public static String[] getCommonElements(String[] arr1, String[] arr2) {
        // Step 1: Convert arr1 to Set<String> for efficient lookup
        Set<String> set1 = Arrays.stream(arr1)
                .collect(Collectors.toSet());

        // Step 2: Filter arr2 to retain only elements present in set1
        return Arrays.stream(arr2)
                .filter(set1::contains)
                .distinct() // Remove duplicates from arr2
                .toArray(String[]::new); // Convert to String[]
    }

    public static int[] getCommonElements(int[] arr1, int[] arr2) {
        // Step 1: Convert arr1 to Set for efficient lookup
        Set<Integer> set1 = Arrays.stream(arr1)
                .boxed()
                .collect(Collectors.toSet());

        // Step 2: Filter arr2 to retain only elements present in set1
        return Arrays.stream(arr2)
                .filter(set1::contains)         // keep if in set1
                .distinct()                     // remove duplicates
                .toArray();                     // convert to int[]
    }

    private static void GetCommonElemet(int[] ar1, int[] ar2)
    {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < ar1.length; i++) {
            for (int j = 0; j < ar2.length; j++) {
                if (ar1[i] == ar2[j]) {

                    // add common elements
                    set.add(ar1[i]);
                    break;
                }
            }
        }
        for (Integer i : set) {
            System.out.print(i + " ");
        }
    }

    // main method
    public static void main(String[] args)
    {

        // create Array 1
        String[] arr1
                = { "Article", "in", "Geeks", "for", "Geeks" };

        // create Array 2
        String[] arr2 = { "Geeks", "for", "Geeks" };

        // print Array 1
        System.out.println("Array 1: "
                + Arrays.toString(arr1));

        // print Array 2
        System.out.println("Array 2: "
                + Arrays.toString(arr2));

        System.out.print("Common Elements: ");

        int[] ar1 = {1,5,6,8,4};
        int[] ar2 = {5,6,3};


        // Find the common elements
        GetCommonElemet(ar1, ar2);
    }
}
