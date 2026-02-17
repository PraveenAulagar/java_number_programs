package com.pa;

import java.util.Scanner;

public class PertersonNumber {
	
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int num, onum,rem, fact, sum=0;
	num=sc.nextInt();
	onum=num;
	
	while(num!=0)
	{
		rem=num%10;
		fact=1;
	for(int i=rem;i>0;i--)
	{
		fact=fact*i;
		System.out.println(fact);
	}
	sum=sum+fact;
	num=num/10;
	
	}
	System.out.println(sum);
	
}
}
