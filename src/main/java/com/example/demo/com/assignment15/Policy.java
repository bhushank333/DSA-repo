package com.example.demo.com.assignment15;

import java.util.Scanner;

public class Policy {
	
	public int policyId;
	public String policyName;
	public String policyType;
	public int premiumAmount;
	
	public Policy(){
		
	}
	
	public Policy(int policyId, String policyName, String policyType, int premiumAmount) {
		super();
		this.policyId = policyId;
		this.policyName = policyName;
		this.policyType = policyType;
		this.premiumAmount = premiumAmount;
	}
	
	
	
	@Override
	public String toString() {
		return "Policy [policyId=" + policyId + ", policyName=" + policyName + ", policyType=" + policyType
				+ ", premiumAmount=" + premiumAmount + "]";
	}



	public static Policy getPolicyDetails() {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the PolicyId : ");
		int policyId=sc.nextInt();
		System.out.println("Entere the PolicyName : ");
		String policyName =sc.next();
		System.out.println("Entere the policyType : ");
		String policyType = sc.next();
		System.out.println("Entere the premiumAmount : ");
		int premiumAmount = sc.nextInt();
		
		return new Policy(policyId, policyName, policyType, premiumAmount);
		
		
		
	}
	
	public static void main(String[] args) {
	 System.out.println(getPolicyDetails());
	}
	

}
