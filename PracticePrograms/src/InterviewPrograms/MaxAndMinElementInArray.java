package InterviewPrograms;

public class MaxAndMinElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[]= {10,20,30,80,65,05,84,32,14};
		
		int max=array[0];
		
		for(int i=0;i<array.length;i++) {
			if(array[i]>max) {
				max=array[i];
			}
		}
		System.out.println("max element :" +max);
		
int min=array[0];
		
		for(int i=0;i<array.length;i++) {
			if(array[i]<min) {
				min=array[i];
			}
		}
		System.out.println("max element :" +min);
	}

}
