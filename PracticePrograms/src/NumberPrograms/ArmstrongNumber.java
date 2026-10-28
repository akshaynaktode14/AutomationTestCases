package NumberPrograms;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//input = 153;
//output = 1^3+5^3+3^3= 153
		
		int n=153;
		int original=n;
		int sum=0;
		int digits= String.valueOf(n).length();
		while(n>0) {
			int unitDigit=n%10;
			sum+=Math.pow(unitDigit, digits);
			//System.out.println(sum);
			n=n/10;
		}
		if(sum==original) {
			System.out.println(original + " it is a armstrong number");
		}
		else {
			System.out.println(original+ " it is not armstrong number");
		}
	}

}
