package numberPrograms;

import java.util.Scanner;

public class PallendromeNumber {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of your choice");
		int originalNumber=sc.nextInt();
		/*
		 * we assign the original number to a temporary variable so the original number
		 * does not get changed
		 */
		int temp=originalNumber;
		int reverseNumber=0;
		
		while(temp!=0)
		{
			// By using modulus operator we get remainder of the number.
			int rem=temp%10;
			// by multiplying the reverse number by 10 and adding the remainder we get reverse number of the original digit
			reverseNumber=reverseNumber*10+rem;
			// By dividing temp by 10 we are eliminating the last digit
			temp=temp/10;
		}
		System.out.println("The reverse of given number is "+reverseNumber);
		
		// pallendrome number is the original number should be same when it is reversed.
		if(reverseNumber==originalNumber)
		{
			System.out.println("The original number is same when the number is reversed");
			System.out.println("Hence the given number " + originalNumber +" is pallendrome");
		}
		else
		{
			System.out.println("The original number is not same when the number is reversed");
			System.out.println("Hence the given number " + originalNumber +" is not pallendrome");
		}
		
	}

}
