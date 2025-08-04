package com.example.demo.practice;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamApiMethods {

    // 1) Collectors.toList()
    List<String> list = Stream.of("apple", "banana", "orange")
            .collect(Collectors.toList());
    // Input: ["apple", "banana", "orange"]
    // Output: [apple, banana, orange]

    // 2) Collectors.toSet()
    Set<String> set = Stream.of("apple", "banana", "orange")
            .collect(Collectors.toSet());
    // Input: ["apple", "banana", "orange"]
    // Output (unordered): [orange, banana, apple]

    // 3) Collectors.toMap()
    Map<Integer, String> mapUnique = Stream.of("apple", "banana")
            .collect(Collectors.toMap(String::length, Function.identity()));

    Map<Integer, String> map = Stream.of("apple", "banana", "orange")
            .collect(Collectors.toMap(String::length, Function.identity(), (s1, s2) -> s1 + "," + s2));
    // Input: ["apple", "banana", "orange"]
    // Output: {5=apple, 6=banana,orange}

    // 4) Collectors.joining()
    String result = Stream.of("apple", "banana", "orange")
            .collect(Collectors.joining(", "));
    // Input: ["apple", "banana", "orange"]
    // Output: "apple, banana, orange"

    // 5) Collectors.groupingBy(String::length)
    Map<Integer, List<String>> groupedByLength = Stream.of("apple", "banana", "orange")
            .collect(Collectors.groupingBy(String::length));
    // Output: {5=[apple], 6=[banana, orange]}

    // 6) Collectors.partitioningBy(s -> s.length() > 5)
    Map<Boolean, List<String>> partitioned = Stream.of("apple", "banana", "orange")
            .collect(Collectors.partitioningBy(s -> s.length() > 5));
    // Output: {false=[apple], true=[banana, orange]}

    // 7) Collectors.counting()
    long count = Stream.of("apple", "banana", "orange")
            .collect(Collectors.counting());
    // Output: 3

    // Filter
    List<String> fruitsWithA = Stream.of("apple", "banana", "orange")
            .filter(s -> s.startsWith("a"))
            .collect(Collectors.toList());
    // Output: [apple]

    // distinct
    List<Integer> distinctNumbers = Stream.of(1, 2, 2, 2, 2)
            .distinct()
            .collect(Collectors.toList());
    // Output: [1, 2]

    // Limit
    List<Integer> firstThreeNumbers = Stream.of(1, 2, 2, 2, 2)
            .limit(3)
            .collect(Collectors.toList());
    // Output: [1, 2, 2]

    // Skip
    List<Integer> afterSkippingThree = Stream.of(1, 2, 2, 2, 2)
            .skip(3)
            .collect(Collectors.toList());
    // Output: [2, 2]

    // takeWhile
    List<Integer> takenWhileLessThanFive = Stream.of(1, 2, 2, 2, 2)
            .takeWhile(n -> n < 5)
            .collect(Collectors.toList());
    // Output: [1, 2, 2, 2, 2]

    // dropWhile
    List<Integer> afterDroppingWhileLessThanFive = Stream.of(1, 2, 2, 2, 2)
            .dropWhile(n -> n < 5)
            .collect(Collectors.toList());
    // Output: []

    List<String> upperCaseFruits = Arrays.asList("apple", "banana", "orange").stream()
            .map(String::toUpperCase)
            .collect(Collectors.toList());
    // Output: [APPLE, BANANA, ORANGE]

    List<String> uniqueLetters = Arrays.asList("Hello", "World").stream()
            .flatMap(word -> Arrays.stream(word.split("")))
            .distinct()
            .collect(Collectors.toList());
    // Output: [H, e, l, o, W, r, d]

    int[] lengthsArray = Arrays.asList("apple", "banana", "orange").stream()
            .mapToInt(String::length)
            .toArray();
    // Output: [5, 6, 6]

    int[] numbersArray = {1, 2, 3, 4, 5};

    List<Integer> numbersList = Arrays.stream(numbersArray)
            .boxed()
            .collect(Collectors.toList());
    // Output: [1, 2, 3, 4, 5]

    List<String> fruits = Arrays.asList("apple", "banana", "orange");

    List<String> modifiedFruits = fruits.stream()
            .map(s -> s + " is a fruit")
            .peek(System.out::println)
            .collect(Collectors.toList());
    // Output (printed):
    // apple is a fruit
    // banana is a fruit
    // orange is a fruit

    Map<String, Integer> wordLengths = Arrays.asList("Hello", "World").stream()
            .collect(Collectors.toMap(Function.identity(), String::length));
    // Output: {Hello=5, World=5}

    List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");

    String resultt = names.stream()
            .collect(Collectors.joining(", "));
    // Output: "Alice, Bob, Charlie, David"

    List<String> words = Arrays.asList("apple", "banana", "cherry", "date");

    List<String> modifiedList = words.stream()
            .peek(word -> System.out.println("Length of " + word + ": " + word.length()))
            .map(String::toUpperCase)
            .peek(word -> System.out.println("Uppercase: " + word))
            .filter(word -> word.length() > 5)
            .collect(Collectors.toList());
    // Output:
    // Length of apple: 5
    // Uppercase: APPLE
    // Length of banana: 6
    // Uppercase: BANANA
    // Length of cherry: 6
    // Uppercase: CHERRY
    // Length of date: 4
    // Uppercase: DATE
    // Final List: [BANANA, CHERRY]

    // flatMap example
    public static void main(String[] arg) {
        List<List<String>> list = new ArrayList<>();

        List<String> list1 = Arrays.asList("bhushan", "rahul", "kumar");
        List<String> list2 = Arrays.asList("pranav", "ram");
        list.add(list1);
        list.add(list2);
        System.out.println(list);
        List<String> collect = list.stream().flatMap(e -> e.stream()).collect(Collectors.toList());

        collect.forEach(e -> System.out.println(e));
        // Output:
        // [bhushan, rahul, kumar, pranav, ram]

        List<Integer> numbers = Arrays.asList(10, 5, 8, 20, 15, 25);
        int secondHighest = findSecondHighest(numbers);
        System.out.println("Second Highest Element: " + secondHighest);
        // Output: Second Highest Element: 20
    }

    public static int findSecondHighest(List<Integer> numbers) {
        return numbers.stream()
                .distinct()
                .sorted((a, b) -> b.compareTo(a))
                .skip(1)
                .findFirst()
                .orElseThrow(() -> new IllegalStateException("List is empty"));
    }

    public static void mainn(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8);

        Map<Integer, Integer> resultMap = list.stream()
                .filter(num -> num % 2 == 0)
                .collect(Collectors.toMap(
                        num -> num,
                        num -> num * num
                ));

        System.out.println(resultMap);
        // Output: {2=4, 4=16, 6=36, 8=64}
    }
}
