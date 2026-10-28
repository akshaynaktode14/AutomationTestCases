package NumberPrograms;

public class GcdLcm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=21;
		int num2=14;
		int a=num1;
		int b=num2;
		while(b!=0) {
			int temp=b;
			b=a%b;
			a=temp;
		}
		int gcd=a;
		int lcm=(num1*num2)/gcd;
		System.out.println("GCD of "+num1+" And "+num2+" is "+gcd);
		System.out.println("LCM of "+num1+" And "+num2+" is "+lcm);
	}

}
