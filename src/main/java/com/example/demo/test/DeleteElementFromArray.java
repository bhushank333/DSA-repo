package com.example.demo.test;

import java.util.Arrays;

public class DeleteElementFromArray {

    public static void DeleteElemetByValue(int[] arr , int valueTodelete){
        int indextToDelete= -1;

        for(int i=0 ; i<arr.length-1 ; i++ ){
            if(arr[i] == valueTodelete){
                indextToDelete = i;
            }
        }

        if (indextToDelete != -1){
            for(int i = indextToDelete ; i< arr.length-1 ; i++){
                arr[i] = arr[i+1];
            }
        }

        int[] newArray = Arrays.copyOf(arr, arr.length-1);

        for (int ar : newArray){
            System.out.println(ar);
        }

    }

    public static void DeleteElemetByIndex(int[] arr, int indextodlt){

        for(int i = indextodlt ; i < arr.length-1 ; i++){
            arr[i]= arr[i+1];
        }

        int[] newArray = Arrays.copyOf(arr,arr.length-1);

        for(int ar : newArray){
            System.out.println(ar);
        }
    }
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};

        int indextodlt = 2;

        int valueTodelete = 2;



        //DeleteElemetByIndex(arr, indextodlt);

        DeleteElemetByValue(arr, valueTodelete);
    }

}
