package com.example.demo.com.assignment19;

//1. Design a method for counting the alphabet, vowels and numbers from String. Input should be from user into main method and pass that to methods. 
//And result will print into main method 

public class Count {
	
	public static void getCount(String s) {
		
		int alphabet =0;
		int vowels=0;
		int numbers=0;
		
		for(int i=0 ; i<s.length() ; i++) {
		char ch =s.toLowerCase().charAt(i);
		
		if(ch=='a' || ch=='i' || ch=='e'|| ch=='o' || ch=='u') {
			vowels++;
		}
		else if (ch>='a' && ch<='z') {
			alphabet++;
		}
		else if(ch>='0'&& ch<='9') {
			numbers++;
		}
		}
		System.out.println("alphabet :" + alphabet );
		System.out.println("vowels : " + vowels);
		System.out.println("numbers : " + numbers);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "aieou123xyz";
		getCount(s);
	}

}
