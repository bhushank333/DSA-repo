package com.example.demo.test;

import java.util.*;

public class FindCommonElemet {

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
