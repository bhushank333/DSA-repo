package com.example.demo.testdsa;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MoveZeros {

    // int[] arr = {1,2,3,0,4,0,5};


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
