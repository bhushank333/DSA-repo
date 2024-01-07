package com.example.demo.testdsa;

public class InsertElementInArray {

    public static void main(String[] args){

        int[] arr = {1,2,3,4,5};

        int index = 2;

        int element = 10;

        for(int i = arr.length-1 ; i> index; i--){
            arr[i]= arr[i-1];
        }
        arr[2]=element;

        for (int ar : arr){
            System.out.println(ar);
        }

    }


}
