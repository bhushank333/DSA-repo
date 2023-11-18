package com.example.demo.test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class computeUnionArrays {

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {4, 5, 6};

        int[] merged = computeUnion(arr1, arr2);
        System.out.println(Arrays.toString(merged));
    }

    static int[] computeUnion(int[] arr1, int[] arr2) {
        Set<Integer> unionSet = new HashSet<>();

        for (int num : arr1) {
            unionSet.add(num);
        }

        for (int num : arr2) {
            unionSet.add(num);
        }

        int[] unionArray = new int[unionSet.size()];
        int index = 0;

        for (int num : unionSet) {
            unionArray[index++] = num;
        }

        return unionArray;
    }
}
