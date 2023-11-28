package com.example.demo.test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;



public class TestMain {
    int m1() {
        try {
            return 10;
        } catch (Exception e) {
            return 20;
        } finally {
            return 30;
        }
    }

    int m2() {
        try {
            return 10;
        } catch (Exception e) {
            return 20;
        } finally {
            return 30;
        }
      //  return 40;
    }

    public static Map getCharCount(String s){
        HashMap<String, Integer>  map = new  HashMap<>();
        for(int i =0 ; i< s.length() ; i++){
            if (map.containsKey(s)){
                map.put(s, map.get(s) +1);
            }else {
                map.put(s, map.get(s));
            }
        }
        return map;
    }

    public static void main(String[] args){
//        TestMain t = new TestMain();
//        int x = t.m2();
//        System.out.println(x);
//
//        List<String> languages = Arrays.asList("Java", "Python", "Asknka", "C++");
//        languages
//                .stream()
//                .filter(s -> s.charAt(s.length()-1) =='a')
//                .collect(Collectors.toList())
//                .forEach(s -> System.out.println(s));
////        languages.stream()
////                .filter(s -> s.charAt(s.length() - 1) == 'a') // Corrected the equality check
////                .collect(Collectors.toList())
////                .forEach(s -> System.out.println(s));
//
        Map<String, Integer> map = getCharCount("Shubham");

            System.out.println(map);
    }

}
