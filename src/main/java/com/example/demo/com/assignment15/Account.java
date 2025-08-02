package com.example.demo.com.assignment15;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Account {

	private int id;
	private String accountNumber;
	private double balance;


	public static void main(String[] arg){
		int[] numbers = {1, 2, 3, 4};
		String s = Arrays.toString(numbers);
		char[] sCharArray = s.toCharArray();
		s.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		char[] charArray = s.toCharArray();
		String string = Arrays.toString(charArray);
		List<List<String>> stringList = List.of(List.of(string));
		List<String> list = stringList.stream().flatMap(Collection::stream).toList();
		for(int i=0 ; i <= list.size() ; i++ ){
			list.forEach(System.out::println);
		}
	}


}
