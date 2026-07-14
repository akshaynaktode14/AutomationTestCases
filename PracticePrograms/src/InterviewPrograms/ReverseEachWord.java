package InterviewPrograms;

import java.util.Scanner;

public class ReverseEachWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the string:");
		 
		 Scanner sc = new Scanner(System.in);
		 String inputString=sc.nextLine();
//		reverseEachWordOfString("Java Concept Of The Day");
//		reverseEachWordOfString("Java J2EE JSP Servlets Hibernate Struts");
//		reverseEachWordOfString("I am string not reversed");
//		reverseEachWordOfString("Reverse Me");
//		}
//		static void reverseEachWordOfString(String inputString)
//		{
		String[] words = inputString.split(" ");
		String reverseString = "";
		String ab="";
		for (int i = 0; i < words.length; i++)
		
		{
		String word = words[i];
		String reverseWord = "";
		for (int j = word.length() - 1; j >= 0; j--)
		{
		reverseWord = reverseWord + word.charAt(j);
		}
		reverseString = reverseString + reverseWord + " ";
		}
		for(int i=words.length-1;i>=0;i--) {
			ab=ab+words[i]+" ";
		}
		System.out.println(inputString);
		System.out.println(ab);
		System.out.println(reverseString);
		System.out.println("-------------------------");
		}
	}
