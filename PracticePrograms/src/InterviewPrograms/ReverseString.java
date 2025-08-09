package InterviewPrograms;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Reverse a String: 
		 //diff bw String and StringBuffer
		 //do we have reverse function in String?
		 
		 System.out.println("Enter the string:");
		 
		 Scanner sc = new Scanner(System.in);
		 String s=sc.nextLine();
		 
		 //1. using for loop 
		 int len = s.length(); //8
		 String rev = "";
		 
		 for(int i =len-1; i>=0; i--)
		 {
		 rev = rev + s.charAt(i); //muineleS
		 }
		 
		 System.out.println(rev);
		 
		 //2. using StringBuffer class:
		 StringBuffer sf = new StringBuffer(s);
		 System.out.println(sf.reverse());

	}

}
