package com.example.demo.testdsa;

import java.util.*;

public class GroupAnagrams {

    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (String word : strs) {
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String sortedWord = new String(chars);

            if (!map.containsKey(sortedWord)) {
                map.put(sortedWord, new ArrayList<>());
            }

            map.get(sortedWord).add(word);
        }
        System.out.println(map);
        return new ArrayList<>(map.values());
    }

    public static List<List<String>> getGroupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (String word : strs) {
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String sortedWord = new String(chars);

            System.out.println("Sorted Word ------>"  + sortedWord);

            // Check if the key exists in the map
            if (map.containsKey(sortedWord)) {
                // If yes, get the list and add the word to it
                map.get(sortedWord).add(word);
            } else {
                // If no, create a new list with the word and put it in the map
                List<String> newList = new ArrayList<>();
                newList.add(word);
                map.put(sortedWord, newList);
            }
        }

        // Convert the values of the map to a list of lists
        return new ArrayList<>(map.values());
    }

    public static void main(String[] args){
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
       // Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
        List<List<String>> groupAnagrams = getGroupAnagrams(strs);
        System.out.println(groupAnagrams);
    }
}
