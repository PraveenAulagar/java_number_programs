package com.pa;

import java.util.Scanner;

public class ArmStrongNumber {
	
	public static void main(String[] args) {
		
		int num,cubed=0,rem;
		
		
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter any number");
		num=scanner.nextInt();
		int originalnum=num;
		while(num>0)
		{
			rem=num%10;
			cubed=cubed+(rem*rem*rem);
			num=num/10;
			
		}
		if(cubed==originalnum)
		{
			System.out.println("given number is Armstrong Number");
		}
		else
		{

			System.out.println("given number is not Armstrong Number");
		}
		
		System.out.println(cubed);
	}

}
