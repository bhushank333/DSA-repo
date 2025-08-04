package com.example.demo.practice;


import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StramApiQue {

    public static void main(String[] arg) {

        ArrayList<Employee> employees = new ArrayList<>();

        employees.add(new Employee("Bhushan", "Dhule", "Finance", 500));
        employees.add(new Employee("Shubham", "Pune", "Manangment", 650));
        employees.add(new Employee("Rahul", "Mumbai", "HR", 830));
        employees.add(new Employee("Ram", "Surat", "IT", 561));
        employees.add(new Employee("Ajay", "Nashik", "Engg", 486));

        // 1. Find the second highest salary from a list of employees.
        Optional<Employee> secondHighest = employees.stream()
                .sorted(Comparator.comparing(Employee::getSalary).reversed())
                .skip(1)
                .findFirst();

        List<Employee> sortAscending = employees.stream()
                .sorted(Comparator.comparing(Employee::getSalary))
                .toList();
//                .skip(1)
//                .findFirst();

        List<Employee> sortDescending = employees.stream()
                .sorted(Comparator.comparing(Employee::getSalary).reversed())
                .toList();

        System.out.println("secondHighest ----> " + secondHighest);
        System.out.println("sortAscending ----> " + sortAscending);
        System.out.println("sortDescending ----> " + sortDescending);

//        2. Group employees by department and find the highest-paid employee in each department.
        Map<String, Optional<Employee>> highestPaidByDept = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,
                        Collectors.maxBy(Comparator.comparing(Employee::getSalary))));


        highestPaidByDept.forEach((k, v) -> System.out.println(k + ":" + v));


        // 3. Duplicate integers
        List<Integer> nums = List.of(1, 2, 3, 2, 4, 5, 1);
        Set<Integer> seen = new HashSet<>();
        Set<Integer> duplicates = nums.stream()
                .filter(n -> !seen.add(n)).collect(Collectors.toSet());
        System.out.println("Duplicates: " + duplicates); // Expected: [1, 2]

        // 4. Uppercase comma-separated sorted string
        List<String> fruits = List.of("banana", "apple", "cherry");
        String result = fruits.stream()
                .map(String::toUpperCase)
                .sorted()
                .collect(Collectors.joining(","));
        System.out.println("Uppercase Comma String: " + result); // Expected: APPLE,BANANA,CHERRY

        // 5. Flatten list of lists
        List<List<Integer>> listOfLists = List.of(List.of(1, 2), List.of(2, 3), List.of(4));
        List<Integer> flat = listOfLists.stream()
                .flatMap(List::stream).distinct().collect(Collectors.toList());
        System.out.println("Flattened List: " + flat); // Expected: [1, 2, 3, 4]

        // 6. First non-repeating char
        String word = "swiss";
        Optional<Character> firstNonRepeat = word.chars().mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(x -> x, LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream().filter(e -> e.getValue() == 1)
                .map(Map.Entry::getKey).findFirst();
        System.out.println("First Non-Repeating Char: " + firstNonRepeat.orElse(null)); // Expected: w

        // 7. Sort map by value descending
        Map<String, Integer> map = Map.of("A", 3, "B", 5, "C", 2);
        LinkedHashMap<String, Integer> sortedMap = map.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                        (e1, e2) -> e1, LinkedHashMap::new));
        System.out.println("Sorted Map by Value: " + sortedMap); // Expected: {B=5, A=3, C=2}

        //Sort Map by Value Ascending
//        Map<String, Integer> map = Map.of("A", 3, "B", 5, "C", 2);
        LinkedHashMap<String, Integer> valueAsc = map.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())  // ascending order
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (e1, e2) -> e1,
                        LinkedHashMap::new));

        System.out.println("Sort by Value Ascending: " + valueAsc);
        // Output: {C=2, A=3, B=5}

        //Sort Map by Value Descending
        LinkedHashMap<String, Integer> valueDesc = map.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())  // descending
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (e1, e2) -> e1,
                        LinkedHashMap::new));

        System.out.println("Sort by Value Descending: " + valueDesc);
        // Output: {B=5, A=3, C=2}

        // Sort Map by Key Ascending
        LinkedHashMap<String, Integer> keyAsc = map.entrySet().stream()
                .sorted(Map.Entry.comparingByKey())  // ascending order
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (e1, e2) -> e1,
                        LinkedHashMap::new));

        System.out.println("Sort by Key Ascending: " + keyAsc);
        // Output: {A=3, B=5, C=2}

        //Sort Map by Key Descending
        LinkedHashMap<String, Integer> keyDesc = map.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByKey().reversed())  // descending
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (e1, e2) -> e1,
                        LinkedHashMap::new));

        System.out.println("Sort by Key Descending: " + keyDesc);
        // Output: {C=2, B=5, A=3}


        // 8. Longest string
        List<String> vehicles = List.of("car", "airplane", "bus");
        String longest = vehicles.stream()
                .max(Comparator.comparingInt(String::length)).orElse(null);
        System.out.println("Longest String: " + longest); // Expected: airplane

        // 9. Palindrome check
        String palindrome = "madam";
        boolean isPalindrome = IntStream.range(0, palindrome.length() / 2)
                .allMatch(i -> palindrome.charAt(i) == palindrome.charAt(palindrome.length() - i - 1));
        System.out.println("Is Palindrome: " + isPalindrome); // Expected: true

        // 10. Partition even/odd
        List<Integer> nums2 = List.of(1, 2, 3, 4, 5);
        Map<Boolean, List<Integer>> partition = nums2.stream()
                .collect(Collectors.partitioningBy(n -> n % 2 == 0));
        System.out.println("Even/Odd Partition: " + partition); // Expected: {false=[1, 3, 5], true=[2, 4]}

        // 11. Group by first char and count
        List<String> words = List.of("apple", "apricot", "banana", "blueberry");
        Map<Character, Long> groupByChar = words.stream()
                .collect(Collectors.groupingBy(w -> w.charAt(0), Collectors.counting()));
        System.out.println("Group by First Char: " + groupByChar); // Expected: {a=2, b=2}

        // 12. Parallel stream sum
        List<Long> bigList = List.of(1L, 2L, 3L, 4L, 5L);
        long sum = bigList.parallelStream().mapToLong(Long::longValue).sum();
        System.out.println("Parallel Sum: " + sum); // Expected: 15

        // 13. Sequential vs parallel
        List<Integer> large = IntStream.rangeClosed(1, 1000000).boxed().collect(Collectors.toList());
        long start = System.nanoTime();
        large.parallelStream().forEach(i -> {
        }); // dummy processing
        long end = System.nanoTime();
        System.out.println("Parallel Time: " + (end - start) / 1e6 + " ms"); // Expected: Varies based on system

        // 14. Remove duplicate chars from string
        String inputStr = "programming";
        String unique = inputStr.chars().distinct().mapToObj(c -> String.valueOf((char) c)).collect(Collectors.joining());
        System.out.println("Unique Chars: " + unique); // Expected: progamin

        // 15. Word frequency
        String text = "apple banana apple orange banana apple";
        Map<String, Long> freq = Arrays.stream(text.split(" "))
                .collect(Collectors.groupingBy(x -> x, Collectors.counting()));
        System.out.println("Word Frequency: " + freq); // Expected: {apple=3, banana=2, orange=1}

        // 16. Top 3 frequent words
        List<String> top3 = freq.entrySet().stream()
                .sorted(Map.Entry.<String, Long>comparingByValue().reversed())
                .limit(3).map(Map.Entry::getKey).collect(Collectors.toList());
        System.out.println("Top 3 Words: " + top3); // Expected: [apple, banana, orange]

        // 17. Fibonacci series
        List<Integer> fib = Stream.iterate(new int[]{0, 1}, f -> new int[]{f[1], f[0] + f[1]})
                .limit(10).map(f -> f[0]).collect(Collectors.toList());
        System.out.println("Fibonacci: " + fib); // Expected: [0, 1, 1, 2, 3, 5, 8, 13, 21, 34]
    }


}
