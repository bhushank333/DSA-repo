package com.example.demo.practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class StreamApi {

    public static void main(String[] args) {
        //   1) Intermediate Operations (Command-based):
//
//    These methods do not produce a final result right away but rather return a new stream that can be used for further processing.
//    Examples include filter, map, flatMap, distinct, sorted, peek, etc.
//    These operations are often referred to as command-based because they define the processing commands to be executed on the elements of the stream.

        //1) filter: This method is used to filter elements based on a given predicate.

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> evenNumbers = numbers.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());

        System.out.println(evenNumbers);  //o/p --> [2, 4, 6, 8, 10]

        //2)  map: This method is used to transform each element of the stream using the provided function.

        List<String> names = Arrays.asList("John", "Jane", "Doe");

        List<Integer> nameLengths = names.stream()
                .map(String::length)
                .collect(Collectors.toList());

        System.out.println(nameLengths); // o/p ----> [4, 4, 3]

        //3) flatMap: This method is used to flatten the elements of nested collections.

        List<List<Integer>> nestedNumbers = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5, 6),
                Arrays.asList(7, 8, 9)
        );

        List<Integer> flattenedNumbers = nestedNumbers.stream()
                .flatMap(e -> e.stream())
                .collect(Collectors.toList());

        System.out.println(flattenedNumbers); // o/p ----> [1, 2, 3, 4, 5, 6, 7, 8, 9]

        //4) distinct: This method is used to remove duplicate elements from the stream.

        List<Integer> numbersWithDuplicates = Arrays.asList(1, 2, 3, 1, 2, 3, 4, 5);

        List<Integer> uniqueNumbers = numbersWithDuplicates.stream()
                .distinct()
                .collect(Collectors.toList());

        System.out.println(uniqueNumbers);  // -----> [1, 2, 3, 4, 5]

        //5) sorted: This method is used to sort the elements of the stream.

        List<Integer> unsortedNumbers = Arrays.asList(5, 2, 8, 1, 6, 3);

        List<Integer> sortedNumbers = unsortedNumbers.stream()
                .sorted()
                .collect(Collectors.toList());

        System.out.println(sortedNumbers);  // o/p ----> [1, 2, 3, 5, 6, 8]

        //6) peek: This method is used to perform an action on each element of the stream without modifying it.

        List<String> namess = Arrays.asList("John", "Jane", "Doe");

        List<String> modifiedNames = namess.stream()
                .peek(name -> System.out.println("Processing: " + name))
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println(modifiedNames);  // o/p ----> Processing: John Processing: Jane Processing: Doe [JOHN, JANE, DOE]

    //---------------------------------------------------------------------------------------------------//

        //    Terminal Operations (?):
//
//    These methods trigger the processing of the stream and produce a final result or a side-effect.
//    Once a terminal operation is executed, the stream is considered consumed, and it cannot be reused.
//    Examples include forEach, collect, reduce, count, anyMatch, allMatch, noneMatch, etc.
//    These operations are often referred to as terminal operations because they mark the end of the stream processing pipeline.

        //1)  forEach: This method is used to perform an action for each element of the stream.

        List<String> list = Arrays.asList("John", "Jane", "Doe");

        list.stream().forEach(name -> System.out.println("Hello, " + name));

        //o/p ----> Hello, John
        //          Hello, Jane
        //          Hello, Doe

        //2) collect: This method is used to accumulate elements of the stream into a collection.

        List<String> list1 = Arrays.asList("John", "Jane", "Doe");

        List<String> collectedNames = list1.stream().collect(Collectors.toList());

        System.out.println(collectedNames); // o/p -----> [John, Jane, Doe]

       // 3) reduce: This method is used to perform a reduction on the elements of the stream.

        List<Integer> list2 = Arrays.asList(1, 2, 3, 4, 5);

        int sum = list2.stream().reduce(0, Integer::sum);

        System.out.println(sum); // o/p -------> 15

        //4) count: This method is used to count the number of elements in the stream.

        List<String> list3 = Arrays.asList("John", "Jane", "Doe");

        long count = list3.stream().count();

        System.out.println(count); // o/p -----> 3

        //5) anyMatch, allMatch, noneMatch: These methods are used for checking if any, all, or none of the elements match a given predicate.

        List<Integer> list4 = Arrays.asList(1, 2, 3, 4, 5);

        boolean anyMatch = list4.stream().anyMatch(n -> n > 3);
        boolean allMatch = list4.stream().allMatch(n -> n > 0);
        boolean noneMatch = list4.stream().noneMatch(n -> n > 5);

        System.out.println("Any Match: " + anyMatch);
        System.out.println("All Match: " + allMatch);
        System.out.println("None Match: " + noneMatch);

        //o/p--->
//        Any Match: true
//        All Match: true
//        None Match: true




    }
}
