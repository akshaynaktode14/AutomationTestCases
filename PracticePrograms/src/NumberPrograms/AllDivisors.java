package NumberPrograms;

public class AllDivisors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//input=36;
//output=1,2,3,4,6,9,12,18,36
		int n=36;
		
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				System.out.print(i+" ");
			}
		}
	}

}
