package com.pa;

import java.util.Scanner;

public class SwappingOfNumbers {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b,temp;
		System.out.println("enter number for a");
		 a=sc.nextInt();
		 System.out.println("enter number for b");
		 b=sc.nextInt();
		System.out.println("before swapping are a = "+a+ " and b = "+b);
		
//		temp=a+b;
//		a=temp-a;
//		b=temp-b;
		
		temp=a;
		a=b;
		b=temp;
		
		
		System.out.println("after swapping are a = "+a+ " and b = "+b);
	}

}
