package NumberPrograms;

public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		input = 131;
//		output= 131 palindrome
		int n=151;
		int original=n;
		int sum=0;
		while(n>0) {
			int rem=n%10;
			sum=sum*10+rem;
			n=n/10;
			
		}
		if(sum==original) {
			System.out.println(original + " is a palindrome number");
		}
		else
		{
			System.out.println(original +" is not palindrome number");
		}
	}

}
