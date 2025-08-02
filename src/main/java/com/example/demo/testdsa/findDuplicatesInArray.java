package com.example.demo.testdsa;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class findDuplicatesInArray {

    public static List<Integer> getDuplicates(int[] nums) {
        // Convert int[] to Stream<Integer>, group by number and count occurrences
        return Arrays.stream(nums)
                .boxed()
//                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting())) // It returns a Function that simply returns its input as output, i.e., it performs no transformation.
                .collect(Collectors.groupingBy(x -> x, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() > 1)  // Keep only duplicates
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
    }

    public static List<Integer> getDuplicatesUsingSet(int[] nums) {
        Set<Integer> seen = new HashSet<>();
        return Arrays.stream(nums)
                .filter(n -> !seen.add(n))  // add() returns false if already seen
                .distinct()                 // ensure each duplicate only once
                .boxed()
                .collect(Collectors.toList());
    }


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
//       List<Integer> duplicate = getDuplicate(nums);
//        duplicate.forEach(System.out::println);
        getDuplicates(nums).forEach(System.out::println);
    }

}
