package com.example.demo.com.assignment12;

import java.util.Scanner;

public class AccountImpl implements Account {

	@Override
	public void getSavingAccount() {
		String name;
		float balance;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name of the Account Holder>>");
		name = sc.next();
		System.out.println("Enter Balance of the Account Holder>>");
		balance = sc.nextFloat();
		
		getUserDetails(name , balance);
		
		
	}

	
	@Override
	public void getUserDetails(String name, float balance) {
		System.out.println("Account User Name is>>" + name);
		System.out.println("Account Balance is>>" + balance);
	}
	
	public static void main(String[] args) {
		
		AccountImpl am = new AccountImpl();
		am.getSavingAccount();
	}

}
