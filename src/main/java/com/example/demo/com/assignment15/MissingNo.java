package com.example.demo.com.assignment15;

public class MissingNo {
	
	static int getMissingNo(int a[], int n)
    {
        int total = 1;
        for (int i = 2; i <= (n + 1); i++) {
            total += i;
            total -= a[i - 2];
        }
        return total;
    }
 
    // Driver Code
    public static void main(String[] args)
    {
        int[] arr = { 1, 2, 3, 4, 5, 7 };
        int N = arr.length;
       
        // Function call
        System.out.println(getMissingNo(arr, N));
    }
}
