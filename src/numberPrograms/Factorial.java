package numberPrograms;

import java.util.Scanner;

public class Factorial {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		long num=sc.nextLong();
		long factorial=num;
		
		for(long i=num-1;i>1;i--)
		{
			factorial=factorial*i;
		}
		System.out.println("factorial is " + factorial);
	}

}
