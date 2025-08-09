package InterviewPrograms;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. using algorithm
		System.out.println("Enter the number:");
		 
		 Scanner sc = new Scanner(System.in);
		 long num=sc.nextLong();
		 long original = num;
		//long num = 12345; // 54321
		long rev = 0;
		while (num != 0)
		{
		rev = rev * 10 + num % 10; // 5432
		num = num / 10; // 12
		}
		System.out.println("Reverse num is:" + rev);

	}

}
