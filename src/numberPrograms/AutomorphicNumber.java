package numberPrograms;

import java.util.Scanner;

public class AutomorphicNumber {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number to be squared");
		int num=sc.nextInt();
		int sqNum=num*num;
		int temp=sqNum;
		int digits=0;int divisor=1;
		System.out.println("square of the number is "+sqNum);
		while(temp!=0)
		{
			digits++;
			temp=temp/10;
		}
		System.out.println("the digits are "+digits);
		for(int i=1;i<digits;i++)
		{
			divisor=divisor*10;
		}
		System.out.println("divisor is "+divisor);
		System.err.println(sqNum%divisor==num?"the number is automorphic number":"the number is not automorphic number");
	}

}
