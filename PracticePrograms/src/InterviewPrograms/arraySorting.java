package InterviewPrograms;

public class arraySorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a= {2,0,0,3,8,0,0,7,2,4,0};
		int temp=0;
		
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for(int n:a) {
			System.out.print(n);
		}

	}

}
