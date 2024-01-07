package com.example.demo.testdsa;

import java.util.Scanner;

public class FactorsOfNumber {

     static void fact(int no){
        for(int i=1;i<no;i++){
            if(no%i==0){
                System.out.println("factor"+i);
            }
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int no = sc.nextInt();
      fact(no);
    }

}
