package com.example.demo.com.assignment16;

//1. Design the Product class in which design void productCheck(int weight) in check 
//whether weight is less than 100, then throw the ProductException  with meaningful message. 
//2. Design the ProductException class in which write custom exceptions.
//3. Create MainProduct class in which pass the input to productCheck method with try and catch block.

public class Product {

	
	 void productCheck(int weight)  {
		 
		 if(weight<100) {
			 try {
			 throw new ProductException("Product weight is less than 100");
			 }
			 catch(ProductException e) {
				 System.out.println(e);
			 }
			 
			 System.out.println("Weight of product is : " + weight);
		 }
		 
	 }
}
