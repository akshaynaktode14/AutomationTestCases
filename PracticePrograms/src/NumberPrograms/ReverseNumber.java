package NumberPrograms;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//input = 12345
//output = 54321
		
		int n=1234;
		int revN=0;
		while(n>0) {
			int rem= n%10;
			revN=revN*10+rem;
			n=n/10;
		}
		System.out.println(revN);
	}

}
