package numberPrograms;

import java.util.Scanner;

public class BuzzNumber {
	
	public static void main(String[] args) {
		
		System.out.println("enter the number");
		int number=new Scanner(System.in).nextInt();
		System.out.println((number%10==7||number%7==0)?"the given number is buzz number":"the given number is not buzz number");
		
	}

}
