package com.example.demo.testdsa;

import java.util.Arrays;
import java.util.stream.IntStream;

public class reverseArray {

    public static int[] getReversedArray(int[] arr) {
        return IntStream.rangeClosed(1, arr.length)
                .map(i -> arr[arr.length - i])  // Reverse index mapping
                .toArray();
    }

    public static void getReverseArray(int[] arr){
        int start = 0;
        int end = arr.length-1;

        while (start < end){
            int temp = arr[start];
            arr[start]= arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

       for(int ar : arr) {
           System.out.println(ar);
       }
    }

    public static void main(String[] args){
        int[] arr = {1, 2, 3, 4, 5};
//        getReverseArray(arr);
        int[] reversed = getReversedArray(arr);

        Arrays.stream(reversed).forEach(System.out::println);

    }
}
