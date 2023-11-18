package com.example.demo.test;

public class MinMaxValue {

    public static void main(String[] args) {
        int small1 = Integer.MAX_VALUE;
        int small2 = Integer.MIN_VALUE;

        System.out.println("small1 ====>" + small1);

        System.out.println("small2 ====>" + small2);

        int ansMin = Math.min(small1,small2);

        int ansMax = Math.max(small1,small2);

        System.out.println("Anwser ansMin ==>" +ansMin);

        System.out.println("Anwser ansMax ==>" +ansMax);


    }

}
