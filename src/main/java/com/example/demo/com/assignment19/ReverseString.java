package com.example.demo.com.assignment19;

//2. Design the java method for String getReverseString(String reverse) and 
//take the input from user into main method and pass to that method. 
//Result will print into main method
//Output
//Enter string- pune
//Output enup

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ReverseString {

    public static void getRverseString(String s) {

        StringBuilder str = new StringBuilder();
//		String str = "";
        int small1 = Integer.MAX_VALUE;

        for (int i = s.length() - 1; i >= 0; i--) {
            str.append(s.charAt(i));
//			str += s.charAt(i);
        }
        System.out.println(str);

        List<String> List = Arrays.asList("Bhushan", "rahule", "Shubham");

        List.stream().filter(e -> e.charAt(e.length() - 1) == 'm').forEach(System.out::println);

    }

    public static void getRverse(String s) {

        StringBuffer sb = new StringBuffer(s);
        sb.reverse();
        String st = new String(sb);
        System.out.println(st);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String a = sc.nextLine();
//        getRverseString(a);
        getRverse(a);
        getRverseString(a);
    }

}
