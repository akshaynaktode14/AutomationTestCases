package InterviewPrograms;

public class AllZeroRightShiftCapg5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,1,0,0,1,0,0,0,1}; // 1 1 1 1 0 0 0 0 0
		
		int left=0;
		int right=arr.length-1;
		while(left<right) {
			if(arr[left]==1) {
				left++;
			}
			else if(arr[right]==0){
				right--;
			}else {
				int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
			}
		}
		for(int num:arr) {
			System.out.print(num+" ");
		}
	}

}
