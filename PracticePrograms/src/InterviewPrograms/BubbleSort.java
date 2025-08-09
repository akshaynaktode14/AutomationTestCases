package InterviewPrograms;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, i, j, temp;
		int array[] = { 500, 300, 200, 400, 100 };
		n=array.length;
		System.out.println("Array Before Bubble Sort");
		for ( i = 0; i < array.length; i++)
		{
		System.out.print(array[i] + " ");
		}
		// Sorting
		temp = 0;

		for( i=0;i<n;i++) {
			for(j=1;j<(n-i);j++) {
				if(array[j-1]>array[j]) {
					temp=array[j-1];
					array[j-1]=array[j];
					array[j]=temp;	
				}
			}
		}
		System.out.println();
		System.out.println("Array After Bubble Sort");
		for ( i = 0; i < array.length; i++)
		{
		System.out.print(array[i] + " ");
		}
	}

}
