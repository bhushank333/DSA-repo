package com.example.demo.test;

public class ArrayAppend {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};

        int newElememnt = 6;

        int[] newArray = new int[arr.length + 1];

        System.arraycopy(arr,0,newArray,0,arr.length);

        newArray[newArray.length-1]= newElememnt;

        for(int ar : newArray){
            System.out.println(ar);
        }

    }
}
