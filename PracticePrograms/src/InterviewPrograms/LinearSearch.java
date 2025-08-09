package InterviewPrograms;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int array[]= {10,20,30,80,65,05,84,32,14};
		
		int search_num=89;
		int i;
		for(i=0;i<array.length;i++) {
			if(array[i]==search_num)
			{
				System.out.println("search number is: " +array[i]);
				break;
			}
		}
		if(i==array.length) {
			System.out.println("search number is not present");
		}

	}

}
