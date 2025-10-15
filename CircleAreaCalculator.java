package com.codegnan.fundamentals;

import java.util.Scanner;

public class CircleAreaCalculator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter radius of the circle:");
		double r=sc.nextFloat();
		double area=3.14*r*r;
		System.out.println("Area of theCircle:"+area);
		sc.close();
	}

}
