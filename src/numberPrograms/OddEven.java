package com.pa;

import java.util.Scanner;

public class OddEven {
	
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		System.out.println("enter any number");
		int num=scanner.nextInt();
		if(num%2==0)
		{
			System.out.println("given number " + num +" is even number");
		}
		else
		{
			System.out.println("given number " + num +" is odd number");
		}
		
	}

}
