package com.example.demo.com.assignment5;

import java.util.HashMap;
import java.util.Map;

public class CharCountExample {

    public static Map<Character, Integer> getCharCount(String s) {
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        return map;
    }

    public static void main(String[] args) {
        String inputString = "programming";
        Map<Character, Integer> charCountMap = getCharCount(inputString);

        // Print the character count map using forEach
        charCountMap.forEach((k, v) -> System.out.println(k + ": " + v));
    }
}
