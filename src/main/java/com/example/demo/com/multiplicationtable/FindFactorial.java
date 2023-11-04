package com.example.demo.com.multiplicationtable;

public class FindFactorial {

	public static void main(String[] args) {
	
		FindFactorial fc = new FindFactorial();
		fc.factorial(5);
		
		
}
	public int factorial (int no){
		
		int fact= 1;
		
		for (int i= 1 ; i<= no; i++) {
			
			 fact = fact * i;
		}
		 System.out.println("factorial is" + fact);
		return no;
	}


}
