package com.example.demo.test;

import java.util.*;

public class findDuplicatesInArray {

    public static List<Integer> getDuplicate(int[] nums){
        Map<Integer,Integer> frequencyMap = new HashMap<>();
        List<Integer> duplicate = new ArrayList<>();

        for(int num : nums){
            if (frequencyMap.containsKey(num)){
                duplicate.add(num);
            }
            else {
                frequencyMap.put(num,1);
            }
        }

        return duplicate;
    }

    public static void main(String[] args){
        int[] nums = {1, 2, 3, 4, 5, 2, 4, 6, 7, 8, 5};
       List<Integer> duplicate = getDuplicate(nums);
        duplicate.forEach(e -> System.out.println(e));
    }

}
