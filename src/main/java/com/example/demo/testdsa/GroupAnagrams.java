package com.example.demo.testdsa;

import java.util.*;
import java.util.stream.Collectors;

public class GroupAnagrams {

    public static List<List<String>> groupAnagramsUsingStream(String[] strs) {
        return Arrays.stream(strs)
                .collect(Collectors.groupingBy(
                        word -> {
                            char[] chars = word.toCharArray();
                            Arrays.sort(chars);
                            return new String(chars);  // key: sorted word
                        }
                ))
                .values()
                .stream()
                .collect(Collectors.toList());
    }

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

            System.out.println("Sorted Word ------>" + sortedWord);

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

    public static void main(String[] args) {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        // Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
        List<List<String>> groupAnagrams = groupAnagramsUsingStream(strs);
        System.out.println(groupAnagrams);
    }
}

/// /////////////////////////////////////////////////////////////////////

//💡 Example Flow: Grouping Anagrams Step-by-Step
//
//Input Array:
//        ["eat", "tea", "tan", "ate", "nat", "bat"]
//
//        --------------------------------------------------
//
//Iteration 1: word = "eat"
//
//Step               | Value
//-------------------|-----------------
//toCharArray()      | ['e', 'a', 't']
//sort()             | ['a', 'e', 't']
//        new String(chars)  | "aet"
//Key Returned       | "aet"
//
//        ➜ Map after 1st word:
//        {"aet": ["eat"]}
//
//        --------------------------------------------------
//
//Iteration 2: word = "tea"
//
//Step               | Value
//-------------------|-----------------
//toCharArray()      | ['t', 'e', 'a']
//sort()             | ['a', 'e', 't']
//        new String(chars)  | "aet"
//Key Returned       | "aet"
//
//        ➜ Map after 2nd word:
//        {"aet": ["eat", "tea"]}
//
//        🚨 Explanation:
//        "eat" and "tea" both produced the same sorted string "aet".
//So groupingBy puts them in the same list under key "aet".
//
//        --------------------------------------------------
//
//Iteration 3: word = "tan"
//
//Step               | Value
//-------------------|-----------------
//toCharArray()      | ['t', 'a', 'n']
//sort()             | ['a', 'n', 't']
//        new String(chars)  | "ant"
//Key Returned       | "ant"
//
//        ➜ Map after 3rd word:
//        {"aet": ["eat", "tea"], "ant": ["tan"]}
//
//        --------------------------------------------------
//
//Iteration 4: word = "ate"
//
//Result: Key = "aet"
//Updated Map:
//        {"aet": ["eat", "tea", "ate"], "ant": ["tan"]}
//
//        --------------------------------------------------
//
//        🧠 How Grouping Happens Technically:
//
//Internally:
//Map<String, List<String>> map = new HashMap<>();
//
//For each word:
//        1. Compute key = sorted word
//2. If key not in map → create new list
//3. If key exists → add word to existing list
//
//--------------------------------------------------
//
//        ✅ Summary: Why Sorted Key Works for Anagrams
//
//Word   | Sorted Key | Group in Map
//-------|------------|----------------------------
//        "eat"  | "aet"      | ["eat", ...]
//        "tea"  | "aet"      | ["eat", "tea"]
//        "ate"  | "aet"      | ["eat", "tea", "ate"]
//
//All are mapped to "aet", so they are grouped together.


//public static List<List<String>> groupAnagramsUsingStream(String[] strs) {
//    return Arrays.stream(strs)
//            .collect(Collectors.groupingBy(
//                    word -> {
//                        char[] chars = word.toCharArray();
//                        Arrays.sort(chars);
//                        return new String(chars);  // key: sorted word
//                    }
//            ))
//            .values()
//            .stream()
//            .collect(Collectors.toList());
//}

//public static List<List<String>> groupAnagramsUsingStream(String[] strs) {
//    return new ArrayList<>(Arrays.stream(strs)
//            .collect(Collectors.groupingBy(
//                    word -> {
//                        char[] chars = word.toCharArray();
//                        Arrays.sort(chars);
//                        return new String(chars);  // key: sorted word
//                    }
//            ))
//            .values());
//}