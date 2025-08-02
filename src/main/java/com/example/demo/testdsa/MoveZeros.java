package com.example.demo.testdsa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MoveZeros {

    // int[] arr = {1,2,3,0,4,0,5};

    public static int[] moveZerosToEnd(int[] arr) {
        // Step 1: Filter non-zero elements
        List<Integer> nonZeroList = Arrays.stream(arr)
                .filter(num -> num != 0)
                .boxed()
                .collect(Collectors.toList());

        // Step 2: Count number of zeros
        long zeroCount = Arrays.stream(arr)
                .filter(num -> num == 0)
                .count();

        // Step 3: Append zeros to nonZeroList
        for (int i = 0; i < zeroCount; i++) {
            nonZeroList.add(0);
        }

        // Step 4: Convert List<Integer> back to int[]
        return nonZeroList.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }

    public static int[] moveZerosToStart(int[] arr) {
        // Step 1: Filter non-zero elements
        List<Integer> nonZeroList = Arrays.stream(arr)
                .filter(num -> num != 0)
                .boxed()
                .toList();

        // Step 2: Count number of zeros
        long zeroCount = Arrays.stream(arr)
                .filter(num -> num == 0)
                .count();

        // Step 3: Create a new List with zeros first
        List<Integer> resultList = new ArrayList<>();

        // Add zeros first
        for (int i = 0; i < zeroCount; i++) {
            resultList.add(0);
        }

        // Add non-zero elements next
        resultList.addAll(nonZeroList);

        // Step 4: Convert List<Integer> to int[]
        return resultList.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }

    public static int[] getSort(int[] arr){
        int j = 0;
        for (int i = 0 ; i<arr.length ; i++){
            if(arr[i] != 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
        return arr;
    }

    public static void main(String[] args){
        int[] arr = {1,2,3,0,4,0,5};
        int[] sort = getSort(arr);
        String string = Arrays.toString(sort);
        System.out.println(string);
        String s = "bhushan";
        Map<Character, Long> collect = s.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        collect.forEach((k,v) -> System.out.println(k +":" +v));
    }
}
