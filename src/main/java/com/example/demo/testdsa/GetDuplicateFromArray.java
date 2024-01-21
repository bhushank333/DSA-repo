package com.example.demo.testdsa;

import java.util.*;

public class GetDuplicateFromArray {

    public static HashSet<Integer> getDuplicate(int[] arr){
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0 ; i < arr.length ; i++){
            for (int j = i +1 ; j < arr.length ; j ++){
                if(arr[i] == arr[j]){
                    set.add(arr[i]);
                }
            }
        }
        return set;
    }

    public static HashSet<Integer> getNonRepeating(int[] arr) {
        HashSet<Integer> nonRepeatingSet = new HashSet<>();
        HashMap<Integer, Integer> elementCountMap = new HashMap<>();

        for (int num : arr) {
            elementCountMap.put(num, elementCountMap.getOrDefault(num, 0) + 1);
        }

        for (int num : arr) {
            if (elementCountMap.get(num) == 1) {
                nonRepeatingSet.add(num);
            }
        }

        return nonRepeatingSet;
    }

    public static void main(String[] args){
        int[] arr = {10,30,20,10,30,40,60};
        HashSet duplicate = getDuplicate(arr);
        duplicate.forEach(e-> System.out.println("get duplicate element ---->" + e));

        HashSet<Integer> nonRepeating = getNonRepeating(arr);
        nonRepeating.forEach(e-> System.out.println("get not duplicate element ---->" +  e));


    }
}
