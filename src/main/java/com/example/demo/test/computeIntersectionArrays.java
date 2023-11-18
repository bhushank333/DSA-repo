package com.example.demo.test;
import java.util.*;


public class computeIntersectionArrays {

    public static int[] computeIntersectionUsingHashSet(int[] arr1, int[] arr2) {
        Set<Integer> set = new HashSet<>();
        List<Integer> intersectionList = new ArrayList<>();

        for (int num : arr1) {
            set.add(num);
        }

        for (int num : arr2) {
            if (set.contains(num)) {
                intersectionList.add(num);
                set.remove(num); // If duplicates need to be considered, remove this line
            }
        }

        int[] intersectionArray = new int[intersectionList.size()];
        for (int i = 0; i < intersectionList.size(); i++) {
            intersectionArray[i] = intersectionList.get(i);
        }

        return intersectionArray;
    }

    public static int[] computeIntersectionUsingSorting(int[] arr1, int[] arr2) {
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        List<Integer> intersectionList = new ArrayList<>();
        int i = 0, j = 0;

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] == arr2[j]) {
                intersectionList.add(arr1[i]);
                i++;
                j++;
            } else if (arr1[i] < arr2[j]) {
                i++;
            } else {
                j++;
            }
        }

        int[] intersectionArray = new int[intersectionList.size()];
        for (int k = 0; k < intersectionList.size(); k++) {
            intersectionArray[k] = intersectionList.get(k);
        }

        return intersectionArray;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {3, 4, 5, 6, 7};

        int[] intersection1 = computeIntersectionUsingHashSet(arr1, arr2);
        System.out.println("Intersection using hash set: " + Arrays.toString(intersection1));

        int[] intersection2 = computeIntersectionUsingSorting(arr1, arr2);
        System.out.println("Intersection using sorting: " + Arrays.toString(intersection2));
    }
}
