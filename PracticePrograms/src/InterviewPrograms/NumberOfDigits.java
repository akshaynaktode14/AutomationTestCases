package InterviewPrograms;

public class NumberOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		int n=4577458;
		while(n!=0)
		{
			n=n/10;
			++count;
		}
		System.out.println(count);

	}

}
