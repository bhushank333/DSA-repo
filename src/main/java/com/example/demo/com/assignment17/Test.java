package com.example.demo.com.assignment17;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Test {

	public static void countVowelsAndNumbersFromFile(String file) {
		
		int vowelsCount =0;
		int digit =0;
		String str="";
		
		
		try {
			FileInputStream fls = new FileInputStream(file);
			
			Scanner sc = new Scanner(fls);
			
			while(sc.hasNext()) {
				str = str + sc.next();			
				}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("File Not Found");
		}
		for(int i=0 ; i<str.length() ; i++) {
			
			char ch = str.toLowerCase().charAt(i);
			if(ch=='a' || ch=='i' || ch=='e' || ch=='o' || ch=='u') {
				vowelsCount++;
			}
			else if (ch>='0' && ch<='9') {
				digit++;
			}
		}
		System.out.println("Vowels : "+ vowelsCount);
		System.out.println("Digit : " +digit);

		
	}
	
	public static void main(String[] args) {
		
		String file= "D:\\User\\hp\\bk.txt";
		countVowelsAndNumbersFromFile(file);
	}
}
