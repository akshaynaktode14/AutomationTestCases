package InterviewPrograms;

import java.util.Scanner;

public class CountCharacterOccurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the string");
		String s = sc.nextLine();
//char c='a';
//int count =s.length()-s.replace("a", "").length();
//System.out.println(count);
		System.out.println("enter the character what to seacrh");
		String c = sc.nextLine();
		int count = s.length() - s.replace(c, "").length();
		System.out.println("Number of occurances of "+ c+ " is: " + count);

	}

}
