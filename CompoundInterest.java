package com.codegnan.fundamentals;

import java.util.Scanner;

public class CompoundInterest {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Principle amount:");
		double p=sc.nextDouble();
		System.out.println("Enter Rate of Intrest %:");
		double r=sc.nextDouble();
		System.out.println("Enter Time in years:");
		double t=sc.nextFloat();
		double amount=p*(Math.pow((1+r/100),t));
		double compoundInterest=amount-p;
		double totalAmount=compoundInterest+p;
		System.out.println("Compound Interest is:"+compoundInterest);
		System.out.println("Total Amount is:"+totalAmount);
		sc.close();
		
	
}
}
