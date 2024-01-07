package com.example.demo.practice;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamApiMethods {

    //stream api all collect methods with example

    // 1) Collectors.toList()
    List<String> list = Stream.of("apple", "banana", "orange")
            .collect(Collectors.toList());

    //2) Collectors.toSet()
    Set<String> set = Stream.of("apple", "banana", "orange")
            .collect(Collectors.toSet());

    //3)Collectors.toMap()
    Map<Integer, String> map = Stream.of("apple", "banana", "orange")
            .collect(Collectors.toMap(String::length, Function.identity()));

    //4) Collectors.joining()
    String result = Stream.of("apple", "banana", "orange")
            .collect(Collectors.joining(", "));

    //5) Collectors.groupingBy(String::length)
    Map<Integer, List<String>> groupedByLength = Stream.of("apple", "banana", "orange")
            .collect(Collectors.groupingBy(String::length));

    //6)Collectors.partitioningBy(s -> s.length() > 5)
    Map<Boolean, List<String>> partitioned = Stream.of("apple", "banana", "orange")
            .collect(Collectors.partitioningBy(s -> s.length() > 5));

    //7) Collectors.counting()
    long count = Stream.of("apple", "banana", "orange")
            .collect(Collectors.counting());

    // -----------------------------------------

    //Filter
    List<String> fruitsWithA = Stream.of("apple", "banana", "orange")
            .filter(s -> s.startsWith("A"))
            .collect(Collectors.toList());

    //distinct
    List<Integer> distinctNumbers = Stream.of(1, 2, 2, 2, 2)
            .distinct()
            .collect(Collectors.toList());

    //Limit
    List<Integer> firstThreeNumbers = Stream.of(1, 2, 2, 2, 2)
            .limit(3)
            .collect(Collectors.toList());

    //Skip
    List<Integer> afterSkippingThree = Stream.of(1, 2, 2, 2, 2)
            .skip(3)
            .collect(Collectors.toList());

    //takeWhile
    List<Integer> takenWhileLessThanFive = Stream.of(1, 2, 2, 2, 2)
            .takeWhile(n -> n < 5)
            .collect(Collectors.toList());

    //dropWhile
    List<Integer> afterDroppingWhileLessThanFive = Stream.of(1, 2, 2, 2, 2)
            .dropWhile(n -> n < 5)
            .collect(Collectors.toList());


    //
    //List<String> fruits = Arrays.asList("apple", "banana", "orange");

    List<String> upperCaseFruits = Arrays.asList("apple", "banana", "orange").stream()
            .map(String::toUpperCase)
            .collect(Collectors.toList());

    // Expected Output: ["APPLE", "BANANA", "ORANGE"]


    //List<String> words = Arrays.asList("Hello", "World");

    List<String> uniqueLetters = Arrays.asList("Hello", "World").stream()
            .flatMap(word -> Arrays.stream(word.split("")))
            .distinct()
            .collect(Collectors.toList());

    // Expected Output: ["H", "e", "l", "o", "W", "r", "d"]

    //List<String> fruits = Arrays.asList("apple", "banana", "orange");

    int[] lengthsArray = Arrays.asList("apple", "banana", "orange").stream()
            .mapToInt(String::length)
            .toArray();

    // Expected Output: [5, 6, 6]

    int[] numbersArray = {1, 2, 3, 4, 5};

    List<Integer> numbersList = Arrays.stream(numbersArray)
            .boxed()
            .collect(Collectors.toList());

    // Expected Output: [1, 2, 3, 4, 5]

    List<String> fruits = Arrays.asList("apple", "banana", "orange");

    List<String> modifiedFruits = fruits.stream()
            .map(s -> s + " is a fruit")
            .peek(System.out::println)
            .collect(Collectors.toList());

    // Expected Output:
    // apple is a fruit
    // banana is a fruit
    // orange is a fruit

//    List<String> words = Arrays.asList("Hello", "World");

    Map<String, Integer> wordLengths = Arrays.asList("Hello", "World").stream()
            .collect(Collectors.toMap(Function.identity(), String::length));

    // Expected Output: {Hello=5, World=5}

    List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");

    String resultt = names.stream()
            .collect(Collectors.joining(", "));

    // Result: "Alice, Bob, Charlie, David"



}
