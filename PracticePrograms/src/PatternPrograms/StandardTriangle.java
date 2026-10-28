package PatternPrograms;

public class StandardTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		    *
//		   ***
//		  *****
//		 *******
		 
int n=4;
for(int i=0;i<n;i++) {
	for(int j=i;j<n-1;j++) {
		System.out.print(" ");
	}
	for(int k=0;k<(2*i+1);k++) {
		System.out.print("*");
	}
	System.out.println();
}
	}

}
