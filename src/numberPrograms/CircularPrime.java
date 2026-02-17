package numberPrograms;

import java.util.Scanner;

public class CircularPrime {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int num=sc.nextInt();
		int temp=num;
		int digits=0;int divisor=1;
		while(temp!=0)
		{
			digits++;
			temp=temp/10;
		}
		System.out.println("digits are "+digits);
		
		for(int i=1;i<digits;i++)
		{
			divisor=divisor*10;
		}
		System.out.println("divisor is "+divisor);
		int newNum=num;
		boolean prime=true;
		while(digits!=0)
		{
			
			for(int i=2;i<newNum/2;i++)
			{
				if(newNum%i==0)
				{
					System.out.println("the new number is not prime "+ newNum);
					prime=false;
					break;
				}
				else
				{
					System.out.println("new number is prime "+newNum);
					prime=true;
					break;
				}
			}
			int quotient=newNum/divisor;
			int rem=newNum%divisor;
			newNum=rem*10+quotient;
			System.out.println("new number is "+newNum);
			digits--;
		}
		System.out.println(prime?"the number is circular prime":"the number is not circular prime");
	}

}
