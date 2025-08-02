package com.example.demo.testdsa;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ReverseStringWithoutSpecialChar {

    public static String reverseWithoutSpecialChars(String str) {
        char[] input = str.toCharArray();

        // Step 1: Extract letters only and reverse them
        List<Character> letters = str.chars()
                .mapToObj(c -> (char) c)
                .filter(Character::isAlphabetic)
                .collect(Collectors.toList());

        Collections.reverse(letters); // Reverse the list of letters

        // Step 2: Reconstruct the string by replacing letters
        final Iterator<Character> reversedIter = letters.iterator();

        // Step 3: Build new string with reversed letters in original positions
        return IntStream.range(0, input.length)
                .mapToObj(i -> Character.isAlphabetic(input[i]) ? reversedIter.next() : input[i])
                .map(String::valueOf)
                .collect(Collectors.joining());
    }

    public static String reverseLettersOnlyUnicodeSafe(String input) {
        int[] codePoints = input.codePoints().toArray();

        // Collect letters only (using Character.isLetter for Unicode)
        List<Integer> letters = Arrays.stream(codePoints)
                .filter(Character::isLetter)
                .boxed()
                .collect(Collectors.toList());

        Collections.reverse(letters); // Reverse letters list
        Iterator<Integer> reversedIter = letters.iterator();

        // Rebuild the result string
        return IntStream.of(codePoints)
                .mapToObj(cp -> Character.isLetter(cp) ? reversedIter.next() : cp)
                .map(Character::toString)
                .collect(Collectors.joining());
    }

    public static void reverse(char[] str) {
        // Initialize left and right pointers
        int r = str.length - 1, l = 0;

        // Traverse string from both ends until 'l' and 'r'
        while (l < r) {
            // Ignore special characters
            if (!Character.isAlphabetic(str[l]))
                l++;
            else if (!Character.isAlphabetic(str[r]))
                r--;

                // Both str[l] and str[r] are not spacial
            else {
                char tmp = str[l];
                str[l] = str[r];
                str[r] = tmp;
                l++;
                r--;
            }
        }
    }

    // Driver Code
    public static void main(String[] args) {
        String str = "a!!!b.c.d,e'f,ghi";
        char[] charArray = str.toCharArray();

        System.out.println("Input string: " + str);
        reverse(charArray);
        reverseLettersOnlyUnicodeSafe(str);
        String revStr = new String(charArray);

        System.out.println("Output string reverse: " + revStr);
        System.out.println("Output string reverseLettersOnlyUnicodeSafe: " + reverseLettersOnlyUnicodeSafe(str));
        System.out.println("Output string reverseWithoutSpecialChars: " + reverseWithoutSpecialChars(str));

    }
}



